/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Log_In_Type;

//import Customer_Log_in.*;

import static Log_In_Type.Customer_New_account.customers_arrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.JOptionPane;


/**
 *
 * @author Aans
 */
public class Customer_Log_in extends javax.swing.JFrame {

    /**
     * Creates new form Customer_Log_in
     */
    public Customer_Log_in() {
        initComponents();
    }
    String name;
    String password;
    boolean Customer_Status;
    
        String data[];
 void read ()
     {
         try {
             FileReader fileReader = new FileReader("Customers_Data.csv");
             BufferedReader bufferedReader = new BufferedReader(fileReader);
             String line;
//             String name,password;
             for (int i=0;(line = bufferedReader.readLine())!=null;i++)
             {
                  data = line.split(",");
                  name = data[0];
                  password = data[1];
                  Customer_Status = Boolean.valueOf(data[2]);
                  
                 Customers customers = new Customers(name,password,Customer_Status);
                 customers_arrayList.add(customers);
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

        Name_label = new javax.swing.JLabel();
        Password = new javax.swing.JPasswordField();
        Password_Label = new javax.swing.JLabel();
        Name = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        customers_Log_in_button = new javax.swing.JButton();
        Back_button = new javax.swing.JButton();
        New_Account = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Name_label.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        Name_label.setText("Enter your Name:");

        Password.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        Password_Label.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        Password_Label.setText("Enter your Password:");

        Name.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Log_In As Customer");

        customers_Log_in_button.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        customers_Log_in_button.setText("Log-In");
        customers_Log_in_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customers_Log_in_buttonActionPerformed(evt);
            }
        });

        Back_button.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        Back_button.setText("Back");
        Back_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_buttonActionPerformed(evt);
            }
        });

        New_Account.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        New_Account.setText("Create a new Account");
        New_Account.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                New_AccountActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Password_Label)
                            .addComponent(Name_label, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(Back_button)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Name)
                            .addComponent(Password, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                            .addComponent(customers_Log_in_button, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap(42, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(109, Short.MAX_VALUE)
                .addComponent(New_Account)
                .addGap(72, 72, 72))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Name_label))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Password_Label)
                    .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Back_button)
                    .addComponent(customers_Log_in_button))
                .addGap(39, 39, 39)
                .addComponent(New_Account)
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameActionPerformed
Customer_New_account customer_New_account = new  Customer_New_account();
    
    private void customers_Log_in_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customers_Log_in_buttonActionPerformed
        // TODO add your handling code here:
            name= Name.getText();
        password = Password.getText();
//        System.out.println(name);
//        System.out.println(password);
System.out.println("up to for loop");
Boolean mark = false;
        System.out.println(customer_New_account.customers_arrayList.size());
        for (int i=0; i<customer_New_account.customers_arrayList.size();i++)
        {
//             mark = false;
//            System.out.println("Hello");
        if (name.equalsIgnoreCase(customer_New_account.customers_arrayList.get(i).getName())&&password.equalsIgnoreCase(customer_New_account.customers_arrayList.get(i).getPassword())&&(Customer_Status==false))
        {
            System.out.println("Name; "+name);
            System.out.println("Password: "+password);
//            System.out.println("Logg in successful");
mark = true;
            JOptionPane.showMessageDialog(this, "Logged-In Successfully");
//            Customer_Menu customer_Menu = new Customer_Menu();
//             customer_Menu.main();
             Resturants_List resturants_List = new Resturants_List();
             resturants_List.main();
             
             break;
        }
        else 
        {
                System.out.println("Error");
        }
        }
        if (mark == false)
        {
        JOptionPane.showMessageDialog(this, "Account Not Found!");
        }
    dispose();
        
    }//GEN-LAST:event_customers_Log_in_buttonActionPerformed
        Customer_New_account customer_new_Account = new Customer_New_account();
    private void Back_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_buttonActionPerformed
        // TODO add your handling code here:
        Log_In_Type log_in_type = new Log_In_Type();
        log_in_type.setVisible(true);
        dispose();
    }//GEN-LAST:event_Back_buttonActionPerformed

    private void New_AccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_New_AccountActionPerformed
        // TODO add your handling code here:
        customer_New_account.main();
        customer_New_account.setVisible(true);
        dispose();
    }//GEN-LAST:event_New_AccountActionPerformed

    /**
     * @param args the command line arguments
     */
    public void menu() {
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
            java.util.logging.Logger.getLogger(Customer_Log_in.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Customer_Log_in.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Customer_Log_in.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Customer_Log_in.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Customer_Log_in().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back_button;
    private javax.swing.JTextField Name;
    private javax.swing.JLabel Name_label;
    private javax.swing.JButton New_Account;
    private javax.swing.JPasswordField Password;
    private javax.swing.JLabel Password_Label;
    private javax.swing.JButton customers_Log_in_button;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
