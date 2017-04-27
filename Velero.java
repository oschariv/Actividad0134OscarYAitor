
/**
 * Write a description of class Velero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Velero extends Barco
{
    // instance variables - replace the example below with your own
    private int numMastiles;

    /**
     * Constructor for objects of class Velero
     */
    public Velero(String matricula, double eslora, int ano, Persona propietario, int nMastiles)
    {
        super(matricula, eslora, ano, propietario);
        numMastiles = nMastiles;
    }

    public String toString(){
        String cadenaADevolver = super.toString();
        cadenaADevolver += "\nNumero de Mastiles: " + numMastiles + ".";
        return cadenaADevolver;
    }
    
    public int getCoeficienteBernua(){
        return numMastiles;
    }
}
