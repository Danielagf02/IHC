package bd;

import Interno.Adminis;
import Interno.ManipulaBD;
import java.sql.Connection;
import java.util.ArrayList;
import poo.bd.Querys;

/**
 *
 * @author Kevin
 */
public class Pruebas
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
//        AltasAdminisPrueba();
//        BajasAdminisPrueba();
//        ArrayList<Adminis> admin = ConsultasAdminsPrueba("Puesto=","'SubDirector'");
        ModificarAdminis();
    }

    /**
     * Método que hace las altas de los Admins en la bd la cual recibe por
     * parametro los datos del objeto
     *
     * @param id tipo int
     * @param ApellidoP tipo String
     * @param ApellidoM tipo String
     * @param Nombre tipo String
     * @param fechaNacimiento tipo String
     * @param CURP tipo String
     * @param rfc tipo String
     * @param sexo tipo String
     * @param Telefono tipo int
     * @param CedulaProfe tipo String
     * @param Direccion tipo String (Solo se acepta una palabra por errores en
     * la base de datos)
     * @param FolioEmpleado tipo int
     * @param Hentrada tipo String
     * @param Hsalida tipo String
     * @param Puesto tipo String
     * @param Correo tipo String
     * @param Contraseña tipo String
     */
    public static void AltasAdminisPrueba(int id, String ApellidoP, String ApellidoM, String Nombre, String fechaNacimiento, String CURP,
            String rfc, String sexo, int Telefono, String CedulaProfe, String Direccion, int FolioEmpleado, String Hentrada, String Hsalida,
            String Puesto, String Correo, String Contraseña)
    {
        Connection con = ManipulaBD.conecta();
        if (con != null)
        {
            Querys sql = new Querys();
            sql.Insertar(con, "adminis",
                    "" + id + ",'"
                    + ApellidoP + "','"
                    + ApellidoM + "','"
                    + Nombre + "','"
                    + fechaNacimiento + "','"
                    + CURP + "','"
                    + rfc + "','"
                    + sexo + "',"
                    + Telefono + ",'"
                    + CedulaProfe + "','"
                    + Direccion + "',"
                    + FolioEmpleado + ",'"
                    + Hentrada + "','"
                    + Hsalida + "','"
                    + Puesto + "','"
                    + Correo + "','"
                    + Contraseña + "'");
            ManipulaBD.desconecta(con);
            System.out.println("Dato Insertado");
        }
    }

    /**
     * Se debe enviar el id ya que es unico e impide la eliminacion de un dato
     * erroneo así como se recomienda hacer uso del metodo ConsultasAdmins el
     * cual sera usado para encontrar cual es dato que se quiere eliminar
     *
     * @param id tipo int es el identificador unico del objeto en la bd
     */
    public static void BajasAdminisPrueba(int id)
    {
        Connection con = ManipulaBD.conecta();
        if (con != null)
        {
            Querys sql = new Querys();
            sql.Delete(con, "adminis", "id", "" + id + "");
        }
        ManipulaBD.desconecta(con);
    }

    /**
     * Método para colsutar en la bd en la tabla de adminis y retorna el objeto
     * o los objetos en un arraylist esto con la intencion de traer lo que se
     * requiera en el momento
     *
     * @param variable que variable va a buscar en la base ejemplo "Nombre=" es
     * importante poner el igual
     * @param condicion cual es la condicion por la cual se extraera el objeto
     * ejemplo "'Firulais'" Nota: los números van sin comillas y los String
     * entre comillas simples
     * @return ArrayList de Adminis dada la condicion enviada
     */
    public static ArrayList<Adminis> ConsultasAdminsPrueba(String variable, String condicion)
    {
        Connection con = ManipulaBD.conecta();
        ArrayList<Adminis> ap = null;
        if (con != null)
        {
            Querys sql = new Querys();
            ap = ManipulaBD.CargarAdminis(sql.Seleccion(con, "*", "adminis", variable + condicion));
            ManipulaBD.desconecta(con);
            if (ap != null)
            {
                System.out.println("Datos encontrados");
            } else
            {
                System.out.println("no se encontro nada");
            }
        }
        return ap;
    }

    public static void ModificarAdminis()
    {
        Connection con = ManipulaBD.conecta();
        if (con != null)
        {
            Querys sql = new Querys();
            ArrayList<Adminis> ap = ManipulaBD.CargarAdminis(sql.Seleccion(con, "*", "adminis", "id=" + 2 + ""));
            Adminis obj = new Adminis(ap.get(0).getId(), ap.get(0).getApellidoP(), ap.get(0).getApellidoM(),
                    "Elkevin", ap.get(0).getFechaNacimiento(), ap.get(0).getCURP(),
                    ap.get(0).getRfc(), ap.get(0).getSexo(), ap.get(0).getTelefono(),
                    ap.get(0).getCedulaProfe(), ap.get(0).getDireccion(), ap.get(0).getFolioEmpleado(),
                    ap.get(0).getHentrada(), ap.get(0).getHsalida(), ap.get(0).getPuesto(), ap.get(0).getCorreo(),
                    "gnomo115");
            if (obj != null)
            {
                BajasAdminisPrueba(obj.getId());
                AltasAdminisPrueba(obj.getId(), obj.getApellidoP(), obj.getApellidoM(), obj.getNombre(),
                        obj.getFechaNacimiento(), obj.getCURP(), obj.getRfc(), obj.getSexo(),
                        obj.getTelefono(), obj.getCedulaProfe(), obj.getDireccion(), obj.getFolioEmpleado(),
                        obj.getHentrada(), obj.getHsalida(), obj.getPuesto(), obj.getCorreo(), obj.getContrasenia());
            }
        }
    }
}
