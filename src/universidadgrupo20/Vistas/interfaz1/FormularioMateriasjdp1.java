
package universidadgrupo20.Vistas.interfaz1;

import javax.swing.JOptionPane;
import universidadgrupo20.Entidades.Materia;
import universidadgrupo20.accesoADatos.MateriaData;


public class FormularioMateriasjdp1 extends javax.swing.JInternalFrame {
    private MateriaData mateData = new MateriaData();
    private Materia mateActual = null;

    
    public FormularioMateriasjdp1() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jbEliminar = new javax.swing.JButton();
        jBnuevaMat = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jRadioBestado = new javax.swing.JRadioButton();
        jTAnio = new javax.swing.JTextField();
        jTNombre = new javax.swing.JTextField();
        jBuscar = new javax.swing.JButton();
        jTMateria = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setBorder(null);
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Formulario Materias");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Formulario Materias", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbEliminar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbEliminar.setText("Eliminar");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(jbEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 103, 37));

        jBnuevaMat.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jBnuevaMat.setText("Nuevo");
        jBnuevaMat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBnuevaMatActionPerformed(evt);
            }
        });
        jPanel1.add(jBnuevaMat, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 103, 37));

        jbGuardar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(jbGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 103, 37));

        jbSalir.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });
        jPanel1.add(jbSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 103, 37));

        jRadioBestado.setText("Activo");
        jPanel1.add(jRadioBestado, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, -1, -1));
        jPanel1.add(jTAnio, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 170, 30));
        jPanel1.add(jTNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 170, 30));

        jBuscar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jBuscar.setText("buscar");
        jBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(jBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 25, 80, -1));
        jPanel1.add(jTMateria, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 86, 30));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Nombre");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 56, 26));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Año");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 56, 26));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Estado");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 47, 30));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Codigo");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 47, 26));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBnuevaMatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBnuevaMatActionPerformed
      limpiarCampos();
      mateActual=null;
    }//GEN-LAST:event_jBnuevaMatActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed

        String nombre = jTNombre.getText();
        Integer anio = Integer.parseInt(jTAnio.getText());
        if(nombre.isEmpty() || anio==null){
                JOptionPane.showMessageDialog(this,"No puede haber campos vacios");
                return;
            
            }
        if(mateActual == null){
            mateActual = new Materia(nombre, anio,true);
            mateData.guardarMateria(mateActual);
        }else{
            mateActual.setAnioMateria(anio);
            mateActual.setNombre(nombre);
            
            mateData.modificarMateria(mateActual);
           
        
        }
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuscarActionPerformed
       try{
        int cod = Integer.parseInt(jTMateria.getText());
        
        
        mateActual = mateData.buscarMateria(cod);
            if(mateActual!=null){
                jTNombre.setText(mateActual.getNombre());
                jTAnio.setText(String.valueOf(mateActual.getAnioMateria()));
                jRadioBestado.setSelected(mateActual.isActivo());
                
            }
        
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(this, "Debe ingresar un número");
            
        }
    }//GEN-LAST:event_jBuscarActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        
               if(mateActual != null){
       
           mateData.eliminarMateria(mateActual.getIdMateria());
           mateActual =null;
           limpiarCampos();
           JOptionPane.showMessageDialog(this, "Materia Eliminado");
                   
       
       
       }else{
           JOptionPane.showMessageDialog(this, "Seleccione una materia para eliminar");
       }
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
       JOptionPane.showMessageDialog(this, "Saliendo");
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void limpiarCampos(){
        jTMateria.setText("");
        jTNombre.setText("");
        jTAnio.setText("");
        jRadioBestado.setSelected(true);
    
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBnuevaMat;
    private javax.swing.JButton jBuscar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioBestado;
    private javax.swing.JTextField jTAnio;
    private javax.swing.JTextField jTMateria;
    private javax.swing.JTextField jTNombre;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbSalir;
    // End of variables declaration//GEN-END:variables
}
