package bd;

import Interno.ManipulaBD;
import java.sql.Connection;
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
        AltasAdminisPrueba();
        
    }

    public static void AltasAdminisPrueba()
    {
//        int id = 1;
//        String ApellidoP = "Reunel";
//        String ApellidoM = "Tolkien";
//        String Nombre = "John";
//        String fechaNacimiento = "03/01/1892";
//        String CURP = "123456789012345678";
//        String rfc = "12345678";
//        String sexo = "Hombre";
//        int Telefono = 12345;
//        String CedulaProfe = "4r5g";
//        String Direccion = "Londres, iIngleterra";
//        int FolioEmpleado = 1;
//        String Hentrada = "2:00";
//        String Hsalida = "3:00";
//        String Puesto = "Director";
//        String Correo = "Tolkien@gandalf.com";
//        String Contraseña = "hobit123";
        
//        int id = 2;
//        String ApellidoP = "Escutia";
//        String ApellidoM = "Ceja";
//        String Nombre = "Kevin";
//        String fechaNacimiento = "15/01/2000";
//        String CURP = "876543210987654321";
//        String rfc = "15151515";
//        String sexo = "Hombre";
//        int Telefono = 72913;
//        String CedulaProfe = "EUCK001";
//        String Direccion = "Doroteo Arango";
//        int FolioEmpleado = 2;
//        String Hentrada = "2:00";
//        String Hsalida = "3:00";
//        String Puesto = "SubDirector";
//        String Correo = "Tolkien@gandalf.com";
//        String Contraseña = "hobit123";
        
        int id = 3;
        String ApellidoP = "Garduño";
        String ApellidoM = "Fernandez";
        String Nombre = "Daniela";
        String fechaNacimiento = "04/10/2000";
        String CURP = "287567934795678329";
        String rfc = "0000000";
        String sexo = "Mujer";
        int Telefono = 722453;
        String CedulaProfe = "FEDG104";
        String Direccion = "Santiago";
        int FolioEmpleado = 3;
        String Hentrada = "2:00";
        String Hsalida = "3:00";
        String Puesto = "SubDirector";
        String Correo = "Daniela@gmail.com";
        String Contraseña = "yonas200";

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

}
