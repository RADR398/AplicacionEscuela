package InternalFrame.Estudiante;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import Metodos.ImagenFondo;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;


/**
 *
 * @author rommel
 */
public final class MensualidadEstudiante extends javax.swing.JInternalFrame {

    DefaultTableModel modelo = new DefaultTableModel();
    DefaultTableModel detalle = new DefaultTableModel();
//    List<Mensualidad> mensualidads = new ArrayList<Mensualidad>();
    boolean deshacer = false;
    int n=0;
    int selectrow = 0;
    int fila1 = -1,fila2=-1,fila3=-1,fila4=-1;
            
    public MensualidadEstudiante() {
        initComponents();
        modelo.addColumn("Mes");
        modelo.addColumn("Estado");
        detalle.addColumn("Monto");
        detalle.addColumn("Interes");
        detalle.addColumn("Total");
//        vista.setEnabled(false);
        cargar.setEnabled(false);
        Bloquear(false);
    }
  
    public void Bloquear(boolean flag){
    
    carnet.setEnabled(flag);
    nombre.setEnabled(flag);
    apellido.setEnabled(flag);
    telefono.setEnabled(flag);
    seleccionar.setEnabled(flag);
    Deshacer.setEnabled(flag);
    Realizar.setEnabled(flag);
    
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        apellido = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        carnet = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        telefono = new javax.swing.JFormattedTextField();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        seleccionar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        fechaActual = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        Total = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        mensualidad = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        mora = new javax.swing.JLabel();
        jLabel = new javax.swing.JLabel();
        fechaPago = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Deshacer = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        Realizar = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        vista = new javax.swing.JButton();
        selectstudent = new javax.swing.JButton();
        cargar = new javax.swing.JButton();
        limpiarbt = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Pago de Mensualidad");

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(144, 132, 132), null));

        jPanel1.setBorder(null);

        jLabel3.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        jLabel3.setText("Nombre");

        nombre.setEditable(false);
        nombre.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        jLabel4.setText("Apellido");

        apellido.setEditable(false);
        apellido.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Datos del Estudiante");

        jLabel13.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        jLabel13.setText("N#Carnet");

        carnet.setEditable(false);
        carnet.setText("2015-00001");
        carnet.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        jLabel2.setText("Teléfono");

        telefono.setEditable(false);
        telefono.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel13)
                                        .addComponent(jLabel3))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(10, 10, 10)))
                                .addGap(31, 31, 31)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(carnet, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(apellido, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(nombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(34, 34, 34)
                                .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13)
                    .addComponent(carnet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(nombre))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        carnet.setFormatterFactory(ImagenFondo.getFormato("####-#####"));
        telefono.setFormatterFactory(ImagenFondo.getFormato("####-####"));

        jPanel4.setBorder(null);

        jTable1.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        jTable1.setModel(modelo);
        JTableHeader th = jTable1.getTableHeader();
        th.setFont(new java.awt.Font("Ubuntu", 0, 16));
        jScrollPane1.setViewportView(jTable1);

        seleccionar.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        seleccionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Añadir.png"))); // NOI18N
        seleccionar.setText("Seleccionar");
        seleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleccionarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(seleccionar, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(seleccionar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.setBorder(null);

        jLabel9.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Factura");

        jLabel21.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        jLabel21.setText("Monto Total");

        fechaActual.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        //Session session = NewHibernateUtil.sessionFactory.openSession();
        fechaActual.setText("");
        //session.createSQLQuery("select curdate()").uniqueResult().toString()
        //session.close();

        jLabel23.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        jLabel23.setText("Fecha");

        Total.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        Total.setText("0.00");

        jLabel26.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        jLabel26.setText("Detalle");

        jTable2.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        jTable2.setModel(detalle);
        JTableHeader th1 = jTable2.getTableHeader();
        th1.setFont(new java.awt.Font("Ubuntu", 0, 16));
        jScrollPane3.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21)
                            .addComponent(jLabel26))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(Total)
                                .addGap(0, 284, Short.MAX_VALUE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(102, 102, 102)
                                .addComponent(fechaActual))
                            .addComponent(jLabel23)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fechaActual)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(Total))
                .addGap(24, 24, 24))
        );

        jPanel2.setBorder(null);

        jLabel14.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        jLabel14.setText("Mensualidad: ");

        mensualidad.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        mensualidad.setText("0.00");

        jLabel20.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        jLabel20.setText("Interes");

        mora.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        mora.setText("0.00");

        jLabel.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        jLabel.setText("Fecha Pago");

        fechaPago.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Pago de Mensualidad");

        Deshacer.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        Deshacer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Deshacer.png"))); // NOI18N
        Deshacer.setText("Deshacer");
        Deshacer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeshacerActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        jLabel22.setText("Total");

        total.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        total.setText("0.00");

        Realizar.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        Realizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Pago.png"))); // NOI18N
        Realizar.setText("Realizar Pago");
        Realizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RealizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel22)
                                    .addComponent(jLabel))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(fechaPago, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(total, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(mora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(mensualidad, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(Realizar, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Deshacer, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fechaPago, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(mensualidad))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mora)
                    .addComponent(jLabel20))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(total, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Realizar)
                    .addComponent(Deshacer))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(144, 132, 132), null));

        vista.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        vista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Vista.png"))); // NOI18N
        vista.setText("Vista Previa");
        vista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vistaActionPerformed(evt);
            }
        });

        selectstudent.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        selectstudent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Nuevo.png"))); // NOI18N
        selectstudent.setText("Seleccionar Estudiante");
        selectstudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectstudentActionPerformed(evt);
            }
        });

        cargar.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        cargar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Factura.png"))); // NOI18N
        cargar.setText("Cargar Factura");
        cargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargarActionPerformed(evt);
            }
        });

        limpiarbt.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        limpiarbt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Papelera.png"))); // NOI18N
        limpiarbt.setText("Limpiar");
        limpiarbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarbtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(selectstudent)
                .addGap(27, 27, 27)
                .addComponent(cargar, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(vista, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(limpiarbt, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cargar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(selectstudent, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(vista, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(limpiarbt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void selectstudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectstudentActionPerformed
       BuscarEstudiante.mensualidad = this;
       BuscarEstudiante buscar = new BuscarEstudiante();
       buscar.setVisible(true);
       
       this.setVisible(false);
       
    }//GEN-LAST:event_selectstudentActionPerformed

    private void DeshacerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeshacerActionPerformed
      
//        boolean value = false;
//        
//        
//        if(n==0){
//        
//            if(deshacer == true){
//            
//                fechaPago.setText("");
//                mensualidad.setText("0.00");
//                mora.setText("0.00");
//                total.setText("0.00");
//                deshacer = false;
//                
//                
//            }else{
//            JOptionPane.showMessageDialog(this, "No hay cambio que deshacer");
//            }
//        
//        }else if(n == 1){
//        
//            selectrow = fila1;
//            fila1=-1;
//            value = true;
//            
//        }else if(n == 2){
//        
//            selectrow = fila2;
//            fila2 = -1;
//            value = true;
//            
//        }else if(n == 3){
//            
//            selectrow = fila3;
//            fila3 = -1;
//            value = true;
//            
//        }else if(n == 4){
//        
//            selectrow = fila4;
//            fila4 = -1;
//            n = 4;
//            value = true;
//            
//        }
//        
//       if(value==true){
//        
//        int filadelete =detalle.getRowCount()-1;
//        double tot = Double.parseDouble(Total.getText())-Double.parseDouble(detalle.getValueAt(filadelete, 2).toString());
//        detalle.removeRow(filadelete);
//        Total.setText(String.valueOf(tot));
//        jTable1.setValueAt("Sin Pagar", selectrow, 1);
//        mensualidads.get(selectrow).setEstado(false);
//        n--;
//       
//       }
        
    }//GEN-LAST:event_DeshacerActionPerformed

    private void seleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seleccionarActionPerformed

        
//       selectrow = jTable1.getSelectedRow();
//        
//        if(selectrow>-1){
//        
//        Mensualidad m = mensualidads.get(selectrow);
//        if(jTable1.getValueAt(selectrow, 1).toString().equals("Pagado")){
//        
//            JOptionPane.showMessageDialog(this,"Mes Pagado, no se puede modificar");
//        
//        }else{
//            deshacer = true;
//            if(fila1 == -1){
//       
//           fila1 = selectrow;
//       
//       }else if(fila2 == -1){
//       
//           fila2 = selectrow;
//    
//       }else if(fila3  == -1){
//       
//           fila3 = selectrow;
//           
//       }else if(fila4 == -1){
//       
//           fila4 = selectrow;
//       
//       }else{
//           
//           fila1 = fila2;
//           fila2 = fila3;
//           fila3 = fila4;
//           fila4 = selectrow;
//           n=4;
//       
//       }
//            
//            Session session = NewHibernateUtil.sessionFactory.openSession();
//            Criteria criteria = session.createCriteria(MontoMensualidad.class);
//            criteria.addOrder(Order.desc("idMontoMensualidad"));
//           
//            fechaPago.setText(m.getFecha().toString());
//            MontoMensualidad monto = (MontoMensualidad)criteria.uniqueResult();
//            
//            mensualidad.setText(monto.getMonto().toString());
//            SQLQuery query = session.createSQLQuery(String.format("select datediff(:fechaActual,:fechaPago)"));
//            query.setParameter("fechaActual", fechaActual.getText());
//            query.setParameter("fechaPago", fechaPago.getText());
//            
//            int dias = Integer.parseInt(query.uniqueResult().toString());
//            double interes = 0;
//            if(dias>0){
//            
//            interes = (dias*monto.getInteres()*monto.getMonto())/3000;
//            mora.setText(String.valueOf(interes));
//            
//            }
//            total.setText(String.valueOf(interes+monto.getMonto()));
//            
//            
//        }
//         
//       
//        
//        }
        
        
    }//GEN-LAST:event_seleccionarActionPerformed

    private void RealizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RealizarActionPerformed
//        
//        if(!fechaPago.getText().trim().equals("")){
//       detalle = (DefaultTableModel)jTable2.getModel();
//       detalle.addRow(new Object[]{mensualidad.getText(),mora.getText(),total.getText()});
//       fechaPago.setText("");
//       
//       double tot = Double.parseDouble(Total.getText())+Double.parseDouble(total.getText());
//       
//       Total.setText(String.valueOf(tot));
//       mensualidad.setText("0.00");
//       mora.setText("0.00");
//       total.setText("0.00");
//       
//       jTable1.setValueAt("Pagado", selectrow, 1);
//       mensualidads.get(selectrow).setEstado(true);
//       
//        n++;
//        cargar.setEnabled(true);
//        
//       }else{
//        
//       JOptionPane.showMessageDialog(this, "No se ha seleccionado un mes a pagar");
//       if(n==1){fila1 =-1;}else
//       if(n==2){fila2 =-1;}else
//       if(n==3){fila3 =-1;}else
//       if(n==4){fila4 =-1;}
//       }
//        
       
    }//GEN-LAST:event_RealizarActionPerformed

    private void cargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargarActionPerformed
//       
//       int id=DaoImpl.Usuario("Cajero", "Ca");
//       
//        if(id!=0){
//            
//        FacturaMensualidad fm = new FacturaMensualidad();
//        Cajero c = new Cajero();
//        c.setIdCajero(id);
//        fm.setCajero(c);
//        fm.setDetalle("");
//        Calendar calendario = GregorianCalendar.getInstance();
//        Date fecha = calendario.getTime();
//        
//        fm.setFecha(fecha);
//        
//         DaoImpl.GuardarFactura(fm);
//         DaoImpl.UpdateMensualidad(mensualidads);
//         DaoImpl.SavePagoMensualidad(mensualidads, fm);
//         
//        
//        
//        vista.setEnabled(true);
//         
//        }else{
//        
//            JOptionPane.showMessageDialog(this, "Usted no tiene permiso de gestionar pago de mensualidad");
//        
//        }
//        
//        
//       
        
        
    }//GEN-LAST:event_cargarActionPerformed

    private void limpiarbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarbtActionPerformed

    Limpiar();
    
    }//GEN-LAST:event_limpiarbtActionPerformed

    private void vistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vistaActionPerformed
       
