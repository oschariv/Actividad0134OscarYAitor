
/**
 * Write a description of class Yate here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Yate extends EmbarcacionAMotor
{
    // instance variables - replace the example below with your own
    private int numCamarotes;

    /**
     * Constructor for objects of class Yate
     */
    public Yate(String matricula, double eslora, int ano, Persona propietario, int potencia, int nCamarotes)
    {
        super(matricula, eslora, ano, propietario, potencia);
        numCamarotes = nCamarotes;
    }

    public String toString(){
        String cadenaADevolver = super.toString();
        cadenaADevolver += "\nNumero de Camarotes: " + numCamarotes + ".";
        return cadenaADevolver;
    }
    
    public int getCoeficienteBernua(){
        return numCamarotes + super.getCoeficienteBernua();
    }
}
