package Interno;

/**
 *
 * @author DanielaGF
 */
public class Dias
{
    private int semana;
    private String nombre;
    private String día;
    private String horaEnt;
    private String horaSal;

    public Dias()
    {
    }

    public Dias(int Semana, String Nombre, String Día, String HoraEnt, String HoraSal)
    {
        this.semana = Semana;
        this.nombre = Nombre;
        this.día = Día;
        this.horaEnt = HoraEnt;
        this.horaSal = HoraSal;
    }

    /**
     * @return the Semana
     */
    public int getSemana()
    {
        return semana;
    }

    /**
     * @param Semana the Semana to set
     */
    public void setSemana(int Semana)
    {
        this.semana = Semana;
    }

    /**
     * @return the Nombre
     */
    public String getNombre()
    {
        return nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre)
    {
        this.nombre = Nombre;
    }

    /**
     * @return the Día
     */
    public String getDía()
    {
        return día;
    }

    /**
     * @param Día the Día to set
     */
    public void setDía(String Día)
    {
        this.día = Día;
    }

    /**
     * @return the HoraEnt
     */
    public String getHoraEnt()
    {
        return horaEnt;
    }

    /**
     * @param HoraEnt the HoraEnt to set
     */
    public void setHoraEnt(String HoraEnt)
    {
        this.horaEnt = HoraEnt;
    }

    /**
     * @return the HoraSal
     */
    public String getHoraSal()
    {
        return horaSal;
    }

    /**
     * @param HoraSal the HoraSal to set
     */
    public void setHoraSal(String HoraSal)
    {
        this.horaSal = HoraSal;
    }
    
    
}
