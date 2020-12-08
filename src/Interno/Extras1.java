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
public class Extras1
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
            System.out.println("VAMO A VER");
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
