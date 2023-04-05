/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Log_In_Type;

/**
 *
 * @author Aans
 */
public class Foods {
//    String Resturant_name;
    String food_name;
    double food_price;

    public Foods( String food_name, double food_price) {
//        this.Resturant_name = Resturant_name;
        this.food_name = food_name;
        this.food_price = food_price;
    }

    
    
//    public String getResturant_name() {
//        return Resturant_name;
//    }
//
//    public void setResturant_name(String Resturant_name) {
//        this.Resturant_name = Resturant_name;
//    }

    public String getFood_name() {
        return food_name;
    }

    public void setFood_name(String food_name) {
        this.food_name = food_name;
    }

    public double getFood_price() {
        return food_price;
    }

    public void setFood_price(double food_price) {
        this.food_price = food_price;
    }
    
    
    
}
