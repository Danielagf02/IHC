package clases;

/**
 *
 * @author Kevin
 */
public class Proveedores
{

    private int id;
    private int id_Municipio;
    private String nombre;
    private String apellidoP;
    private String apellidoM;
    private String rfc;
    private String razon_Social;
    private String direccion;
    private int cp;
    private int telefono;
    private int email;
    private boolean estatus;

    public Proveedores()
    {
    }

    public Proveedores(int id, String nombre, String apellidoP, String apellidoM, String rfc, String razon_Social, String direccion, int cp, int telefono, int email, boolean estatus)
    {
        this.id = id;
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.rfc = rfc;
        this.razon_Social = razon_Social;
        this.direccion = direccion;
        this.cp = cp;
        this.telefono = telefono;
        this.email = email;
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

    /**
     * @return the id_Municipio
     */
    public int getId_Municipio()
    {
        return id_Municipio;
    }

    /**
     * @param id_Municipio the id_Municipio to set
     */
    public void setId_Municipio(int id_Municipio)
    {
        this.id_Municipio = id_Municipio;
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
     * @return the rfc
     */
    public String getRfc()
    {
        return rfc;
    }

    /**
     * @param rfc the rfc to set
     */
    public void setRfc(String rfc)
    {
        this.rfc = rfc;
    }

    /**
     * @return the razon_Social
     */
    public String getRazon_Social()
    {
        return razon_Social;
    }

    /**
     * @param razon_Social the razon_Social to set
     */
    public void setRazon_Social(String razon_Social)
    {
        this.razon_Social = razon_Social;
    }

    /**
     * @return the direccion
     */
    public String getDireccion()
    {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion)
    {
        this.direccion = direccion;
    }

    /**
     * @return the cp
     */
    public int getCp()
    {
        return cp;
    }

    /**
     * @param cp the cp to set
     */
    public void setCp(int cp)
    {
        this.cp = cp;
    }

    /**
     * @return the telefono
     */
    public int getTelefono()
    {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(int telefono)
    {
        this.telefono = telefono;
    }

    /**
     * @return the email
     */
    public int getEmail()
    {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(int email)
    {
        this.email = email;
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

    public void BuscarM(int id)
    {
        this.id_Municipio = id;
    }

    public void BuscarM(String nombre)
    {

    }

}
