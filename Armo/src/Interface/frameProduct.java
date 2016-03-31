package Interface;

import javax.swing.JOptionPane;
import Persistence.MSAccessA;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import logic.Product;

/**
 *
 * @author Yesica Daniela Vargas Espitia
 * @author Andres Mauricio Perez Escobar
 */
public class frameProduct extends javax.swing.JFrame {
 private MSAccessA dataFile;
    
    public frameProduct() {
         initComponents();
  
        this.setDataFile(new MSAccessA());
        this.selectProduct();
    }

    public MSAccessA getDataFile() {
        return dataFile;
    }

    public void setDataFile(MSAccessA dataFile) {
        this.dataFile = dataFile;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labProduct = new javax.swing.JLabel();
        labIdPro = new javax.swing.JLabel();
        labNamep = new javax.swing.JLabel();
        txtIdp = new javax.swing.JTextField();
        txtNamep = new javax.swing.JTextField();
        btnFirst = new javax.swing.JButton();
        btnPrevious = new javax.swing.JButton();
        btnNext1 = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnNew = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();

        labProduct.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        labProduct.setText("Product");

        labIdPro.setFont(new java.awt.Font("Kristen ITC", 0, 12)); // NOI18N
        labIdPro.setText("Id Product");

        labNamep.setFont(new java.awt.Font("Kristen ITC", 0, 12)); // NOI18N
        labNamep.setText("Name Product");

        btnFirst.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnFirst.setText("|<");
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });

        btnPrevious.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnPrevious.setText("<");
        btnPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviousActionPerformed(evt);
            }
        });

        btnNext1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnNext1.setText(">");
        btnNext1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNext1ActionPerformed(evt);
            }
        });

        btnLast.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnLast.setText(">|");
        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnNew.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnNew.setText("New");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        btnSearch.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSearch.setText("Search ...");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labNamep)
                    .addComponent(labIdPro))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labProduct)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtIdp, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                            .addComponent(txtNamep))))
                .addContainerGap(107, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(29, 29, 29)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnSearch)
                            .addGap(10, 10, 10)
                            .addComponent(btnNew)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnUpdate)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(48, 48, 48)
                            .addComponent(btnFirst)
                            .addGap(16, 16, 16)
                            .addComponent(btnPrevious)
                            .addGap(18, 18, 18)
                            .addComponent(btnNext1)
                            .addGap(18, 18, 18)
                            .addComponent(btnLast)
                            .addGap(0, 0, Short.MAX_VALUE)))
                    .addGap(30, 30, 30)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labProduct)
                        .addGap(18, 18, 18)
                        .addComponent(labIdPro))
                    .addComponent(txtIdp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labNamep)
                    .addComponent(txtNamep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(103, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(118, 118, 118)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnNext1)
                        .addComponent(btnLast)
                        .addComponent(btnFirst)
                        .addComponent(btnPrevious))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSearch)
                        .addComponent(btnDelete)
                        .addComponent(btnNew)
                        .addComponent(btnUpdate))
                    .addContainerGap(20, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
       try {
            this.getDataFile().getResultSet().first();
            this.updateView();
        } catch (SQLException ex) {
            Logger.getLogger(frameProduct.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnFirstActionPerformed

    private void btnPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousActionPerformed
        
         try {
            if (!this.getDataFile().getResultSet().isFirst()) {
                this.getDataFile().getResultSet().previous();
                this.updateView();
            }
        } catch (SQLException ex) {
            Logger.getLogger(frameProduct.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnPreviousActionPerformed

    private void btnNext1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNext1ActionPerformed
      try {
            if (!this.getDataFile().getResultSet().isLast()) {
                this.getDataFile().getResultSet().next();
                this.updateView();
            }
        } catch (SQLException ex) {
            Logger.getLogger(frameProduct.class.getName()).log(Level.SEVERE, null, ex);
        }    
    }//GEN-LAST:event_btnNext1ActionPerformed

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
          try {
            this.getDataFile().getResultSet().last();
            this.updateView();
        } catch (SQLException ex) {
            Logger.getLogger(frameProduct.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnLastActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
       if (JOptionPane.showConfirmDialog(this, 
                "Are you sure to delete this record?", "Delete record", 
                JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {

            this.deleteProduct();
            JOptionPane.showMessageDialog(this, "Deleted record!", "Delete record",
                JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        this.updateProduct();
        JOptionPane.showMessageDialog(this, "Updated record!", "Update record",
                JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
          if (btnNew.getText().equals("New")) {
            this.newView();
        }
        else if (btnNew.getText().equals("Save")) {
            if (validateView()) {
                this.insertProduct();

                btnNew.setText("New");
                btnFirst.setEnabled(true);
                btnPrevious.setEnabled(true);
                btnNext1.setEnabled(true);
                btnLast.setEnabled(true);
                btnSearch.setEnabled(true);
                btnUpdate.setEnabled(true);
                btnDelete.setEnabled(true);
            }
            else {
                JOptionPane.showMessageDialog(this, "Please, fill the requeried fields", 
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
      long id = Long.parseLong(JOptionPane.showInputDialog("Please, write the product id", "Product id"));
        if (id > 0){
             this.searchProduct(id);
        }
    }//GEN-LAST:event_btnSearchActionPerformed

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
            java.util.logging.Logger.getLogger(frameProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frameProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frameProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frameProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frameProduct().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnNext1;
    private javax.swing.JButton btnPrevious;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel labIdPro;
    private javax.swing.JLabel labNamep;
    private javax.swing.JLabel labProduct;
    private javax.swing.JTextField txtIdp;
    private javax.swing.JTextField txtNamep;
    // End of variables declaration//GEN-END:variables

     private boolean validateView() {
        boolean validate = !(txtIdp.getText().equals("") 
                || txtNamep.getText().equals(""));
                         
        return validate;
    }
     /**
     * Obtain the view data and tranfer it to the object
     */
    private Product view2Object() {
        Product product = new Product();

        product.setIdProduct(Integer.parseInt(txtIdp.getText()));
        product.setNameP(txtNamep.getText());
        
        return product;
    }
    
    /**
     * You obtain data from an object and pass it to the view
     */
    private void updateView() {
        if (this.getDataFile().getResultSet() == null) {
            this.newView();
        }
        else {
            this.object2View();
        }
    }

    /**
     * You prepare the view to enter a new employee data
     */
    private void newView() {
        
        txtIdp.setText("");
        txtNamep.setText("");
               
        btnNew.setText("save");
        btnFirst.setEnabled(false);
        btnPrevious.setEnabled(false);
        btnNext1.setEnabled(false);
        btnLast.setEnabled(false);
        btnSearch.setEnabled(false);
        btnDelete.setEnabled(false);
        btnUpdate.setEnabled(false);
    }

    /**
     * Result set -> object
     */
    private void object2View() {
        Product product = new Product();
        try {
             product.setIdProduct(this.getDataFile().getResultSet().getInt("idProduct"));
             product.setNameP(this.getDataFile().getResultSet().getString("nameProduct"));
             
            this.object2View(product);
        } catch (SQLException ex) {
            Logger.getLogger(frameUser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

     /**
     * Show the object data into view
     * @param employee Employee to show
     */
    private void object2View(Product product) {
        
        txtIdp.setText(""+ product.getIdProduct());
        txtNamep.setText(product.getNameP());
        
         }
    
    /**
     * Select employees from DB
     */
    private void selectProduct() {
        String query = "SELECT * FROM Product";
        if (this.getDataFile().execute(query)) {
            try {
                this.getDataFile().getResultSet().next();
                this.updateView();
            } catch (SQLException ex) {
                Logger.getLogger(frameUser.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    

/**
     * Insert new employee
     */
    private void insertProduct() {
        Product product = this.view2Object();

        String query = "INSERT INTO Product "
                + "(idProduct, nameProduct) "
                + "VALUES ("
                + product.getIdProduct()+ ", '"
                + product.getNameP() + ")";
        if (this.getDataFile().execute(query)) {
            this.selectProduct();
            this.searchProduct(product.getIdProduct());
        }
    }

    /**
     * Update employee
     */
    private void updateProduct() {
        Product product = this.view2Object();

        String query = "UPDATE Employee SET "
                + "nameProduct = '" + product.getNameP() + "', "
                + "WHERE idProduct = " + product.getIdProduct();
        if (this.getDataFile().execute(query)) {
            this.selectProduct();
            this.searchProduct(product.getIdProduct());
        }
    }

    /**
     * Delete employee
     */
    private void deleteProduct() {
        Product product = this.view2Object();
        String query = "DELETE * FROM Product WHERE id = " + product.getIdProduct();
        if (this.getDataFile().execute(query)) {
            this.selectProduct();
        }        
    }

    /**
     * Search employee by id
     * @param id Employee id
     */
    private void searchProduct(long id) {
        boolean find = false;
        try {
            if (this.getDataFile().getResultSet() != null) {
                Long lastId = this.getDataFile().getResultSet().getLong("id");
                this.getDataFile().getResultSet().beforeFirst();
                while (this.getDataFile().getResultSet().next()) {
                    if (this.getDataFile().getResultSet().getLong("id") == id) {
                        find = true;
                        break;
                    }
                }
                if (find) {
                    this.updateView();
                }
                else {
                    this.getDataFile().getResultSet().first();
                    this.searchProduct(lastId);
                    JOptionPane.showMessageDialog(this, "Product " + id + " was not found!");
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(frameProduct.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}