package Interno;

/**
 *
 * @author kevin
 */
public class Asis
{
    private int retardos;
    private int inasistencias;
    private int abandono;

    public Asis()
    {
    }

    public Asis(int retardos, int Inasistencias, int abandono)
    {
        this.retardos = retardos;
        this.inasistencias = Inasistencias;
        this.abandono = abandono;
    }

    /**
     * @return the retardos
     */
    public int getRetardos()
    {
        return retardos;
    }

    /**
     * @param retardos the retardos to set
     */
    public void setRetardos(int retardos)
    {
        this.retardos = retardos;
    }

    /**
     * @return the Inasistencias
     */
    public int getInasistencias()
    {
        return inasistencias;
    }

    /**
     * @param Inasistencias the Inasistencias to set
     */
    public void setInasistencias(int Inasistencias)
    {
        this.inasistencias = Inasistencias;
    }

    /**
     * @return the abandono
     */
    public int getAbandono()
    {
        return abandono;
    }

    /**
     * @param abandono the abandono to set
     */
    public void setAbandono(int abandono)
    {
        this.abandono = abandono;
    }
    
    
}
