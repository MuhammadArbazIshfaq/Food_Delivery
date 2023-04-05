/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Log_In_Type;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Aans
 */
public class Add_Food extends javax.swing.JFrame {

    /**
     * Creates new form Add_Food
     */
    ArrayList <Foods> food_arraylist = new ArrayList<Foods>();
    public Add_Food() {
        initComponents();
    }
//    String resturant_name;
//    Resturant_Log_In resturant_Log_In = new Resturant_Log_In();
//  String str =  resturant_Log_In.getName();
    //public  void setresturantname(String str )
  //  {
//        resturant_name = str;
   // }

//    public Add_Food(String Resturant_name) {
//        this.Resturant_name = Resturant_name;
//    }
   
    

    
    public void createFile(String Resturant_name){
         try {
             File my_file = new File(Resturant_name+".csv");
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
    
    
    void write (String food_name, double price)
     {
         try {
             System.out.println(Resturant_name);
             FileWriter fileWriter = new FileWriter(Resturant_name+".csv",true);
             fileWriter.write(food_name+","+price+"\n");
             System.out.println("written");
             fileWriter.close();
         }catch(IOException e)
         {
             System.out.println("ERROR");
             e.printStackTrace();
         }
     }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Food_Name = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Food_Price = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Add_Button = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        resturant_name = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Enter the Name of Food:");

        Food_Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Food_NameActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Enter the price of Food:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Rupees");

        Add_Button.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Add_Button.setText("Add ");
        Add_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_ButtonActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setText("Enter the Name of Resturant:");

        resturant_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resturant_nameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Add_Button)
                .addGap(160, 160, 160))
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Food_Name, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Food_Price, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3))
                    .addComponent(resturant_name))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(resturant_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Food_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Food_Price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(51, 51, 51)
                .addComponent(Add_Button)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Food_NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Food_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Food_NameActionPerformed
String Food_name;
double price;
//String Resturant_name;
        Resturant_Log_In resturant_Log_In = new Resturant_Log_In();
//        String Resturant_Name = resturant_Log_In.getText();
//        Resturants resturants = new Resturants();
//        String Resturant_Name = resturants.getName();
        Resturants resturants = new Resturants();
        String Resturant_name;
//        String Resturant_name = resturant_Log_In.Resturant_Name;
//        Resturants resturants = new Resturants();
//        String Resturant_name = resturant_Log_In.getName();
    private void Add_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_ButtonActionPerformed
        // TODO add your handling code here:
        Resturant_name =resturant_name.getText();
System.out.println(Resturant_name);

        Food_name = Food_Name.getText();
        price = Double.valueOf(Food_Price.getText());
        Foods food = new Foods(Food_name,price);
        food_arraylist.add(food);
        System.out.println(Resturant_name);
        createFile(Resturant_name);
        write(Food_name, price);
        JOptionPane.showMessageDialog(this, "Food Added!");
        Resturant_Menu resturant_Menu = new  Resturant_Menu();
        resturant_Menu.main();
        dispose();
        
        
    }//GEN-LAST:event_Add_ButtonActionPerformed

    private void resturant_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resturant_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resturant_nameActionPerformed

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
            java.util.logging.Logger.getLogger(Add_Food.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_Food.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_Food.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_Food.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_Food().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add_Button;
    private javax.swing.JTextField Food_Name;
    private javax.swing.JTextField Food_Price;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField resturant_name;
    // End of variables declaration//GEN-END:variables
}
