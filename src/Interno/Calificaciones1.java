package Interno;

/**
 *
 * @author DanielaGF
 */
public class Calificaciones1
{
    private int id;
    private int id_Alumno;
    private int id_Materia;
    private double Calificacion;

    public Calificaciones1()
    {
    }

    public Calificaciones1(int id, int id_Alumno, int id_Materia, double Calificacion)
    {
        this.id = id;
        this.id_Alumno = id_Alumno;
        this.id_Materia = id_Materia;
        this.Calificacion = Calificacion;
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

    /**
     * @return the id_Alumno
     */
    public int getId_Alumno()
    {
        return id_Alumno;
    }

    /**
     * @param id_Alumno the id_Alumno to set
     */
    public void setId_Alumno(int id_Alumno)
    {
        this.id_Alumno = id_Alumno;
    }

    /**
     * @return the id_Materia
     */
    public int getId_Materia()
    {
        return id_Materia;
    }

    /**
     * @param id_Materia the id_Materia to set
     */
    public void setId_Materia(int id_Materia)
    {
        this.id_Materia = id_Materia;
    }

    /**
     * @return the Calificacion
     */
    public double getCalificacion()
    {
        return Calificacion;
    }

    /**
     * @param Calificacion the Calificacion to set
     */
    public void setCalificacion(double Calificacion)
    {
        this.Calificacion = Calificacion;
    }
    
}
