package Interno;

import java.sql.Connection;
import java.util.ArrayList;
import poo.bd.Conexion;

/**
 *
 * @author DanielaGF
 */
public class ManipulaBD
{

    private static Conexion con = new Conexion();

    public static Connection conecta()
    {
        try
        {
            return con.Conecta("localhost:3306", "controlecolar", "root", "", 2);
        } catch (Exception ex)
        {
            System.out.println("Error al conectar en metodo conecta");
            return null;
        }
    }

    public static void desconecta(Connection conn)
    {
        con.desconectar(conn);
    }

    public static ArrayList<Adminis> CargarAdminis(ArrayList<Object> reg)
    {
        ArrayList<Adminis> lista = new ArrayList<>();
        try
        {
            for (int i = 0; i <= reg.size(); i += 17)
            {
                System.out.println("Vuelta " + i);
                String idS = "";
                idS = (String) reg.get(i);
                idS=idS.trim();
                System.out.println(idS);
                if (idS != "" && idS != " ")
                {
                    int id = Integer.parseInt(idS);
                    System.out.println("id creado " + id);
                    String ApellidoP = ((String) reg.get(i + 1)).trim();
                    System.out.println("ApellidoP creado " + ApellidoP);
                    String ApellidoM = ((String) reg.get(i + 2)).trim();
                    System.out.println("ApellidoM creado " + ApellidoM);
                    String Nombre = ((String) reg.get(i + 3)).trim();
                    System.out.println("Nombre creado " + ApellidoP);
                    String FechaNacimiento = ((String) reg.get(i + 4)).trim();
                    System.out.println("FechNac creado " + FechaNacimiento);
                    String Curp = ((String) reg.get(i + 5)).trim();
                    System.out.println("Curp creado " + Curp);
                    String rfc = ((String) reg.get(i + 6)).trim();
                    System.out.println("rfc creado " + rfc);
                    String sexo = ((String) reg.get(i + 7)).trim();
                    System.out.println("sexo creado " + sexo);
                    String tele = ((String) reg.get(i + 8)).trim();
                    int telefono = Integer.parseInt(tele);
                    System.out.println("telefono creado " + telefono);
                    String CedulaProfe = ((String) reg.get(i + 9)).trim();
                    System.out.println("ceduprofe creado " + CedulaProfe);
                    String Direccion = ((String) reg.get(i + 10)).trim();
                    System.out.println("direccion creado " + Direccion);
                    String FolioEmpleadoS = ((String) reg.get(i + 11)).trim();
                    int FolioEmpleado = Integer.parseInt(FolioEmpleadoS);
                    System.out.println("folioempleado creado " + FolioEmpleado);
                    String Hentrada = ((String) reg.get(i + 12)).trim();
                    System.out.println("hentra creado " + Hentrada);
                    String Hsalida = ((String) reg.get(i + 13)).trim();
                    System.out.println("hsalida creado " + Hsalida);
                    String Puesto = ((String) reg.get(i + 14)).trim();
                    System.out.println("puesto creado " + Puesto);
                    String Correo = ((String) reg.get(i + 15)).trim();
                    System.out.println("correo creado " + Correo);
                    String Contrasenia = ((String) reg.get(i + 16)).trim();
                    System.out.println("contraseña creado " + Contrasenia);
                    Adminis obj = new Adminis(id, ApellidoP, ApellidoM, Nombre, FechaNacimiento, Curp, rfc, sexo, telefono,
                            CedulaProfe, Direccion, FolioEmpleado, Hentrada, Hsalida, Puesto, Correo, Contrasenia);
                    lista.add(obj);
                    System.out.println("Objeto agregado a la lista");
                }
            }
            System.out.println(lista.get(0).getNombre());
            System.out.println(lista.get(1).getNombre());
            return lista;
        } catch (Exception e)
        {
            System.out.println("Error al crear objeto");
            if (lista!=null)
            {
                return lista;
            } else
            {
                return null;
            }
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

    public static ArrayList<Horarios> CargarHorarios(ArrayList<Object> reg)
    {
        try
        {
            ArrayList<Horarios> lista = new ArrayList<>();
            for (int i = 0; i < reg.size(); i += 6)
            {
                String idS = (String) reg.get(i);
                if (idS != "" && idS != " ")
                {
                    int id = Integer.parseInt(idS);
                    String id_Mat = ((String) reg.get(i + 1)).trim();
                    int id_Materias = Integer.parseInt(id_Mat);
                    String grad = ((String) reg.get(i + 2)).trim();
                    int grado = Integer.parseInt(grad);
                    String grupo = ((String) reg.get(i + 3)).trim();
                    String horaini = ((String) reg.get(i + 4)).trim();
                    int horaI = Integer.parseInt(horaini);
                    String horafin = ((String) reg.get(i + 5)).trim();
                    int horaF = Integer.parseInt(horafin);

                    Horarios obj = new Horarios(id, id_Materias, grado, grupo, horaI, horaF);
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
