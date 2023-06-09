/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Log_In_Type;

import static Log_In_Type.Resturant_new_Account.resturants_arrayList;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Aans
 */
public class Riders_New_Account extends javax.swing.JFrame {

    /**
     * Creates new form Riders_New_Account
     */
    public Riders_New_Account() {
        initComponents();
    }
    String name;
    String password;
    
    public static ArrayList<Riders> riders_arrayList = new ArrayList<Riders>();

    
    public void createFile(){
         try {
             File my_file = new File("Riders_Data.csv");
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

 void write (String name, String password)
     {
         try {
             FileWriter fileWriter = new FileWriter("Riders_Data.csv",true);
             fileWriter.write(name+","+password+"\n");
             fileWriter.close();
         }catch(IOException e)
         {
             System.out.println("ERROR");
             e.printStackTrace();
         }
     }
     
 
 String data[];
 void read ()
     {
         try {
             FileReader fileReader = new FileReader("Riders_Data.csv");
             BufferedReader bufferedReader = new BufferedReader(fileReader);
             String line;
             for (int i=0;(line = bufferedReader.readLine())!=null;i++)
             {
                  data = line.split(",");
                  name = data[0];
                  password = data[1];
                 Riders riders = new Riders(name,password);
                 riders_arrayList.add(riders);
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
        Name_label = new javax.swing.JLabel();
        Name = new javax.swing.JTextField();
        Password_label = new javax.swing.JLabel();
        Password = new javax.swing.JPasswordField();
        SignUp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Welcome to Sign-up ");

        Name_label.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        Name_label.setText("Enter your Name:");

        Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameActionPerformed(evt);
            }
        });

        Password_label.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        Password_label.setText("Enter the password:");

        Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordActionPerformed(evt);
            }
        });

        SignUp.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        SignUp.setText("Sign up");
        SignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignUpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Name_label)
                    .addComponent(Password_label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Password, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                    .addComponent(Name))
                .addContainerGap(93, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(SignUp)))
                .addContainerGap(136, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Name_label)
                    .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Password_label)
                    .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addComponent(SignUp)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameActionPerformed
        // TODO add your handling code here:
        //        String name = String.valueOf(Name);

    }//GEN-LAST:event_NameActionPerformed

    private void PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordActionPerformed
        // TODO add your handling code here:
        //        String password = String.valueOf(Password);
    }//GEN-LAST:event_PasswordActionPerformed

    private void SignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignUpActionPerformed
        // TODO add your handling code here:
        name = Name.getText();
        password = Password.getText();
        Riders riders_obj = new Riders(name, password);
        riders_arrayList.add(riders_obj);
        createFile();
        write(name,password);
        JOptionPane.showMessageDialog(this, "Account Createde Successfully!");
        Rider_Log_in rider_Log_In = new Rider_Log_in();
        rider_Log_In.menu();
        dispose();
    }//GEN-LAST:event_SignUpActionPerformed

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
            java.util.logging.Logger.getLogger(Riders_New_Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Riders_New_Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Riders_New_Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Riders_New_Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Riders_New_Account().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Name;
    private javax.swing.JLabel Name_label;
    private javax.swing.JPasswordField Password;
    private javax.swing.JLabel Password_label;
    private javax.swing.JButton SignUp;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
