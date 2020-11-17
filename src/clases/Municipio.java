package clases;

/**
 *
 * @author Kevin
 */
public class Municipio
{

    private int id;
    private int id_Entidad;
    private boolean estatus;
    private String nombre;

    public Municipio()
    {
    }

    public Municipio(int id, int id_Entidad, boolean estatus, String nombre)
    {
        this.id = id;
        this.id_Entidad = id_Entidad;
        this.estatus = estatus;
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
     * @return the id_Entidad
     */
    public int getId_Entidad()
    {
        return id_Entidad;
    }

    /**
     * @param id_Entidad the id_Entidad to set
     */
    public void setId_Entidad(int id_Entidad)
    {
        this.id_Entidad = id_Entidad;
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

    public void BuscarE(int id)
    {
        this.id_Entidad = id;
    }

    public void BuscarE(String nombre)
    {

    }
}
