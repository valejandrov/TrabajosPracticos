
package trabajo;

import javax.swing.JOptionPane;



public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
        initComponents();
        jTabbedPane1.setVisible(false);
        btn_aceptar.setVisible(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cbox_producto = new javax.swing.JComboBox<>();
        lbl_producto = new javax.swing.JLabel();
        btn_ingresar = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        panelTelevisor = new javax.swing.JPanel();
        lbltv_marca = new javax.swing.JLabel();
        lbltv_modelo = new javax.swing.JLabel();
        lbltv_pugadas = new javax.swing.JLabel();
        lbltv_smarTv = new javax.swing.JLabel();
        lbltv_empresaCable = new javax.swing.JLabel();
        lbltv_valor = new javax.swing.JLabel();
        txttv_marca = new javax.swing.JTextField();
        txttv_modelo = new javax.swing.JTextField();
        txttv_pulgadas = new javax.swing.JTextField();
        txttv_empresaCable = new javax.swing.JTextField();
        cboxtv_smarTv = new javax.swing.JComboBox<>();
        txttv_valor = new javax.swing.JTextField();
        panelCamara = new javax.swing.JPanel();
        lblcam_codigo = new javax.swing.JLabel();
        lblcam_modelo = new javax.swing.JLabel();
        lblcam_giro = new javax.swing.JLabel();
        lblcam_megaPixels = new javax.swing.JLabel();
        lblcam_alcanceWifi = new javax.swing.JLabel();
        lblcam_valor = new javax.swing.JLabel();
        txtcam_codigo = new javax.swing.JTextField();
        txtcam_modelo = new javax.swing.JTextField();
        txtcam_giro = new javax.swing.JTextField();
        txtcam_megaPixeles = new javax.swing.JTextField();
        txtcam_alcanceWifi = new javax.swing.JTextField();
        txtcam_valor = new javax.swing.JTextField();
        btn_aceptar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        cbox_producto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Televisor", "Cámara IP" }));

        lbl_producto.setText("Producto a comprar:");

        btn_ingresar.setText("Ingresar");
        btn_ingresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_ingresarMouseClicked(evt);
            }
        });

        jTabbedPane1.setEnabled(false);

        panelTelevisor.setEnabled(false);

        lbltv_marca.setText("Marca:");

        lbltv_modelo.setText("Modelo:");

        lbltv_pugadas.setText("Pulgadas:");

        lbltv_smarTv.setText("SmarTV:");

        lbltv_empresaCable.setText("Empresa Cable:");

        lbltv_valor.setText("Valor(usd):");

        txttv_marca.setColumns(12);

        txttv_modelo.setColumns(12);

        txttv_pulgadas.setColumns(12);

        txttv_empresaCable.setColumns(12);

        cboxtv_smarTv.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NO", "SI" }));

        txttv_valor.setColumns(12);

        javax.swing.GroupLayout panelTelevisorLayout = new javax.swing.GroupLayout(panelTelevisor);
        panelTelevisor.setLayout(panelTelevisorLayout);
        panelTelevisorLayout.setHorizontalGroup(
            panelTelevisorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTelevisorLayout.createSequentialGroup()
                .addGroup(panelTelevisorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelTelevisorLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(panelTelevisorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbltv_smarTv)
                            .addComponent(lbltv_pugadas)
                            .addComponent(lbltv_modelo)
                            .addComponent(lbltv_marca)))
                    .addGroup(panelTelevisorLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbltv_empresaCable))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTelevisorLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbltv_valor)))
                .addGap(56, 56, 56)
                .addGroup(panelTelevisorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txttv_marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txttv_modelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txttv_pulgadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txttv_empresaCable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboxtv_smarTv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txttv_valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(188, Short.MAX_VALUE))
        );
        panelTelevisorLayout.setVerticalGroup(
            panelTelevisorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTelevisorLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(panelTelevisorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelTelevisorLayout.createSequentialGroup()
                        .addGroup(panelTelevisorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbltv_marca)
                            .addComponent(txttv_marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelTelevisorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbltv_modelo)
                            .addComponent(txttv_modelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelTelevisorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txttv_pulgadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbltv_pugadas))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelTelevisorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cboxtv_smarTv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbltv_smarTv))
                        .addGap(18, 18, 18)
                        .addComponent(lbltv_empresaCable)
                        .addGap(7, 7, 7))
                    .addComponent(txttv_empresaCable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelTelevisorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbltv_valor)
                    .addComponent(txttv_valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Televisor", panelTelevisor);

        panelCamara.setPreferredSize(new java.awt.Dimension(514, 260));

        lblcam_codigo.setText("Código:");

        lblcam_modelo.setText("Modelo:");

        lblcam_giro.setText("Giro:");

        lblcam_megaPixels.setText("Megapixels:");

        lblcam_alcanceWifi.setText("Alcance Wifi [m]:");

        lblcam_valor.setText("Valor(usd):");

        txtcam_codigo.setColumns(12);

        txtcam_modelo.setColumns(12);

        txtcam_giro.setColumns(12);

        txtcam_megaPixeles.setColumns(12);

        txtcam_alcanceWifi.setColumns(12);

        txtcam_valor.setColumns(12);

        javax.swing.GroupLayout panelCamaraLayout = new javax.swing.GroupLayout(panelCamara);
        panelCamara.setLayout(panelCamaraLayout);
        panelCamaraLayout.setHorizontalGroup(
            panelCamaraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCamaraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCamaraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblcam_valor)
                    .addComponent(lblcam_alcanceWifi)
                    .addComponent(lblcam_megaPixels)
                    .addComponent(lblcam_giro)
                    .addComponent(lblcam_modelo)
                    .addComponent(lblcam_codigo))
                .addGap(53, 53, 53)
                .addGroup(panelCamaraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCamaraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtcam_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtcam_modelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtcam_giro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcam_megaPixeles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcam_alcanceWifi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcam_valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(192, Short.MAX_VALUE))
        );
        panelCamaraLayout.setVerticalGroup(
            panelCamaraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCamaraLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(panelCamaraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblcam_codigo)
                    .addComponent(txtcam_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelCamaraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcam_modelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblcam_modelo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelCamaraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcam_giro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblcam_giro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelCamaraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcam_megaPixeles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblcam_megaPixels))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelCamaraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcam_alcanceWifi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblcam_alcanceWifi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelCamaraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblcam_valor)
                    .addComponent(txtcam_valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Cámara IP", panelCamara);

        btn_aceptar.setText("Aceptar");
        btn_aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_producto)
                        .addGap(18, 18, 18)
                        .addComponent(cbox_producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(btn_ingresar)
                        .addGap(62, 62, 62)
                        .addComponent(btn_aceptar)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbox_producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_producto)
                    .addComponent(btn_ingresar)
                    .addComponent(btn_aceptar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void btn_ingresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ingresarMouseClicked
        
        Integer variable = cbox_producto.getSelectedIndex();
        int indexn;
        jTabbedPane1.setVisible(true);
        btn_aceptar.setVisible(true);
       
        super.setTitle(variable.toString());
        jTabbedPane1.setEnabled(true);
        
        if(cbox_producto.getSelectedIndex()==0){
            jTabbedPane1.setEnabledAt(0, true);
            jTabbedPane1.setEnabledAt(1, false);
            jTabbedPane1.setSelectedIndex(0);
            //panelTelevisor.setVisible(true);
            //panelTelevisor.setEnabled(true);
        }
        else{
            jTabbedPane1.setEnabledAt(1, true);
            jTabbedPane1.setEnabledAt(0, false);
            jTabbedPane1.setSelectedIndex(1);
            //panelCamara.setEnabled(true);
            //panelCamara.setVisible(true);
        }
        
        reset(txttv_marca);
        reset(txttv_empresaCable);
        reset(txttv_modelo);
        reset(txttv_pulgadas);
        reset(txttv_valor);
        
        reset(txtcam_giro);
        reset(txtcam_alcanceWifi);
        reset(txtcam_codigo);
        reset(txtcam_megaPixeles);
        reset(txtcam_modelo);
        reset(txtcam_valor);
        
    }//GEN-LAST:event_btn_ingresarMouseClicked

    //Al presionar sobre el Botón "Aceptar", se procede a validar los datos según el JTabbedPanel activado 
    private void btn_aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aceptarActionPerformed
        
        if(jTabbedPane1.getSelectedIndex() == 0)
            validar_televisor();
        else
            validar_camara();
           
    }//GEN-LAST:event_btn_aceptarActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
            
        });
    }
    
    //Método para validar todos los JTextField de CámaraIP
    public void validar_camara(){
        
        ControlIngresoCam ctrlCam1 = new ControlIngresoCam();
        CamaraIp cam1 = new CamaraIp();
       
        boolean banderaCamValidada = true;
               
        try{
                ctrlCam1.validarCamaraCodigo(txtcam_codigo.getText());
                ctrlCam1.validarCamaraModelo(txtcam_modelo.getText());
                ctrlCam1.validarCamaraGiro(txtcam_giro.getText());
                ctrlCam1.validarCamaraMegaPixeles(txtcam_megaPixeles.getText());
                ctrlCam1.validarCamaraAlcanceWifi(txtcam_alcanceWifi.getText());
                ctrlCam1.validarCamaraValor(txtcam_valor.getText());
                
        }catch(Excepciones e){
            banderaCamValidada = false;
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
          
        if(banderaCamValidada){
                                            
            // Si pasa las validaciones --> cargar producto
            cam1.setAlcanceWifi(Double.parseDouble(txtcam_alcanceWifi.getText()));
            cam1.setCodigo(txtcam_codigo.getText());
            cam1.setModelo(txtcam_modelo.getText());
            cam1.setGiro(Integer.parseInt(txtcam_giro.getText()));
            cam1.setMegaPixeles(Double.parseDouble(txtcam_megaPixeles.getText()));
            cam1.setValor(Double.parseDouble(txtcam_valor.getText()));
                
                
            mostrarCamara(cam1);  
        
        }         
        
    }
    
    public void validar_televisor(){
        
        ControlIngresoTv ctrl1 = new ControlIngresoTv();
        Televisor tv1 = new Televisor();
       
        boolean banderaTvValidada = true;
               
        try{
                ctrl1.validarTelevisorMarca(txttv_marca.getText());
                ctrl1.validarTelevisorModelo(txttv_modelo.getText());
                ctrl1.validarTelevisorPulgadas(txttv_pulgadas.getText());
                ctrl1.validarTelevisorEmpresaCable(txttv_empresaCable.getText());
                ctrl1.validarTelevisorValor(txttv_valor.getText());
        }catch(Excepciones e){
            banderaTvValidada = false;
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
 
       
        if(banderaTvValidada){
                                            
                // Si pasa las validaciones --> cargar producto
                tv1.setMarca(txttv_marca.getText());
                tv1.setModelo(txttv_modelo.getText());
                tv1.setPulgadas(Integer.parseInt(txttv_pulgadas.getText()));
                tv1.setEmpresaCable(txttv_empresaCable.getText());
                tv1.setValor(Double.parseDouble(txttv_valor.getText()));
                
                if( (cboxtv_smarTv.getSelectedItem().equals("NO"))  )
                    tv1.setSmarTv("N");
                else
                    tv1.setSmarTv("S");
                
                mostrarTelevisor(tv1);  
        
        }
        
    }
    
    //Mensaje de Aceptación de datos ingresados para Televisor
    public void mostrarTelevisor(Televisor tv){
        JOptionPane.showMessageDialog(null, tv.getMarca()+"\n"+
                                            tv.getModelo()+"\n"+
                                            tv.getPulgadas()+"\n"+
                                            tv.getSmarTv()+"\n"+
                                            tv.getEmpresaCable()+"\n"+
                                            tv.getValor());
        
        reset(txttv_marca);
        reset(txttv_empresaCable);
        reset(txttv_modelo);
        reset(txttv_pulgadas);
        reset(txttv_valor);
        
    }
    
    //Mensaje de Aceptación de datos ingresados para CamaraIp
    public void mostrarCamara(CamaraIp cam){
        JOptionPane.showMessageDialog(null, cam.getCodigo()+"\n"+
                                            cam.getModelo()+"\n"+
                                            cam.getGiro()+"\n"+
                                            cam.getMegaPixeles()+"\n"+
                                            cam.getAlcanceWifi()+"\n"+
                                            cam.getValor());
        
        reset(txtcam_alcanceWifi);
        reset(txtcam_codigo);
        reset(txtcam_giro);
        reset(txtcam_megaPixeles);
        reset(txtcam_modelo);
        reset(txtcam_valor);
    }
   
    //Método para resetear un JTextField
    public void reset(javax.swing.JTextField txt) {
         txt.setText("");
    }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_aceptar;
    private javax.swing.JButton btn_ingresar;
    private javax.swing.JComboBox<String> cbox_producto;
    private javax.swing.JComboBox<String> cboxtv_smarTv;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lbl_producto;
    private javax.swing.JLabel lblcam_alcanceWifi;
    private javax.swing.JLabel lblcam_codigo;
    private javax.swing.JLabel lblcam_giro;
    private javax.swing.JLabel lblcam_megaPixels;
    private javax.swing.JLabel lblcam_modelo;
    private javax.swing.JLabel lblcam_valor;
    private javax.swing.JLabel lbltv_empresaCable;
    private javax.swing.JLabel lbltv_marca;
    private javax.swing.JLabel lbltv_modelo;
    private javax.swing.JLabel lbltv_pugadas;
    private javax.swing.JLabel lbltv_smarTv;
    private javax.swing.JLabel lbltv_valor;
    private javax.swing.JPanel panelCamara;
    private javax.swing.JPanel panelTelevisor;
    private javax.swing.JTextField txtcam_alcanceWifi;
    private javax.swing.JTextField txtcam_codigo;
    private javax.swing.JTextField txtcam_giro;
    private javax.swing.JTextField txtcam_megaPixeles;
    private javax.swing.JTextField txtcam_modelo;
    private javax.swing.JTextField txtcam_valor;
    private javax.swing.JTextField txttv_empresaCable;
    private javax.swing.JTextField txttv_marca;
    private javax.swing.JTextField txttv_modelo;
    private javax.swing.JTextField txttv_pulgadas;
    private javax.swing.JTextField txttv_valor;
    // End of variables declaration//GEN-END:variables
}
