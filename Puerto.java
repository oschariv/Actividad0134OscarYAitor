/**
 * Clase Puerto
 */
public class Puerto
{
    private Alquiler[] amarres;

    /**
     * Constructor de puerto sin parametros
     */
    public Puerto()
    {
        amarres = new Alquiler[4];
    }

    /**
     * Metodo que mediante dos parametros, permite alquilar un amarre.
     * Primero se comprueba si hay amarres libres, si los hay, se crea un alquiler nuevo y se coloca en la posicion libre.
     * Devuelve el precio del alquiler.
     * @param numDias int
     * @param barco Barco
     * @return alquiler
     */
    public float alquilarAmarre(int numDias, Barco barco)
    {
        int primeraPosicion = posicionPrimerAmarreLibre();
        float alquiler = -1;
        if(hayAmarresLibres())
        {
            Alquiler alquilerNuevo = new Alquiler(numDias, barco, primeraPosicion);
            amarres[primeraPosicion] = alquilerNuevo;
            alquiler = alquilerNuevo.getPrecioAlquiler();
        }
        return alquiler;
    }

    /**
     * Metodo que mediante un parametro, indica la posicion del amarre que queremos liberar
     * Comprobamos que no introducimos una posicion inexistente, despues comprobamos si esa posicion esta realmente ocupada
     * y a continuacion si es asi, devolvemos el precio del alquiler y eliminamos el objeto de la posicion.
     * @param posicionAmarre
     * @return alquiler
     */
    public float liquidarAlquilerAmarre(int posicionAmarre)
    {
        float alquiler = -1;
        if(posicionAmarre < amarres.length)
        {
            if(amarres[posicionAmarre] != null)
            {
                alquiler = amarres[posicionAmarre].getPrecioAlquiler();
                amarres[posicionAmarre] = null;
            }            
        }
        return alquiler;
    }    

    /**
     * Metodo que no devuelve nada.
     * Primero recorremos toda la lista de amarres, y en el caso de que este ocupado, lo mostramos por pantalla
     * y si esta libre, realizamos la misma operacion, pero en este caso diciendo que esta libre.
     */
    public void verEstadoAmarres()
    {
        for(int i = 0; i < amarres.length; i++)
        {
            if(amarres[i] == null)
            {
                System.out.println("El amarre " + i + " esta vacio");
            }
            else
            {
                System.out.println(amarres[i].toString());
            }
        }
    }

    /**
     * Metodo que encuentra el primer amarre libre.
     * Recorremos toda la lista de amarres, en cada uno comprobamos si esta null y si hemos encontrado ya uno libre,
     * una vez encontrado el primer amarre libre, devolvemos la posicion de dicho amarre y cerramos el bucle.
     * @return int
     */
    public int posicionPrimerAmarreLibre()
    {
        int libre = -1;
        boolean encontrado = false;
        int posicion = 0;
        while(posicion < amarres.length)
        {
            if(amarres[posicion] == null && !encontrado)
            {
                libre = posicion;
                encontrado = true;

            }
            posicion++;
        }
        return libre;
    }

    /**
     * Metodo que nos indica si hay algun amarre libre.
     * Recorremos la lista y comprobamos si hay alguno vacio, en el caso de que haya uno o mas libres,
     * devolvera true, en el caso de que no haya libres, devolvera false.
     * @return boolean
     */
    public boolean hayAmarresLibres()
    {
        boolean libre = false;
        int posicion = 0;
        while(posicion < amarres.length)
        {
            if(amarres[posicion] == null)
            {
                libre = true;

            }
            posicion++;
        }
        return libre;
    }
}
