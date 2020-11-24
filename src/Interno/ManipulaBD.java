package Interno;

/import cjb.ci.Mensaje;
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
            Mensaje.error(jf, "No se pudo conectar a la BD, " + ex.toString());
            return null;
        }
    }

    public static void desconecta(Connection conn)
    {
        con.desconectar(conn);
    }

    public static ArrayList<Profesor> cargaP(ArrayList<Object> reg)
    {
        try
        {
            ArrayList<Profesor> v = new ArrayList<>();
            for (int i = 0; i < reg.size(); i += 14)
            {
                String idS = (String) reg.get(i);
                if (idS != "" && idS != " ")
                {
                    String ApellidoP = ((String) reg.get(i + 1)).trim();
                    String ApellidoM= ((String) reg.get(i + 2)).trim();
                    String Nombres= ((String) reg.get(i + 3)).trim();
                    String fechaNacimiento = ((String) reg.get(i + 4)).trim();
                    String CURP = ((String) reg.get(i + 5)).trim();
                    String sexo = ((String) reg.get(i + 6)).trim();
                    int Grado=Integer.parseInt(idS.trim());
                    String Grupo= ((String) reg.get(i + 7)).trim();
                    int Telefono = Integer.parseInt(idS.trim());
                    String CedulaProf = ((String) reg.get(i + 8)).trim();
                    int FolioProfesor= Integer.parseInt(idS.trim());
                    String rfc = ((String) reg.get(i +9)).trim();
                    String Hentrada= ((String) reg.get(i +10)).trim();
                    String Hsalida= ((String) reg.get(i +11)).trim();
                    String Correo= ((String) reg.get(i + 12)).trim();
                    String Contraseña = ((String) reg.get(i + 13)).trim();
                    Profesor obj = new Profesor(ApellidoP,ApellidoM,Nombres,fechaNacimiento,CURP,sexo,Grado,Grupo,Telefono,CedulaProf,FolioProfesor,Hentrada,Hsalida,Correo,Contraseña);
                    obj.setFolioProfesor(FolioProfesor);
                    v.add(obj);
                }
            }
            return v;
        } catch (Exception e)
        {
            System.out.println(e.getMessage());
            return null;
        }
    }
     public static ArrayList<Adminis> cargaB(ArrayList<Object> reg)
    {
        try
        {
            ArrayList<Adminis> o = new ArrayList<>();
            for (int i = 0; i < reg.size(); i += 15)
            {
                String idS = (String) reg.get(i);
                if (idS != "" && idS != " ")
                {
                
                    String ApellidoP = ((String) reg.get(i + 1)).trim();
                    String ApellidoM= ((String) reg.get(i + 2)).trim();
                    String Nombre= ((String) reg.get(i + 3)).trim();
                    String fechaNacimiento = ((String) reg.get(i + 4)).trim();
                    String CURP = ((String) reg.get(i + 5)).trim();
                    String rfc= ((String) reg.get(i + 6)).trim();
                    String sexo= ((String) reg.get(i + 7)).trim();
                    int Telefono = Integer.parseInt(idS.trim());
                    String CedulaProfe = ((String) reg.get(i + 8)).trim();
                    String Direccion = ((String) reg.get(i + 9)).trim();
                    int FolioEmpleado= Integer.parseInt(idS.trim());
                    String Hentrada= ((String) reg.get(i +10)).trim();
                    String Hsalida= ((String) reg.get(i +11)).trim();
                     String Puesto = ((String) reg.get(i +2)).trim();
                    String Correo= ((String) reg.get(i + 13)).trim();
                    String Contraseña = ((String) reg.get(i + 14)).trim();
                    Adminis obj = new Adminis(ApellidoP,ApellidoM,Nombre,fechaNacimiento,CURP,rfc,sexo,Telefono,CedulaProfe,Direccion,FolioEmpleado,Hentrada,Hsalida,Puesto,Correo,Contraseña);
                    obj.setFolioEmpleado(FolioEmpleado);
                    o.add(obj);
                            //o.add(obj);  // error y no se porque aiuda
                }
            }
            return o;
        } catch (Exception e)
        {
            System.out.println(e.getMessage());
            return null;
        }
    }
 public static ArrayList<Alumnno> cargaL(ArrayList<Object> reg)
    {
        try
        {
            ArrayList<Alumnno> k =new ArrayList<>();
            for (int i = 0; i < reg.size(); i += 12)
            {
                String idS = (String) reg.get(i);
                if (idS != "" && idS != " ")
                {
                
                    String ApellidoP = ((String) reg.get(i + 1)).trim();
                    String ApellidoM= ((String) reg.get(i + 2)).trim();
                    String Nombres= ((String) reg.get(i + 3)).trim();
                    String fechaNacimiento = ((String) reg.get(i + 4)).trim();
                    String CURP = ((String) reg.get(i + 5)).trim();
                    String sexo = ((String) reg.get(i + 6)).trim();
                    int Grado=Integer.parseInt(idS.trim());
                    String Grupo= ((String) reg.get(i + 7)).trim();
                    int Telefono = Integer.parseInt(idS.trim());
                    String NombreMadre = ((String) reg.get(i + 8)).trim();
                    String NombrePadre = ((String) reg.get(i + 9)).trim();
                    int FolioAlumno= Integer.parseInt(idS.trim());
                    String Correo= ((String) reg.get(i + 10)).trim();
                    String Contraseña = ((String) reg.get(i + 11)).trim();
                    Alumnno obj = new Alumnno(ApellidoP,ApellidoM,Nombres,fechaNacimiento,CURP,sexo,Grado,Grupo,Telefono,NombreMadre,NombrePadre,FolioAlumno,Correo,Contraseña);
                    obj.setFolioAlumno(FolioAlumno);
                    k.add(obj);
                }            }
            return k;
        } catch (Exception e)
        {
            System.out.println(e.getMessage());
            return null;
        }
    }
 
 
 public static ArrayList<Calificaciones> cargaC(ArrayList<Object> reg)
    {
        try
        {
            ArrayList<Calificaciones> c =new ArrayList<>();
            for (int i = 0; i < reg.size(); i += 3)
            {
                String idS = (String) reg.get(i);
                if (idS != "" && idS != " ")
                {
                

                    double Calificaciones = Integer.parseInt(idS.trim());
                    String Matricula = ((String) reg.get(i + 1)).trim();
      
                    Calificaciones obj = new Calificaciones (Calificaciones,Matricula);
                    c.add(obj);
                }            }
            return c;
        } catch (Exception e)
        {
            System.out.println(e.getMessage());
            return null;
        }
    }
 
    public static ArrayList<Admin> cargaA(ArrayList<Object> reg)
    {
        try
        {
            ArrayList<Admin> v = new ArrayList<>();
            for (int i = 0; i < reg.size(); i += 2)
            {
                String UsuS = (String) reg.get(i);
                if (UsuS != "" && UsuS != " ")
                {
                    String contraseña = ((String) reg.get(i + 1)).trim();
                    Admin obj = new Admin(UsuS, contraseña);
                    v.add(obj);
                }
            }
            return v;
        } catch (Exception e)
        {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public static ArrayList<Dias> cargaH(ArrayList<Object> reg)
    {
        try
        {
            ArrayList<Dias> v = new ArrayList<>();
            for (int i = 0; i < reg.size(); i += 5)
            {
                String semanaS = (String) reg.get(i);
                if (semanaS != "" && semanaS != " ")
                {
                    int semana = Integer.parseInt(semanaS.trim());
                    String nom = ((String) reg.get(i+1)).trim();
                    String dia = ((String) reg.get(i + 2)).trim();
                    String hent = ((String) reg.get(i + 3)).trim();
                    String hsal = ((String) reg.get(i + 4)).trim();
                    Dias obj = new Dias(semana, nom, dia, hent, hsal);
                    v.add(obj);
                }
            }
            return v;
        } catch (Exception e)
        {
            System.out.println(e.getMessage());
            return null;
        }
    }

}