//        int estudiante = DaoImpl.idEstudiante(carnet.getText());
//        int ifm = DaoImpl.idFacturaMensualidad(estudiante);
//        
//         InputStream ruta = getClass().getResourceAsStream("FacturaPagoMensualidad.jrxml");
//        
//        Map<String,Object> parametros = new HashMap<String,Object>();
//        
//        parametros.put("ifm", ifm);
//        
//       
//        try {
//            JasperDesign jd = JRXmlLoader.load(ruta);
//            JasperReport reporte = JasperCompileManager.compileReport(jd);
//            JasperPrint informe = JasperFillManager.fillReport(reporte,parametros,NewHibernateUtil.conn);
//            JasperViewer ventanaVisor = new JasperViewer(informe, false);
//            ventanaVisor.setTitle("Factura Estudiante");
//            ventanaVisor.setVisible(true);
//            
//        } catch (JRException ex) {
//            Logger.getLogger(Mensualidades.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }//GEN-LAST:event_vistaActionPerformed

    public void Limpiar(){
        
    fechaPago.setText("");
    mensualidad.setText("0.00");
    mora.setText("0.00");
    total.setText("0.00");           
    carnet.setText("");
    nombre.setText("");
    apellido.setText("");
    telefono.setText("");
    modelo= new DefaultTableModel();
    modelo.addColumn("Mensualidad");
    modelo.addColumn("Estado");
    detalle = new DefaultTableModel();
    detalle.addColumn("Monto");
    detalle.addColumn("Interes");
    detalle.addColumn("Total");
    jTable1.setModel(modelo);
    jTable2.setModel(detalle);
    Bloquear(false);
    
    }
    public String IsEstado(boolean value){
    
    if(value){
    
        return "Pagado";
    }else{
    
    return "Sin Pagar";
    }
        
    }
    public String getMonth(Date date){
   
    SimpleDateFormat formateador = new SimpleDateFormat("MMMMM");
    return formateador.format(date);
    
    }
