package InternalFrame.Estudiante;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import Metodos.Dao;
import Clases.Estudiante;
import Metodos.ImagenFondo;
import Clases.Tutor;
import InternalFrame.Trabajador.Camara;
import Metodos.Resize;
import Metodos.Validar;
import Principal.VentanaPrincipal;
import java.awt.Dimension;
import java.awt.FileDialog;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.beans.PropertyVetoException;
import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author rommel
 */
public class NuevoEstudiante extends javax.swing.JInternalFrame {

   
    
    List<Tutor> tutores = new ArrayList<>();
    int val = -1;
    boolean vflag = false;
    public Estudiante student = null;
    String [] años,dias;
    
    public JDesktopPane desktop;
    DefaultTableModel modelo;
    DefaultComboBoxModel modeloCb;
    Image image = null;
   
    public NuevoEstudiante() {
        ComboBoxDate();
        
        initComponents();

//        TomarFoto();
        
        TablaTitulo();
        Closed(false);
        Dia();
        this.setFrameIcon(new ImageIcon(ImagenFondo.Icono));
       
    }
    
    public final void ComboBoxDate(){
    
        int year = Dao.Year();
        
        años = new String[20];
        
        for(int i=year-25;i<year-5;i++){
        
            años[i-year+25] = String.valueOf(i);
        
        }
        
        
    }

    public  final void Dia(){
        
        int day = Dao.Dia(Integer.parseInt(año.getSelectedItem().toString()), mes.getSelectedIndex()+1);
        
        dias = new String[day];
        
        for(int i=1;i<=day;i++){
        
            dias[i-1] = String.valueOf(i);
        
        }
        modeloCb = new DefaultComboBoxModel(dias);
        dia.setModel(modeloCb);
    }
    
    public final DefaultTableModel TablaTitulo(){
    
        
        modelo = new DefaultTableModel();
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Parentesco");
        modelo.addColumn("Teléfono");
        jTable1.setModel(modelo);
        
       return modelo;
    
    }
    
    public void setDate(Date fecha){
    
        StringTokenizer st = new StringTokenizer(fecha.toString(),"-");
        
        año.setSelectedItem(st.nextToken());
        mes.setSelectedIndex(Integer.parseInt(st.nextToken())-1);
        dia.setSelectedItem(st.nextToken());
    }
    
    public Date getDate(){
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date fecha = null;
        
        try {
            fecha = sdf.parse(año.getSelectedItem().toString()+"-"+
                    mes.getSelectedItem().toString()+"-"+dia.getSelectedItem().toString());
        } catch (ParseException ex) {
            Logger.getLogger(NuevoEstudiante.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return fecha;
    }
    public void BuscarEstudiante(){
    
    Closed(true);
    carnet.setText(student.getNumeroCarnet());
    nombre.setText(student.getNombre());
    apellido.setText(student.getApellido());
    telefono.setText(student.getTelefono());
    direccion.setText(student.getDireccion());
    genero.setSelectedItem((Object)student.getGenero());
    sangre.setSelectedIndex(student.getTipoSangre());
    lugar.setSelectedItem((Object)student.getLugarDeNacimiento());
    setDate(student.getFechaNacimiento());
    
    tutores = new ArrayList<>();
    tutores.addAll(student.getTutors());
    
    TablaTitulo();

    
    for(Tutor tutor: tutores){
    
        
        modelo.addRow(new Object[]{tutor.getNombre(),tutor.getApellido(),tutor.getParentesco(),tutor.getTelefono()});
    
    }
       
    jTable1.setModel(modelo);
    if(tutores.size()>0){
    
       editar.setEnabled(true);
       
    }

    }
    
    public void MetodoTutor(Tutor t){
    
    
        
        if(val == -1) {
            
            tutores.add(t);
            modelo.addRow(new Object[]{t.getNombre(),t.getApellido(),
            t.getParentesco(),t.getTelefono()});
            int interval = jTable1.getRowCount()-1;
            jTable1.getSelectionModel().setSelectionInterval(interval, interval);
            
        } else {
           
            tutores.set(val, t);
            jTable1.setValueAt(t.getNombre(),val,0);
            jTable1.setValueAt(t.getApellido(),val,1);
            jTable1.setValueAt(t.getParentesco(),val,2);
            jTable1.setValueAt(t.getTelefono(),val,3);
            jTable1.getSelectionModel().setSelectionInterval(val, val);
            val = -1;
        }

        editar.setEnabled(true);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        buscarbt = new javax.swing.JButton();
        nuevobt = new javax.swing.JButton();
        guardarbt = new javax.swing.JButton();
        limpiarbt = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        carnet = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        apellido = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        telefono = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        direccion = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        genero = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        sangre = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        editar = new javax.swing.JButton();
        añadir = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        lugar = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        año = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        mes = new javax.swing.JComboBox();
        jLabel14 = new javax.swing.JLabel();
        dia = new javax.swing.JComboBox();
        jPanel4 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        caja = new javax.swing.JPanel();
        foto = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Nuevo Estudiante");

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        buscarbt.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        buscarbt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Buscar.png"))); // NOI18N
        buscarbt.setText("Buscar");
        buscarbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarbtActionPerformed(evt);
            }
        });

