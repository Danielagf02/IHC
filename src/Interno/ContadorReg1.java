/**
 * Clase usada por el gnomo apestoso para saber cuantas personas de que categoria
 * estan registrados en la base de datos
 */
package Interno;

/**
 *
 * @author Kevin
 */
public class ContadorReg1
{

    private int id;
    private int admin;
    private int alumno;
    private int profesores;

    public ContadorReg1()
    {
    }

    public ContadorReg1(int id, int admin, int alumno, int profesores)
    {
        this.id = id;
        this.admin = admin;
        this.alumno = alumno;
        this.profesores = profesores;
    }

    /**
     * @return the admin
     */
    public int getAdmin()
    {
        return admin;
    }

    /**
     * @param admin the admin to set
     */
    public void setAdmin(int admin)
    {
        this.admin = admin;
    }

    /**
     * @return the alumno
     */
    public int getAlumno()
    {
        return alumno;
    }

    /**
     * @param alumno the alumno to set
     */
    public void setAlumno(int alumno)
    {
        this.alumno = alumno;
    }

    /**
     * @return the profesores
     */
    public int getProfesores()
    {
        return profesores;
    }

    /**
     * @param profesores the profesores to set
     */
    public void setProfesores(int profesores)
    {
        this.profesores = profesores;
    }

    /**
     * @return the id
     */
    public int getId()
    {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id)
    {
        this.id = id;
    }

}
