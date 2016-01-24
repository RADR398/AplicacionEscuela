/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InternalFrame.Estudiante;


import Metodos.NewHibernateUtil;
import Clases.Estudiante;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author rommel
 */
public class BuscarEstudiante extends javax.swing.JInternalFrame {

    DefaultTableModel modelo = new DefaultTableModel();
    static NuevoEstudiante nuevo = null;
    static MatriculaEstudiante matricula = null;
    static MensualidadEstudiante mensualidad = null;
    
    
    public BuscarEstudiante() {
        initComponents();
        buttonGroup1.add(carnet);
        buttonGroup1.add(apellido);
        carnet.setSelected(true);
        
        
        TablaTitulo();
        
        
    }

    public final void TablaTitulo(){
    
    modelo = new DefaultTableModel();
    modelo.addColumn("Carnet");
    modelo.addColumn("Apellido");
    modelo.addColumn("Nombre");
    modelo.addColumn("Telefono");
    modelo.addColumn("Genero");
    jTable1.setModel(modelo);
    MetodoBuscar("");
        
    }
    
    public void MetodoBuscar(String chain){
    
        
 
        
        String cadena="select * from Estudiante"; 
        
        if(!chain.equals("")){
       
        cadena += " where ";
        if(carnet.isSelected()){
        
        cadena += "numeroCarnet='"+chain+"'";    
        
        }else{
        
            cadena += "apellido='"+chain+"'";
        
        }
        }
        
        Session session = NewHibernateUtil.sessionFactory.openSession();

        
        List<Estudiante> estudiantes = session.createSQLQuery(String.format(cadena))
        .addEntity(Estudiante.class)
        .list();
        
        for(Estudiante estudiante : estudiantes){
        
        
        modelo.addRow(new String[]{estudiante.getNumeroCarnet(),estudiante.getApellido()
        ,estudiante.getNombre(),estudiante.getTelefono(),estudiante.getGenero()});
        
            
        }
    
        
    }
    
    public void Lista(){
    
    
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        carnet = new javax.swing.JRadioButton();
        apellido = new javax.swing.JRadioButton();
        jTextField1 = new javax.swing.JTextField();
        aceptar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Buscar Estudiante");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosing(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jTable1.setModel(modelo);
        jScrollPane1.setViewportView(jTable1);

        carnet.setText("Carnet");

        apellido.setText("Apellido");

        aceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Aceptar.png"))); // NOI18N
        aceptar.setText("Aceptar");
        aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Cancelar.png"))); // NOI18N
        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(carnet)
                        .addGap(18, 18, 18)
                        .addComponent(apellido)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addComponent(aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(carnet)
                    .addComponent(apellido)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aceptar)
                    .addComponent(jButton2))
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarActionPerformed
       
            int fila = jTable1.getSelectedRow();
            int columna = 0;
            
            if(fila!=-1){
                
                String carnets = jTable1.getValueAt(fila, columna).toString();
                Session session = NewHibernateUtil.sessionFactory.openSession();
                System.out.println("Carnet:"+carnets);
                Criteria consulta = session.createCriteria(Estudiante.class);
                consulta.add(Restrictions.eq("numeroCarnet", carnets));
                
                Estudiante student = (Estudiante)consulta.uniqueResult();

                if(nuevo!=null){

                    nuevo.student = student;
                    nuevo.setVisible(true);
                    nuevo.BuscarEstudiante();
                    nuevo = null;
                    

                }else if(matricula != null){
                
                    matricula.student = student;
                    matricula.setVisible(true);
                    matricula.BuscarEstudiante();
                    matricula = null;
                
                    
                    
                }else if(mensualidad != null){
                    
                    
                    mensualidad.setVisible(true);
                    mensualidad  = null;
                    
                
                }
                
                this.dispose();
            }else{
            
                JOptionPane.showMessageDialog(null, "Debe de seleccionar una fila", "Error de seleccionar fila", 
                JOptionPane.ERROR_MESSAGE);
            }
        
        
    }//GEN-LAST:event_aceptarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       if(nuevo != null){
       
           nuevo.setVisible(true);
           this.dispose();
       
       }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        if(nuevo != null){
        
            nuevo.setVisible(true);
           
        
        }else if(matricula != null){
        
            matricula.setVisible(true);
            
        
        }
         this.dispose();
    }//GEN-LAST:event_formInternalFrameClosing


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptar;
    private javax.swing.JRadioButton apellido;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton carnet;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
