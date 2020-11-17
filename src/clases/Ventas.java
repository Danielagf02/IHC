package clases;

/**
 *
 * @author Kevin
 */
public class Ventas
{

    private int id;
    private int id_DV;
    private int producto;
    private String fecha;
    private int hora;
    private int cantidadV;
    private float Costos;

    public Ventas(int id, int id_DV, int producto, String fecha, int hora, int cantidadV, float Costos)
    {
        this.id = id;
        this.id_DV = id_DV;
        this.producto = producto;
        this.fecha = fecha;
        this.hora = hora;
        this.cantidadV = cantidadV;
        this.Costos = Costos;
    }

    public Ventas()
    {
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
     * @return the id_DV
     */
    public int getId_DV()
    {
        return id_DV;
    }

    /**
     * @param id_DV the id_DV to set
     */
    public void setId_DV(int id_DV)
    {
        this.id_DV = id_DV;
    }

    /**
     * @return the producto
     */
    public int getProducto()
    {
        return producto;
    }

    /**
     * @param producto the producto to set
     */
    public void setProducto(int producto)
    {
        this.producto = producto;
    }

    /**
     * @return the fecha
     */
    public String getFecha()
    {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha)
    {
        this.fecha = fecha;
    }

    /**
     * @return the hora
     */
    public int getHora()
    {
        return hora;
    }

    /**
     * @param hora the hora to set
     */
    public void setHora(int hora)
    {
        this.hora = hora;
    }

    /**
     * @return the cantidadV
     */
    public int getCantidadV()
    {
        return cantidadV;
    }

    /**
     * @param cantidadV the cantidadV to set
     */
    public void setCantidadV(int cantidadV)
    {
        this.cantidadV = cantidadV;
    }

    /**
     * @return the Costos
     */
    public float getCostos()
    {
        return Costos;
    }

    /**
     * @param Costos the Costos to set
     */
    public void setCostos(float Costos)
    {
        this.Costos = Costos;
    }

}