//     public void UpdateTable(){
//    
//    modelo= new DefaultTableModel();
//    modelo.addColumn("Mensualidad");
//    modelo.addColumn("Estado");
//  
//    
//     for(int i=0;i<mensualidads.size();i++){
//            
//     Mensualidad t = mensualidads.get(i);
//     modelo.addRow(new Object[]{getMonth(t.getFecha()),IsEstado(t.getEstado())});
//          
//     }
//    
//     jTable1.setModel(modelo);
//     
//     detalle = new DefaultTableModel();
//     detalle.addColumn("Monto");
//     detalle.addColumn("Interes");
//     detalle.addColumn("Total");
//     jTable2.setModel(detalle);
//     
//
//    }
    
//    public void setEstudiante(Estudiante e){
//    
//        carnet.setText(e.getNumeroCarnet());
//        nombre.setText(e.getNombre());
//        apellido.setText(e.getApellido());
//        telefono.setText(e.getTelefono());
//        UpdateTable();
//        Bloquear(true);
//        
//        
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Deshacer;
    private javax.swing.JButton Realizar;
    private javax.swing.JLabel Total;
    private javax.swing.JTextField apellido;
    private javax.swing.JButton cargar;
    private javax.swing.JFormattedTextField carnet;
    private javax.swing.JLabel fechaActual;
    private javax.swing.JLabel fechaPago;
    private javax.swing.JLabel jLabel;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JButton limpiarbt;
    private javax.swing.JLabel mensualidad;
    private javax.swing.JLabel mora;
    private javax.swing.JTextField nombre;
    private javax.swing.JButton seleccionar;
    private javax.swing.JButton selectstudent;
    private javax.swing.JFormattedTextField telefono;
    private javax.swing.JLabel total;
    private javax.swing.JButton vista;
    // End of variables declaration//GEN-END:variables
}
