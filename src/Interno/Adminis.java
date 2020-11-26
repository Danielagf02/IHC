package Interno;


/**
 *
 * @author DanielaGF
 */
public class Adminis
{
    
    private int id;
    private String ApellidoP;
    private String ApellidoM;
    private String Nombre;
    private String fechaNacimiento;
    private String CURP;
    private String rfc;
    private String sexo;
    private int Telefono;
    private String CedulaProfe;
    private String Direccion;
    private int FolioEmpleado;
    private String Hentrada;
    private String Hsalida;
    private String Puesto;
    private String Correo;
    private String Contraseña;

    public Adminis()
    {
    }

    public Adminis(int id, String ApellidoP, String ApellidoM, String Nombre, String fechaNacimiento, String CURP, String rfc, String sexo, int Telefono, String CedulaProfe, String Direccion, int FolioEmpleado, String Hentrada, String Hsalida, String Puesto, String Correo, String Contraseña)
    {
        this.id = id;
        this.ApellidoP = ApellidoP;
        this.ApellidoM = ApellidoM;
        this.Nombre = Nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.CURP = CURP;
        this.rfc = rfc;
        this.sexo = sexo;
        this.Telefono = Telefono;
        this.CedulaProfe = CedulaProfe;
        this.Direccion = Direccion;
        this.FolioEmpleado = FolioEmpleado;
        this.Hentrada = Hentrada;
        this.Hsalida = Hsalida;
        this.Puesto = Puesto;
        this.Correo = Correo;
        this.Contraseña = Contraseña;
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
     * @return the ApellidoP
     */
    public String getApellidoP()
    {
        return ApellidoP;
    }

    /**
     * @param ApellidoP the ApellidoP to set
     */
    public void setApellidoP(String ApellidoP)
    {
        this.ApellidoP = ApellidoP;
    }

    /**
     * @return the ApellidoM
     */
    public String getApellidoM()
    {
        return ApellidoM;
    }

    /**
     * @param ApellidoM the ApellidoM to set
     */
    public void setApellidoM(String ApellidoM)
    {
        this.ApellidoM = ApellidoM;
    }

    /**
     * @return the Nombre
     */
    public String getNombre()
    {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre)
    {
        this.Nombre = Nombre;
    }

    /**
     * @return the fechaNacimiento
     */
    public String getFechaNacimiento()
    {
        return fechaNacimiento;
    }

    /**
     * @param fechaNacimiento the fechaNacimiento to set
     */
    public void setFechaNacimiento(String fechaNacimiento)
    {
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * @return the CURP
     */
    public String getCURP()
    {
        return CURP;
    }

    /**
     * @param CURP the CURP to set
     */
    public void setCURP(String CURP)
    {
        this.CURP = CURP;
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
     * @return the Telefono
     */
    public int getTelefono()
    {
        return Telefono;
    }

    /**
     * @param Telefono the Telefono to set
     */
    public void setTelefono(int Telefono)
    {
        this.Telefono = Telefono;
    }

    /**
     * @return the CedulaProfe
     */
    public String getCedulaProfe()
    {
        return CedulaProfe;
    }

    /**
     * @param CedulaProfe the CedulaProfe to set
     */
    public void setCedulaProfe(String CedulaProfe)
    {
        this.CedulaProfe = CedulaProfe;
    }

    /**
     * @return the Direccion
     */
    public String getDireccion()
    {
        return Direccion;
    }

    /**
     * @param Direccion the Direccion to set
     */
    public void setDireccion(String Direccion)
    {
        this.Direccion = Direccion;
    }

    /**
     * @return the FolioEmpleado
     */
    public int getFolioEmpleado()
    {
        return FolioEmpleado;
    }

    /**
     * @param FolioEmpleado the FolioEmpleado to set
     */
    public void setFolioEmpleado(int FolioEmpleado)
    {
        this.FolioEmpleado = FolioEmpleado;
    }

    /**
     * @return the Hentrada
     */
    public String getHentrada()
    {
        return Hentrada;
    }

    /**
     * @param Hentrada the Hentrada to set
     */
    public void setHentrada(String Hentrada)
    {
        this.Hentrada = Hentrada;
    }

    /**
     * @return the Hsalida
     */
    public String getHsalida()
    {
        return Hsalida;
    }

    /**
     * @param Hsalida the Hsalida to set
     */
    public void setHsalida(String Hsalida)
    {
        this.Hsalida = Hsalida;
    }

    /**
     * @return the Puesto
     */
    public String getPuesto()
    {
        return Puesto;
    }

    /**
     * @param Puesto the Puesto to set
     */
    public void setPuesto(String Puesto)
    {
        this.Puesto = Puesto;
    }

    /**
     * @return the Correo
     */
    public String getCorreo()
    {
        return Correo;
    }

    /**
     * @param Correo the Correo to set
     */
    public void setCorreo(String Correo)
    {
        this.Correo = Correo;
    }

    /**
     * @return the Contraseña
     */
    public String getContraseña()
    {
        return Contraseña;
    }

    /**
     * @param Contraseña the Contraseña to set
     */
    public void setContraseña(String Contraseña)
    {
        this.Contraseña = Contraseña;
    }
    

    
}
