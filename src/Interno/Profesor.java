package Interno;

import Interfaces.Grupo;

/**
 *
 * @author DnielaGF
 */
public class Profesor
{
    
    private String ApellidoP;
    private String ApellidoM;
    private String Nombres;
    private String fechaNacimiento;
    private String CURP;
    private String sexo;
    private int Grado;
    private String Grupo;
    private int Telefono;
    private String CedulaProf;
    private String Direccion;
    private int Folioprofesor;
    private String rfc;
    private String Hentrada;
    private String Hsalida;
    private String Correo;
    private String Contraseña;
    

    public Profesor()
    {
    }

    public Profesor(String ApellidoP, String ApellidoM, String Nombres, String fechaNacimiento, String CURP, String sexo, int Grado, String Grupo, int Telefono, String CedulaProf, String Direccion, int FolioProfesor, String rfc, String Hentrada, String Hsalida, String Correo, String Contraseña)
    {
        this.ApellidoP = ApellidoP;
        this.ApellidoM = ApellidoM;
        this.Nombres = Nombres;
        this.fechaNacimiento = fechaNacimiento;
        this.CURP = CURP;
        this.sexo = sexo;
        this.Grado = Grado;
        this.Grupo = Grupo;
        this.Telefono = Telefono;
        this.CedulaProf = CedulaProf;
        this.Direccion = Direccion;
        this.Folioprofesor = FolioProfesor;
        this.rfc = rfc;
        this.Hentrada = Hentrada;
        this.Hsalida = Hsalida;
        this.Correo = Correo;
        this.Contraseña = Contraseña;
    }

    Profesor(int id, String nom, String curp, String rfc, String dir, String correo, String tel, int sueldo, String puesto, String hent, String hsal, String foto, String contraseña)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Profesor(String ApellidoP, String ApellidoM, String Nombres, String fechaNacimiento, String CURP, String sexo, int Grado, String Grupo, int Telefono, String CedulaProf, int FolioProfesor, String Hentrada, String Hsalida, String Correo, String Contraseña)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Profesor(String ApellidoP, String ApellidoM, String Nombres, String fechaNacimiento, String CURP, String rfc, String sexo, int Telefono, String CedulaProfe, String Direccion, int FolioEmpleado, String Hentrada, String Hsalida, String Puesto, String Correo, String Contraseña)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Profesor(String ApellidoP, String ApellidoM, String Nombres, String fechaNacimiento, String CURP, String sexo, int Grado, String Grupo, int Telefono, String NombreMadre, String NombrePadre, int FolioAlumno, String Correo, String Contraseña)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

  
    public String getApellidoP()
    {
        return ApellidoP;
    }

    public void setApellidoP(String ApellidoP)
    {
        this.ApellidoP = ApellidoP;
    }

    public String getApellidoM()
    {
        return ApellidoM;
    }

    public void setApellidoM(String ApellidoM)
    {
        this.ApellidoM = ApellidoM;
    }

    public String getNombres()
    {
        return Nombres;
    }

    public void setNombres(String Nombres)
    {
        this.Nombres = Nombres;
    }

    public String getFechaNacimiento()
    {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento)
    {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCURP()
    {
        return CURP;
    }

    public void setCURP(String CURP)
    {
        this.CURP = CURP;
    }

    public String getSexo()
    {
        return sexo;
    }

    public void setSexo(String sexo)
    {
        this.sexo = sexo;
    }

    public int getGrado()
    {
        return Grado;
    }

    public void setGrado(int Grado)
    {
        this.Grado = Grado;
    }

    public String getGrupo()
    {
        return Grupo;
    }

    public void setGrupo(String Grupo)
    {
        this.Grupo = Grupo;
    }

    public void setTelefono(int Telefono)
    {
        this.Telefono = Telefono;
    }

    public String getCedulaProf()
    {
        return CedulaProf;
    }

    public void setCedulaProf(String CedulaProf)
    {
        this.CedulaProf = CedulaProf;
    }

    public String getDireccion()
    {
        return Direccion;
    }

    public void setDireccion(String Direccion)
    {
        this.Direccion = Direccion;
    }
    public String getHentrada()
    {
        return Hentrada;
    }

    public void setHentrada(String Hentrada)
    {
        this.Hentrada = Hentrada;
    }

    public String getHsalida()
    {
        return Hsalida;
    }

    public void setHsalida(String Hsalida)
    {
        this.Hsalida = Hsalida;
    }

    void setFolioProfesor(int FolioProfesor)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setFolioEmpleado(int FolioEmpleado)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

   

   
    
    
    
}
