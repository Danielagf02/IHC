package Interno;

import java.sql.Connection;
import java.util.ArrayList;
import javax.swing.JFrame;
import poo.bd.Conexion;

/**
 *
 * @author DanielaGF
 */
public class ManipulaBD
{
//falta hacer el array de alumnos y administrativos
    // falta array de calificaciones 

    private static Conexion con = new Conexion();

    public static Connection conecta(JFrame jf)
    {
        try
        {
            return con.Conecta("localhost:3306", "ControlEcolar", "root", "", 2);
        } catch (Exception ex)
        {
            System.out.println("Error");
            return null;
        }
    }

    public static void desconecta(Connection conn)
    {
        con.desconectar(conn);
    }

    public static ArrayList<Adminis> CargarAdminis(ArrayList<Object> reg)
    {
        try
        {
            ArrayList<Adminis> lista = new ArrayList<>();

            for (int i = 0; i < reg.size(); i += 17)
            {
                String idS = (String) reg.get(i);
                if (idS != "" && idS != " ")
                {
                    int id = Integer.parseInt(idS);
                    String ApellidoP = ((String) reg.get(i + 1)).trim();
                    String ApellidoM = ((String) reg.get(i + 2)).trim();
                    String Nombre = ((String) reg.get(i + 3)).trim();
                    String FechaNacimiento = ((String) reg.get(i + 4)).trim();
                    String Curp = ((String) reg.get(i + 5)).trim();
                    String rfc = ((String) reg.get(i + 6)).trim();
                    String sexo = ((String) reg.get(i + 7)).trim();
                    String tele = ((String) reg.get(i + 8)).trim();
                    int telefono = Integer.parseInt(tele);
                    String CedulaProfe = ((String) reg.get(i + 9)).trim();
                    String Direccion = ((String) reg.get(i + 10)).trim();
                    String FolioEmpleadoS = ((String) reg.get(i + 11)).trim();
                    int FolioEmpleado = Integer.parseInt(FolioEmpleadoS);
                    String Hentrada = ((String) reg.get(i + 12)).trim();
                    String Hsalida = ((String) reg.get(i + 13)).trim();
                    String Puesto = ((String) reg.get(i + 14)).trim();
                    String Correo = ((String) reg.get(i + 15)).trim();
                    String Contraseña = ((String) reg.get(i + 16)).trim();
                    Adminis obj = new Adminis(id, ApellidoP, ApellidoM, Nombre, FechaNacimiento, Curp, rfc, sexo, telefono,
                            CedulaProfe, Direccion, FolioEmpleado, Hentrada, Hsalida, Puesto, Correo, Contraseña);
                    lista.add(obj);
                }
            }
            return lista;
        } catch (Exception e)
        {
            System.out.println("Error al crear objeto");
            return null;
        }
    }

}
