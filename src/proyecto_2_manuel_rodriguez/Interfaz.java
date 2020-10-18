
package proyecto_2_manuel_rodriguez;

import java.awt.Image;
import java.awt.Toolkit;
import java.io.*;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Interfaz extends javax.swing.JFrame {

    private int controlResumen = 0;
    private TablaHash tablaDispercionResumenes =  new TablaHash();
    private TablaHash tablaDispercionPalabras = new TablaHash();
    private Resumen resumen = new Resumen();
    private Lista autores = new Lista();
    private String cuerpo = "";
    private Lista palabras = new Lista();
    private Lista auxKeys = new Lista();
    private Lista resumenesPorPalabra = new Lista();
    private Lista DB = new Lista();
    
    public Interfaz() {
        initComponents();
        setLocationRelativeTo(null);
        Image iconoPropio = Toolkit.getDefaultToolkit().getImage(getClass().getResource("Ico.png"));
        setIconImage(iconoPropio);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTextField2 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Análisis de Resumenes");
        setPreferredSize(new java.awt.Dimension(500, 500));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel2.setText("Agregar un resumen desde un documento de texto:");

        jButton1.setBackground(new java.awt.Color(51, 103, 214));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Seleccionar archivo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Key", "Titulo"
            }
        ));
        jScrollPane2.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMaxWidth(100);
        }

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Tabla de Resumenes");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        jTabbedPane1.addTab("Agregar", jPanel1);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel4.setText("Seleccione el resumen:");

        jComboBox1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(51, 103, 214));
        jButton2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Analizar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jScrollPane3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Autores", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12))); // NOI18N

        jTextArea2.setBackground(new java.awt.Color(238, 238, 238));
        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane3.setViewportView(jTextArea2);

        jTextField1.setBackground(new java.awt.Color(238, 238, 238));
        jTextField1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Titulo del trabajo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12))); // NOI18N

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Palabras Clave", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12))); // NOI18N

        jTextArea1.setBackground(new java.awt.Color(238, 238, 238));
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jTextField2.setBackground(new java.awt.Color(238, 238, 238));
        jTextField2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tiempo empleado en el análisis", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2)
                    .addComponent(jScrollPane3)
                    .addComponent(jTextField1)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jTextField2))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Analizar", jPanel2);

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel6.setText("Ingrese la palabra clave:");

        jButton3.setBackground(new java.awt.Color(51, 103, 214));
        jButton3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Buscar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Listado de las investigaciones relacionadas"
            }
        ));
        jScrollPane4.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator3)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Buscar", jPanel3);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(0, 60, 495, 412);

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_2_manuel_rodriguez/Proyecto_2_Titulo.png"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 10, 400, 40);

        jButton4.setBackground(new java.awt.Color(51, 103, 214));
        jButton4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Salir");
        jButton4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(420, 10, 70, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_2_manuel_rodriguez/Back.PNG"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 500, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // LEER UN ARCHIVO DE TEXTO CON EL FORMATO QUE EXPLICAN EN EL PROYECTO .TXT
        JFileChooser Seleccionador = new JFileChooser();
        Seleccionador.showOpenDialog(null);
        File archivo = Seleccionador.getSelectedFile();
        System.out.println("\nSe esta cargando el archivo: " + archivo.getName() + "\n");
        try {
            FileReader Lector = new FileReader(archivo);
            BufferedReader Temporal = new BufferedReader(Lector);
            String texto = "";
            String linea = "";
            // ESTABLECIENDO TODO EN BLANCO
            controlResumen = 0;  
            resumen = new Resumen();
            autores = new Lista();
            cuerpo = "";
            palabras = new Lista();
            
            while (((linea = Temporal.readLine()) != null)) {
                texto += linea + "\n";
                if(!linea.equals("")){          // EVITAR QUE SE CARGUEN LINEAS EN BLANCO
                    cargarResumen(linea);      // FUNCION QUE CARGA EL RESUMEN DEPENDIENDO DE LA VARIABLE controlResumen
                }
            }

            System.out.println("Titulo: " + resumen.getTitulo());
            System.out.println("Autores: ");
            for(int i=0; i<autores.getTamano();i++){
                Autor autor = new Autor();
                autor = (Autor) autores.getValor(i);
                System.out.println(autor.getNombre());
            }
            System.out.println("Resumen: ");
            System.out.println(cuerpo);
            System.out.println("Palabras Claves: ");
            for(int i=0; i<palabras.getTamano();i++){
                System.out.println(palabras.getValor(i));
            }
            int key = generarKey(resumen.getTitulo());
            System.out.println("Clave generada: " + key);
            if (!tablaDispercionResumenes.containsKey(key)) { // VERIFICAR SI EXISTE EN LA TABLA DE DISPERCION
                tablaDispercionResumenes.put(key, resumen);      // AGREGARNDO EL RESUMEN LA TABLA DE DISPERCION
                auxKeys.agregarAlFinal(key);
                DB.agregarAlFinal(resumen);
                System.out.println("Se agrego a la Tabla de Disperción con exito!");
                JOptionPane.showMessageDialog(this, "¡Se agrego con éxito el nuevo resumen!");
                // GUARDAR POR PALABRAS CLAVE EN OTRAS TABLA DE DISPERSION
                for (int i = 0; i < palabras.getTamano(); i++) {
                    System.out.println(palabras.getValor(i));
                    resumenesPorPalabra = new Lista();
                    int keyPalabra = generarKey((String) palabras.getValor(i));
                    if (!tablaDispercionPalabras.containsKey(keyPalabra)) {
                        resumenesPorPalabra.agregarAlFinal(resumen);
                        tablaDispercionPalabras.put(keyPalabra, resumenesPorPalabra);
                    } else {
                        resumenesPorPalabra = (Lista) tablaDispercionPalabras.get(keyPalabra);
                        resumenesPorPalabra.agregarAlFinal(resumen);
                        tablaDispercionPalabras.put(keyPalabra, resumenesPorPalabra);
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "¡Este resumen ya se encuentra cargado!",
                        "Información!", JOptionPane.ERROR_MESSAGE);
            }

            actualizarTablaDispercion();    // ACTUALIZAR LA TABLA DE DISPERCION DE VISTA
            actualizarComboBox();       // ACTUALIZAR LA LISTA DE RESUMEN QUE SE PUEDEN ANALIZAR
      
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public void inicio() throws Exception {
        // CARGANDO LOS RESUMENES ANTERIORES DESDE LA LISTA QUE ESTAMOS USANDO COMO UNA DB
        try {
            FileInputStream fis = new FileInputStream("investigaciones.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            DB = (Lista) ois.readObject();//El método readObject() recupera el objeto
            ois.close();
            fis.close();
        } catch (FileNotFoundException e) {
//            e.printStackTrace();
        } catch (IOException e) {
//            e.printStackTrace();
        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
        }
        
        for (int j=0; j < DB.getTamano(); j++) {
            resumen = (Resumen) DB.getValor(j);
            int key = generarKey(resumen.getTitulo());
            System.out.println("Clave generada: " + key);
            if (!tablaDispercionResumenes.containsKey(key)) { // VERIFICAR SI EXISTE EN LA TABLA DE DISPERCION
                tablaDispercionResumenes.put(key, resumen);      // AGREGARNDO EL RESUMEN LA TABLA DE DISPERCION
                auxKeys.agregarAlFinal(key);
                DB.agregarAlFinal(resumen);
                System.out.println("Se agrego a la Tabla de Disperción con exito!");
                // GUARDAR POR PALABRAS CLAVE EN OTRAS TABLA DE DISPERSION
                for (int i = 0; i < resumen.palabras.getTamano(); i++) {
                    System.out.println(resumen.palabras.getValor(i));
                    resumenesPorPalabra = new Lista();
                    int keyPalabra = generarKey((String) resumen.palabras.getValor(i));
                    if (!tablaDispercionPalabras.containsKey(keyPalabra)) {
                        resumenesPorPalabra.agregarAlFinal(resumen);
                        tablaDispercionPalabras.put(keyPalabra, resumenesPorPalabra);
                    } else {
                        resumenesPorPalabra = (Lista) tablaDispercionPalabras.get(keyPalabra);
                        resumenesPorPalabra.agregarAlFinal(resumen);
                        tablaDispercionPalabras.put(keyPalabra, resumenesPorPalabra);
                    }
                }
            }
        }
        actualizarComboBox();
        actualizarTablaDispercion();

    }


    
    
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        long inicio = System.currentTimeMillis();   // INICIO DEL CALCULO DE TIEMPO

        String seleccionado = (String) jComboBox1.getSelectedItem();
        System.out.println("Se ha seleccionado: " + seleccionado);
        int key = generarKey(seleccionado);
        System.out.println("La funcion Hash arroja el key a ser consultado: " + key);
        if(tablaDispercionResumenes.containsKey(key)){
            System.out.println("El resumen si existe y sera analizado!");
            Resumen resumenSeleccionado = (Resumen) tablaDispercionResumenes.get(key);
            //TITULO
            if(resumenSeleccionado.getTitulo().length()>70){
                String tiutloAdaptado = resumenSeleccionado.getTitulo().substring(0,70); 
                tiutloAdaptado += "...";
                jTextField1.setText(tiutloAdaptado);
            }else{
                jTextField1.setText(resumenSeleccionado.getTitulo());
            }    
            jTextField1.setToolTipText(resumenSeleccionado.getTitulo());
            try {
                //AUTORES
                String autoresString = "";
                for (int i = 0; i < resumenSeleccionado.getAutores().getTamano(); i++) {
                    Autor autor = (Autor) resumenSeleccionado.getAutores().getValor(i);
                    autoresString += autor.getNombre() + "\n";
                }
                jTextArea2.setText(autoresString);
                
                //PALABRAS CLAVES
                System.out.println("Resumen Seleccionado (Cuerpo): " + resumenSeleccionado.getCuerpo());
                System.out.println("Resumen Seleccionado (Palabras Claves): " + resumenSeleccionado.getPalabras());
                String palabrasString = "";
                for (int i = 0; i < resumenSeleccionado.getPalabras().getTamano(); i++) {
                    int frecuencia = 0;
                    String[] cuerpoPalabras = resumenSeleccionado.getCuerpo().split(" ");
                    System.out.println(cuerpoPalabras.length);
                    for (String palabra : cuerpoPalabras) {
                        //System.out.println(palabra);
                        if(palabra.equals(resumenSeleccionado.getPalabras().getValor(i))){
                            frecuencia++;
                        }     
                    }
                    String stringFrecuencia = String.valueOf(frecuencia);
                    palabrasString += "Palabra: " + resumenSeleccionado.getPalabras().getValor(i) + " - Frecuencia: " + stringFrecuencia + "\n";
                }
                jTextArea1.setText(palabrasString);

                long fin = System.currentTimeMillis();  // FIN DEL CALCULO
                double tiempo = (double) ((fin - inicio));
                jTextField2.setText(tiempo + " milisegundos");
                System.out.println(tiempo + " milisegundos");
                
            } catch (Exception e) {
                System.out.println("Error: " + e);
            }

            
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(jTextField3.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Error: Campo de busqueda vacio", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }else{
            int keyBusqueda = generarKey(jTextField3.getText());
            if (tablaDispercionPalabras.containsKey(keyBusqueda)) {
                System.out.println("Se encontro resumenes con esa Palabra Clave!");
                // ACTUALIZA LA TABLA DE DISPERCION
                DefaultTableModel tabla = new DefaultTableModel();
                tabla.addColumn("Listado de las investigaciones relacionadas");
                resumenesPorPalabra = (Lista) tablaDispercionPalabras.get(keyBusqueda);
                try {
                    for (int i = 0; i < resumenesPorPalabra.getTamano(); i++) {
                        Resumen resumenTemporal = (Resumen) resumenesPorPalabra.getValor(i);
                        System.out.println(resumenTemporal.getTitulo());
                        tabla.addRow(new Object[]{resumenTemporal.getTitulo()});
                    }
                    jTable2.setModel(tabla);

                } catch (Exception e) {
                    System.out.println("Error: " + e);
                }
            }else{
                JOptionPane.showMessageDialog(null, "No hay inventigaciones relacionadas.", "Información", JOptionPane.WARNING_MESSAGE);
            }

        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // GUARDAR LA LISTA DE resumenesDB PORQUE AL SERIALIZAR NO SE TOMAN EN CUENTA
        try {
            FileOutputStream fs = new FileOutputStream("investigaciones.ser");
            ObjectOutputStream os = new ObjectOutputStream(fs);
            os.writeObject(DB);
            os.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.exit(0);
    }//GEN-LAST:event_jButton4ActionPerformed

    public void cargarResumen(String linea){
        // CONTADOR PARA LLEVAR UN CONTRON DE LO CORRESPONDE CARGAR
        if(linea.equals("Autores")){
            controlResumen++;
        }
        if(linea.equals("Resumen")){
            controlResumen++;
        }
        
        if(linea.length()>14){
            String subLinea = linea.substring(0,15);  // EXTRAER SOLO LOS PRIMEROS 14 CARACTERES PARA VER SI LLEGAMOS A LAS PALABRAS CLAVE
            if(subLinea.equals("Palabras claves") || subLinea.equals("Palabras Claves")){
                controlResumen++;
            }
        }
        

        // CARGANDO DATOS DEPENDIENDO DEL CONTADOR 
        if (controlResumen == 0) {
            resumen.setTitulo(linea);
        }
        if (controlResumen == 1 && !linea.equals("Autores")) {  // CARGAR AUTORES A LA LISTA DEL RESUMEN
            Autor autor = new Autor(linea);
            autores.agregarAlFinal(autor);  //  CARGANDO EL AUTOR LINEA A LINEA A LA LISTA
            resumen.setAutores(autores);
        }
        if (controlResumen == 2 && !linea.equals("Resumen")) {
            cuerpo = cuerpo + linea;
            resumen.setCuerpo(cuerpo);
        }
        if (controlResumen == 3) {
            int longitudLinea = linea.length();
            String subLinea = linea.substring(16,longitudLinea);    // TOMA SOLO LAS PALABRAS CLAVE
            String[] vectorPalabras = subLinea.split(",");          //  LAS SEPARA EN UN VECTOR
            for (String i : vectorPalabras) {
                palabras.agregarAlFinal(i.trim().replace(".",""));  // CARGO A LA LISTA DE PALABRAS CLAVE DEL RESUMEN
            }
            resumen.setPalabras(palabras);      //CARGO ESA LISTA AL RESUMEN COMO OBJETO
        }
    }

    public void actualizarTablaDispercion() {
        // ACTUALIZA LA TABLA DE DISPERCION
//        System.out.println(auxKeys.primero.getValor());
//        System.out.println(tablaDispercionResumenes.get((int) auxKeys.primero.getValor()));
        DefaultTableModel tabla = new DefaultTableModel();
        tabla.addColumn("Key");
        tabla.addColumn("Titulo");
        try {
            for (int i = 0; i < auxKeys.tamano; i++) {
                Resumen resumen = (Resumen) tablaDispercionResumenes.get((int) auxKeys.getValor(i));
                tabla.addRow(new Object[]{auxKeys.getValor(i), resumen.getTitulo()});
                jTable1.setModel(tabla);
                jTable1.getColumnModel().getColumn(0).setMaxWidth(100);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
    
    public void actualizarComboBox() { 
        jComboBox1.removeAllItems();
        try {
            for (int i = 0; i < auxKeys.tamano; i++) {
                Resumen resumen = (Resumen) tablaDispercionResumenes.get((int) auxKeys.getValor(i));
                jComboBox1.addItem(resumen.getTitulo());
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        

    }
    
    public int generarKey(String texto) {
        String cadena = texto;
        int longitud = cadena.length();
        int cantidad = 0;
        for (int i = 0; i < cadena.length(); i++) {
            cantidad += cadena.charAt(i);
        }
        return cantidad + longitud;
    }

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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
