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
                String idS = "";
                idS = (String) reg.get(i);
                idS = idS.trim();
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
                    String Contrasenia = ((String) reg.get(i + 16)).trim();
                    Adminis obj = new Adminis(id, ApellidoP, ApellidoM, Nombre, FechaNacimiento, Curp, rfc, sexo, telefono,
                            CedulaProfe, Direccion, FolioEmpleado, Hentrada, Hsalida, Puesto, Correo, Contrasenia);
                    lista.add(obj);
                    System.out.println("Objeto agregado a la lista");
                }
            }
            return lista;
        } catch (Exception e)
        {
            System.out.println("Error al crear objeto");
            if (lista != null)
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
        ArrayList<Profesor> lista = new ArrayList<>();
        try
        {
            for (int i = 0; i < reg.size(); i++)
            {
                String idS = "";
                idS = (String) reg.get(i);
                idS = idS.trim();
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
                    System.out.println("Objeto agregado a la lista");
                }
            }
            return lista;
        } catch (Exception e)
        {
            System.out.println("Error al crear objeto");
            if (lista != null)
            {
                return lista;
            } else
            {
                return null;
            }
        }
    }

    public static ArrayList<Alumnno> CargarAlumno(ArrayList<Object> reg)
    {
        ArrayList<Alumnno> lista = new ArrayList<>();
        try
        {
            for (int i = 0; i < reg.size(); i += 15)
            {
                String idS = "";
                idS = (String) reg.get(i);
                idS = idS.trim();
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
            if (lista != null)
            {
                return lista;
            } else
            {
                return null;
            }
        }
    }

    public static ArrayList<Calificaciones> CargaCalificacion(ArrayList<Object> reg)
    {
        ArrayList<Calificaciones> lista = new ArrayList<>();
        try
        {
            for (int i = 0; i < reg.size(); i += 4)
            {
                String idS = "";
                idS = (String) reg.get(i);
                idS = idS.trim();
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
            if (lista != null)
            {
                return lista;
            } else
            {
                return null;
            }
        }
    }

    public static ArrayList<Materias> CargarMateria(ArrayList<Object> reg)
    {
        ArrayList<Materias> lista = new ArrayList<>();
        try
        {
            for (int i = 0; i < reg.size(); i += 4)
            {
                String idS = "";
                idS = (String) reg.get(i);
                idS = idS.trim();
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
            if (lista != null)
            {
                return lista;
            } else
            {
                return null;
            }
        }
    }

    public static ArrayList<Horarios> CargarHorarios(ArrayList<Object> reg)
    {
        ArrayList<Horarios> lista = new ArrayList<>();
        try
        {
            for (int i = 0; i < reg.size(); i += 6)
            {
                String idS = "";
                idS = (String) reg.get(i);
                idS = idS.trim();
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
            if (lista != null)
            {
                return lista;
            } else
            {
                return null;
            }
        }
    }

    public static ArrayList<ContadorReg> CargaContador(ArrayList<Object> reg)
    {
        ArrayList<ContadorReg> lista = new ArrayList<>();
        try
        {
            for (int i = 0; i < reg.size(); i += 4)
            {
                String idS = "";
                idS = (String) reg.get(i);
                idS = idS.trim();
                if (idS != "" && idS != " ")
                {
                    int id = Integer.parseInt(idS);
                    String ad = ((String) reg.get(i + 1)).trim();
                    int admin = Integer.parseInt(ad);
                    String al = ((String) reg.get(i + 2)).trim();
                    int alumno = Integer.parseInt(al);
                    String pr = ((String) reg.get(i + 3)).trim();
                    int profesores = Integer.parseInt(pr);
                    ContadorReg obj = new ContadorReg(id, admin, alumno, profesores);
                    lista.add(obj);
                }
            }
            return lista;
        } catch (Exception e)
        {
            System.out.println("Error al crear objeto");
            if (lista != null)
            {
                return lista;
            } else
            {
                return null;
            }
        }
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
    public static void AltasAdminis(int id, String ApellidoP, String ApellidoM, String Nombre, String fechaNacimiento, String CURP,
            String rfc, String sexo, int Telefono, String CedulaProfe, String Direccion, int FolioEmpleado, String Hentrada, String Hsalida,
            String Puesto, String Correo, String Contraseña)
    {
        Connection con = ManipulaBD.conecta();
        if (con != null)
        {
            poo.bd.Querys sql = new poo.bd.Querys();
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
    public static void BajasAdminis(int id)
    {
        Connection con = ManipulaBD.conecta();
        if (con != null)
        {
            poo.bd.Querys sql = new poo.bd.Querys();
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
    public static ArrayList<Adminis> ConsultasAdmins(String variable, String condicion)
    {
        Connection con = ManipulaBD.conecta();
        ArrayList<Adminis> ap = null;
        if (con != null)
        {
            poo.bd.Querys sql = new poo.bd.Querys();
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

    /**
     * Método para modificar datos en la bd de un usario adminis
     *
     * @param id el id de la persona que se modificara sus datos
     * @param campos los campos que seran cambiados ejemplo: "Nombre,Telefono"
     * @param datos los datos nuevos que seran remplazados en la bd ejemplo:
     * "'Pancho',1234" los datos tipos String deben ser puestos entre comillas
     * simples
     */
    public static void ModificarAdminis(int id, String campos, String datos)
    {
        Connection con = ManipulaBD.conecta();
        if (con != null)
        {
            poo.bd.Querys sql = new poo.bd.Querys();
            ArrayList<Adminis> ap = ManipulaBD.CargarAdminis(sql.Seleccion(con, "*", "adminis", "id=" + id + ""));
            if (ap != null)
            {
                sql.Modificar(con, "adminis", campos, datos, "id='" + id + "'");
                ManipulaBD.desconecta(con);
                System.out.println("Modificados");
            }
        }
    }

    /**
     *Método que hace las altas de los profesores en la base de datos
     * @param id tipo int
     * @param Grado tipo int
     * @param Grupo tipo String
     * @param ApellidoP tipo String
     * @param ApellidoM tipo String
     * @param Nombres tipo String
     * @param fechaNacimiento tipo String
     * @param CURP tipo String
     * @param sexo tipo String
     * @param Telefono tipo int
     * @param CedulaProf tipo String
     * @param Direccion tipo String
     * @param rfc tipo String
     * @param Hentrada tipo String
     * @param Hsalida tipo String
     * @param Correo tipo String
     * @param Contraseña tipo String
     */
    public static void AltasProfesores(int id, int Grado, String Grupo, String ApellidoP, String ApellidoM, String Nombres,
            String fechaNacimiento, String CURP, String sexo, int Telefono, String CedulaProf, String Direccion, String rfc,
            String Hentrada, String Hsalida, String Correo, String Contraseña)
    {
        Connection con = ManipulaBD.conecta();
        if (con != null)
        {
            poo.bd.Querys sql = new poo.bd.Querys();
            sql.Insertar(con, "profesor",
                    "" + id + ","
                    + Grado + ",'"
                    + Grupo + "','"
                    + ApellidoP + "','"
                    + ApellidoM+ "','"
                    + Nombres + "','"
                    + fechaNacimiento + "','"
                    + CURP + "','"
                    + sexo + "',"
                    + Telefono + ",'"
                    + CedulaProf + "','"
                    + Direccion + "','"
                    + rfc + "','"
                    + Hentrada + "','"
                    + Hsalida + "','"
                    + Correo + "','"
                    + Contraseña + "'");
            ManipulaBD.desconecta(con);
            System.out.println("Dato Insertado");
        }
    }

    /**
     * Se debe enviar el id ya que es unico e impide la eliminacion de un dato
     * erroneo así como se recomienda hacer uso del metodo ConsultasProfesores el
     * cual sera usado para encontrar cual es dato que se quiere eliminar
     *
     * @param id tipo int es el identificador unico del objeto en la bd
     */
    public static void BajasProfesores(int id)
    {
        Connection con = ManipulaBD.conecta();
        if (con != null)
        {
            poo.bd.Querys sql = new poo.bd.Querys();
            sql.Delete(con, "profesor", "id", "" + id + "");
        }
        ManipulaBD.desconecta(con);
    }

    /**
     * Método para colsutar en la bd en la tabla de profesor y retorna el objeto
     * o los objetos en un arraylist esto con la intencion de traer lo que se
     * requiera en el momento 
     * PD: Si quieres traer todos los datos la variable debe ser id!= y la 
     * condicion es 0
     * @param variable que variable va a buscar en la base ejemplo "Nombre=" es
     * importante poner el igual
     * @param condicion cual es la condicion por la cual se extraera el objeto
     * ejemplo "'Firulais'" Nota: los números van sin comillas y los String
     * entre comillas simples
     * @return ArrayList de Adminis dada la condicion enviada
     */
    public static ArrayList<Profesor> ConsultasProfesores(String variable, String condicion)
    {
        Connection con = ManipulaBD.conecta();
        ArrayList<Profesor> ap = null;
        if (con != null)
        {
            poo.bd.Querys sql = new poo.bd.Querys();
            ap = ManipulaBD.CargarProfesor(sql.Seleccion(con, "*", "profesor", variable + condicion));
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

    /**
     * Método para modificar datos en la bd de un usario profesor
     *
     * @param id el id de la persona que se modificara sus datos
     * @param campos los campos que seran cambiados ejemplo: "Nombre,Telefono"
     * @param datos los datos nuevos que seran remplazados en la bd ejemplo:
     * "'Pancho',1234" los datos tipos String deben ser puestos entre comillas
     * simples
     */
    public static void ModificarProfesores(int id, String campos, String datos)
    {
        Connection con = ManipulaBD.conecta();
        if (con != null)
        {
            poo.bd.Querys sql = new poo.bd.Querys();
            ArrayList<Profesor> ap = ManipulaBD.CargarProfesor(sql.Seleccion(con, "*", "profesor", "id=" + id + ""));
            if (ap != null)
            {
                sql.Modificar(con, "profesor", campos, datos, "id='" + id + "'");
                ManipulaBD.desconecta(con);
                System.out.println("Modificados");
            }
        }
    }

    /**
     * Método usado para dar de alta en la bd un objeto del tipo alumno
     * 
     * @param id tipo int
     * @param Grado tipo int
     * @param Grupo Tipo String
     * @param ApellidoP Tipo String
     * @param ApellidoM Tipo String
     * @param Nombre Tipo String
     * @param fechaNacimiento Tipo String
     * @param CURP Tipo String
     * @param sexo Tipo String
     * @param Telefono tipo int
     * @param NomMadre Tipo String
     * @param NomPadre Tipo String
     * @param FolioAlumno tipo int
     * @param Correo Tipo String
     * @param Contraseña  Tipo String
     */
    public static void AltasAlumnos(int id, int Grado, String Grupo, String ApellidoP, String ApellidoM, String Nombre, 
            String fechaNacimiento, String CURP, String sexo, int Telefono, String NomMadre, String NomPadre, int FolioAlumno, 
            String Correo, String Contraseña)
    {
        Connection con = ManipulaBD.conecta();
        if (con != null)
        {
            poo.bd.Querys sql = new poo.bd.Querys();
            sql.Insertar(con, "alumnos",
                    "" + id + ","
                    + Grado + ",'"
                    + Grupo + "','"
                    + ApellidoP + "','"
                    + ApellidoM+ "','"
                    + Nombre + "','"
                    + fechaNacimiento + "','"
                    + CURP + "','"
                    + sexo + "',"
                    + Telefono + ",'"
                    + NomMadre + "','"
                    + NomPadre + "',"
                    + FolioAlumno + ",'"
                    + Correo + "','"
                    + Contraseña + "','");
            ManipulaBD.desconecta(con);
            System.out.println("Dato Insertado");
        }
    }

    /**
     * Se debe enviar el id ya que es unico e impide la eliminacion de un dato
     * erroneo así como se recomienda hacer uso del metodo ConsultasAlumnos el
     * cual sera usado para encontrar cual es dato que se quiere eliminar
     *
     * @param id tipo int es el identificador unico del objeto en la bd
     */
    public static void BajasAlumnos(int id)
    {
        Connection con = ManipulaBD.conecta();
        if (con != null)
        {
            poo.bd.Querys sql = new poo.bd.Querys();
            sql.Delete(con, "alumnos", "id", "" + id + "");
        }
        ManipulaBD.desconecta(con);
    }

    /**
     * Método para colsutar en la bd en la tabla de alumnos y retorna el objeto
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
    public static ArrayList<Alumnno> ConsultasAlumnos(String variable, String condicion)
    {
        Connection con = ManipulaBD.conecta();
        ArrayList<Alumnno> ap = null;
        if (con != null)
        {
            poo.bd.Querys sql = new poo.bd.Querys();
            ap = ManipulaBD.CargarAlumno(sql.Seleccion(con, "*", "alumnos", variable + condicion));
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

    /**
     * Método para modificar datos en la bd de un usario Alumnos
     *
     * @param id el id de la persona que se modificara sus datos
     * @param campos los campos que seran cambiados ejemplo: "Nombre,Telefono"
     * @param datos los datos nuevos que seran remplazados en la bd ejemplo:
     * "'Pancho',1234" los datos tipos String deben ser puestos entre comillas
     * simples
     */
    public static void ModificarAlumnos(int id, String campos, String datos)
    {
        Connection con = ManipulaBD.conecta();
        if (con != null)
        {
            poo.bd.Querys sql = new poo.bd.Querys();
            ArrayList<Alumnno> ap = ManipulaBD.CargarAlumno(sql.Seleccion(con, "*", "alumnos", "id=" + id + ""));
            if (ap != null)
            {
                sql.Modificar(con, "alumnos", campos, datos, "id='" + id + "'");
                ManipulaBD.desconecta(con);
                System.out.println("Modificados");
            }
        }
    }

}
