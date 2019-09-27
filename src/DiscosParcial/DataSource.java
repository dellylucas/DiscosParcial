/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DiscosParcial;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author delly
 */
public class DataSource {
    
    /**
     * obtiene el Data source de discos
     * @return 
     */
    public static List<BlueRay> obtenerBlueRays() {
        List<BlueRay> listaBlue = new ArrayList<>();

        listaBlue.add(new BlueRay_CapaSimple("2404", "sirena", "2000"));
        listaBlue.add(new BlueRay_CapaSimple("3205", "scream", "3000"));
        listaBlue.add(new BlueRay_CapaDoble("4500", "rec", "10000"));
        listaBlue.add(new BlueRay_CapaDoble("3465", "spiderman", "2000"));
        listaBlue.add(new BlueRay_CapaDoble("6786", "hero", "30000"));
        listaBlue.add(new BlueRay_CapaDoble("4560", "vengadores", "2000"));

        return listaBlue;
    }

    public static List<DVD> obtenerDVDs() {
        List<DVD> listaDVD = new ArrayList<>();

        listaDVD.add(new DVD_CapaDoble("1434", "aquaman", "30000"));
        listaDVD.add(new DVD_CapaDoble("54646", "poo", "4000"));
        listaDVD.add(new DVD_CapaSimple("4355", "jakass", "1000"));
        listaDVD.add(new DVD_CapaSimple("4453", "bee", "2100"));
        listaDVD.add(new DVD_CapaSimple("5464", "estero", "3400"));
        listaDVD.add(new DVD_CapaSimple("67879", "1000 futuro", "2500"));

        return listaDVD;
    }
}
