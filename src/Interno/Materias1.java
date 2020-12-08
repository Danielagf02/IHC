package Interno;

/**
 *
 * @author Kevin
 */
public class Materias1
{

    private int id;
    private int grado;
    private String grupo;
    private String nombre;

    public Materias1()
    {
    }

    public Materias1(int id, int grado, String grupo, String nombre)
    {
        this.id = id;
        this.grado = grado;
        this.grupo = grupo;
        this.nombre = nombre;
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
     * @return the nombre
     */
    public String getNombre()
    {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    
}
