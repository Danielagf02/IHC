package Interno;

/**
 *
 * @author DanielaGF
 */
public class Admin
{
    private String usuario;
    private String contraseña;

    public Admin()
    {
    }

    public Admin(String usuario, String contraseña)
    {
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    /**
     * @return the usuario
     */
    public String getUsuario()
    {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(String usuario)
    {
        this.usuario = usuario;
    }

    /**
     * @return the contraseña
     */
    public String getContraseña()
    {
        return contraseña;
    }

    /**
     * @param contraseña the contraseña to set
     */
    public void setContraseña(String contraseña)
    {
        this.contraseña = contraseña;
    }
    
    

}
