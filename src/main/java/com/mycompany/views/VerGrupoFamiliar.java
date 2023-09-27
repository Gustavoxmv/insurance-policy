/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.views;


import javax.swing.table.DefaultTableModel;
import com.mycompany.ilib.DAOfamiliaresImpl;
import com.mycompany.ilib.DAOpolizasImpl;
import com.mycompany.interfaces.DAOfamiliares;
import com.mycompany.interfaces.DAOpolizas;
import javax.swing.table.DefaultTableModel;
import com.mycompany.models.polizas;
import javax.swing.JTable;
/**
 *
 * @author Gustavo
 */
public class VerGrupoFamiliar extends javax.swing.JPanel {
polizas polizasEdition;
    /**
     * Creates new form GrupoFamiliarLista
     */
    public VerGrupoFamiliar(com.mycompany.models.polizas Polizas) {
   
        
            polizasEdition=Polizas;
initComponents();
      LoadUser();
    }
    
    
    
    
     private void LoadUser(){
   try{
    

    
    DAOfamiliares dao1= new DAOfamiliaresImpl();
    DefaultTableModel model =(DefaultTableModel) jTable1.getModel();
  
   
    dao1.listar(polizasEdition.getId()).forEach((u)-> model.addRow(new Object[]{u.getNombre(),u.getApellido(),u.getCedula(),u.getFecha_nacimiento(),u.getSexo(),u.getParentezco(),u.getId()}));
  
   ocultarColumnas(jTable1, new int[] {6});
   
   }
catch(Exception e)   
{
    System.out.println(e);
}
   }
   
   public void ocultarColumnas(JTable tbl, int columna[]) {
for (int i = 0; i < columna.length; i++) {
tbl.getColumnModel().getColumn(columna[i]).setMaxWidth(0);
tbl.getColumnModel().getColumn(columna[i]).setMinWidth(0);
tbl.getTableHeader().getColumnModel().getColumn(columna[i]).setMaxWidth(0);
tbl.getTableHeader().getColumnModel().getColumn(columna[i]).setMinWidth(0);
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        jTable1.setForeground(new java.awt.Color(51, 51, 51));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Apellido", "DNI/Cédula", "Fecha Nacimiento", "Sexo", "Parentesco", "ID"
            }
        ));
        jTable1.setSelectionBackground(new java.awt.Color(51, 51, 51));
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 51, 51));
        jButton1.setText("Borrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 651, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       DAOfamiliares dao= new DAOfamiliaresImpl();
   DefaultTableModel model =(DefaultTableModel) jTable1.getModel();
        for(int i: jTable1.getSelectedRows()){
   
   try{
     
   
    dao.eliminar((int) jTable1.getValueAt(i, 6));
   model.removeRow(i);
   }
catch(Exception e)   
{
    System.out.println(e);
}
   
   }
       
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
