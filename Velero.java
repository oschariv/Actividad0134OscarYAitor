
/**
 * Clase Velero para guardar los datos especificos para barcos creados a
 * partir de esta clase.
 * 
 * @author Oscar Charro Rivera (oschariv) 
 * @version 27-04-2017
 */
public class Velero extends Barco
{
    // instance variables - replace the example below with your own
    private int numMastiles;

    /**
     * Constructor de la clase Velero
     * @param matricula String para obtener la matricula
     * @param eslora int para obtener el tamaño del barco
     * @param ano int para obtener el año de fabricacion del barco
     * @param propietario objeto Persona para obtener los datos del propietario
     * @param nMastiles int para obtener el numero total de mastiles del barco
     */
    public Velero(String matricula, double eslora, int ano, Persona propietario, 
                    int nMastiles)
    {
        super(matricula, eslora, ano, propietario);
        numMastiles = nMastiles;
    }

    /**
     * Metodo toString para imprime todo la informacion referente al velero
     * @return cadenaADevolver - String para retorno de la informacion del velero
     */
    public String toString(){
        String cadenaADevolver = super.toString();
        cadenaADevolver += "\nNumero de Mastiles: " + numMastiles + ".";
        return cadenaADevolver;
    }
    
    /**
     * Metodo getCoeficienteBernua para obtener el coeficiente de bernua 
     * para posteriormente calcular el precio de alquiler.
     * @return numMastiles - int para obtener el numero de mastiles  
     */
    public int getCoeficienteBernua(){
        return numMastiles;
    }
}