        nuevobt.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        nuevobt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Nuevo.png"))); // NOI18N
        nuevobt.setText("Nuevo");
        nuevobt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevobtActionPerformed(evt);
            }
        });

        guardarbt.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        guardarbt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Save.png"))); // NOI18N
        guardarbt.setText("Guardar");
        guardarbt.setEnabled(false);
        guardarbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarbtActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(guardarbt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                    .addComponent(limpiarbt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buscarbt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nuevobt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(nuevobt)
                .addGap(18, 18, 18)
                .addComponent(guardarbt)
                .addGap(18, 18, 18)
                .addComponent(limpiarbt)
                .addGap(18, 18, 18)
                .addComponent(buscarbt)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Datos del Estudiante");

        jLabel13.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        jLabel13.setText("N#Carnet");

        carnet.setEditable(false);
        carnet.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        jLabel3.setText("Nombre");

        nombre.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        jLabel4.setText("Apellido");

        apellido.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        apellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellidoActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        jLabel5.setText("Nacimiento");

        jLabel2.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        jLabel2.setText("Teléfono");

        telefono.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        jLabel6.setText("Dirección");

        direccion.setColumns(20);
        direccion.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        direccion.setLineWrap(true);
        direccion.setRows(5);
        jScrollPane1.setViewportView(direccion);

        jLabel8.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        jLabel8.setText("Género");

        genero.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar Opcion", "Masculino", "Femenino" }));

        jLabel9.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        jLabel9.setText("Tipo Sangre");

        sangre.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar Opcion", "A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-" }));

        jScrollPane2.setViewportView(jTable1);

        jLabel10.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        jLabel10.setText("Tutores(Padres de familia)");
        jLabel10.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Editar.png"))); // NOI18N
        editar.setText("Editar");
        editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarActionPerformed(evt);
            }
        });

        añadir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Añadir.png"))); // NOI18N
        añadir.setText("Añadir");
        añadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añadirActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        jLabel11.setText("Lugar");

        lugar.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar Opcion", "Atlantico Norte (RAAN)", "Atlantico Sur (RAAS)", "Boaco", "Carazo", "Chinandega", "Chontales", "Esteli", "Granada", "Jinotega", "Leon", "Madriz", "Managua", "Masaya", "Matagalpa", "Nueva Segovia", "Rio San Juan", "Rivas" }));

        jLabel1.setText("Año");

        año.setModel(new javax.swing.DefaultComboBoxModel(años));
        año.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añoActionPerformed(evt);
            }
        });

        jLabel12.setText("Mes");

        mes.setModel(new javax.swing.DefaultComboBoxModel(new String []{"Ene","Feb","Mar","Abr","May","Jun",
            "Jul","Ago","Sep","Oct","Nov","Dic"}));
