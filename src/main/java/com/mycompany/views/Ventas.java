package com.mycompany.views;


import com.mycompany.ilib.DAOpolizasImpl;
import com.mycompany.ilib.DAOventasImpl;
import com.mycompany.interfaces.DAOpolizas;
import com.mycompany.interfaces.DAOventas;
import com.mycompany.models.ventas;
import com.mycompany.models.polizas;

import java.awt.Color;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class Ventas extends javax.swing.JPanel {
ventas ventasEdition;
    boolean isEdition = false;
    polizas polizasEdition;

   
 public Ventas(com.mycompany.models.polizas Polizas){
        initComponents();      
        polizasEdition=Polizas;
        InitStyles();
    }

    private void InitStyles() {
        title.putClientProperty("FlatLaf.styleClass", "h1");
        title.setForeground(Color.black);
        txtpromotor.putClientProperty("JTextField.placeholderText", "Ingrese Promotor");
        txtcedula.putClientProperty("JTextField.placeholderText", "Ingrese Cedula Promotor.");
        txtfecharevision.putClientProperty("JTextField.placeholderText", "Fecha de Revision.");
        txttipopago.putClientProperty("JTextField.placeholderText", "Ingrese Tipo de Pago.");
        txtfechapago.putClientProperty("JTextField.placeholderText", "Ingrese la Fecha de pago.");
        txtreferencia.putClientProperty("JTextField.placeholderText", "Ingrese Referencia.");
        txtmes.putClientProperty("JTextField.placeholderText", "Ingrese Mes.");
     
      
        txtmonto.putClientProperty("JTextField.placeholderText", "Ingrese Monto a pagar.");
        
       
        
       
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        titleLbl = new javax.swing.JLabel();
        txtpromotor = new javax.swing.JTextField();
        dateLbl = new javax.swing.JLabel();
        txtcedula = new javax.swing.JTextField();
        authorLbl = new javax.swing.JLabel();
        txtfecharevision = new javax.swing.JTextField();
        catLbl = new javax.swing.JLabel();
        txttipopago = new javax.swing.JTextField();
        edLbl = new javax.swing.JLabel();
        txtfechapago = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        langLbl = new javax.swing.JLabel();
        txtreferencia = new javax.swing.JTextField();
        pagsLbl = new javax.swing.JLabel();
        txtmes = new javax.swing.JTextField();
        txtmonto = new javax.swing.JTextField();
        dispLbl = new javax.swing.JLabel();
        button = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        bg.setBackground(new java.awt.Color(255, 255, 255));

        title.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        title.setForeground(new java.awt.Color(51, 51, 51));
        title.setText("Polizas de Seguro");

        titleLbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        titleLbl.setForeground(new java.awt.Color(51, 51, 51));
        titleLbl.setText("Vendedor");

        txtpromotor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpromotorActionPerformed(evt);
            }
        });

        dateLbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        dateLbl.setForeground(new java.awt.Color(51, 51, 51));
        dateLbl.setText("DNI/Cédula del promotor");

        authorLbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        authorLbl.setForeground(new java.awt.Color(51, 51, 51));
        authorLbl.setText("Fecha de revisión (promotor) ");

        catLbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        catLbl.setForeground(new java.awt.Color(51, 51, 51));
        catLbl.setText("Tipo de pago");

        edLbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        edLbl.setForeground(new java.awt.Color(51, 51, 51));
        edLbl.setText("Fecha de pago");

        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setPreferredSize(new java.awt.Dimension(200, 10));

        langLbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        langLbl.setForeground(new java.awt.Color(51, 51, 51));
        langLbl.setText("Referencia de la operación");

        txtreferencia.setToolTipText("");

        pagsLbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        pagsLbl.setForeground(new java.awt.Color(51, 51, 51));
        pagsLbl.setText("Mes a cancelar");

        txtmes.setToolTipText("");

        txtmonto.setToolTipText("");

        dispLbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        dispLbl.setForeground(new java.awt.Color(51, 51, 51));
        dispLbl.setText("Monto");

        button.setBackground(new java.awt.Color(18, 90, 173));
        button.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        button.setForeground(new java.awt.Color(255, 255, 255));
        button.setText("Subir");
        button.setBorderPainted(false);
        button.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(553, 553, 553))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txttipopago)
                            .addComponent(txtfecharevision)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(authorLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                                .addGap(233, 233, 233))
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(catLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(213, 213, 213))
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(titleLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(234, 234, 234))
                            .addComponent(txtpromotor)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(dateLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(161, 161, 161))
                            .addComponent(txtcedula)
                            .addComponent(txtfechapago, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(edLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(227, 227, 227)))
                        .addGap(68, 68, 68)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtreferencia)
                                    .addGroup(bgLayout.createSequentialGroup()
                                        .addComponent(langLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                                        .addGap(228, 228, 228))
                                    .addComponent(txtmes)
                                    .addGroup(bgLayout.createSequentialGroup()
                                        .addComponent(pagsLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(223, 223, 223))
                                    .addComponent(button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(bgLayout.createSequentialGroup()
                                        .addComponent(txtmonto, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(72, 72, 72))
                            .addGroup(bgLayout.createSequentialGroup()
                                .addGap(85, 85, 85)
                                .addComponent(dispLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())))))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(langLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtreferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pagsLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtmes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(dispLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtmonto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addComponent(button, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(titleLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtpromotor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dateLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtcedula, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(authorLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtfecharevision, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(catLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txttipopago, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtfechapago, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonActionPerformed
int id = polizasEdition.getId();
        String promotor=txtpromotor.getText();
      String cedula=txtcedula.getText();
      String fecharevision=txtfecharevision.getText();
       String tipopago=txttipopago.getText();
      String fechapago=txtfechapago.getText();
      String referencia=txtreferencia.getText();
      String mes=txtmes.getText();
     
  
        String monto=txtmonto.getText();
         
      if(tipopago.isEmpty()){
 javax.swing.JOptionPane.showMessageDialog(this, "Debe colocar al menos un Tipo de pago. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
         
            return;}
      
      if(monto.isEmpty()){
 javax.swing.JOptionPane.showMessageDialog(this, "Debe colocar el monto. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
         
            return;}
 
com.mycompany.models.ventas Ventas=isEdition ? ventasEdition : new com.mycompany.models.ventas();
Ventas.setPoliza_id(id);
Ventas.setPromotor(promotor);
Ventas.setCedula(cedula);
Ventas.setFecharevision(fecharevision);
Ventas.setPago(tipopago);
Ventas.setFecha_pago(fechapago);
Ventas.setReferencia(referencia);
Ventas.setMes(mes);
Ventas.setMonto(monto);


   try{
   DAOventas dao= new DAOventasImpl();
   if(!isEdition)
       dao.registrar(Ventas);
       
   else 
       dao.modificar(Ventas);
        
   String succesMessage = isEdition ? "Modificado" : "Agregada";
        javax.swing.JOptionPane.showMessageDialog(this, "Venta"+succesMessage+ " exitosamente. \n", "AVISO",javax.swing.JOptionPane.INFORMATION_MESSAGE);
        if(!isEdition){ 
            txtpromotor.setText("");
           txtcedula.setText("");
            txtfecharevision.setText("");
         txtfechapago.setText("");
            txtreferencia.setText("");
            txtmes.setText("");
           
            txtmonto.setText("");
     
            txttipopago.setText("");
            
        }
            
   }   catch (Exception e){
 String errorMessage = isEdition ? "Modificar" : "Registrar";
        javax.swing.JOptionPane.showMessageDialog(this, "Ocurrio un error al "+errorMessage+ " la venta. \n", "AVISO",javax.swing.JOptionPane.INFORMATION_MESSAGE);
   }  

        
        

           
    }//GEN-LAST:event_buttonActionPerformed

    private void txtpromotorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpromotorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpromotorActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel authorLbl;
    private javax.swing.JPanel bg;
    private javax.swing.JButton button;
    private javax.swing.JLabel catLbl;
    private javax.swing.JLabel dateLbl;
    private javax.swing.JLabel dispLbl;
    private javax.swing.JLabel edLbl;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel langLbl;
    private javax.swing.JLabel pagsLbl;
    private javax.swing.JLabel title;
    private javax.swing.JLabel titleLbl;
    private javax.swing.JTextField txtcedula;
    private javax.swing.JTextField txtfechapago;
    private javax.swing.JTextField txtfecharevision;
    private javax.swing.JTextField txtmes;
    private javax.swing.JTextField txtmonto;
    private javax.swing.JTextField txtpromotor;
    private javax.swing.JTextField txtreferencia;
    private javax.swing.JTextField txttipopago;
    // End of variables declaration//GEN-END:variables
}