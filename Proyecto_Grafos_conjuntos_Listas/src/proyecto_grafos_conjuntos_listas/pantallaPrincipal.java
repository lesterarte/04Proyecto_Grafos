/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_grafos_conjuntos_listas;

import java.awt.Component;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.graphstream.graph.Edge;
import org.graphstream.graph.Graph;
import org.graphstream.graph.Node;
import org.graphstream.graph.implementations.SingleGraph;

/**
 *
 * @author Lesterarte
 */
public class pantallaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form pantallaPrincipal
     */
    public pantallaPrincipal() {
        initComponents();
        ArrayList allGroups = readGroups();
        bindEvents(allGroups);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbSetting = new javax.swing.JDialog();
        jsPersonXGroup = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jsBreakXLeader = new javax.swing.JSpinner();
        btnaceptar = new javax.swing.JButton();
        chkOneCouple = new javax.swing.JCheckBox();
        jdSetGroups = new javax.swing.JDialog();
        jToolBar1 = new javax.swing.JToolBar();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jpAllGroups = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmfile = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        mnsalir = new javax.swing.JMenu();

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel2.setText("PERSON X GRUPO ");

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel1.setText("ONLY ONE COUPLE");

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel3.setText("BREAK FOR LEADER");

        btnaceptar.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnaceptar.setText("ACEPTAR");

        javax.swing.GroupLayout jbSettingLayout = new javax.swing.GroupLayout(jbSetting.getContentPane());
        jbSetting.getContentPane().setLayout(jbSettingLayout);
        jbSettingLayout.setHorizontalGroup(
            jbSettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jbSettingLayout.createSequentialGroup()
                .addGroup(jbSettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jbSettingLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jbSettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jbSettingLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jsBreakXLeader, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jbSettingLayout.createSequentialGroup()
                                .addGroup(jbSettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGap(72, 72, 72)
                                .addGroup(jbSettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chkOneCouple)
                                    .addComponent(jsPersonXGroup, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jbSettingLayout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(btnaceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jbSettingLayout.setVerticalGroup(
            jbSettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jbSettingLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jbSettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jsPersonXGroup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jbSettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkOneCouple)
                    .addComponent(jLabel1))
                .addGap(37, 37, 37)
                .addGroup(jbSettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jsBreakXLeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addComponent(btnaceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        jdSetGroups.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jdSetGroupsComponentShown(evt);
            }
        });

        jToolBar1.setRollover(true);

        jButton1.setText("Anterior");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton1);

        jButton2.setText("Siguiente");
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton2);

        javax.swing.GroupLayout jpAllGroupsLayout = new javax.swing.GroupLayout(jpAllGroups);
        jpAllGroups.setLayout(jpAllGroupsLayout);
        jpAllGroupsLayout.setHorizontalGroup(
            jpAllGroupsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jpAllGroupsLayout.setVerticalGroup(
            jpAllGroupsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 348, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jdSetGroupsLayout = new javax.swing.GroupLayout(jdSetGroups.getContentPane());
        jdSetGroups.getContentPane().setLayout(jdSetGroupsLayout);
        jdSetGroupsLayout.setHorizontalGroup(
            jdSetGroupsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 625, Short.MAX_VALUE)
            .addGroup(jdSetGroupsLayout.createSequentialGroup()
                .addComponent(jpAllGroups, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jdSetGroupsLayout.setVerticalGroup(
            jdSetGroupsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdSetGroupsLayout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpAllGroups, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("File");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jmfile.setText("Select file");
        jmfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmfileActionPerformed(evt);
            }
        });
        jMenu1.add(jmfile);

        jMenuItem2.setText("Create groups");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Show graph");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem1.setText("Show Groups");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        mnsalir.setText("Exit");
        mnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnsalirActionPerformed(evt);
            }
        });
        jMenuBar1.add(mnsalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 668, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 366, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmfileActionPerformed
        
    }//GEN-LAST:event_jmfileActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        this.jbSetting.pack();
        this.jbSetting.setVisible(true);
        this.jbSetting.setLocationRelativeTo(this);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void mnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnsalirActionPerformed
      
    }//GEN-LAST:event_mnsalirActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jdSetGroupsComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jdSetGroupsComponentShown
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jdSetGroupsComponentShown

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        this.jdSetGroups.pack();
        this.jdSetGroups.setVisible(true);
        this.jdSetGroups.setLocationRelativeTo(this);
    }//GEN-LAST:event_jMenuItem1ActionPerformed
    /**
     * 
     * @param allGroups Arreglo de arreglos de grupos
     * @return boolean, retorna true si el archivo fue cargado correctamente de lo contrario false.
     */
    public boolean saveGroups(ArrayList allGroups) {
        try {
            FileOutputStream fileOut=new FileOutputStream("groups.obj");
            ObjectOutputStream salida=new ObjectOutputStream(fileOut);
            salida.writeObject(allGroups);
            salida.close();
            return true;
        } catch (Exception e) {
            System.out.println(e.toString());
            return false;
        }
    }
    
    /**
     * Leer del archivo groups.obj, un arreglo que contiene arreglos de grupos.
     */
    public ArrayList readGroups() {
        ArrayList allGroups = new ArrayList();
        try {
            FileInputStream fileIn=new FileInputStream("groups.obj");
            ObjectInputStream entrada=new ObjectInputStream(fileIn);
            allGroups = (ArrayList)(entrada.readObject());
            for (Object group : allGroups) {
                ArrayList<Group> newGroup = (ArrayList<Group>)group;
                for (Object group1 : newGroup) {
                    System.out.println(group1.toString());                
                }
            }
        } catch (Exception e) {
            System.out.println("ERROR LEER ARCHIVO");
            System.out.println(e.toString());
        }
        return allGroups;
    }
    
    public Object[] readMembers(File inFile) {
        Scanner sc = null;
        ArrayList<Member> allMembers = new ArrayList<Member>();
        int contCouples = 0;
        int leaders = 0;
        try{
            sc = new Scanner( inFile );
            while( sc.hasNext() ){
                String actual = sc.nextLine();
                if (actual.contains(",")) {
                    allMembers.add(0, new Member(actual, true));
                    contCouples++;
                } else {
                    allMembers.add(new Member(actual, false));
                }
            }
        } catch(Exception e) {}
        return new Object[]{allMembers, contCouples};
    }
    /**
     * Este método enlaza los eventos de los componentes del GUI
     * @param allGroups 
     */
    public void bindEvents(ArrayList allGroups) {
        jdSetGroups.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                for (Object object : allGroups) {
                    ArrayList<Group> actualSet = (ArrayList<Group>)object;
                    for (Group group : actualSet) {
                        int pos = actualSet.indexOf(group);
                        groupPanel viewGroup = new groupPanel(group, pos + 1);
                        viewGroup.setBounds(pos * 200, 0, 200, 150);
                        viewGroup.setVisible(true);
                        jpAllGroups.add( viewGroup );
                        jpAllGroups.repaint();
                        jpAllGroups.validate();
                        jdSetGroups.repaint();
                        jdSetGroups.validate();
                        
                    }
                }
            }
        });
        
        
        //Menu
        Component scope = this;
        jmfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
                FileNameExtensionFilter filter = new  FileNameExtensionFilter("txt","txt");
                JFileChooser FSArchivo = new JFileChooser();
                FSArchivo.setFileFilter(filter);
                int opcion = FSArchivo.showDialog(FSArchivo, "Aceptar");
                if (opcion == JFileChooser.CANCEL_OPTION) {
                    return;
                }
                String nombreArchivo = FSArchivo.getSelectedFile().toString();
                File archivoConfig = new File(nombreArchivo);

                //Get data from file
                Object[] data = readMembers(archivoConfig);
                ArrayList<Member> allMembers = (ArrayList<Member>)data[0];
                final int totalCouples = (int)data[1];
                Grafo friendlyGraph = createGraph(allMembers);
                if(allMembers.size()>0){
                    jbSetting.pack();
                    jbSetting.setLocationRelativeTo(scope);
                    jbSetting.setVisible(true);
                    /**
                     * Inyeccion del evento click del boton aceptar del dialogo settings
                     */
                    btnaceptar.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                            int personXGroup = (int)jsPersonXGroup.getValue();
                            int totalPersons = allMembers.size() + totalCouples;
                            int totalGroups = (int)(totalPersons / personXGroup);
                            int breaksXLeader = (int)jsBreakXLeader.getValue();
                            boolean oneCouple = chkOneCouple.isSelected();
                            int maxCouples = oneCouple ? totalCouples : 0;
                            //if (chkOneCouple.isSelected()) {
                                ArrayList<Group> newSetGroups = new ArrayList();
                                for (int i = 0; i < totalGroups; i++) {
                                    newSetGroups.add(new Group());
                                    Group actualGroup = newSetGroups.get(i);
                                    Member actualMember = allMembers.get(0);
                                    if (oneCouple && actualMember.isCouple()) {
                                       actualGroup.addMember(actualMember, friendlyGraph);
                                       actualMember.setBreakForLeader(breaksXLeader);
                                       allMembers.remove(0);
                                       maxCouples--;
                                    }
                                    while ((actualMember.isCouple() ? actualGroup.getCantMembers() + 1 : actualGroup.getCantMembers()) < personXGroup && !allMembers.isEmpty()) {
                                        int rand = (int)(Math.random() * (allMembers.size() - maxCouples) + maxCouples - 1);
                                        actualMember = allMembers.get(rand);
                                        if (actualGroup.getCantMembers() == (actualMember.isCouple() ? 1 : 0) && actualGroup.getLeader() == null) {
                                            while (actualMember.getBreakForLeader() > 0) {
                                                rand = (int)(Math.random() * (allMembers.size() - maxCouples) + maxCouples - 1);
                                                actualMember = allMembers.get(rand);
                                            }
                                        }
                                        Edge edgeToLeader = friendlyGraph.getEdge(actualMember.getName() + "->" + actualGroup.getLeader().getName());
                                        if (actualGroup.getCantMembers() == (actualMember.isCouple() ? 2 : 1) && edgeToLeader != null) {
                                            while (edgeToLeader != null) {
                                                rand = (int)(Math.random() * (allMembers.size() - maxCouples) + maxCouples - 1);
                                                actualMember = allMembers.get(rand);
                                                edgeToLeader = friendlyGraph.getEdge(actualMember.getName() + "->" + actualGroup.getLeader().getName());
                                            }
                                            
                                        }
                                        actualMember.setBreakForLeader(breaksXLeader);
                                        actualGroup.addMember(actualMember, friendlyGraph);
                                        allMembers.remove(rand);
                                    }   
                                }
                                int groupIndex = 0;
                                for (int j = 0; j < allMembers.size(); j++) {
                                    if (newSetGroups.get(groupIndex).getCantMembers() > personXGroup) {
                                        groupIndex++;
                                        continue;
                                    }

                                    allMembers.get(j).setBreakForLeader(breaksXLeader);
                                    newSetGroups.get(groupIndex).addMember(allMembers.get(j), friendlyGraph);
                                    groupIndex++;
                                }
                                allGroups.add(newSetGroups);
                                saveGroups(allGroups);
                                for (Group allGroup : newSetGroups) {
                                    System.out.println(allGroup.toString());                        
                                }

                            //}
                            jbSetting.setVisible(false);

                        }
                    });
                }
            }
        });
    }
    
    public Grafo createGraph(ArrayList<Member> allMembers){
        
        Grafo newGraph = new Grafo("Members");  
        newGraph.addAttribute("ui.quality");
        newGraph.addAttribute("ui.antialias");
        System.setProperty("org.graphstream.ui.renderer", "org.graphstream.ui.j2dviewer.J2DGraphRenderer");
        newGraph.addAttribute("ui.stylehseet", "url('http://somewere/in/the/clouds/stylesheet')");
        newGraph.addAttribute("ui.style", "padding: 45px;");
        for (int i = 0; i < allMembers.size(); i++) {
           newGraph.addNode(allMembers.get(i));
        }
      
       //labels nodes
       for(Node n:newGraph){
            n.addAttribute("ui.label",n.getId());
            n.addAttribute("ui.style", "text-alignment: at-right; text-padding:"
                    + " 4px, 3px; text-background-mode: rounded-box; "
                    + "text-background-color: #A7CC; text-color: white; "
                    + "text-style: bold-italic; text-color: #FFF;");     
       }     
       return newGraph;
        
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
            java.util.logging.Logger.getLogger(pantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pantallaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnaceptar;
    private javax.swing.JCheckBox chkOneCouple;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JDialog jbSetting;
    private javax.swing.JDialog jdSetGroups;
    private javax.swing.JMenuItem jmfile;
    private javax.swing.JPanel jpAllGroups;
    private javax.swing.JSpinner jsBreakXLeader;
    private javax.swing.JSpinner jsPersonXGroup;
    private javax.swing.JMenu mnsalir;
    // End of variables declaration//GEN-END:variables
}
