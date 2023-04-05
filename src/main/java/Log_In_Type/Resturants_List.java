/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Log_In_Type;

import static Log_In_Type.Customer_New_account.customers_arrayList;
import java.awt.AWTEventMulticaster;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.util.ArrayList;

/**
 *
 * @author Aans
 */
public class Resturants_List extends javax.swing.JFrame {
        ArrayList<JButton> buttoncollection = new ArrayList<JButton>();
    /**
     * Creates new form Resturants_List
     */
    public Resturants_List() {
//        initComponents();
//        myinitComponents();
    }
    
    String data[], name, password;
    void read ()
     {
         JFrame f=new JFrame("Resturants List");  
         try {
             FileReader fileReader = new FileReader("Resturants_Data.csv");
             BufferedReader bufferedReader = new BufferedReader(fileReader);
             String line;
//             String name,password;
             for (int i=0;(line = bufferedReader.readLine())!=null;i++)
             {
                  data = line.split(",");
                  name = data[0];
                  password = data[1];
//                  myinitComponents(name, i);
//                 Customers customers = new Customers(name,password);
//                 customers_arrayList.add(customers);
                   JButton r=new JButton(name);
                   buttoncollection.add(r);
//                   JButton b=new JButton("Click Here");
//                   b.setBounds(50,100,95,30);
//                   f.add(b);  
                   r.setBounds(50*i*2,100,95,30);
                   f.add(r);
                   f.setSize(400,400); 
//                   String Name = r.getName();
//                   System.out.println(Name);
                   String NAME = r.getText();
                   System.out.println(NAME);
//                   System.out.println("Name: "+name);
//                   r.addActionListener(new ActionListener(){  
//                   public void actionPerformed(ActionEvent e){  
////                 tf.setText("Welcome to Javatpoint.");  
//
//                       System.out.println(name);
//
//                    if (r.getText().equalsIgnoreCase(name)){
//                    Resturants_Foods resturants_Foods = new Resturants_Foods();
//                    resturants_Foods.main();
//                    }
//                    else if(r.getText().equalsIgnoreCase("Hassan")){
////                    Hassan_Foods hassan_Foods = new Hassan_Foods();
////                    hassan_Foods.main();
//                    }
//                    else JOptionPane.showMessageDialog(null, "Error");
//                    }  
//                    }); 
                   f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                   f.setLayout(null);  
                   f.setVisible(true);
                   


//        jButton1 = new javax.swing.JButton();
//        jButton1.setText(name);
//        jButton1.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                jButton1ActionPerformed(evt);
//            }
//        });      
             }
             bufferedReader.close();
             System.out.println("Readed");
         }catch (Exception e)
         {
             System.out.println("ERROR");
             e.printStackTrace();
         }
         
         JButton Back = new JButton("Back");
         f.add(Back);
         Back.setBounds(10, 150, 100, 50);
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
     }
    public void actionListeners()
    {
    for (int i= 0; i<buttoncollection.size(); i++)
    {
        int finalI = i;
        buttoncollection.get(i).addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
//            ArrayList<Foods> foods =  new ArrayList<Foods>();
//            for (int i=0; i<foods.size(); i++)
//            {
//                System.out.println(foods.get(i));
//            }
            String resturant_name = buttoncollection.get(finalI).getText();
            System.out.println(resturant_name);
            Resturants_Foods resturants_Foods = new Resturants_Foods();
//            resturants_Foods.main();
dispose();
            resturants_Foods.show_foods(resturant_name);
            
            
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    
    );
    }
    
    }
    
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
//    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Which Resturant do you want to shop?");

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jLabel1))
                .addContainerGap(95, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addComponent(jButton1)
                .addContainerGap(201, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
//     * @param args the command line arguments
     */
    public  void main() {
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
            java.util.logging.Logger.getLogger(Resturants_List.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Resturants_List.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Resturants_List.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Resturants_List.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
                   read();
                   actionListeners();
    
        
 
            
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Resturants_List().setVisible(false);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
