/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Marken Tuan Nguyen
 */
public class ISBN extends javax.swing.JFrame {

    /**
     * Creates new form ISBN
     */
    public ISBN() {
        initComponents();
//        int d;
//        
//        Scanner scanner = new Scanner(System.in);
//        String input = scanner.next();
//        input.replaceAll("[^0-9,-\\.]", ",");
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        verifyISBN = new javax.swing.JButton();
        verifyCard = new javax.swing.JButton();
        editISBN = new javax.swing.JTextField();
        editCard = new javax.swing.JTextField();
        clear = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultBox = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        verifyISBN.setText("Verify ISBN");
        verifyISBN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verifyISBNMouseClicked(evt);
            }
        });

        verifyCard.setText("Verify Card");

        clear.setText("Clear");
        clear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearMouseClicked(evt);
            }
        });

        resultBox.setColumns(20);
        resultBox.setRows(5);
        jScrollPane1.setViewportView(resultBox);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(editISBN, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(49, 49, 49)
                                        .addComponent(verifyISBN)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(editCard, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(74, 74, 74)
                                        .addComponent(verifyCard))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(clear)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editISBN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(verifyISBN)
                    .addComponent(verifyCard))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(clear)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearMouseClicked
        // TODO add your handling code here:
        editISBN.setText("");
        editCard.setText("");
        resultBox.setText("");
    }//GEN-LAST:event_clearMouseClicked

    private void verifyISBNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verifyISBNMouseClicked
        // TODO add your handling code here:
        ArrayList<Character> d = new ArrayList<>(); 
        String s;
        s = editISBN.getText();
        
        for ( int i=0; i<s.length(); i++){
            if(Character.isLetterOrDigit(s.charAt(i))) {
                d.add(s.charAt(i)); 
            }
        }
        
        
        
        for ( int i=0;i<d.size(); i++){
            resultBox.append( "index: " + (i+1) + " has char: " + d.get(i) + "\n"); 
        }
        
        
        if(checkISBN(d) == 0){  //remain
            resultBox.append("Valid Book");
            resultBox.append("\n"+checkISBN(d));
        } else {
            resultBox.append("Invalid Book !!!");
            resultBox.append("\nThe last digit should be: "+checkISBN(d));
        }         
    }//GEN-LAST:event_verifyISBNMouseClicked
    
//    private int hasLetter (ArrayList<Integer> d) {
//        for ( int i=0;i<d.size(); i++){
//            if(Character.isLetter(d.get(i))){
//                System.out.println("Empty at index: " + (i+1));
//                return (i+1);
//            }     
//        }
//        return 0;
//    }
    
//    private int predictDigit(int index, ArrayList<Integer> d) {
//        int result = 0;
//        int indexLetter = hasLetter(d);
//        int sumNoLetter = checkISBN(d);
//        return 0 ;
//    }
    
    private int checkISBN (ArrayList<Character> d){
        int sum = 0 ;
        //System.out.println(d);
        for ( int i=0; i<d.size(); i++){
           if(Character.isDigit(d.get(i))){
               sum += ((i+1)*(Integer.parseInt(String.valueOf(d.get(i))))); 
           }
           
           //System.out.println((i+1) + " x " + (d.get(i)) + " = " +sum);
        }
        int remain = sum %11;
        return remain;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(ISBN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ISBN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ISBN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ISBN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ISBN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clear;
    private javax.swing.JTextField editCard;
    private javax.swing.JTextField editISBN;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea resultBox;
    private javax.swing.JButton verifyCard;
    private javax.swing.JButton verifyISBN;
    // End of variables declaration//GEN-END:variables
}
