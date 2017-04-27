/**
 * Clase abstracta Barco para crear objetos donde almacenar los datos de los barcos.
 * 
 * @author Oscar Charro Rivera (oschariv)
 * @version 27-04-2017
 */
public abstract class Barco
{
    // instance variables - replace the example below with your own
    private String matricula;
    private double eslora;
    private int anoFabricacion;
    private Persona propietario;

    /**
     * Constructor de la clase Barco.
     * @param matricula String para obtener la matricula
     * @param eslora int para obtener el tamaño del barco
     * @param ano int para obtener el año de fabricacion del barco
     * @param propietario objeto Persona para obtener los datos del propietario
     */
    public Barco(String matricula, double eslora, int ano, Persona propietario)
    {
        this.matricula = matricula;
        this.eslora = eslora;
        anoFabricacion = ano;
        this.propietario = propietario;
    }
    
    /**
     * Metodo toString para imprime todo la informacion referente al barco
     * @return cadenaADevolver - String para retorno de la informacion del barco
     */
    public String toString(){
        String cadenaADevolver = propietario.toString() + "\nMatricula: " + matricula 
                            + ".\nEslora: " + eslora + " Metros.\nAño de Fabricacion: " 
                            + anoFabricacion + ".";
        return cadenaADevolver;
    }
    
    /**
     * Metoso getEslora para devolver el tamaño del barco.
     * @return eslora - int que devuelve la eslora del barco
     */
    public double getEslora(){
        return eslora;
    }
    
    /**
     * Metodo abstracto getCoeficienteBernua para obtener el coeficiente de bernua 
     * para posteriormente calcular el precio de alquiler.
     */
    public abstract int getCoeficienteBernua();
}
