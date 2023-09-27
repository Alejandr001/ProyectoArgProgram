
package universidadgrupo20.Vistas.interfaz1;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Principal extends javax.swing.JFrame {


    public Principal() {
        initComponents();
 
     
        this.setLocationRelativeTo(null);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        JbAlumno = new javax.swing.JButton();
        JbMaterias = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        JbListadoMat = new javax.swing.JButton();
        JbListadoAlu = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        JbCalificaciones1 = new javax.swing.JButton();
        JbInscripcion = new javax.swing.JButton();
        jDesktopPaneMenuPrincipal = new javax.swing.JDesktopPane();
        jBSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Principal");
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "MENU ADMINISTRATIVO", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Times New Roman", 1, 18))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Formularios", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        JbAlumno.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        JbAlumno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/universidadgrupo20/Recursos/Iconos/icon.png"))); // NOI18N
        JbAlumno.setText("Alumnos");
        JbAlumno.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JbAlumno.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        JbAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbAlumnoActionPerformed(evt);
            }
        });

        JbMaterias.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        JbMaterias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/universidadgrupo20/Recursos/Iconos/office_folder_icon_219542.png"))); // NOI18N
        JbMaterias.setText("Materias");
        JbMaterias.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JbMaterias.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        JbMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbMateriasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JbAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JbMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JbAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JbMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 13, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Listado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        JbListadoMat.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        JbListadoMat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/universidadgrupo20/Recursos/Iconos/iconfinder-518-code-learning-code-learning-education-4212896_114952.png"))); // NOI18N
        JbListadoMat.setText("List. Materias");
        JbListadoMat.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JbListadoMat.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        JbListadoMat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbListadoMatActionPerformed(evt);
            }
        });

        JbListadoAlu.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        JbListadoAlu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/universidadgrupo20/Recursos/Iconos/icon.png"))); // NOI18N
        JbListadoAlu.setText("List. Alumnos");
        JbListadoAlu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JbListadoAlu.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        JbListadoAlu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbListadoAluActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JbListadoMat, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JbListadoAlu)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JbListadoMat, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JbListadoAlu, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 12, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(153, 153, 153));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Inscripciones & Notas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        JbCalificaciones1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        JbCalificaciones1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/universidadgrupo20/Recursos/Iconos/hand_document_list_paper_file_icon_219540.png"))); // NOI18N
        JbCalificaciones1.setText("Calificaciones");
        JbCalificaciones1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JbCalificaciones1.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        JbCalificaciones1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbCalificaciones1ActionPerformed(evt);
            }
        });

        JbInscripcion.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        JbInscripcion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/universidadgrupo20/Recursos/Iconos/curriculum_vitae_paper_document_icon_219537.png"))); // NOI18N
        JbInscripcion.setText("Inscripciones");
        JbInscripcion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JbInscripcion.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        JbInscripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbInscripcionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JbCalificaciones1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JbInscripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JbCalificaciones1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JbInscripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 880, 160));

        javax.swing.GroupLayout jDesktopPaneMenuPrincipalLayout = new javax.swing.GroupLayout(jDesktopPaneMenuPrincipal);
        jDesktopPaneMenuPrincipal.setLayout(jDesktopPaneMenuPrincipalLayout);
        jDesktopPaneMenuPrincipalLayout.setHorizontalGroup(
            jDesktopPaneMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 880, Short.MAX_VALUE)
        );
        jDesktopPaneMenuPrincipalLayout.setVerticalGroup(
            jDesktopPaneMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );

        jPanel1.add(jDesktopPaneMenuPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 880, 360));

        jBSalir.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });
        jPanel1.add(jBSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 540, 100, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 573, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    
    
    
    private void JbAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbAlumnoActionPerformed
   
        jDesktopPaneMenuPrincipal.removeAll();
        jDesktopPaneMenuPrincipal.repaint();
        FormularioAlumnojdp formAlum= new FormularioAlumnojdp();
        formAlum.setVisible(true);
        jDesktopPaneMenuPrincipal.add(formAlum);
        jDesktopPaneMenuPrincipal.moveToFront(formAlum);
        
         Dimension desktopSize = jDesktopPaneMenuPrincipal.getSize();
        Dimension FrameSize = formAlum.getSize();
        formAlum.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        formAlum.show();
    }//GEN-LAST:event_JbAlumnoActionPerformed

    private void JbListadoMatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbListadoMatActionPerformed
        jDesktopPaneMenuPrincipal.removeAll();
        jDesktopPaneMenuPrincipal.repaint();
        ListarxMateriajif1 LisM= new ListarxMateriajif1();
        LisM.setVisible(true);
        jDesktopPaneMenuPrincipal.add(LisM);
        jDesktopPaneMenuPrincipal.moveToFront(LisM);
        
        
         Dimension desktopSize = jDesktopPaneMenuPrincipal.getSize();
        Dimension FrameSize = LisM.getSize();
        LisM.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        LisM.show();

    }//GEN-LAST:event_JbListadoMatActionPerformed
  
    private void JbListadoAluActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbListadoAluActionPerformed
    jDesktopPaneMenuPrincipal.removeAll();
        jDesktopPaneMenuPrincipal.repaint();
        ListarxAlumnojif LisA= new ListarxAlumnojif();
        LisA.setVisible(true);
        jDesktopPaneMenuPrincipal.add(LisA);
        jDesktopPaneMenuPrincipal.moveToFront(LisA);
        
        
         Dimension desktopSize = jDesktopPaneMenuPrincipal.getSize();
        Dimension FrameSize = LisA.getSize();
        LisA.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        LisA.show();
    }//GEN-LAST:event_JbListadoAluActionPerformed

    private void JbInscripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbInscripcionActionPerformed
        jDesktopPaneMenuPrincipal.removeAll();
        jDesktopPaneMenuPrincipal.repaint();
        FormDeInscripcion ForI= new FormDeInscripcion();
        ForI.setVisible(true);
        jDesktopPaneMenuPrincipal.add(ForI);
        jDesktopPaneMenuPrincipal.moveToFront(ForI);
        Dimension desktopSize = jDesktopPaneMenuPrincipal.getSize();
        Dimension FrameSize = ForI.getSize();
        ForI.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        ForI.show();
    }//GEN-LAST:event_JbInscripcionActionPerformed

    private void JbMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbMateriasActionPerformed

        jDesktopPaneMenuPrincipal.removeAll();
        jDesktopPaneMenuPrincipal.repaint();
        FormularioMateriasjdp1 formAlum= new FormularioMateriasjdp1();
        formAlum.setVisible(true);
        jDesktopPaneMenuPrincipal.add(formAlum);
        jDesktopPaneMenuPrincipal.moveToFront(formAlum);
        
         Dimension desktopSize = jDesktopPaneMenuPrincipal.getSize();
        Dimension FrameSize = formAlum.getSize();
        formAlum.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        formAlum.show();     
    }//GEN-LAST:event_JbMateriasActionPerformed

    private void JbCalificaciones1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbCalificaciones1ActionPerformed
              
        jDesktopPaneMenuPrincipal.removeAll();
        jDesktopPaneMenuPrincipal.repaint();
        FormCargarNoa formMa= new FormCargarNoa();
        formMa.setVisible(true);
        jDesktopPaneMenuPrincipal.add(formMa);
        jDesktopPaneMenuPrincipal.moveToFront(formMa);
        
         Dimension desktopSize = jDesktopPaneMenuPrincipal.getSize();
        Dimension FrameSize = formMa.getSize();
        formMa.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        formMa.show();
        
    }//GEN-LAST:event_JbCalificaciones1ActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        JOptionPane.showMessageDialog(this, "Saliendo");
        dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_jBSalirActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JbAlumno;
    private javax.swing.JButton JbCalificaciones1;
    private javax.swing.JButton JbInscripcion;
    private javax.swing.JButton JbListadoAlu;
    private javax.swing.JButton JbListadoMat;
    private javax.swing.JButton JbMaterias;
    private javax.swing.JButton jBSalir;
    private javax.swing.JDesktopPane jDesktopPaneMenuPrincipal;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    // End of variables declaration//GEN-END:variables
}
