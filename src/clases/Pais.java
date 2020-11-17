package clases;

/**
 *
 * @author Kevin
 */
public class Pais
{
    private int id;
    private String nombre;
    private boolean estatus;
    private int clave;

    public Pais()
    {
    }

    public Pais(int id, String nombre, boolean estatus, int clave)
    {
        this.id = id;
        this.nombre = nombre;
        this.estatus = estatus;
        this.clave = clave;
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

    /**
     * @return the estatus
     */
    public boolean isEstatus()
    {
        return estatus;
    }

    /**
     * @param estatus the estatus to set
     */
    public void setEstatus(boolean estatus)
    {
        this.estatus = estatus;
    }

    /**
     * @return the clave
     */
    public int getClave()
    {
        return clave;
    }

    /**
     * @param clave the clave to set
     */
    public void setClave(int clave)
    {
        this.clave = clave;
    }
    
}
