package Interno;

/**
 *
 * @author Kevin
 */
public class Horarios1
{

    private int id;
    private int id_Materia;
    private int grado;
    private String grupo;
    private int horaI;
    private int horaF;
    private String dia;

    public Horarios1()
    {
    }

    public Horarios1(int id, int id_Materia, int grado, String grupo, int horaI, int horaF, String dia)
    {
        this.id = id;
        this.id_Materia = id_Materia;
        this.grado = grado;
        this.grupo = grupo;
        this.horaI = horaI;
        this.horaF = horaF;
        this.dia = dia;
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
     * @return the grado
     */
    public int getGrado()
    {
        return grado;
    }

    /**
     * @param grado the grado to set
     */
    public void setGrado(int grado)
    {
        this.grado = grado;
    }

    /**
     * @return the grupo
     */
    public String getGrupo()
    {
        return grupo;
    }

    /**
     * @param grupo the grupo to set
     */
    public void setGrupo(String grupo)
    {
        this.grupo = grupo;
    }

    /**
     * @return the horaI
     */
    public int getHoraI()
    {
        return horaI;
    }

    /**
     * @param horaI the horaI to set
     */
    public void setHoraI(int horaI)
    {
        this.horaI = horaI;
    }

    /**
     * @return the horaF
     */
    public int getHoraF()
    {
        return horaF;
    }

    /**
     * @param horaF the horaF to set
     */
    public void setHoraF(int horaF)
    {
        this.horaF = horaF;
    }

    /**
     * @return the dia
     */
    public String getDia()
    {
        return dia;
    }

    /**
     * @param dia the dia to set
     */
    public void setDia(String dia)
    {
        this.dia = dia;
    }

}
