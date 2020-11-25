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

    public static ArrayList<Profesor> cargaProfesores(ArrayList<Object> reg)
    {
        try
        {
            ArrayList<Profesor> v = new ArrayList<>();
            for (int i = 0; i < reg.size(); i += 14)
            {
                String idS = (String) reg.get(i);
                if (idS != "" && idS != " ")
                {
                    
                }
            }
            return v;
        } catch (Exception e)
        {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public static ArrayList<Adminis> cargaAdminist(ArrayList<Object> reg)
    {
        try
        {
            ArrayList<Adminis> o = new ArrayList<>();
            for (int i = 0; i < reg.size(); i += 15)
            {
                String idS = (String) reg.get(i);
                if (idS != "" && idS != " ")
                {
                    
                }
            }
            return o;
        } catch (Exception e)
        {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public static ArrayList<Alumnno> cargaAlumnos(ArrayList<Object> reg)
    {
        try
        {
            ArrayList<Alumnno> k = new ArrayList<>();
            for (int i = 0; i < reg.size(); i += 12)
            {
                String idS = (String) reg.get(i);
                if (idS != "" && idS != " ")
                {
                    
                }
            }
            return k;
        } catch (Exception e)
        {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public static ArrayList<Calificaciones> cargaCalificaciones(ArrayList<Object> reg)
    {
        try
        {
            ArrayList<Calificaciones> c = new ArrayList<>();
            for (int i = 0; i < reg.size(); i += 3)
            {
                String idS = (String) reg.get(i);
                if (idS != "" && idS != " ")
                {

                    double Calificaciones = Integer.parseInt(idS.trim());
                    String Matricula = ((String) reg.get(i + 1)).trim();

                    Calificaciones obj = new Calificaciones(Calificaciones, Matricula);
                    c.add(obj);
                }
            }
            return c;
        } catch (Exception e)
        {
            System.out.println(e.getMessage());
            return null;
        }
    }


}
