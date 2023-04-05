/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Log_In_Type;

import static Log_In_Type.Customer_New_account.customers_arrayList;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
//import java.awt*;
/**
 *
 * @author Aans
 */
public class Resturants_Foods extends javax.swing.JFrame {

    public ArrayList<Customer_Cart> getCart_ArrayList() {
        return Cart_ArrayList;
    }
    public void createFile1(){
         try {
             File my_file = new File("Food_Cart.csv");
             if (my_file.createNewFile())
             {
                 System.out.println("File Created: "+my_file.getName());
             }else
                 System.out.println("Already exist");
         }catch (IOException e)
         {
             System.out.println("Error");
             e.printStackTrace();
         }
     }
    
    void write (String food_name, double food_price)
     {
         try {
             FileWriter fileWriter = new FileWriter("Food_Cart.csv",true);
             fileWriter.write(food_name+","+food_price+"\n");
             fileWriter.close();
         }catch(IOException e)
         {
             System.out.println("ERROR");
             e.printStackTrace();
         }
     }
     public JLabel Food_Status = new JLabel("Order not dilivered yet!");

    
     void delete(String filename, int startline)
    {
        try
        {
            BufferedReader br=new BufferedReader(new FileReader(filename+".csv"));
            StringBuffer sb=new StringBuffer("");
            int linenumber=1;
            String line;
            while((line=br.readLine())!=null)
            {
                if(linenumber<startline||linenumber>=startline+1)
                    sb.append(line+"\n");
                linenumber++;
            }
            if(startline+1>linenumber)
                System.out.println("End of file reached.");
            br.close();

            FileWriter fw=new FileWriter(new File(filename+".csv"));
            fw.write(sb.toString());
            fw.close();
        }
        catch (Exception e)
        {
            System.out.println("Something went wrong: "+e.getMessage());
        }
    }
    
    void read (String Food_name, String FileName)
     {
         String data[];
         String FoodName;
         double FoodPrice;
         try {
             FileReader fileReader = new FileReader(FileName+".csv");
             BufferedReader bufferedReader = new BufferedReader(fileReader);
             String line;
             boolean check=false;
             for (int i=0;(line = bufferedReader.readLine())!=null;i++)
             {
                  data = line.split(",");
                  FoodName = data[0];
                  FoodPrice = Double.valueOf(data[1]);
                  if(Food_name.equalsIgnoreCase(FoodName))
                  { delete(FileName, i+1);
                  check = true;
                  JOptionPane.showMessageDialog(null, "Successfully Deleted!");
                  }
             }
             if (check==false)
             {
                 JOptionPane.showMessageDialog(null, "Food not found!");
             }
             bufferedReader.close();
             System.out.println("Readed");
         }catch (Exception e)
         {
             System.out.println("ERROR");
             e.printStackTrace();
         }
     }

    
//    

    /**
     * Creates new form Resturants_Foods
     */
//    public Resturants_Foods() {
//        initComponents();
//    }
    public void setCart_ArrayList(ArrayList<Customer_Cart> Cart_ArrayList) {
        this.Cart_ArrayList = Cart_ArrayList;
    }
    
//    public void delete_record()
//    {
//        
//    }
    
String data[];
String food_name;
double food_price;
             ArrayList<Customer_Cart> Cart_ArrayList = new ArrayList<Customer_Cart>();
//            Resturant_Menu resturant_Menu = new Resturant_Menu();
            ArrayList<JButton> food_collection = new ArrayList<JButton>();
    ArrayList<Foods> food_ArrayList = new  ArrayList<Foods>();
    void read (String resturant_name)
     {
         JFrame frame = new JFrame(resturant_name);
         try {
             FileReader fileReader = new FileReader(resturant_name+".csv");
             BufferedReader bufferedReader = new BufferedReader(fileReader);
             String line;
//             String name,password;
             for (int i=0;(line = bufferedReader.readLine())!=null;i++)
             {
                  data = line.split(",");
                  food_name = data[0];
                  food_price = Double.valueOf(data[1]);
                  
                  JButton button = new JButton(food_name+" \n "+food_price);
                  food_collection.add(button);
                  Foods foods = new  Foods(food_name,Double.valueOf(food_price));
                  food_ArrayList.add(foods);

                  
                   button.setBounds(50,100*i,150,60);
                   frame.add(button);
                   frame.setSize(400,400);
                   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                   frame.setLayout(null);  
                   frame.setVisible(true);}
             
             JButton Back = new JButton("Back");
         frame.add(Back);
         Back.setBounds(250, 10, 100, 50);
         dispose();
         Back.addActionListener(new ActionListener()
         {
             @Override
            public void actionPerformed(ActionEvent e){
            Customer_Log_in customer_Log_in = new Customer_Log_in();
            customer_Log_in.setVisible(true);
            dispose();
            }
         }
         );
             
                 bufferedReader.close();
             System.out.println("Readed");
         }catch (Exception e)
         {
             JOptionPane.showMessageDialog(this, "No Food!");
             System.out.println("ERROR");
             e.printStackTrace();
         }
         
     }
             public void Action_Listener()
             {
                              JFrame customer_cart = new JFrame("Customer's Cart");
                              customer_cart.setBounds(50, 50, 500, 500);
                              Customer_Cart customer_Cart = new Customer_Cart(food_name,food_price);
                              
for (int i=0; i<food_collection.size(); i++)
{
    int finalI = i;
    food_collection.get(i).addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            customer_cart.setLayout(new GridLayout(5,5));
            JPanel panel = new JPanel();
            panel.setBounds(50, 50, 20, 20);
            panel.setBackground(Color.gray);
            
            JButton Remove_Button = new JButton("Remove");
            
//String food = food_collection.get(i).get
//String food_name = food_ArrayList.get(i).food_name;
            JLabel food = new JLabel("Food: "+food_ArrayList.get(finalI).getFood_name());
            JLabel price = new JLabel("Price: "+food_ArrayList.get(finalI).getFood_price());
            panel.add(food);
            panel.add(price);
            customer_cart.add(panel);
            panel.add(Remove_Button);
//            customer_cart.add(Check_out_Button);
            
           
            
            
            Remove_Button.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e)
            {

                String food_name = food_ArrayList.get(finalI).getFood_name();
                System.out.println(food_name);
                read(food_name, "Food_Cart");
            }
            }
            );
            

            
            customer_cart.setVisible(true);
            write(food_ArrayList.get(finalI).getFood_name(),food_ArrayList.get(finalI).getFood_price());
