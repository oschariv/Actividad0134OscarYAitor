
/**
 * Clase embarcacionAMotor para guardar los datos especificos para barcos creados a
 * partir de esta clase.
 * 
 * @author Oscar Charro Rivera (oschariv)
 * @version 27-04-2017
 */
public class EmbarcacionAMotor extends Barco
{
    // instance variables - replace the example below with your own
    private int potencia;

    /**
     * Constructor de la clase EmbarcacionesAMotor
     * @param matricula String para obtener la matricula
     * @param eslora int para obtener el tamaño del barco
     * @param ano int para obtener el año de fabricacion del barco
     * @param propietario objeto Persona para obtener los datos del propietario
     * @param potencia int para obtener la potencia del barco
     */
    public EmbarcacionAMotor(String matricula, double eslora, int ano, 
            Persona propietario, int potencia)
    {
        super(matricula, eslora, ano, propietario);
        this.potencia = potencia;
    }
    
    /**
     * Metodo toString para imprime todo la informacion referente a la embarcacion a 
     * motor.
     * @return cadenaADevolver - String para retorno de la informacion de la embarcacion 
     * a motor
     */
    public String toString(){
        String cadenaADevolver = super.toString();
        cadenaADevolver += "\nPotencia: " + potencia + " CV.";
        return cadenaADevolver;
    }
    
    /**
     * Metodo getCoeficienteBernua para obtener el coeficiente de bernua 
     * para posteriormente calcular el precio de alquiler.
     * @return pontencia - int para devolver la potencia de la embarcacion 
     */
    public int getCoeficienteBernua(){
        return potencia;
    }
}
