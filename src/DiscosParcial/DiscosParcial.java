package DiscosParcial;

import java.util.ArrayList;
import java.util.List;
import static DiscosParcial.DataSource.obtenerBlueRays;
import static DiscosParcial.DataSource.obtenerDVDs;

/**
 * @author Delly lucas Ing de sistemas
 */
public class DiscosParcial {

    /**
     * hilo principal aplicacion
     *
     * @param args
     */
    public static void main(String[] args) {
        //Crea lista
        List<Disco> discosLista = crearLista();

        //ordena lista
        discosLista = FactoryDisco.ordenarLista(discosLista);

        //Imprime lista
        discosLista.forEach(T -> {
            System.out.println("nombre Disco: " + T.getNombre());
        });
    }

    /**
     * inicializa lista de discos
     *
     * @return lista discos
     */
    public static List<Disco> crearLista() {
        List<Disco> lista = new ArrayList<>();
        obtenerBlueRays().forEach(T -> {
            lista.add(FactoryDisco.obtener(T));
        });
        obtenerDVDs().forEach(T -> {
            lista.add(FactoryDisco.obtener(T));
        });
        return lista;
    }

}