mes.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        mesActionPerformed(evt);
    }
    });

    jLabel14.setText("Dia");

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 849, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel5)
                                .addComponent(jLabel3)
                                .addComponent(jLabel13)
                                .addComponent(jLabel4))
                            .addGap(34, 34, 34)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(carnet, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(año, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel12)
                                    .addGap(8, 8, 8)
                                    .addComponent(mes, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel14)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(dia, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(añadir)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(editar)))
                    .addGap(43, 43, 43)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel9)
                                .addComponent(jLabel11))
                            .addGap(42, 42, 42)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lugar, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(sangre, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8)
                                .addComponent(jLabel6))
                            .addGap(61, 61, 61)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(genero, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addComponent(jLabel10)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 927, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(31, 31, 31)
            .addComponent(jLabel7)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(carnet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13)
                        .addComponent(jLabel6))
                    .addGap(22, 22, 22)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3))
                    .addGap(15, 15, 15)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(genero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(año, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(mes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14)
                            .addComponent(dia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel2)
                .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel9)
                .addComponent(sangre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel10)
                .addComponent(jLabel11)
                .addComponent(lugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(añadir)
                .addComponent(editar))
            .addGap(24, 24, 24)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    //carnet.setFormatterFactory(ImagenFondo.getFormato("##-#####"));
    telefono.setFormatterFactory(ImagenFondo.getFormato("####-####"));

    jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

    jLabel16.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
    jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel16.setText("Imagen para Carnet");

    caja.setBorder(javax.swing.BorderFactory.createEtchedBorder());

    javax.swing.GroupLayout cajaLayout = new javax.swing.GroupLayout(caja);
    caja.setLayout(cajaLayout);
    cajaLayout.setHorizontalGroup(
        cajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(foto, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
    );
    cajaLayout.setVerticalGroup(
        cajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(foto, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
    );

    jButton2.setText("Tomar foto");
    jButton2.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton2ActionPerformed(evt);
        }
    });

    jButton1.setText("Buscar en Pc");
    jButton1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton1ActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
    jPanel4.setLayout(jPanel4Layout);
    jPanel4Layout.setHorizontalGroup(
        jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jButton2)
                .addComponent(jLabel16)
                .addComponent(caja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap())
        .addGroup(jPanel4Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jButton1)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    jPanel4Layout.setVerticalGroup(
        jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel4Layout.createSequentialGroup()
            .addGap(32, 32, 32)
            .addComponent(jLabel16)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(caja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jButton2)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jButton1)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap())
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addContainerGap(15, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGap(5, 5, 5))
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscarbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarbtActionPerformed

        try {
            BuscarEstudiante buscar = new BuscarEstudiante();
            buscar.setVisible(true);
            desktop.add(buscar);
            buscar.setSelected(true);
            buscar.nuevo = this;
            this.setVisible(false);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(NuevoEstudiante.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_buscarbtActionPerformed

    private void nuevobtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevobtActionPerformed

       carnet.setText(Dao.GetCarnet());
       vflag = false;
       Closed(true);
        
        
        
    }//GEN-LAST:event_nuevobtActionPerformed
 
    public final void Closed(boolean flag){
    
        nuevobt.setEnabled(!flag);
        guardarbt.setEnabled(flag);
        carnet.setEnabled(flag);
        nombre.setEnabled(flag);
        apellido.setEnabled(flag);
        direccion.setEnabled(flag);
        telefono.setEnabled(flag);
        año.setEnabled(flag);
        mes.setEnabled(flag);
        dia.setEnabled(flag);
        sangre.setEnabled(flag);
        genero.setEnabled(flag);
        añadir.setEnabled(flag);
        lugar.setEnabled(flag);
        editar.setEnabled(flag);
        
    }
    
    private void guardarbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarbtActionPerformed

        Estudiante estudiante = new Estudiante();
         if(student==null){
           
               student = new Estudiante();
               student.setIdEstudiante(Dao.idEstudiante(estudiante.getNumeroCarnet()));
               
           
           }
         
        estudiante.setIdEstudiante(student.getIdEstudiante());
        estudiante.setNumeroCarnet(carnet.getText());
        estudiante.setNombre(nombre.getText().trim());
        estudiante.setApellido(apellido.getText().trim());
        estudiante.setTelefono(telefono.getText());
        estudiante.setDireccion(direccion.getText().trim());
        estudiante.setTipoSangre(sangre.getSelectedIndex());
        estudiante.setGenero(genero.getSelectedItem().toString());
        estudiante.setFechaNacimiento(getDate());
        estudiante.setLugarDeNacimiento(lugar.getSelectedItem().toString());
        estudiante.setTipo(vflag);
        
        Validar validar = new Validar();
        
        
       if(Vacio() && validar.ValidarLetras(estudiante.getNombre(), "Nombre") 
               && validar.ValidarLetras(estudiante.getApellido(), "Apellido")){
       
           estudiante.setNombre(validar.ArreglarCadenas(estudiante.getNombre()));
           estudiante.setApellido(validar.ArreglarCadenas(estudiante.getApellido()));
           
           Dao.SaveOrUpdateEstudiante(estudiante);
           
           
           
           for (Tutor tutore : tutores) {
               
               tutore.setEstudiante(student);
               
           }
           
       Dao.SaveOrUpdateTutor(tutores);
       
       }
   
     student = null;   
    }//GEN-LAST:event_guardarbtActionPerformed

    public boolean Vacio(){
    
        if(nombre.getText().trim().equals("") || apellido.getText().trim().equals("") ||
                direccion.getText().trim().equals("") || telefono.getText().trim().equals("-")){
            JOptionPane.showMessageDialog(null, "Puede que existe un campo vacio", 
                    "Error de rellenar campo", JOptionPane.ERROR_MESSAGE);
            return false;
        }else if(genero.getSelectedIndex()==0 || sangre.getSelectedIndex()==0 || lugar.getSelectedIndex()==0){
        
            JOptionPane.showMessageDialog(null, "Puede que no haya selecciona nada en Tipo de sangre o Genero", 
                    "Error de selección", JOptionPane.ERROR_MESSAGE);
            return false;
        
        }else{
            
        return true;
        
        }

    }
    private void limpiarbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarbtActionPerformed

        
        carnet.setText("");
        nombre.setText("");
        apellido.setText("");
        direccion.setText("");
        telefono.setText("");
        
       
        sangre.setSelectedIndex(0);
        genero.setSelectedIndex(0);
        añadir.setEnabled(false);
        
        lugar.setSelectedIndex(0);
        nuevobt.setEnabled(true);
        guardarbt.setEnabled(false);
        año.setSelectedIndex(0);
        mes.setSelectedIndex(0);
        Dia();
        Closed(false);
        TablaTitulo();
        
    }//GEN-LAST:event_limpiarbtActionPerformed

    private void apellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellidoActionPerformed
       
    }//GEN-LAST:event_apellidoActionPerformed

    private void añadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añadirActionPerformed
       
        try {
            NuevoTutor nuevo = new NuevoTutor();
            nuevo.setVisible(true);
            desktop.add(nuevo);
            nuevo.setSelected(true);
            nuevo.nuevo = this;
            this.setVisible(false);
            
        } catch (PropertyVetoException ex) {
            Logger.getLogger(NuevoEstudiante.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_añadirActionPerformed

    private void editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarActionPerformed
      
          try {
            NuevoTutor nuevo = new NuevoTutor();
            nuevo.setVisible(true);
            desktop.add(nuevo);
            nuevo.setSelected(true);
            nuevo.nuevo = this;
            this.val = jTable1.getSelectedRow();
            nuevo.EditarTutor();
            this.setVisible(false);
            
        } catch (PropertyVetoException ex) {
            Logger.getLogger(NuevoEstudiante.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_editarActionPerformed

    private void mesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mesActionPerformed
        
        int month = mes.getSelectedIndex();
        
        int day = dia.getSelectedIndex();
        
        Dia();
        
        if(day < dia.getItemCount()){
            
            dia.setSelectedIndex(day);
        
        }
        
    }//GEN-LAST:event_mesActionPerformed

    private void añoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añoActionPerformed
        int anio = Integer.parseInt(año.getSelectedItem().toString());
        int day = dia.getSelectedIndex()+1;
        boolean estado = false;
        
        if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0)))
           estado = true;
        
        if((mes.getSelectedIndex()+1) == 2){
        
            int tam = dia.getItemCount();
            
            if((estado && tam != 29) || (!estado && day != 29)){
            
                    Dia();
                    dia.setSelectedIndex(day-1);
                
                
            
            }else if(day > 28){
               
                   Dia();
            }
        
        }
    }//GEN-LAST:event_añoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        try {
            Dimension tamaño = desktop.size();
            Dimension frame = VentanaPrincipal.f.getSize();
            Camara camara = new Camara();
