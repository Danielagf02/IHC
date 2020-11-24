package Interno;

import java.io.File;
import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JFrame;
import poo.bd.Querys;

/**
 * Esta clase es utilizada para crear los metodos necesarios pero no
 * obligatoriamente relacionados
 */
/**
 *
 * @author kevin
 */
public class Extras
{

    /**
     * Este método se encarga de hacer carpetas Sera utilizada para guardar las
     * imagenes que se utilizaran (icono del programa y fotos de los empleados)
     */
    public static void carpeta(JFrame jf)
    {
        String userDir = System.getProperty("user.dir");
        //System.out.println(userDir+"/src/imagenes");
        File c = new File(userDir + "/src/imagenes");
        if (!c.exists())
        {
            c.mkdir();
        } else
        {
            eliminarimagen(userDir, jf);
        }
    }

    /**
     * Este método se encarga de eliminar la imagen del empleado y es requerida
     * para las bajas
     *
     * @param foto se debe mandar la variable foto pues esta contiene la
     * dirección de la imagen a borrar
     * @param jf requerido para mandar el mensaje de error cuando se manda mal
     * la variable foto
     */
    public static void eliminarimagen(String foto, JFrame jf)
    {
        File imagen = new File(foto);
        if (imagen.exists())
        {
            imagen.delete();
        } else
        {
            System.out.println("YA PUDEEEEEEEEEEEEEE JAJAJAJA");
        }
    }

    /**
     * Este método se encarga de tranformar la hora en forma de String a una
     * hora en forma de Date con la cual podremos hacer los calculos para el pdf
     *
     * @param horaT esta resive el string de la hora de salida,entrada y
     * registrados
     * @return la hora ya convertida
     */
    public static Date convertirhora(String horaT)
    {
        SimpleDateFormat formato = new SimpleDateFormat("hh:mm a");
        Date hora = null;
        try
        {
            hora = formato.parse(horaT);
        } catch (Exception e)
        {
            System.out.println(e);
        }

        return hora;
    }

    public static Date convertirfecha(String horaT)
    {
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
        Date fecha = null;
        try
        {
            fecha = formato.parse(horaT);
        } catch (Exception e)
        {
            System.out.println(e);
        }
        return fecha;
    }

    /**
     * Este metodo es usado para verificar si la hora dada por el usuario es AM
     * o PM es de suma importancia para los registros pues esta solo acepta el
     * formato 24hrs
     *
     * @param Hora aqui mandaremos lo que el usuario introdujo a la aplicación
     * @return la hora ya en el formato que requerimos
     */
    public static String compararhora(String Hora)
    {
        if ((Hora.charAt(0) == '0' || Hora.charAt(0) == '1' || Hora.charAt(0) == '2'
                || Hora.charAt(0) == '3' || Hora.charAt(0) == '4' || Hora.charAt(0) == '5'
                || Hora.charAt(0) == '6' || Hora.charAt(0) == '7' || Hora.charAt(0) == '8'
                || Hora.charAt(0) == '9') && Hora.charAt(1) == ':')
        {
            Hora = "0" + Hora;
            System.out.println(Hora);
        } else
        {
            System.out.println(Hora);
        }

        if (Hora.charAt(0) == '0')
        {
            if ((Hora.charAt(1) == '1' || Hora.charAt(1) == '2'
                    || Hora.charAt(1) == '3' || Hora.charAt(1) == '4' || Hora.charAt(1) == '5'
                    || Hora.charAt(1) == '6' || Hora.charAt(1) == '7' || Hora.charAt(1) == '8'
                    || Hora.charAt(1) == '9') && Hora.charAt(2) == ':')
            {
                Hora = Hora + " AM";
                System.out.println(Hora);
            }
        } else
        {
            if ((Hora.charAt(1) == '1' || Hora.charAt(1) == '0') && Hora.charAt(2) == ':')
            {
                Hora = Hora + " AM";
                System.out.println(Hora);
            }
        }

        if ((Hora.length() != 8))
        {
            Hora = Hora + " PM";
            System.out.println(Hora);
        }

        return Hora;
    }

    /**
     * Este metodo sera utilizado para contar los retardos etc
     *
     * @param nom de quien buscaremos
     * @param jf para la conección
     * @return un objeto de la clase Asis
     */
    public static Asis retardos(String nom, JFrame jf)
    {
        Asis retar = new Asis();
        int control = 0;
        int can;

        Connection con = ManipulaBD.conecta(jf);
        if (con != null)
        {
            Querys sql = new Querys();
            ArrayList<Profesor> re = ManipulaBD.cargaP(sql.Seleccion(con, "*", "Empleado", "nom='" + nom + "'"));
            ArrayList<Dias> ap = ManipulaBD.cargaH(sql.Seleccion(con, "*", "Asistencias", "Nom='" + nom + "'"));

            can = ap.size();

            Date HoraEntrada = convertirhora(re.get(0).getHentrada());
            Date HoraSalida = convertirhora(re.get(0).getHsalida());

            for (int i = 0; i < can; i++)
            {
                Date HoraEntR = convertirhora(ap.get(i).getHoraEnt());
                if (HoraEntR.after(HoraEntrada))
                {
                    control++;
                }
            }
            retar.setRetardos(control);
            control = 0;
            System.out.println("Los retardos son igual a " + retar.getRetardos());

            for (int i = 0; i < can; i++)
            {
                Date HoraSalR = convertirhora(ap.get(i).getHoraSal());
                if (HoraSalR.before(HoraSalida))
                {
                    control++;
                }
            }
            retar.setAbandono(control);
            control = 0;
            System.out.println("Los abandonos son igual a " + retar.getAbandono());

            ManipulaBD.desconecta(con);
        }
        return retar;
    }

    /**
     * Metodo que sera usado para contar las faltas
     *
     * @param dias los días del mes a buscar la cantidad de faltas y este sera
     * parte del codigo interno
     * @param mes este sera proporcionado por el usurario para detectar el mes a
     * evaluar
     * @param jf el frame para poder hacer la conexion
     * @param nom el nombre del empleado a buscar
     * @return
     */
    public static int faltas(int dias, String mes, JFrame jf, String nom)
    {
        int faltas = 0;
        int can;

        Connection con = ManipulaBD.conecta(jf);
        if (con != null)
        {
            Querys sql = new Querys();
            ArrayList<Dias> ap = ManipulaBD.cargaH(sql.Seleccion(con, "*", "Asistencias", "Nom='" + nom + "'"));
            can = ap.size();
            for (int i = 0; i < dias; i++)
            {
                String fecha = (i + 1) + "-" + mes + "-" + "2019";
                Date dia = convertirfecha(fecha);
                Date diaR = null;
                for (int j = 0; j < can; j++)
                {
                    diaR = convertirfecha(ap.get(j).getDía());

                    if (dia.equals(diaR))
                    {
                        faltas++;
                    }
                }
            }
        }
        faltas = dias - faltas;
        return faltas;
    }

    /**
     * Metodo usado para windows y que ayuda a hacer la ruta correcta pues en W no se
     * acepta el caracter \ lo que provoca errores
     * @param foto es la ruta que obtenemos desde la vtnregistros o vtnmodifica
     * @return la ruta correcta para que windows pueda reconocer el programa
     */
    public static String rutafoto(String foto)
    {
        String ruta = "";
        for (int i = 0; i < foto.length(); i++)
        {
            if (foto.charAt(i) == 92)
            {
                ruta = ruta + "/";
            } else
            {
                ruta=ruta+foto.charAt(i);
            }
        }
        return ruta;
    }
}
