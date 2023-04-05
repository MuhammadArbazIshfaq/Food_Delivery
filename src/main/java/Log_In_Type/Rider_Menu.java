/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Log_In_Type;

import static Log_In_Type.Customer_New_account.customers_arrayList;
import java.awt.Color;
import java.awt.GridLayout;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Aans
 */
public class Rider_Menu extends javax.swing.JFrame {

    /**
     * Creates new form Rider_Menu
     */
    public Rider_Menu() {
        initComponents();
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
    
    public static ArrayList <Customer_Cart> Riders_order = new ArrayList<Customer_Cart>();
    
        String data[],food_name;
        double food_price;
 void read (String file_name)
     {
         try {
             FileReader fileReader = new FileReader(file_name+".csv");
             BufferedReader bufferedReader = new BufferedReader(fileReader);
             String line;
//             String name,password;
             for (int i=0;(line = bufferedReader.readLine())!=null;i++)
             {
                  data = line.split(",");
                  food_name = data[0];
                  food_price = Double.valueOf(data[1]);
                  
                 Customer_Cart customer_Cart = new Customer_Cart(food_name,food_price);
                 Riders_order.add(customer_Cart);
             }
             bufferedReader.close();
             System.out.println("Readed");
         }catch (Exception e)
         {
             System.out.println("ERROR");
             e.printStackTrace();
         }
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
        Accept_or_reject_Button = new javax.swing.JButton();
        View_Order_Button = new javax.swing.JButton();
        food_delivery_status_Button = new javax.swing.JButton();
        Cash_collection_button = new javax.swing.JButton();
        Back_Button = new javax.swing.JButton();
        Block_Customer_Button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Riders Menu");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 38, -1, -1));

        Accept_or_reject_Button.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        Accept_or_reject_Button.setText("Accept or reject delivery order");
        getContentPane().add(Accept_or_reject_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 101, -1, -1));

        View_Order_Button.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        View_Order_Button.setText("View Order");
        View_Order_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                View_Order_ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(View_Order_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 101, -1, -1));

        food_delivery_status_Button.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        food_delivery_status_Button.setText("Update food delivery status");
        food_delivery_status_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                food_delivery_status_ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(food_delivery_status_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        Cash_collection_button.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        Cash_collection_button.setText("Cash collection update");
        Cash_collection_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cash_collection_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(Cash_collection_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, -1, -1));

        Back_Button.setText("Back");
        Back_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(Back_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        Block_Customer_Button.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        Block_Customer_Button.setText("Block Customer");
        Block_Customer_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Block_Customer_ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(Block_Customer_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void View_Order_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_View_Order_ButtonActionPerformed
        // TODO add your handling code here:
        
        JFrame show_Orders = new JFrame("Orders");
        show_Orders.setLayout(new GridLayout(5,5));
        read("Food_Cart");
        for (int i = 0; i<Riders_order.size(); i++)
        {
            JLabel food_name = new JLabel(Riders_order.get(i).Name+" , "+String.valueOf(Riders_order.get(i).Price));
//            JLabel food_price = new JLabel(String.valueOf(Riders_order.get(i).Price));
            show_Orders.add(food_name);
//            show_Orders.add(food_price);
        }
        show_Orders.setVisible(true);
        
        
        
         
    

        
    }//GEN-LAST:event_View_Order_ButtonActionPerformed

    private void Back_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_ButtonActionPerformed
        // TODO add your handling code here:
        Log_In_Type log_In_Type = new Log_In_Type();
        dispose();
        log_In_Type.setVisible(true);
    }//GEN-LAST:event_Back_ButtonActionPerformed

    private void food_delivery_status_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_food_delivery_status_ButtonActionPerformed
        // TODO add your handling code here:
//        JOptionPane.showMessageDialog(null, "Food not dilivered Yet to customer!");
Resturants_Foods resturants_Foods = new Resturants_Foods();
resturants_Foods.Food_Status.setForeground(Color.YELLOW);
resturants_Foods.Food_Status.setText("Food Dilivered to Rider!");
//        JFrame Food_status = new JFrame("Food Status");
//        JLabel food_ststus = new JLabel("not dilivered to customer yet! ");
//        Food_status.add(food_ststus);
    }//GEN-LAST:event_food_delivery_status_ButtonActionPerformed

    private void Cash_collection_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cash_collection_buttonActionPerformed
        // TODO add your handling code here:
        Resturants_Foods resturants_Foods = new Resturants_Foods();
        resturants_Foods.Food_Status.setForeground(Color.PINK);
resturants_Foods.Food_Status.setText("Food Dilivered!!!");
        
    }//GEN-LAST:event_Cash_collection_buttonActionPerformed

    private void Block_Customer_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Block_Customer_ButtonActionPerformed
        // TODO add your handling code here:
        Block_Customer block_Customer = new Block_Customer();
        dispose();
        block_Customer.setVisible(true);
        
        
    }//GEN-LAST:event_Block_Customer_ButtonActionPerformed

    /**
     * @param args the command line arguments
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
            java.util.logging.Logger.getLogger(Rider_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Rider_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Rider_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Rider_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Rider_Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Accept_or_reject_Button;
    private javax.swing.JButton Back_Button;
    private javax.swing.JButton Block_Customer_Button;
    private javax.swing.JButton Cash_collection_button;
    private javax.swing.JButton View_Order_Button;
    private javax.swing.JButton food_delivery_status_Button;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}