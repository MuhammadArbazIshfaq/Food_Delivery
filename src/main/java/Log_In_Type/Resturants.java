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
public class Resturants {
    String name;
    String password;
    String foods;

    public Resturants() {
    }
    
    Resturants(String Name, String Password)
    {
        name = Name;
        password = Password;
//        foods = Food;
    }
     public String getName() {
        return name;
    }

    public void setName(String Name) {
        name = Name;
    }
     public String getPassword() {
        return password;
    }

    public void setPassword(String Password) {
        password = Password;
    }

    public String getFoods() {
        return foods;
    }

    public void setFoods(String foods) {
        this.foods = foods;
    }
    
    
}
