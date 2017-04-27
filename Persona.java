
/**
 * Write a description of class Persona here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Persona
{
    // instance variables - replace the example below with your own
    private String nombre;
    private String dni;

    /**
     * Constructor for objects of class Persona
     */
    public Persona(String nombre, String dni)
    {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String toString()
    {
        String cadenaADevolver = "Propietario del Barco:\nNombre: " + nombre + ".\nDNI: " + dni+ ".";
        return cadenaADevolver;
    }
}
