package com.grabriel.aprado.gables;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Angel Prado on 14/7/2017.
 */

public class FutureItem {

    String myimag;
    String name;
    String detail;
    String dirreccion;
    String telefno;

    public String getDirreccion() {
        return dirreccion;
    }

    public void setDirreccion(String dirreccion) {
        this.dirreccion = dirreccion;
    }

    public String getTelefno() {
        return telefno;
    }

    public void setTelefno(String telefno) {
        this.telefno = telefno;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    String horario;

    public FutureItem(String myimag, String name, String detail ,String direccion,String horario,String telefno) {
        this.myimag = myimag;
        this.name = name;
        this.detail = detail;
        this.dirreccion = direccion;
        this.telefno = telefno;
        this.horario = horario;

    }
    public FutureItem() {

    }

    public String getMyimag()    {
        return myimag;
    }

    public void setMyimag(String myimag) {
        this.myimag = myimag;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }


    public static ArrayList<FutureItem> items;


    public static List<FutureItem>FTitem(){
        items = new ArrayList<>() ;
        items.add(new FutureItem("http://www.coralgables.com/modules/showimage.aspx?imageid=3935",
                "Venetian Pool",
                "La Piscina Veneciana es una piscina histórica ubicada en Coral Gables, Florida. La piscina se encuentra inscrita en el Registro Nacional de Lugares Históricos desde el 20 de agosto de 1981.",
                "2701 De Soto Blvd," +
                        " Coral Gables, FL 33134",
                "Hoy abierto 11–18:30","(305) 460-5306"));
        items.add(new FutureItem("https://twistedsifter.files.wordpress.com/2012/08/melissani-cave-kefalonia-island-greece-2.jpg?w=800&h=533",
                "Fairchild Tropical Botanical Garden",
                "El Fairchild Tropical Botanic Garden ó en español: Jardín Botánico Tropical de Fairchild, es un arboreto y jardín botánico de 33 hectáreas, con unas extensas colecciones de plantas tropicales raras",
                "10901 Old Cutler Rd, Coral Gables, FL 33156,",
                " 09:30–16:30",
                "(305) 667-1651"));
        items.add(new FutureItem("http://www.museoamano.org/wp-content/uploads/2015/06/home_slider_024.jpg",
                "Lowe Art Museum  ",
                "This museum was great and I actually learned a lot! It's located it a great area and if you like museums you will love this one. ",
                "1301 Stanford Dr, Miami, FL 33146",
                "L - V 10am-8pm","(305) 284-3535"));
        items.add(new FutureItem("https://static.urbandaddy.com/uploads/assets/image/slideshows/standard/132a9a97ff9a6c0fe59e69efed086020.jpg",
                "Bulla Gastrobar",
                "El local, inaugurado en el verano de 2004, ofrece cocina tradicional con toques de modernidad. El restaurante aprovecha los productos de la zona ( excelentes carnes, salazones, pulpo, productos de la huerta, pescados de la cercana ría de Vigo…) combinándolos con nuevos sabores y texturas.","2500 Ponce De Leon Blvd, Coral Gables, FL 33134","12–00"," (305) 441-0107"));

        items.add(new FutureItem("http://images.miamiandbeaches.com/images/100850_548_full.jpg"
                ,"Miami Seaquarium",
                "very nice!"," 4400 Rickenbacker Causeway, Key Biscayne, FL 33149",
                "L -S 7am - 8pm","(305) 361-5705"
                ));

        items.add(new FutureItem("https://lh6.googleusercontent.com/proxy/LzS9FFhUFcnFPVstzW7Z0409hastr4wVN6ii5KljKcGtgLLymggOYhnLwmpiA1FxKcvB_rgG8XweDCVXu6rYJBezj5wSywNK9RTKDsQ98IAfhiZ7Yx2MGSOJneAYcIEbMVCggaHhH0UTnCw=w1064-h400-n-no",
                "Coral Gables",
                "Coral Gables es una ciudad ubicada en el condado de Miami-Dade en el estado estadounidense de Florida. En el Censo de 2010 tenía una población de 46.780 habitantes y una densidad poblacional de 484,02 personas por km² ",
                "nort", "all time","null"));
        items.add(new FutureItem("http://tpwd.texas.gov/state-parks/balmorhea/gallery/balmorhea_hdr_0881.jpg",
                "Phillips Park",
                " 90 Menores Ave, Coral Gables, FL 33134",
                "l -v 8am -8pm",
                "07–21","(305) 460-5600"));
        items.add(new FutureItem("https://captainkimo.com/wp-content/uploads/2014/08/Coral-Gables-Florida-Sunset-Matheson-Hammock-Park.jpg",
                "Matheson Hammock Park",
                "Excelente lugar para compartir con amigos o familia",
                "9610 Old Cutler Rd, Coral Gables, FL 33156","Hoy abierto · 07:30–20","305) 665-5475"));

        return items;

    }

    public static FutureItem getplacebyposition (int positio){
        return items.get(positio);
    }

}
