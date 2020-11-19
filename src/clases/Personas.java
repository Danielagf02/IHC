package clases;

/**
 *
 * @author Kevin
 */
public class Personas extends Tipo_Usuario
{

    private int id;
    private int clasificacion;
    private float sueldo;
    private String nombre;
    private String apellidoP;
    private String apellidoM;
    private String sexo;
    private boolean estatus;

    public Personas()
    {
    }

    public Personas(int id_TU, String usuario, String contrasenia,  int id, int clasificacion, float sueldo, String nombre,  String apellidoP, String apellidoM, String sexo, boolean estatus)
    {
        super(id_TU, usuario, contrasenia);
        this.id = id;
        this.clasificacion = clasificacion;
        this.sueldo = sueldo;
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.sexo = sexo;
        this.estatus = estatus;
    }

    /**
     * @return the clasificacion
     */
    public int getClasificacion()
    {
        return clasificacion;
    }

    /**
     * @param clasificacion the clasificacion to set
     */
    public void setClasificacion(int clasificacion)
    {
        this.clasificacion = clasificacion;
    }

    /**
     * @return the sueldo
     */
    public float getSueldo()
    {
        return sueldo;
    }

    /**
     * @param sueldo the sueldo to set
     */
    public void setSueldo(float sueldo)
    {
        this.sueldo = sueldo;
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
     * @return the apellidoP
     */
    public String getApellidoP()
    {
        return apellidoP;
    }

    /**
     * @param apellidoP the apellidoP to set
     */
    public void setApellidoP(String apellidoP)
    {
        this.apellidoP = apellidoP;
    }

    /**
     * @return the apellidoM
     */
    public String getApellidoM()
    {
        return apellidoM;
    }

    /**
     * @param apellidoM the apellidoM to set
     */
    public void setApellidoM(String apellidoM)
    {
        this.apellidoM = apellidoM;
    }

    /**
     * @return the sexo
     */
    public String getSexo()
    {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(String sexo)
    {
        this.sexo = sexo;
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
    
}
