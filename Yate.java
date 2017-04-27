
/**
 * Write a description of class Yate here.
 * 
 * @author Oscar Charro Rivera (oschariv)
 * @version 27-04-2017
 */
public class Yate extends EmbarcacionAMotor
{
    // instance variables - replace the example below with your own
    private int numCamarotes;

    /**
     * Constructor de la clase Yate
     * @param matricula String para obtener la matricula
     * @param eslora int para obtener el tamaño del barco
     * @param ano int para obtener el año de fabricacion del barco
     * @param propietario objeto Persona para obtener los datos del propietario
     * @param potencia int para obtener la potencia del barco
     * @param nCamarotes int para obtener el numero de camarotes
     */
    public Yate(String matricula, double eslora, int ano, Persona propietario, 
                int potencia, int nCamarotes)
    {
        super(matricula, eslora, ano, propietario, potencia);
        numCamarotes = nCamarotes;
    }

    /**
     * Metodo toString para imprime todo la informacion referente al yate
     * @return cadenaADevolver - String para retorno de la informacion del yate
     */
    public String toString(){
        String cadenaADevolver = super.toString();
        cadenaADevolver += "\nNumero de Camarotes: " + numCamarotes + ".";
        return cadenaADevolver;
    }
    
    /**
     *  Metodo getCoeficienteBernua para obtener el coeficiente de bernua 
     * para posteriormente calcular el precio de alquiler.
     * @return numCamarotes - int para obtener el numero de camarotes
     */
    public int getCoeficienteBernua(){
        return numCamarotes + super.getCoeficienteBernua();
    }
}
