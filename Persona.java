
/**
 * Clase Persona para guardar los datos correspondientes a los propietarios
 * 
 * @author Oscar Charro Rivera (oschariv)
 * @version 27-04-2017
 */
public class Persona
{
    // instance variables - replace the example below with your own
    private String nombre;
    private String dni;

    /**
     * Constructor de la clase Persona
     * @param nombre String para obtener nombre del propietario
     * @param dni String para obtener el dni del propietario
     */
    public Persona(String nombre, String dni)
    {
        this.nombre = nombre;
        this.dni = dni;
    }
    
    /**
     * Metodo toString para imprime todo la informacion referente al propietario.
     * @return cadenaADevolver - String para retorno de la informacion del propietario
     */
    public String toString()
    {
        String cadenaADevolver = "Propietario del Barco:\nNombre: " + nombre + ".\nDNI: " 
                                    + dni+ ".";
        return cadenaADevolver;
    }
}
