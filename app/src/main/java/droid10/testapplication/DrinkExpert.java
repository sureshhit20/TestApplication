package droid10.testapplication;

/**
 * Created by admin on 20-Mar-18.
 */

import java.util.ArrayList;
import java.util.List;

public class DrinkExpert {

    List<String> getBrands(String color){

        List<String> brands = new ArrayList<String>();

        if (color.equals("Diet")){
            brands.add("Pepsi");
            brands.add("Maaja");
        }
        if (color.equals("Normal")){
            brands.add("Normal Pepsi");
            brands.add("Normal Maaja");
        }
        if (color.equals("Sweet")){
            brands.add("Sweet Pepsi");
        }
        if (color.equals("Hot")){
            brands.add("Hot Pepsi");
        }
            return brands;
    }
}
