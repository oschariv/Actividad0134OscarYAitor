
/**
 * Clase Alquiler
 */
public class Alquiler
{
    private static final int VALOR_MULTIPLICADOR_ESLORA = 10;
    private static final int VALOR_MULTIPLICADOR_BERNUA = 300;
    private int diasOcupacion;
    private int posicionAmarre;
    private Barco barco;

    /**
     * Constructor de la clase Alquiler
     * @param numDias int
     * @param barco Barco
     * @param amarre int
     */
    public Alquiler(int numDias, Barco barco, int amarre)
    {
        diasOcupacion = numDias;
        this.barco = barco;
        posicionAmarre = amarre;
    }

    /**
     * Metodo que calcula el precio del alquiler y te lo devuelve.
     * @return float
     */
    public float getPrecioAlquiler()
    {
        float precioAlquiler = 0;
        float valorEslora = (float)barco.getEslora();
        precioAlquiler = (diasOcupacion*(valorEslora*VALOR_MULTIPLICADOR_ESLORA))+(VALOR_MULTIPLICADOR_BERNUA*barco.getCoeficienteBernua());
        return precioAlquiler;
    }

    /**
     * Metodo que devuelve una cadena String
     * @return String
     */
    public String toString()
    {
        String cadena = "";
        cadena += "NºDias de ocupacion: " + diasOcupacion + "\n" + "Posicion del amarre: " + posicionAmarre + "\n" + "Barco: " + barco + "\n" + "Precio del alquiler: " + getPrecioAlquiler();
        return cadena;
    }
}
