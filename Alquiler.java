public class Alquiler
{
    private static final int VALOR_MULTIPLICADOR_ESLORA = 10;
    private static final int VALOR_MULTIPLICADOR_BERNUA = 300;
    private int diasOcupacion;
    private int posicionAmarre;
    private Barco barco;
    
    public Alquiler(int numDias, Barco barco, int amarre)
    {
        diasOcupacion = numDias;
        this.barco = barco;
        posicionAmarre = amarre;
    }

    public float getPrecioAlquiler()
    {
        float precioAlquiler = 0;
        float valorEslora = (float)barco.getEslora();
        precioAlquiler = (diasOcupacion*(valorEslora*VALOR_MULTIPLICADOR_ESLORA))+(VALOR_MULTIPLICADOR_BERNUA*barco.getCoeficienteBernua());
        return precioAlquiler;
    }
    
    public String toString()
    {
        String cadena = "";
        cadena += "NºDias de ocupacion: " + diasOcupacion + "\n" + "Posicion del amarre: " + posicionAmarre + "\n" + "Barco: " + barco + "\n" + "Precio del alquiler: " + getPrecioAlquiler();
        return cadena;
    }
}
