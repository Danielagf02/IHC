package clases;

/**
 *
 * @author Kevin
 */
public class Productos
{
    private int id;
    private int codigo;
    private int id_Proveedor;
    private String nombre;
    private String descripcion;
    private float precio_Venta;
    private float precio_Compra;
    private boolean perecedero;

    public Productos()
    {
    }

    public Productos(int id, int codigo, String nombre, String descripcion, float precio_Venta, float precio_Compra, boolean perecedero)
    {
        this.id = id;
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio_Venta = precio_Venta;
        this.precio_Compra = precio_Compra;
        this.perecedero = perecedero;
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
     * @return the codigo
     */
    public int getCodigo()
    {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo)
    {
        this.codigo = codigo;
    }

    /**
     * @return the id_Proveedor
     */
    public int getId_Proveedor()
    {
        return id_Proveedor;
    }

    /**
     * @param id_Proveedor the id_Proveedor to set
     */
    public void setId_Proveedor(int id_Proveedor)
    {
        this.id_Proveedor = id_Proveedor;
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
     * @return the descripcion
     */
    public String getDescripcion()
    {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion)
    {
        this.descripcion = descripcion;
    }

    /**
     * @return the precio_Venta
     */
    public float getPrecio_Venta()
    {
        return precio_Venta;
    }

    /**
     * @param precio_Venta the precio_Venta to set
     */
    public void setPrecio_Venta(float precio_Venta)
    {
        this.precio_Venta = precio_Venta;
    }

    /**
     * @return the precio_Compra
     */
    public float getPrecio_Compra()
    {
        return precio_Compra;
    }

    /**
     * @param precio_Compra the precio_Compra to set
     */
    public void setPrecio_Compra(float precio_Compra)
    {
        this.precio_Compra = precio_Compra;
    }

    /**
     * @return the perecedero
     */
    public boolean isPerecedero()
    {
        return perecedero;
    }

    /**
     * @param perecedero the perecedero to set
     */
    public void setPerecedero(boolean perecedero)
    {
        this.perecedero = perecedero;
    }
    
    public void BuscarPro(int id)
    {
        this.id_Proveedor = id;
    }

    public void BuscarPro(String nombre)
    {

    }
    
}
