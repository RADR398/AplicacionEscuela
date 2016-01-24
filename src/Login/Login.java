package Login;

import Metodos.JPanelConFondo;
import Metodos.ImagenFondo;
import Metodos.NewHibernateUtil;
import Principal.VentanaPrincipal;
import com.nilo.plaf.nimrod.NimRODLookAndFeel;
import com.nilo.plaf.nimrod.NimRODTheme;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.io.File;
import java.security.Principal;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.WindowConstants;

public class Login extends javax.swing.JFrame {

    int values = 0;
    
    public Login() {
        initComponents();
            
        ImagenFondo fondo = new ImagenFondo();
        this.setIconImage(ImagenFondo.Icono);
        ((JPanelConFondo) panelFondo).setImagen();
        this.setLocationRelativeTo(null);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        login = new JPanelConFondo();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        txContraseña = new javax.swing.JPasswordField();
        txUsuario = new javax.swing.JFormattedTextField(ImagenFondo.getFormato("U?-U???????????????????"));
        panelFondo = new JPanelConFondo();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login de Usuario");
        setUndecorated(true);
        setResizable(false);

        login.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(254, 254, 254)));
        login.setOpaque(false);

        jLabel1.setForeground(new java.awt.Color(254, 254, 254));
        jLabel1.setText("Usuario");

        jLabel2.setForeground(new java.awt.Color(254, 254, 254));
        jLabel2.setText("Contraseña");

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        txContraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txContraseñaKeyReleased(evt);
            }
        });

        txUsuario.setFocusLostBehavior(JFormattedTextField.PERSIST);

        javax.swing.GroupLayout loginLayout = new javax.swing.GroupLayout(login);
        login.setLayout(loginLayout);
        loginLayout.setHorizontalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(txContraseña)
                    .addGroup(loginLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txUsuario))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        loginLayout.setVerticalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar)
                    .addComponent(btnCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelFondo.setBorder(null);
        panelFondo.setOpaque(false);

        javax.swing.GroupLayout panelFondoLayout = new javax.swing.GroupLayout(panelFondo);
        panelFondo.setLayout(panelFondoLayout);
        panelFondoLayout.setHorizontalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelFondoLayout.setVerticalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 296, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        
        NewHibernateUtil nhu = new NewHibernateUtil();
        
        if(nhu.getSessionFactory(txUsuario.getText().trim(), txContraseña.getText())){
            
            VentanaPrincipal vp = new VentanaPrincipal();
            vp.setVisible(true);
            this.dispose();
            
        
        }else if(values==2){
            
            JOptionPane.showMessageDialog(this, "Lo sentimos el programa se cerrara", "Demasiados errores "
                    + "de contraseña", JOptionPane.ERROR_MESSAGE);
        
            System.exit(0);
        }else{
            
            JOptionPane.showMessageDialog(this, "Puede que existe un error en el usuario o contraseña "
                    + "por favor vuelva a introducir los datos", "Error de acceso", JOptionPane.ERROR_MESSAGE);
            values++;
        }
     
        
        
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        int message = JOptionPane.showConfirmDialog(null, "Esta seguro que desea salir de sesión","Salir sesión",
              JOptionPane.YES_NO_OPTION);
    
    if(message != JOptionPane.YES_OPTION){
    
        this.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
    
    }else{
    
        System.exit(0);
    }
    
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txContraseñaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txContraseñaKeyReleased
       
        if(evt.getKeyChar()==KeyEvent.VK_ENTER){
            
            btnAceptarActionPerformed(new ActionEvent(login, WIDTH, null));
        
        }
    }//GEN-LAST:event_txContraseñaKeyReleased

    public static void getLookAndFeet(){
        System.out.println(new File("").getAbsolutePath());
        NimRODTheme tema = new NimRODTheme(new File("").getAbsolutePath()+"/src/Configuracion/LoginTheme.theme");
        
        NimRODLookAndFeel lookandfeel = new NimRODLookAndFeel();
        NimRODLookAndFeel.setCurrentTheme(tema);
        try {
            UIManager.setLookAndFeel(lookandfeel);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    
    }
    
    public static void main(String args[]) {
       
        getLookAndFeet();
//        try {
//            UIManager.setLookAndFeel(new NimbusLookAndFeel());
//        } catch (UnsupportedLookAndFeelException ex) {
//            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
//        }
        java.awt.EventQueue.invokeLater(() -> {
            Login jf = new Login();
            jf.setLocationRelativeTo(null);
            jf.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel login;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JPasswordField txContraseña;
    private javax.swing.JFormattedTextField txUsuario;
    // End of variables declaration//GEN-END:variables
}
