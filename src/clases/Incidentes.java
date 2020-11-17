package clases;

/**
 *
 * @author Kevin
 */
public class Incidentes
{
    
    private int id;
    private String descipcion;
    private int hora;
    private int minuto;
    private int dia;
    private int mes;
    private int anio;

    public Incidentes()
    {
    }

    public Incidentes(int id, String descipcion, int hora, int minuto, int dia, int mes, int anio)
    {
        this.id = id;
        this.descipcion = descipcion;
        this.hora = hora;
        this.minuto = minuto;
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
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
     * @return the descipcion
     */
    public String getDescipcion()
    {
        return descipcion;
    }

    /**
     * @param descipcion the descipcion to set
     */
    public void setDescipcion(String descipcion)
    {
        this.descipcion = descipcion;
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
     * @return the minuto
     */
    public int getMinuto()
    {
        return minuto;
    }

    /**
     * @param minuto the minuto to set
     */
    public void setMinuto(int minuto)
    {
        this.minuto = minuto;
    }

    /**
     * @return the dia
     */
    public int getDia()
    {
        return dia;
    }

    /**
     * @param dia the dia to set
     */
    public void setDia(int dia)
    {
        this.dia = dia;
    }

    /**
     * @return the mes
     */
    public int getMes()
    {
        return mes;
    }

    /**
     * @param mes the mes to set
     */
    public void setMes(int mes)
    {
        this.mes = mes;
    }

    /**
     * @return the anio
     */
    public int getAnio()
    {
        return anio;
    }

    /**
     * @param anio the anio to set
     */
    public void setAnio(int anio)
    {
        this.anio = anio;
    }
    
}
