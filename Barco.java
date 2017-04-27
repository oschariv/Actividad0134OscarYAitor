/**
 * Abstract class Barco - write a description of the class here
 * 
 * @author: Oscar Charro Rivera (@Oschariv)
 * Date: 
 */
public abstract class Barco
{
    // instance variables - replace the example below with your own
    private String matricula;
    private double eslora;
    private int anoFabricacion;
    private Persona propietario;

    /**
     * 
     */
    public Barco(String matricula, double eslora, int ano, Persona propietario)
    {
        this.matricula = matricula;
        this.eslora = eslora;
        anoFabricacion = ano;
        this.propietario = propietario;
    }
    
    public String toString(){
        String cadenaADevolver = propietario.toString() + "\nMatricula: " + matricula + ".\nEslora: " + eslora + " Metros.\nAño de Fabricacion: " + anoFabricacion + ".";
        return cadenaADevolver;
    }
    
    public double getEslora(){
        return eslora;
    }
    
    public abstract int getCoeficienteBernua();
}
