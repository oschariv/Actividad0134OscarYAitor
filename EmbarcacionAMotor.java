
/**
 * Write a description of class EmbarcacionesAMotor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EmbarcacionAMotor extends Barco
{
    // instance variables - replace the example below with your own
    private int potencia;

    /**
     * Constructor for objects of class EmbarcacionesAMotor
     */
    public EmbarcacionAMotor(String matricula, double eslora, int ano, Persona propietario, int potencia)
    {
        super(matricula, eslora, ano, propietario);
        this.potencia = potencia;
    }
    
    public String toString(){
        String cadenaADevolver = super.toString();
        cadenaADevolver += "\nPotencia: " + potencia + " CV.";
        return cadenaADevolver;
    }
    
    public int getCoeficienteBernua(){
        return potencia;
    }
}
