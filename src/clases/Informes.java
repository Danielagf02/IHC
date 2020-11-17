package clases;

/**
 *
 * @author Kevin
 */
public class Informes
{
    private int folio;
    private int id_Ventas;
    private String dia;
    private int producto_Mas;
    private int producto_Menos;
    private int marca_Mas;
    private int marca_Menos;
    private float ganancias;
    private float perdidas;

    public Informes()
    {
    }

    public Informes(int folio, int id_Ventas, String dia, int producto_Mas, int producto_Menos, int marca_Mas, int marca_Menos, float ganancias, float perdidas)
    {
        this.folio = folio;
        this.id_Ventas = id_Ventas;
        this.dia = dia;
        this.producto_Mas = producto_Mas;
        this.producto_Menos = producto_Menos;
        this.marca_Mas = marca_Mas;
        this.marca_Menos = marca_Menos;
        this.ganancias = ganancias;
        this.perdidas = perdidas;
    }

    /**
     * @return the folio
     */
    public int getFolio()
    {
        return folio;
    }

    /**
     * @param folio the folio to set
     */
    public void setFolio(int folio)
    {
        this.folio = folio;
    }

    /**
     * @return the id_Ventas
     */
    public int getId_Ventas()
    {
        return id_Ventas;
    }

    /**
     * @param id_Ventas the id_Ventas to set
     */
    public void setId_Ventas(int id_Ventas)
    {
        this.id_Ventas = id_Ventas;
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

    /**
     * @return the producto_Mas
     */
    public int getProducto_Mas()
    {
        return producto_Mas;
    }

    /**
     * @param producto_Mas the producto_Mas to set
     */
    public void setProducto_Mas(int producto_Mas)
    {
        this.producto_Mas = producto_Mas;
    }

    /**
     * @return the producto_Menos
     */
    public int getProducto_Menos()
    {
        return producto_Menos;
    }

    /**
     * @param producto_Menos the producto_Menos to set
     */
    public void setProducto_Menos(int producto_Menos)
    {
        this.producto_Menos = producto_Menos;
    }

    /**
     * @return the marca_Mas
     */
    public int getMarca_Mas()
    {
        return marca_Mas;
    }

    /**
     * @param marca_Mas the marca_Mas to set
     */
    public void setMarca_Mas(int marca_Mas)
    {
        this.marca_Mas = marca_Mas;
    }

    /**
     * @return the marca_Menos
     */
    public int getMarca_Menos()
    {
        return marca_Menos;
    }

    /**
     * @param marca_Menos the marca_Menos to set
     */
    public void setMarca_Menos(int marca_Menos)
    {
        this.marca_Menos = marca_Menos;
    }

    /**
     * @return the ganancias
     */
    public float getGanancias()
    {
        return ganancias;
    }

    /**
     * @param ganancias the ganancias to set
     */
    public void setGanancias(float ganancias)
    {
        this.ganancias = ganancias;
    }

    /**
     * @return the perdidas
     */
    public float getPerdidas()
    {
        return perdidas;
    }

    /**
     * @param perdidas the perdidas to set
     */
    public void setPerdidas(float perdidas)
    {
        this.perdidas = perdidas;
    }
    
    
}
