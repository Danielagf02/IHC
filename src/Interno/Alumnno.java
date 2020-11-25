package Interno;

/**
 *
 * @author DanielaGF
 */
public class Alumnno
{

    private int id;
    private int Grado;
    private String Grupo;
    private String ApellidoP;
    private String ApellidoM;
    private String Nombre;
    private String fechaNacimiento;
    private String CURP;
    private String sexo;
    private int Telefono;
    private String NomMadre;
    private String NomPadre;
    private int FolioAlumno;
    private String Correo;
    private String Contraseña;

    public Alumnno()
    {
    }

    public Alumnno(int id, int Grado, String Grupo, String ApellidoP, String ApellidoM, String Nombre, String fechaNacimiento, String CURP, String sexo, int Telefono, String NomMadre, String NomPadre, int FolioAlumno, String Correo, String Contraseña)
    {
        this.id = id;
        this.Grado = Grado;
        this.Grupo = Grupo;
        this.ApellidoP = ApellidoP;
        this.ApellidoM = ApellidoM;
        this.Nombre = Nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.CURP = CURP;
        this.sexo = sexo;
        this.Telefono = Telefono;
        this.NomMadre = NomMadre;
        this.NomPadre = NomPadre;
        this.FolioAlumno = FolioAlumno;
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
     * @return the NomMadre
     */
    public String getNomMadre()
    {
        return NomMadre;
    }

    /**
     * @param NomMadre the NomMadre to set
     */
    public void setNomMadre(String NomMadre)
    {
        this.NomMadre = NomMadre;
    }

    /**
     * @return the NomPadre
     */
    public String getNomPadre()
    {
        return NomPadre;
    }

    /**
     * @param NomPadre the NomPadre to set
     */
    public void setNomPadre(String NomPadre)
    {
        this.NomPadre = NomPadre;
    }

    /**
     * @return the FolioAlumno
     */
    public int getFolioAlumno()
    {
        return FolioAlumno;
    }

    /**
     * @param FolioAlumno the FolioAlumno to set
     */
    public void setFolioAlumno(int FolioAlumno)
    {
        this.FolioAlumno = FolioAlumno;
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
