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

    public static ArrayList<Profesor> CargarProfesor(ArrayList<Object> reg)
    {
        try
        {
            ArrayList<Profesor> lista = new ArrayList<>();

            for (int i = 0; i < reg.size(); i++)
            {
                String idS = (String) reg.get(i);
                if (idS != "" && idS != " ")
                {
                    int id = Integer.parseInt(idS);
                    String grad = ((String) reg.get(i + 1)).trim();
                    int Grado = Integer.parseInt(grad);
                    String Grupo = ((String) reg.get(i + 2)).trim();
                    String ApellidoP = ((String) reg.get(i + 3)).trim();
                    String ApellidoM = ((String) reg.get(i + 4)).trim();
                    String Nombres = ((String) reg.get(i + 5)).trim();
                    String fechaNacimiento = ((String) reg.get(i + 6)).trim();
                    String CURP = ((String) reg.get(i + 7)).trim();
                    String sexo = ((String) reg.get(i + 8)).trim();
                    String tele = ((String) reg.get(i + 9)).trim();
                    int Telefono = Integer.parseInt(tele);
                    String CedulaProf = ((String) reg.get(i + 10)).trim();
                    String Direccion = ((String) reg.get(i + 11)).trim();
                    String rfc = ((String) reg.get(i + 12)).trim();
                    String Hentrada = ((String) reg.get(i + 13)).trim();
                    String Hsalida = ((String) reg.get(i + 14)).trim();
                    String Correo = ((String) reg.get(i + 15)).trim();
                    String Constraseña = ((String) reg.get(i + 16)).trim();
                    Profesor obj = new Profesor(id, Grado, Grupo, ApellidoP, ApellidoM, Nombres, fechaNacimiento, CURP,
                            sexo, Telefono, CedulaProf, Direccion, rfc, Hentrada, Hsalida, Correo, Constraseña);
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

    public static ArrayList<Alumnno> CargarAlumno(ArrayList<Object> reg)
    {
        try
        {
            ArrayList<Alumnno> lista = new ArrayList<>();

            for (int i = 0; i < reg.size(); i += 15)
            {
                String idS = (String) reg.get(i);
                if (idS != "" && idS != " ")
                {
                    int id = Integer.parseInt(idS);
                    String grad = ((String) reg.get(i + 1)).trim();
                    int Grado = Integer.parseInt(grad);
                    String Grupo = ((String) reg.get(i + 2)).trim();
                    String ApellidoP = ((String) reg.get(i + 3)).trim();
                    String ApellidoM = ((String) reg.get(i + 4)).trim();
                    String Nombre = ((String) reg.get(i + 5)).trim();
                    String fechaNacimiento = ((String) reg.get(i + 6)).trim();
                    String CURP = ((String) reg.get(i + 7)).trim();
                    String sexo = ((String) reg.get(i + 8)).trim();
                    String tele = ((String) reg.get(i + 9)).trim();
                    int Telefono = Integer.parseInt(tele);
                    String NomMadre = ((String) reg.get(i + 10)).trim();
                    String NomPadre = ((String) reg.get(i + 11)).trim();
                    String folio = ((String) reg.get(i + 12)).trim();
                    int FolioAlumno = Integer.parseInt(folio);
                    String Correo = ((String) reg.get(i + 13)).trim();
                    String Contraseña = ((String) reg.get(i + 14)).trim();
                    Alumnno obj = new Alumnno(id, Grado, Grupo, ApellidoP, ApellidoM, Nombre, fechaNacimiento, CURP, sexo,
                            Telefono, NomMadre, NomPadre, FolioAlumno, Correo, Contraseña);
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

    public static ArrayList<Calificaciones> CargaCalificacion(ArrayList<Object> reg)
    {
        try
        {
            ArrayList<Calificaciones> lista = new ArrayList<>();

            for (int i = 0; i < reg.size(); i += 4)
            {
                String idS = (String) reg.get(i);
                if (idS != "" && idS != " ")
                {
                    int id = Integer.parseInt(idS);
                    String id_Alum = ((String) reg.get(i + 1)).trim();
                    int id_Alumno = Integer.parseInt(id_Alum);
                    String id_Mat = ((String) reg.get(i + 2)).trim();
                    int id_Materia = Integer.parseInt(id_Mat);
                    String cal = ((String) reg.get(i + 3)).trim();
                    double Calificaciones = Double.parseDouble(cal);
                    Calificaciones obj = new Calificaciones(id, id_Alumno, id_Materia, Calificaciones);
                }
            }
            return lista;
        } catch (Exception e)
        {
            System.out.println("Error al crear objeto");
            return null;
        }
    }

    public static ArrayList<Materias> CargarMateria(ArrayList<Object> reg)
    {
        try
        {
            ArrayList<Materias> lista = new ArrayList<>();
            for (int i = 0; i < reg.size(); i += 4)
            {
                String idS = (String) reg.get(i);
                if (idS != "" && idS != " ")
                {
                    int id = Integer.parseInt(idS);
                    String grad = ((String) reg.get(i + 1)).trim();
                    int grado = Integer.parseInt(grad);
                    String grupo = ((String) reg.get(i + 2)).trim();
                    String nombre = ((String) reg.get(i + 3)).trim();
                    Materias obj = new Materias(id, grado, grupo, nombre);
                    lista.add(obj);
                }
            }
            return lista;
        } catch (Exception e)
        {
            System.out.println("Error al crear objetos");
            return null;
        }
    }

}
