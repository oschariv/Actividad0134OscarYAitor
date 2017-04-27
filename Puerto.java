public class Puerto
{
    private Alquiler[] amarres;

    public Puerto()
    {
        amarres = new Alquiler[4];
    }

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

    public void verEstadoAmarres()
    {
        for(int i = 0; i < amarres.length; i++)
        {
            if(amarres[i] == null)
            {
                System.out.println("El amarre " + i + " está vacio");
            }
            else
            {
                System.out.println(amarres[i].toString());
            }
        }
    }

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
