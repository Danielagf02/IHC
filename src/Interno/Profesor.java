package Interno;

/**
 *
 * @author DnielaGF
 */
public class Profesor
{

    private int id;
    private int Grado;
    private String Grupo;
    private String ApellidoP;
    private String ApellidoM;
    private String Nombres;
    private String fechaNacimiento;
    private String CURP;
    private String sexo;
    private int Telefono;
    private String CedulaProf;
    private String Direccion;
    private String rfc;
    private String Hentrada;
    private String Hsalida;
    private String Correo;
    private String Contraseña;

    public Profesor()
    {
    }

    public Profesor(int id, int Grado, String Grupo, String ApellidoP, String ApellidoM, String Nombres, String fechaNacimiento, String CURP, String sexo, int Telefono, String CedulaProf, String Direccion, String rfc, String Hentrada, String Hsalida, String Correo, String Contraseña)
    {
        this.id = id;
        this.Grado = Grado;
        this.Grupo = Grupo;
        this.ApellidoP = ApellidoP;
        this.ApellidoM = ApellidoM;
        this.Nombres = Nombres;
        this.fechaNacimiento = fechaNacimiento;
        this.CURP = CURP;
        this.sexo = sexo;
        this.Telefono = Telefono;
        this.CedulaProf = CedulaProf;
        this.Direccion = Direccion;
        this.rfc = rfc;
        this.Hentrada = Hentrada;
        this.Hsalida = Hsalida;
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
     * @return the Grado
     */
    public int getGrado()
    {
        return Grado;
    }

    /**
     * @param Grado the Grado to set
     */
    public void setGrado(int Grado)
    {
        this.Grado = Grado;
    }

    /**
     * @return the Grupo
     */
    public String getGrupo()
    {
        return Grupo;
    }

    /**
     * @param Grupo the Grupo to set
     */
    public void setGrupo(String Grupo)
    {
        this.Grupo = Grupo;
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
     * @return the Nombres
     */
    public String getNombres()
    {
        return Nombres;
    }

    /**
     * @param Nombres the Nombres to set
     */
    public void setNombres(String Nombres)
    {
        this.Nombres = Nombres;
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
     * @return the CedulaProf
     */
    public String getCedulaProf()
    {
        return CedulaProf;
    }

    /**
     * @param CedulaProf the CedulaProf to set
     */
    public void setCedulaProf(String CedulaProf)
    {
        this.CedulaProf = CedulaProf;
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
