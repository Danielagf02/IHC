package clases;

/**
 *
 * @author Kevin
 */
public class Tipo_Usuario
{
    private int id;
    private String usuario;
    private String contrasenia;

    public Tipo_Usuario()
    {
    }

    public Tipo_Usuario(int id, String usuario, String contrasenia)
    {
        this.id = id;
        this.usuario = usuario;
        this.contrasenia = contrasenia;
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
     * @return the contrasenia
     */
    public String getContrasenia()
    {
        return contrasenia;
    }

    /**
     * @param contrasenia the contrasenia to set
     */
    public void setContrasenia(String contrasenia)
    {
        this.contrasenia = contrasenia;
    }
    
    
    
    
}
