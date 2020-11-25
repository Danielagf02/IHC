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


}
