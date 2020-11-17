package clases;

/**
 *
 * @author Kevin
 */
public class Detalles_Ventas
{
    private int id;
    private int id_Productos;
    private int id_Personas;
    private int id_CantidadV;
    private float precio_Total;

    public Detalles_Ventas()
    {
    }

    public Detalles_Ventas(int id, int id_Productos, int id_Personas, int id_CantidadV, float precio_Total)
    {
        this.id = id;
        this.id_Productos = id_Productos;
        this.id_Personas = id_Personas;
        this.id_CantidadV = id_CantidadV;
        this.precio_Total = precio_Total;
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
     * @return the id_Productos
     */
    public int getId_Productos()
    {
        return id_Productos;
    }

    /**
     * @param id_Productos the id_Productos to set
     */
    public void setId_Productos(int id_Productos)
    {
        this.id_Productos = id_Productos;
    }

    /**
     * @return the id_Personas
     */
    public int getId_Personas()
    {
        return id_Personas;
    }

    /**
     * @param id_Personas the id_Personas to set
     */
    public void setId_Personas(int id_Personas)
    {
        this.id_Personas = id_Personas;
    }

    /**
     * @return the id_CantidadV
     */
    public int getId_CantidadV()
    {
        return id_CantidadV;
    }

    /**
     * @param id_CantidadV the id_CantidadV to set
     */
    public void setId_CantidadV(int id_CantidadV)
    {
        this.id_CantidadV = id_CantidadV;
    }

    /**
     * @return the precio_Total
     */
    public float getPrecio_Total()
    {
        return precio_Total;
    }

    /**
     * @param precio_Total the precio_Total to set
     */
    public void setPrecio_Total(float precio_Total)
    {
        this.precio_Total = precio_Total;
    }
    
    
    
}