//            camara.setLocation((tamaño.width-frame.width)/2, (tamaño.height-frame.height)/2);
            camara.setVisible(true);
            desktop.add(camara);
            this.setVisible(false);
            camara.nuevoEstudiante = this;
            camara.setSelected(true);
            
            
        } catch (PropertyVetoException ex) {
            Logger.getLogger(NuevoEstudiante.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        FileDialog dialog;
        dialog = new FileDialog(VentanaPrincipal.f, "Abrir", FileDialog.LOAD);

        dialog.setFilenameFilter((File dir, String name1) -> name1.endsWith(".png") ||
            name1.endsWith(".jpg") || name1.endsWith(".bmp") || name1.endsWith(".jpeg") ||
            name1.endsWith(".ico"));

        dialog.setVisible(true);

        if(dialog.getDirectory()!=null || dialog.getFile()!=null){

            try {
                String name = dialog.getDirectory()+dialog.getFile();
                BufferedImage bufferedImage = ImageIO.read(new File(name));
                
                foto.setIcon(Resize.Redimencionar(bufferedImage));
                
                

                //                jPan.setIcon(new ImageIcon(bufim));
            } catch (Exception ex) {
                Logger.getLogger(NuevoEstudiante.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

//    public final void TomarFoto(){
//    
//        
//        
//     
//        JPanel camara = new JPanel();
//        camara.setBounds(1, 1 ,160, 160);
//        
//        Webcam webcam = Webcam.getDefault();
//        Dimension size = new Dimension(160, 160);
//        webcam.setCustomViewSizes(new Dimension[]{size});
//        webcam.setViewSize(size);
//        
//        
//        webcamPanel = new WebcamPanel(webcam, size, false);
//        webcamPanel.setFillArea(true);
//        
//        
//        camara.add(webcamPanel);
//        caja.add(camara);
////        webcamPanel.setVisible(false);
//    
//    }
    
//    WebcamPanel webcamPanel;
   

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellido;
    private javax.swing.JButton añadir;
    private javax.swing.JComboBox año;
    private javax.swing.JButton buscarbt;
    private javax.swing.JPanel caja;
    private javax.swing.JFormattedTextField carnet;
    private javax.swing.JComboBox dia;
    private javax.swing.JTextArea direccion;
    private javax.swing.JButton editar;
    public javax.swing.JLabel foto;
    private javax.swing.JComboBox genero;
    private javax.swing.JButton guardarbt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton limpiarbt;
    private javax.swing.JComboBox lugar;
    private javax.swing.JComboBox mes;
    private javax.swing.JTextField nombre;
    private javax.swing.JButton nuevobt;
    private javax.swing.JComboBox sangre;
    private javax.swing.JFormattedTextField telefono;
    // End of variables declaration//GEN-END:variables
}
