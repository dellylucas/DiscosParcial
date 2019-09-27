/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DiscosParcial;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author ESTUDIANTES
 */
public final class FactoryDisco {

    public static Disco obtener(BlueRay disco) {
        return disco;
    }

    public static Disco obtener(DVD disco) {
        return disco;
    }

    public static List<Disco> ordenarLista(List<Disco> discos) {
        Collections.sort(discos, new Comparator<Disco>() {

            @Override
            public int compare(Disco o1, Disco o2) {
                return o1.getNombre().compareTo(o2.getNombre());
            }
        });
        return discos;
    }

}