//            Cart_ArrayList.add(customer_Cart);
//            Cart_ArrayList.add(customer_Cart);
              JOptionPane.showMessageDialog(null, "---! Food Added to Cart !---");
              
        }
    }
    );
             }
JButton Check_out_Button = new JButton("Check Out");
customer_cart.add(Check_out_Button);
JButton Cancel_Order_Button = new JButton("Cancel Order");
customer_cart.add(Cancel_Order_Button);
//JLabel Food_Status = new JLabel("Order not dilivered yet!");
Food_Status.setOpaque(true);
Food_Status.setForeground(Color.red);
customer_cart.add(Food_Status);
Cancel_Order_Button.addActionListener(new ActionListener ()
{
    @Override
    public void actionPerformed(ActionEvent e)
    {
        readFile("Food_Cart");
    }
}
);


Check_out_Button.addActionListener(new ActionListener ()
{
    @Override
    public void actionPerformed(ActionEvent e)
    {
        Customer_Log_in customer_Log_in = new Customer_Log_in();
        customer_cart.dispose();
        customer_Log_in.setVisible(true);
    }
}
);
JButton place_order = new JButton("Place Order");
            place_order.setBounds(50, 50, 100, 50);
            customer_cart.add(place_order);
            place_order.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    Food_Status.setForeground(Color.BLUE);
                    Food_Status.setText("Order Dilivered to Resturant!");
//                    resturant_Menu.Resturant_Order.add(customer_Cart);                   
                    JOptionPane.showMessageDialog(null, "---!Order Placed!---");
                }
            }
            );
             }

//             Resturant_Menu resturant_Menu = new Resturant_Menu();
         String Resturant_Name;
    void show_foods(String resturant_name){
        Resturant_Name = resturant_name;
        read(resturant_name);
        Action_Listener();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addComponent(jLabel1)
                .addContainerGap(224, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(jLabel1)
                .addContainerGap(170, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
//     * @param args the command line arguments
     */
    public void main() {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Resturants_Foods.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Resturants_Foods.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Resturants_Foods.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Resturants_Foods.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
createFile1();
//        show_foods(resturant_name);
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Resturants_Foods().setVisible(true);
            }
        });
    }

        void deleteall(String filename, int startline)
    {
        try
        {
            FileWriter fw=new FileWriter(new File(filename+".csv"));
            fw.write("");
            fw.close();
        }
        catch (Exception e)
        {
            System.out.println("Something went wrong: "+e.getMessage());
        }
    }
    
    void readFile (String FileName)
     {
         String data[];
         String FoodName;
         double FoodPrice;
         try {
             FileReader fileReader = new FileReader(FileName+".csv");
             BufferedReader bufferedReader = new BufferedReader(fileReader);
             String line;
             boolean check=false;
             for (int i=0;(line = bufferedReader.readLine())!=null;i++)
             {
                  
                  deleteall(FileName, i);
                  check = true;
                  
             }
             if (check==false)
             {
                 JOptionPane.showMessageDialog(null, "Food not found!");
             }
             else
                 JOptionPane.showMessageDialog(null, "Successfully Deleted!");

             bufferedReader.close();
             System.out.println("Readed");
         }catch (Exception e)
         {
             System.out.println("ERROR");
             e.printStackTrace();
         }
     }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}


