/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package proyecto_grafos_conjuntos_listas;

import java.util.ArrayList;

/**
 *
 * @author oscarito
 */
public class viewGroups extends javax.swing.JFrame {
    private ArrayList allGroups;
    int posActual = 0;
    /**
     * Creates new form viewGroups
     */
    public viewGroups() {
        initComponents();
    }
    public viewGroups(ArrayList allGroups) {
        this.allGroups = allGroups;
        initComponents();
        showGroup();
    }
    
    public void showGroup() {
        jpAllGroups.removeAll();
        ArrayList<Group> actualSet = (ArrayList<Group>)allGroups.get(posActual);
        for (Group group : actualSet) {
            int pos = actualSet.indexOf(group);
            groupPanel viewGroup = new groupPanel(group, pos + 1);
            viewGroup.setBounds(pos * 200, 0, 200, 150);
            viewGroup.setVisible(true);
            jpAllGroups.add(viewGroup);
            jpAllGroups.repaint();
            jpAllGroups.validate();
            this.repaint();
            this.validate();
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

        jpAllGroups = new javax.swing.JPanel();
        btnSiguiente = new javax.swing.JButton();
        btnAnterior = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jpAllGroupsLayout = new javax.swing.GroupLayout(jpAllGroups);
        jpAllGroups.setLayout(jpAllGroupsLayout);
        jpAllGroupsLayout.setHorizontalGroup(
            jpAllGroupsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jpAllGroupsLayout.setVerticalGroup(
            jpAllGroupsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 368, Short.MAX_VALUE)
        );

        btnSiguiente.setText("Siguiente");
        btnSiguiente.setFocusable(false);
        btnSiguiente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSiguiente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSiguiente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSiguienteMouseClicked(evt);
            }
        });

        btnAnterior.setText("Anterior");
        btnAnterior.setEnabled(false);
        btnAnterior.setFocusable(false);
        btnAnterior.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAnterior.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAnterior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAnteriorMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpAllGroups, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(btnAnterior)
                        .addGap(18, 18, 18)
                        .addComponent(btnSiguiente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 394, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSiguiente)
                    .addComponent(btnAnterior))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jpAllGroups, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void btnSiguienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSiguienteMouseClicked
        if (posActual >= this.allGroups.size() - 1) {
            return;
        }
        posActual++;
        if (posActual + 1 == this.allGroups.size()) {
            System.out.println("FINISH");
            this.btnSiguiente.setEnabled(false);
        }
        this.btnAnterior.setEnabled(true);
        showGroup();
    }//GEN-LAST:event_btnSiguienteMouseClicked
    
    private void btnAnteriorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAnteriorMouseClicked
        // TODO add your handling code here:
        if (posActual == 0) {
            return;
        }
        if (posActual == 1) {
            System.out.println("FINISH");
            this.btnAnterior.setEnabled(false);
        }
        posActual--;
        this.btnSiguiente.setEnabled(true);
        showGroup();
    }//GEN-LAST:event_btnAnteriorMouseClicked
    
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
            java.util.logging.Logger.getLogger(viewGroups.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewGroups.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewGroups.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewGroups.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewGroups().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JPanel jpAllGroups;
    // End of variables declaration//GEN-END:variables
}