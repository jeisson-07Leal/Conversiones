
import javax.swing.JOptionPane;

public class InterfazLongitud extends javax.swing.JFrame {

    public InterfazLongitud() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Titulo = new javax.swing.JLabel();
        Volver = new javax.swing.JButton();
        Limpiar = new javax.swing.JButton();
        Salir = new javax.swing.JButton();
        BotonKilómetro = new javax.swing.JButton();
        BotonHectómetro = new javax.swing.JButton();
        RecibirDatosHectómetro = new javax.swing.JTextField();
        BotonDecámetro = new javax.swing.JButton();
        RecibirDatosDecámetro = new javax.swing.JTextField();
        BotonMetro = new javax.swing.JButton();
        RecibirDatosMetro = new javax.swing.JTextField();
        BotonDecímetro = new javax.swing.JButton();
        RecibirDatosDecímetro = new javax.swing.JTextField();
        BotonCentímetro = new javax.swing.JButton();
        RecibirDatosCentímetro = new javax.swing.JTextField();
        BotonMilímetro = new javax.swing.JButton();
        RecibirDatosMilímetro = new javax.swing.JTextField();
        TextoKilómetro = new javax.swing.JLabel();
        TextoHectómetro = new javax.swing.JLabel();
        RecibirResultadoKilómetro = new javax.swing.JTextField();
        TextoDecámetro = new javax.swing.JLabel();
        RecibirResultadoDecámetro = new javax.swing.JTextField();
        TextoMetro = new javax.swing.JLabel();
        RecibirResultadoMetro = new javax.swing.JTextField();
        TextoDecímetro = new javax.swing.JLabel();
        RecibirResultadoDecímetro = new javax.swing.JTextField();
        TextoCentímetro = new javax.swing.JLabel();
        RecibirResultadoCentímetro = new javax.swing.JTextField();
        TextoMilímetro = new javax.swing.JLabel();
        RecibirResultadoMilímetro = new javax.swing.JTextField();
        RecibirResultadoHectómetro = new javax.swing.JTextField();
        RecibirDatosKilómetro = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Titulo.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        Titulo.setText("Longitud");
        Titulo.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Titulo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Volver.setText("Volver");
        Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverActionPerformed(evt);
            }
        });

        Limpiar.setText("Limpiar");
        Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarActionPerformed(evt);
            }
        });

        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        BotonKilómetro.setText("Kilómetro");
        BotonKilómetro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonKilómetroActionPerformed(evt);
            }
        });

        BotonHectómetro.setText("Hectómetro");
        BotonHectómetro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonHectómetroActionPerformed(evt);
            }
        });

        BotonDecámetro.setText("Decámetro");
        BotonDecámetro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonDecámetroActionPerformed(evt);
            }
        });

        BotonMetro.setText("Metro");
        BotonMetro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonMetroActionPerformed(evt);
            }
        });

        BotonDecímetro.setText("Decímetro");
        BotonDecímetro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonDecímetroActionPerformed(evt);
            }
        });

        BotonCentímetro.setText("Centímetro");
        BotonCentímetro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCentímetroActionPerformed(evt);
            }
        });

        BotonMilímetro.setText("Milímetro");
        BotonMilímetro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonMilímetroActionPerformed(evt);
            }
        });

        TextoKilómetro.setText("Kilómetro:");

        TextoHectómetro.setText("Hectómetro:");

        TextoDecámetro.setText("Decámetro:");

        TextoMetro.setText("Metro:");

        TextoDecímetro.setText("Decímetro:");

        TextoCentímetro.setText("Centímetro:");

        TextoMilímetro.setText("Milímetro:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BotonKilómetro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(RecibirDatosKilómetro, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BotonCentímetro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(RecibirDatosCentímetro, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BotonDecímetro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(RecibirDatosDecímetro, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BotonMetro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(RecibirDatosMetro, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BotonDecámetro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(RecibirDatosDecámetro, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BotonHectómetro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(RecibirDatosHectómetro, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(Limpiar)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(BotonMilímetro)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(RecibirDatosMilímetro, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(TextoMetro)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(RecibirResultadoMetro, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(TextoKilómetro)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(RecibirResultadoKilómetro, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(TextoDecámetro)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(RecibirResultadoDecámetro, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(TextoDecímetro)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(RecibirResultadoDecímetro, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(TextoCentímetro)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(RecibirResultadoCentímetro, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(TextoMilímetro)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(RecibirResultadoMilímetro, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(TextoHectómetro)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(RecibirResultadoHectómetro, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Salir)
                                .addGap(88, 88, 88))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Volver)
                        .addGap(69, 69, 69)
                        .addComponent(Titulo)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Titulo)
                    .addComponent(Volver))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextoKilómetro)
                    .addComponent(BotonKilómetro)
                    .addComponent(RecibirResultadoKilómetro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RecibirDatosKilómetro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonHectómetro)
                    .addComponent(RecibirDatosHectómetro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextoHectómetro)
                    .addComponent(RecibirResultadoHectómetro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonDecámetro)
                    .addComponent(RecibirDatosDecámetro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextoDecámetro)
                    .addComponent(RecibirResultadoDecámetro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonMetro)
                    .addComponent(RecibirDatosMetro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextoMetro)
                    .addComponent(RecibirResultadoMetro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonDecímetro)
                    .addComponent(RecibirDatosDecímetro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextoDecímetro)
                    .addComponent(RecibirResultadoDecímetro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonCentímetro)
                    .addComponent(RecibirDatosCentímetro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextoCentímetro)
                    .addComponent(RecibirResultadoCentímetro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonMilímetro)
                    .addComponent(RecibirDatosMilímetro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextoMilímetro)
                    .addComponent(RecibirResultadoMilímetro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Limpiar)
                    .addComponent(Salir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverActionPerformed
        
        InterfazPrincipal ventanaPrincipal = new InterfazPrincipal();
        ventanaPrincipal.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_VolverActionPerformed

    private void LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarActionPerformed
        RecibirDatosKilómetro.setText("");
        RecibirDatosHectómetro.setText("");
        RecibirDatosDecámetro.setText("");
        RecibirDatosMetro.setText("");
        RecibirDatosDecímetro.setText("");
        RecibirDatosCentímetro.setText("");
        RecibirDatosMilímetro.setText("");
        RecibirResultadoKilómetro.setText("");
        RecibirResultadoHectómetro.setText("");
        RecibirResultadoDecámetro.setText("");
        RecibirResultadoMetro.setText("");
        RecibirResultadoDecímetro.setText("");
        RecibirResultadoCentímetro.setText("");
        RecibirResultadoMilímetro.setText("");
    }//GEN-LAST:event_LimpiarActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        dispose();
    }//GEN-LAST:event_SalirActionPerformed
                
    private void BotonKilómetroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonKilómetroActionPerformed
        
        String comprobar = RecibirDatosKilómetro.getText();

        if(comprobar.isEmpty()){
            JOptionPane.showMessageDialog(this, "el espacio de kilómetros no puede ir vacio", "Error de campos vacios", JOptionPane.ERROR_MESSAGE);
        }
        else{
            double datosKm = Double.parseDouble(RecibirDatosKilómetro.getText());
            
            Longitud kilometros = new Longitud();
            RecibirResultadoKilómetro.setText(""+kilometros.Kilómetros("kilómetros", datosKm));
            RecibirResultadoHectómetro.setText(""+kilometros.Kilómetros("hectómetros", datosKm));
            RecibirResultadoDecámetro.setText(""+kilometros.Kilómetros("decámetros", datosKm));
            RecibirResultadoMetro.setText(""+kilometros.Kilómetros("metros", datosKm));
            RecibirResultadoDecímetro.setText(""+kilometros.Kilómetros("decímetro", datosKm));
            RecibirResultadoCentímetro.setText(""+kilometros.Kilómetros("centímetro", datosKm));
            RecibirResultadoMilímetro.setText(""+kilometros.Kilómetros("milímetro", datosKm)); 
        }

    }//GEN-LAST:event_BotonKilómetroActionPerformed

    private void BotonHectómetroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonHectómetroActionPerformed
        
        String comprobar = RecibirDatosHectómetro.getText();
        
        if(comprobar.isEmpty()){
            JOptionPane.showMessageDialog(this, "el espacio de kilómetros no puede ir vacio", "Error de campos vacios", JOptionPane.ERROR_MESSAGE);
        }
        else{
            double datosHm = Double.parseDouble(RecibirDatosHectómetro.getText());

            Longitud hectómetros = new Longitud();
            RecibirResultadoKilómetro.setText(""+hectómetros.Hectómetros("kilómetros", datosHm));
            RecibirResultadoHectómetro.setText(""+hectómetros.Hectómetros("hectómetros", datosHm));
            RecibirResultadoDecámetro.setText(""+hectómetros.Hectómetros("decámetros", datosHm));
            RecibirResultadoMetro.setText(""+hectómetros.Hectómetros("metros", datosHm));
            RecibirResultadoDecímetro.setText(""+hectómetros.Hectómetros("decímetro", datosHm));
            RecibirResultadoCentímetro.setText(""+hectómetros.Hectómetros("centímetro", datosHm));
            RecibirResultadoMilímetro.setText(""+hectómetros.Hectómetros("milímetro", datosHm));
        }
       
    }//GEN-LAST:event_BotonHectómetroActionPerformed

    private void BotonDecámetroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonDecámetroActionPerformed

        String comprobar = RecibirDatosDecámetro.getText();
        
        if(comprobar.isEmpty()){
            JOptionPane.showMessageDialog(this, "el espacio de kilómetros no puede ir vacio", "Error de campos vacios", JOptionPane.ERROR_MESSAGE);
        }
        else{
            double datosDm = Double.parseDouble(RecibirDatosDecámetro.getText());

            Longitud decametros = new Longitud();
            RecibirResultadoKilómetro.setText(""+decametros.Decámetros("kilómetros", datosDm));
            RecibirResultadoHectómetro.setText(""+decametros.Decámetros("hectómetros", datosDm));
            RecibirResultadoDecámetro.setText(""+decametros.Decámetros("decámetros", datosDm));
            RecibirResultadoMetro.setText(""+decametros.Decámetros("metros", datosDm));
            RecibirResultadoDecímetro.setText(""+decametros.Decámetros("decímetro", datosDm));
            RecibirResultadoCentímetro.setText(""+decametros.Decámetros("centímetro", datosDm));
            RecibirResultadoMilímetro.setText(""+decametros.Decámetros("milímetro", datosDm));
        }
        
    }//GEN-LAST:event_BotonDecámetroActionPerformed

    private void BotonMetroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonMetroActionPerformed
        
        String comprobar = RecibirDatosMetro.getText();
        
        if(comprobar.isEmpty()){
            JOptionPane.showMessageDialog(this, "el espacio de kilómetros no puede ir vacio", "Error de campos vacios", JOptionPane.ERROR_MESSAGE);
        }
        else{
            double datosM = Double.parseDouble(RecibirDatosMetro.getText());

            Longitud metros = new Longitud();
            RecibirResultadoKilómetro.setText(""+metros.Metros("kilómetros", datosM));
            RecibirResultadoHectómetro.setText(""+metros.Metros("hectómetros", datosM));
            RecibirResultadoDecámetro.setText(""+metros.Metros("decámetros", datosM));
            RecibirResultadoMetro.setText(""+metros.Metros("metros", datosM));
            RecibirResultadoDecímetro.setText(""+metros.Metros("decímetro", datosM));
            RecibirResultadoCentímetro.setText(""+metros.Metros("centímetro", datosM));
            RecibirResultadoMilímetro.setText(""+metros.Metros("milímetro", datosM));
        }

    }//GEN-LAST:event_BotonMetroActionPerformed

    private void BotonDecímetroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonDecímetroActionPerformed
        
        String comprobar = RecibirDatosDecímetro.getText();
        
        if(comprobar.isEmpty()){
            JOptionPane.showMessageDialog(this, "el espacio de kilómetros no puede ir vacio", "Error de campos vacios", JOptionPane.ERROR_MESSAGE);
        }
        else{
            double datosDc = Double.parseDouble(RecibirDatosDecímetro.getText());

            Longitud decimetros = new Longitud();
            RecibirResultadoKilómetro.setText(""+decimetros.Decímetros("kilómetros", datosDc));
            RecibirResultadoHectómetro.setText(""+decimetros.Decímetros("hectómetros", datosDc));
            RecibirResultadoDecámetro.setText(""+decimetros.Decímetros("decámetros", datosDc));
            RecibirResultadoMetro.setText(""+decimetros.Decímetros("metros", datosDc));
            RecibirResultadoDecímetro.setText(""+decimetros.Decímetros("decímetro", datosDc));
            RecibirResultadoCentímetro.setText(""+decimetros.Decímetros("centímetro", datosDc));
            RecibirResultadoMilímetro.setText(""+decimetros.Decímetros("milímetro", datosDc));
        }
        

    }//GEN-LAST:event_BotonDecímetroActionPerformed

    private void BotonCentímetroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCentímetroActionPerformed
               
        String comprobar = RecibirDatosCentímetro.getText();
        
        if(comprobar.isEmpty()){
            JOptionPane.showMessageDialog(this, "el espacio de kilómetros no puede ir vacio", "Error de campos vacios", JOptionPane.ERROR_MESSAGE);
        }
        else{
            double datosCm = Double.parseDouble(RecibirDatosCentímetro.getText());

            Longitud centimetros = new Longitud();
            RecibirResultadoKilómetro.setText(""+centimetros.Centímetros("kilómetros", datosCm));
            RecibirResultadoHectómetro.setText(""+centimetros.Centímetros("hectómetros", datosCm));
            RecibirResultadoDecámetro.setText(""+centimetros.Centímetros("decámetros", datosCm));
            RecibirResultadoMetro.setText(""+centimetros.Centímetros("metros", datosCm));
            RecibirResultadoDecímetro.setText(""+centimetros.Centímetros("decímetro", datosCm));
            RecibirResultadoCentímetro.setText(""+centimetros.Centímetros("centímetro", datosCm));
            RecibirResultadoMilímetro.setText(""+centimetros.Centímetros("milímetro", datosCm));
        } 

    }//GEN-LAST:event_BotonCentímetroActionPerformed

    private void BotonMilímetroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonMilímetroActionPerformed
       
        String comprobar = RecibirDatosMilímetro.getText();
        
        if(comprobar.isEmpty()){
            JOptionPane.showMessageDialog(this, "el espacio de kilómetros no puede ir vacio", "Error de campos vacios", JOptionPane.ERROR_MESSAGE);
        }
        else{
            double datosMm = Double.parseDouble(RecibirDatosMilímetro.getText());
            
            Longitud milimetros = new Longitud();
            RecibirResultadoKilómetro.setText(""+milimetros.Milímetros("kilómetros", datosMm));
            RecibirResultadoHectómetro.setText(""+milimetros.Milímetros("hectómetros", datosMm));
            RecibirResultadoDecámetro.setText(""+milimetros.Milímetros("decámetros", datosMm));
            RecibirResultadoMetro.setText(""+milimetros.Milímetros("metros", datosMm));
            RecibirResultadoDecímetro.setText(""+milimetros.Milímetros("decímetro", datosMm));
            RecibirResultadoCentímetro.setText(""+milimetros.Milímetros("centímetro", datosMm));
            RecibirResultadoMilímetro.setText(""+milimetros.Milímetros("milímetro", datosMm));
        }  
    }//GEN-LAST:event_BotonMilímetroActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterfazLongitud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazLongitud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazLongitud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazLongitud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazLongitud().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonCentímetro;
    private javax.swing.JButton BotonDecámetro;
    private javax.swing.JButton BotonDecímetro;
    private javax.swing.JButton BotonHectómetro;
    private javax.swing.JButton BotonKilómetro;
    private javax.swing.JButton BotonMetro;
    private javax.swing.JButton BotonMilímetro;
    private javax.swing.JButton Limpiar;
    private javax.swing.JTextField RecibirDatosCentímetro;
    private javax.swing.JTextField RecibirDatosDecámetro;
    private javax.swing.JTextField RecibirDatosDecímetro;
    private javax.swing.JTextField RecibirDatosHectómetro;
    private javax.swing.JTextField RecibirDatosKilómetro;
    private javax.swing.JTextField RecibirDatosMetro;
    private javax.swing.JTextField RecibirDatosMilímetro;
    private javax.swing.JTextField RecibirResultadoCentímetro;
    private javax.swing.JTextField RecibirResultadoDecámetro;
    private javax.swing.JTextField RecibirResultadoDecímetro;
    private javax.swing.JTextField RecibirResultadoHectómetro;
    private javax.swing.JTextField RecibirResultadoKilómetro;
    private javax.swing.JTextField RecibirResultadoMetro;
    private javax.swing.JTextField RecibirResultadoMilímetro;
    private javax.swing.JButton Salir;
    private javax.swing.JLabel TextoCentímetro;
    private javax.swing.JLabel TextoDecámetro;
    private javax.swing.JLabel TextoDecímetro;
    private javax.swing.JLabel TextoHectómetro;
    private javax.swing.JLabel TextoKilómetro;
    private javax.swing.JLabel TextoMetro;
    private javax.swing.JLabel TextoMilímetro;
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton Volver;
    // End of variables declaration//GEN-END:variables
}