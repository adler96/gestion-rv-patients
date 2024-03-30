/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vue;

import controleur.GestionDM;
import controleur.GestionPatient;
import controleur.GestionRV;
import controleur.Utiles;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modele.DossierPatient;
import modele.Patient;
import modele.RV;
import modele.SuiviDossier;

/**
 *
 * @author pc
 */
public class AccueilSecretaire extends javax.swing.JFrame {
    
    DefaultTableModel dtm = null;
    
    /**
     * Creates new form AccueilSecretaire
     */
    public AccueilSecretaire() {
        initComponents();
        
        //desactiver bouton modifier patient
        jButton3.setEnabled(false);
        
        //desactiver boutons modifier et annuler RV
        jButton7.setEnabled(false);
        jButton12.setEnabled(false);
        
        //desactiver bouton ajouterObs.
        jButton15.setEnabled(false);
        jTextField21.setEnabled(false);
        jTextField22.setEnabled(false);
        jTextField23.setEnabled(false);
        jTextField24.setEnabled(false);
        
    }
    
    public void activerChampsRV() {
        jTextField9.setEnabled(true);
        jButton6.setEnabled(true);
        jTextField13.setEnabled(true);
        jButton8.setEnabled(true);
        jSpinner10.setEnabled(true);
        jSpinner11.setEnabled(true);
        jSpinner12.setEnabled(true);
        jButton9.setEnabled(true);
    }
    
    public void desactiverChampsRV() {
        jTextField9.setEnabled(false);
        jButton6.setEnabled(false);
        jTextField13.setEnabled(false);
        jButton8.setEnabled(false);
        jSpinner10.setEnabled(false);
        jSpinner11.setEnabled(false);
        jSpinner12.setEnabled(false);
        jButton9.setEnabled(false);
    }
    
    public void remplirTableauRV() {
        dtm = new DefaultTableModel();
        
        //ajout des colonnes
        dtm.addColumn("id");dtm.addColumn("date");dtm.addColumn("heure");dtm.addColumn("motif");dtm.addColumn("codeP");dtm.addColumn("prenomP");dtm.addColumn("nomP");dtm.addColumn("matricule");dtm.addColumn("prenomM");dtm.addColumn("nomM");
        
        //relation entre le tableau virtuel et le jtable
        jTable2.setModel(dtm);
    
        GestionRV grv = new GestionRV();
        ResultSet rs = grv.listerRVs();
        
        try {
            //parcourir le tableau            
            while(rs.next()) {
                int a = rs.getInt("id");
                String b = rs.getString("date");
                String c = rs.getString("heure");
                String d = rs.getString("motif");
                int e = rs.getInt("codeP");
                String f = rs.getString("prenomP");
                String g = rs.getString("nomP");
                int h = rs.getInt("matricule");
                String i = rs.getString("prenomM");
                String j = rs.getString("nomM");
                
                Object ob[] = {a,Utiles.toDisplayedDate(b),c,d,e,f,g,h,i,j};
                dtm.addRow(ob);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AccueilMedecin.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }

    public void remplirTableauPatients() {
        dtm = new DefaultTableModel();
        
        //ajout des colonnes
        dtm.addColumn("codeP");dtm.addColumn("prenom");dtm.addColumn("nom");dtm.addColumn("age");dtm.addColumn("sexe");dtm.addColumn("adresse");dtm.addColumn("tel");
        
        //relation entre le tableau virtuel et le jtable
        jTable1.setModel(dtm);
    
        GestionPatient gp = new GestionPatient();
        ResultSet rs = gp.listerPatients();
        
        try {
            //parcourir le tableau            
            while(rs.next()) {
                int a = rs.getInt("codeP");
                String b = rs.getString("prenom");
                String c = rs.getString("nom");
                int d = rs.getInt("age");
                String e = rs.getString("sexe");
                String f = rs.getString("adresse");
                int g = rs.getInt("tel");
                
                Object ob[] = {a,b,c,d,e,f,g};
                dtm.addRow(ob);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AccueilMedecin.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    public void desactiverChampsPatient() {
        jTextField1.setEnabled(false);
        jButton2.setEnabled(false);
        jTextField5.setEnabled(false);
        jButton4.setEnabled(false);        
    }
    
    public void activerChampsPatient() {
        jTextField1.setEnabled(true);
        jButton2.setEnabled(true);
        jTextField5.setEnabled(true);
        jButton4.setEnabled(true);
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jSpinner1 = new javax.swing.JSpinner();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jTextField15 = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jSpinner3 = new javax.swing.JSpinner();
        jLabel13 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jTextField16 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel7 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jSpinner5 = new javax.swing.JSpinner();
        jSpinner6 = new javax.swing.JSpinner();
        jSpinner7 = new javax.swing.JSpinner();
        jSpinner8 = new javax.swing.JSpinner();
        jSpinner9 = new javax.swing.JSpinner();
        jLabel22 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jSpinner10 = new javax.swing.JSpinner();
        jSpinner11 = new javax.swing.JSpinner();
        jSpinner12 = new javax.swing.JSpinner();
        jButton9 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jSpinner13 = new javax.swing.JSpinner();
        jSpinner14 = new javax.swing.JSpinner();
        jSpinner15 = new javax.swing.JSpinner();
        jSpinner16 = new javax.swing.JSpinner();
        jSpinner17 = new javax.swing.JSpinner();
        jTextField14 = new javax.swing.JTextField();
        jButton10 = new javax.swing.JButton();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jTextField19 = new javax.swing.JTextField();
        jButton13 = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jTextField20 = new javax.swing.JTextField();
        jButton14 = new javax.swing.JButton();
        jLabel34 = new javax.swing.JLabel();
        jTextField21 = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jTextField22 = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jTextField23 = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jTextField24 = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton15 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jButton16 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 255));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jTabbedPane1.setBackground(new java.awt.Color(255, 204, 204));

        jPanel4.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setText("ID");

        jButton2.setText("Rechercher");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setText("Prenom:");

        jLabel3.setText("Nom:");

        jLabel4.setText("Age:");

        jLabel5.setText("Sexe:");

        jLabel6.setText("Adresse:");

        jLabel7.setText("Telephone:");

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(1, 1, 122, 1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "F" }));

        jButton3.setText("Modifier");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTextField15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField15ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                                .addComponent(jTextField3)
                                .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField4))
                            .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(428, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Rechercher par id", jPanel4);

        jPanel5.setBackground(new java.awt.Color(204, 204, 255));

        jLabel8.setText("Nom:");

        jButton4.setText("Rechercher");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4))
                    .addComponent(jLabel8))
                .addGap(0, 400, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4))
                .addContainerGap(174, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Rechercher par nom", jPanel5);

        jPanel6.setBackground(new java.awt.Color(204, 255, 204));

        jLabel9.setFont(new java.awt.Font("The Bold Font", 0, 18)); // NOI18N
        jLabel9.setText("Ajouter un nouveau Patient:");

        jLabel10.setText("Prenom:");

        jLabel11.setText("Nom:");

        jLabel12.setText("Age:");

        jSpinner3.setModel(new javax.swing.SpinnerNumberModel(1, 1, 122, 1));

        jLabel13.setText("Sexe:");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "F" }));

        jLabel14.setText("Adresse:");

        jLabel15.setText("Telephone");

        jButton5.setText("Enregistrer");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton5)
                            .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(104, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(26, 26, 26)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "codeP", "prenom", "nom", "age", "sexe", "adresse", "tel"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Reinitialiser");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTabbedPane2)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(293, 293, 293)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTabbedPane2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("Gestion Patients", jPanel1);

        jPanel7.setBackground(new java.awt.Color(255, 204, 204));

        jLabel16.setText("ID:");

        jButton6.setText("Rechercher");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel17.setText("date RV:");

        jLabel18.setText("heure RV:");

        jLabel19.setText("codeP:");

        jLabel20.setText("motif:");

        jLabel21.setText("matricule:");

        jSpinner5.setModel(new javax.swing.SpinnerNumberModel(1, 1, 31, 1));

        jSpinner6.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));

        jSpinner7.setModel(new javax.swing.SpinnerNumberModel(2022, 2022, 2050, 1));

        jSpinner8.setModel(new javax.swing.SpinnerNumberModel(8, 8, 15, 1));

        jSpinner9.setModel(new javax.swing.SpinnerNumberModel(0, 0, 30, 30));

        jTextField10.setEditable(false);

        jTextField12.setEditable(false);

        jButton7.setText("Modifier");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel18)
                            .addComponent(jLabel17)
                            .addComponent(jLabel19)
                            .addComponent(jLabel20)
                            .addComponent(jLabel21))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addComponent(jTextField10)
                                        .addGap(18, 18, 18))
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jSpinner5, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                                            .addComponent(jSpinner8))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel7Layout.createSequentialGroup()
                                                .addComponent(jSpinner6, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jSpinner7, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jSpinner9, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24))
                            .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6)))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jSpinner5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jSpinner8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jLabel22)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton7)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Rechercher par id", jPanel7);

        jPanel8.setBackground(new java.awt.Color(255, 204, 204));

        jLabel23.setText("Nom:");

        jButton8.setText("Rechercher");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton8)
                .addContainerGap(116, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8))
                .addContainerGap(159, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Rechercher par nom", jPanel8);

        jPanel9.setBackground(new java.awt.Color(255, 204, 204));

        jLabel24.setText("Date de rendez-vous:");

        jSpinner10.setModel(new javax.swing.SpinnerNumberModel(1, 1, 31, 1));

        jSpinner11.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));

        jSpinner12.setModel(new javax.swing.SpinnerNumberModel(2022, 2022, 2050, 1));

        jButton9.setText("Rechercher");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSpinner10, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSpinner11, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSpinner12, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton9)
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(jSpinner10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9))
                .addContainerGap(128, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Rechercher par date", jPanel9);

        jPanel10.setBackground(new java.awt.Color(204, 255, 204));

        jLabel25.setFont(new java.awt.Font("The Bold Font", 0, 18)); // NOI18N
        jLabel25.setText("Ajouter un rendez-vous:");

        jLabel26.setText("date RV:");

        jLabel27.setText("heure RV:");

        jLabel28.setText("codeP:");

        jLabel29.setText("motif:");

        jLabel30.setText("matricule:");

        jSpinner13.setModel(new javax.swing.SpinnerNumberModel(1, 1, 31, 1));

        jSpinner14.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));

        jSpinner15.setModel(new javax.swing.SpinnerNumberModel(2022, 2022, 2050, 1));

        jSpinner16.setModel(new javax.swing.SpinnerNumberModel(8, 8, 15, 1));

        jSpinner17.setModel(new javax.swing.SpinnerNumberModel(0, 0, 30, 30));

        jButton10.setText("Enregistrer");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jTextField17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField17ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel25)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel26)
                            .addComponent(jLabel27)
                            .addComponent(jLabel28)
                            .addComponent(jLabel29)
                            .addComponent(jLabel30))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(jSpinner13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jSpinner14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinner15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton10)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(jSpinner16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinner17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(371, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25)
                .addGap(23, 23, 23)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(jSpinner13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(jSpinner16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "id", "date RV", "heure RV", "motif", "codeP", "prenom patient", "nom patient", "matricule", "prenom medecin", "nom medecin"
            }
        ));
        jScrollPane2.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(5).setResizable(false);
            jTable2.getColumnModel().getColumn(6).setResizable(false);
        }

        jButton11.setText("Reinitialiser");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setBackground(new java.awt.Color(255, 204, 204));
        jButton12.setText("Annuler");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton12)
                                .addGap(346, 346, 346)
                                .addComponent(jButton11)))
                        .addGap(0, 71, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTabbedPane3)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton11)
                    .addComponent(jButton12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("Gestion Rendez-Vous", jPanel2);

        jPanel11.setBackground(new java.awt.Color(204, 255, 204));

        jLabel31.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel31.setText("Ajouter Nouveau Dossier Medical");

        jLabel32.setText("codeP");

        jButton13.setText("Ajouter");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel32)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton13)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton13))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        jPanel12.setBackground(new java.awt.Color(204, 204, 255));

        jLabel33.setText("codeP");

        jButton14.setText("Rechercher");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jLabel34.setText("numDP");

        jLabel35.setText("prenom:");

        jLabel36.setText("nom:");

        jLabel37.setText("age:");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane5.setViewportView(jTextArea1);

        jButton15.setText("Ajouter Observation");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel34)
                            .addComponent(jLabel33)
                            .addComponent(jLabel35)
                            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel37)
                                .addComponent(jLabel36)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton14))
                            .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton15)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton14))
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton15)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "id", "numDP", "Observations", "date Obs."
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable3);

        jButton16.setText("Reinitialiser");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(103, 103, 103)
                                .addComponent(jButton16)))
                        .addGap(0, 478, Short.MAX_VALUE))
                    .addComponent(jScrollPane3))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton16)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Gestion Dossiers Medicaux", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        //RECHERCHER PATIENT PAR ID
        
        //recuperation saisie
        int id = Integer.parseInt(jTextField1.getText());
        
        jTextField5.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField15.setText("");
        
        GestionPatient gp = new GestionPatient();
        Patient p = null;
        
        p = gp.rechercherPatient(id);
        
        if(p != null) {
            jTextField2.setText(p.getPrenom());
            jTextField3.setText(p.getNom());
            jSpinner1.setValue((int)p.getAge());
            jComboBox1.setSelectedIndex(p.getSexe().charAt(0)=='M' ? 0 : 1);
            jTextField4.setText(p.getAdresse());
            jTextField15.setText(Integer.toString(p.getTel()));
            
            jButton3.setEnabled(true);
            jButton2.setEnabled(false);
            jButton4.setEnabled(false);
            jTextField1.setEnabled(false);
            jTextField5.setEnabled(false);
            
        } else {
            JOptionPane.showMessageDialog(null, "Cet identifiant n'existe pas.");
            jTextField2.setText("");
            jTextField3.setText("");
            jSpinner1.setValue(1);
            jComboBox1.setSelectedIndex(0);
            jTextField4.setText("");
            jTextField15.setText("");
        }
                
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField15ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        //RECHERCHER PATIENT PAR NOM
        
        //recup saisie
        String nom = jTextField5.getText();
        
        GestionPatient gp = new GestionPatient();
        ResultSet rs = null;
        
        rs = gp.rechercherPatients(nom);
        try {
            if(rs.next()) {
                
                rs.beforeFirst();
                dtm = new DefaultTableModel();
                dtm.addColumn("codeP");dtm.addColumn("prenom");dtm.addColumn("nom");dtm.addColumn("age");dtm.addColumn("sexe");dtm.addColumn("adresse");dtm.addColumn("tel");
        
                jTable1.setModel(dtm);
                try {                    
                    while(rs.next()) {
                        int a = rs.getInt("codeP");
                        String b = rs.getString("prenom");
                        String c = rs.getString("nom");
                        int d = rs.getInt("age");
                        String e = rs.getString("sexe");
                        String f = rs.getString("adresse");
                        int g = rs.getInt("tel");
                        
                        Object ob[] = {a,b,c,d,e,f,g};
                        dtm.addRow(ob);
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(AccueilMedecin.class.getName()).log(Level.SEVERE, null, ex);
                }
                jTextField1.setEnabled(false);
                jTextField5.setEnabled(false);
                jButton2.setEnabled(false);
                jButton4.setEnabled(false);
            } else {
                JOptionPane.showMessageDialog(null, "Aucun patient trouve");
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(AccueilMedecin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        
        remplirTableauPatients();
        remplirTableauRV();
    }//GEN-LAST:event_formWindowOpened

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        //modifier les champs d'un patient
        int id = Integer.parseInt(jTextField1.getText());
        String prenom = jTextField2.getText();
        String nom = jTextField3.getText();
        String adresse = jTextField4.getText();
        int tel = Integer.parseInt(jTextField15.getText());
        int age = (int)jSpinner1.getValue();
        String sexe = jComboBox1.getSelectedItem().toString();
        
        Patient p = new Patient(id, prenom, nom, age, sexe, adresse, tel);
        GestionPatient gp = new GestionPatient();
        gp.modifierPatient(p);
        
        remplirTableauPatients();
        
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField15.setText("");
        jSpinner1.setValue(1);
        jButton3.setEnabled(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //REINITIALISER LE PANEL DES PATIENTS 
        jButton3.setEnabled(false);        
        
        jButton2.setEnabled(true);
        jButton4.setEnabled(true);
        jTextField1.setEnabled(true);
        jTextField5.setEnabled(true);
        
        activerChampsPatient();
        
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField15.setText("");
        jSpinner1.setValue(1);
        
        jTextField5.setText("");
        
        remplirTableauPatients();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        //ENREGISTRER UN NOUVEAU PATIENT
        
        //recuperer la saisie
        String prenom = jTextField6.getText();
        String nom = jTextField7.getText();
        int age = (int)jSpinner3.getValue();
        String sexe = jComboBox2.getSelectedItem().toString();
        String adresse = jTextField8.getText();
        int tel = Integer.parseInt(jTextField16.getText());
        
        Patient p = new Patient(prenom, nom, age, sexe, adresse, tel);
        GestionPatient gp = new GestionPatient();
        gp.ajouterPatient(p);
        
        remplirTableauPatients();
        
        jTextField6.setText("");
        jTextField7.setText("");
        jSpinner3.setValue(1);
        jTextField8.setText("");
        jTextField16.setText("");
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTextField17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField17ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        //RECHERCHER RDV PAR ID
        
        //RECUPERER ID
        int id = Integer.parseInt(jTextField9.getText());
        
        //vider autres
        jTextField13.setText("");
        jSpinner10.setValue(1);
        jSpinner11.setValue(1);
        jSpinner12.setValue(2022);
        
        //rechercher
        GestionRV grv = new GestionRV();
        ResultSet rs = null;
        
        rs = grv.rechercherRV(id);
        
        try {
            if(rs.first()) {
                //si resultat
                                
                //collecte et affichage
                int idRV = rs.getInt("id");
                String date = rs.getString("date");
                String heure = rs.getString("heure");
                String motif = rs.getString("motif");
                int codeP = rs.getInt("codeP");
                String prenomP = rs.getString("prenomP");
                String nomP = rs.getString("nomP");
                int matricule = rs.getInt("matricule");
                String prenomM = rs.getString("prenomM");
                String nomM = rs.getString("nomM");
                
                String[] champsDate = date.split("-");
                String[] champsHeure = heure.split(":");
                
                //mettre les champs de date dans les spinners
                jSpinner5.setValue(Integer.parseInt(champsDate[2]));
                jSpinner6.setValue(Integer.parseInt(champsDate[1]));
                jSpinner7.setValue(Integer.parseInt(champsDate[0]));
                
                //mettre les champs heure dans les spinners
                jSpinner8.setValue(Integer.parseInt(champsHeure[0]));
                jSpinner9.setValue(Integer.parseInt(champsHeure[1]));
                
                jTextField10.setText(Integer.toString(codeP));
                jTextField10.setEnabled(false);
                jTextField11.setText(motif);
                jTextField12.setText(Integer.toString(matricule));
                jTextField12.setEnabled(false);
                
                
                //
                //activer le bouton annuler 
                jButton12.setEnabled(true);                
                //activer le bouton modifier
                jButton7.setEnabled(true);
                
                //desactiver les autres champs
                desactiverChampsRV();
            } else {
                JOptionPane.showMessageDialog(null, "Cet identifiant n'existe pas");
            }
        } catch (SQLException ex) {
            Logger.getLogger(AccueilSecretaire.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        //MODIFICATION D'UN RDV BIEN IDENTIFIE
        
        //recuperer les saisies
        int id = Integer.parseInt(jTextField9.getText());
        
        int jour = (int)jSpinner5.getValue();
        int mois = (int)jSpinner6.getValue();
        int annee = (int)jSpinner7.getValue();
        Date date = new Date(annee, mois-1, jour);
        
        int heures = (int)jSpinner8.getValue();
        int minutes = (int)jSpinner9.getValue();
        Time heure = new Time(heures, minutes, 0);
        
        int codeP = Integer.parseInt(jTextField10.getText());
        String motif = jTextField11.getText();
        int matricule = Integer.parseInt(jTextField12.getText());
        
        GestionRV grv = new GestionRV();
        RV rdv = new RV(id, date, heure, codeP, motif, matricule);
        
        grv.modifierRV(rdv);
        
        //vider les champs
        jTextField9.setText("");
        jSpinner5.setValue(1);
        jSpinner6.setValue(1);
        jSpinner7.setValue(2022);
        
        jSpinner8.setValue(8);
        jSpinner9.setValue(00);
        
        jTextField10.setText("");
        jTextField11.setText("");
        jTextField12.setText("");
        
        activerChampsRV();
        remplirTableauRV();
        
        //annuler et modifier sont de nouveau grises
        jButton7.setEnabled(false);
        jButton12.setEnabled(false);
        
        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        
        //BOUTON REINITIALISER        
        activerChampsRV();
        
        //annuler et modifier sont de nouveau grises
        jButton7.setEnabled(false);
        jButton12.setEnabled(false);
        
        //vider les champs
        jTextField9.setText("");
        jSpinner5.setValue(1);
        jSpinner6.setValue(1);
        jSpinner7.setValue(2022);
        
        jSpinner8.setValue(8);
        jSpinner9.setValue(00);
        
        jTextField10.setText("");
        jTextField11.setText("");
        jTextField12.setText("");
        
        jTextField13.setText("");
        
        jSpinner10.setValue(1);
        jSpinner11.setValue(1);
        jSpinner12.setValue(2022);
        
        remplirTableauRV();
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        
        //ANNULER RDV
        GestionRV grv = new GestionRV();
        
        if(!jTextField9.getText().equals("")) {
            //si la recherche se faisait par id
            //supprimer en fonction de l'id
            int id = Integer.parseInt(jTextField9.getText());
            
            grv.annulerRV(id);
                        
        } else {
            
            //dans ce cas on va dans le tableau
            int i=0, nbLignes = dtm.getRowCount();
        
            if(nbLignes > 0) {
                int choix = JOptionPane.showConfirmDialog(null, "Etes vous sur de vouloir annuler ces rendez-vous?", "Confirmer?", JOptionPane.YES_NO_OPTION);

                if(choix == JOptionPane.YES_OPTION) {
                    while(i < nbLignes) {
                        int id = Integer.parseInt(dtm.getValueAt(i, 0).toString());
                        grv.annulerRV(id);
                        i++;
                    }
                }

            } else {
                JOptionPane.showMessageDialog(null, "Aucun rendez-vous a annuler");
            }
        }
        remplirTableauRV();
        jButton7.setEnabled(false);
        jButton12.setEnabled(false);
        
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        //RECHERCHER RV PAR NOM
        ResultSet rs = null;
        
        //recuperer la valeur
        String nom = jTextField13.getText();        
        
        //vider les autres champs
        jTextField9.setText("");
        jSpinner10.setValue(1);
        jSpinner11.setValue(1);
        jSpinner12.setValue(2022);        
        
        //recherche
            //si trouve afficher sinon JOp.
        GestionRV grv = new GestionRV();
        rs = grv.rechercherRV(nom);       
        
        try {
            //s'il y a qqch
            if(rs.next()) {
                dtm = new DefaultTableModel();
                dtm.addColumn("id");dtm.addColumn("date");dtm.addColumn("heure");dtm.addColumn("motif");dtm.addColumn("codeP");dtm.addColumn("prenomP");dtm.addColumn("nomP");dtm.addColumn("matricule");dtm.addColumn("prenomM");dtm.addColumn("nomM");
                jTable2.setModel(dtm);        
                rs.beforeFirst();
                try {
                    while(rs.next()) {
                        int idRV = rs.getInt("id");
                        String date = rs.getString("date");
                        String heure = rs.getString("heure");
                        String motif = rs.getString("motif");
                        int codeP = rs.getInt("codeP");
                        String prenomP = rs.getString("prenomP");
                        String nomP = rs.getString("nomP");
                        int matricule = rs.getInt("matricule");
                        String prenomM = rs.getString("prenomM");
                        String nomM = rs.getString("nomM");
                        
                        Object ob[] = {idRV, Utiles.toDisplayedDate(date), heure, motif, codeP, prenomP, nomP, matricule, prenomM, nomM};
                        dtm.addRow(ob);                       
                        
                    }
                    //activer le bouton annuler
                    jButton12.setEnabled(true);
                        
                    //desactiver les autres champs
                    desactiverChampsRV();
                } catch (SQLException ex) {
                    Logger.getLogger(AccueilMedecin.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Aucun Resultat.");
            }        
        } catch (SQLException ex) {
            Logger.getLogger(AccueilMedecin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        
        //RECHERCHE PAR DATE DE RENDEZ-VOUS
        GestionRV grv = new GestionRV();
        ResultSet rs = null;
        String chaineDate = "";
        
        //recup les donnees
        int jour = Integer.parseInt(jSpinner10.getValue().toString());
        int mois = Integer.parseInt(jSpinner11.getValue().toString());
        int annee = Integer.parseInt(jSpinner12.getValue().toString());
        
        //valider la date               
        if(Utiles.dateValide(annee, mois, jour)) {
            //si date valide
            chaineDate = Utiles.formaterDate(annee, mois, jour);
            rs = grv.rechercherDateRV(chaineDate);
            
            try {
                if(rs.next()) {
                    dtm = new DefaultTableModel();
                    dtm.addColumn("id");dtm.addColumn("date");dtm.addColumn("heure");dtm.addColumn("motif");dtm.addColumn("codeP");dtm.addColumn("prenomP");dtm.addColumn("nomP");dtm.addColumn("matricule");dtm.addColumn("prenomM");dtm.addColumn("nomM");
                    
                    jTable2.setModel(dtm);
                    
                    rs.beforeFirst();
                    while(rs.next()) {
                        //si resultats remplir le tableau avec les resultats
                        
                        //id,date,heure,motif,codeP,prenomP,nomP,matricule,prenomM,nomM
                        int id = rs.getInt("id");
                        java.sql.Date date = rs.getDate("date");
                        java.sql.Time heure = rs.getTime("heure");
                        String dateD = date.toString();
                        String heureH = heure.toString();
                        String motif = rs.getString("motif");
                        int codeP = rs.getInt("codeP");
                        String prenomP = rs.getString("prenomP");
                        String nomP = rs.getString("nomP");
                        int matricule = rs.getInt("matricule");
                        String prenomM = rs.getString("prenomM");
                        String nomM = rs.getString("nomM");
                        
                        Object ob[] = {id,Utiles.toDisplayedDateRS(dateD),Utiles.toDisplayedTimeRs(heureH),motif,codeP,prenomP,nomP,matricule,prenomM,nomM};
                        dtm.addRow(ob);
                                                
                        
                    }
                    //desactiver inputs sauf init                    
                    jTextField9.setEnabled(false);
                    jButton6.setEnabled(false);
                    jTextField13.setEnabled(false);
                    jButton8.setEnabled(false);
                    jSpinner10.setEnabled(false);
                    jSpinner11.setEnabled(false);
                    jSpinner12.setEnabled(false);
                    jButton9.setEnabled(false);
                    
                    //enable annuler
                    jButton12.setEnabled(true);
                    
                } else {
                    //si pas de resultats
                    JOptionPane.showMessageDialog(null, "Aucun resultat pour cette date");
                }
            } catch (SQLException ex) {
                Logger.getLogger(AccueilMedecin.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            //si non, JOP(date invalide)
            JOptionPane.showMessageDialog(null, "Date Invalide");            
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        //ENREGISTRER UN NOUVEAU RENDEZ-VOUS
        
        //recuperer les saisies
        int jour = (int)jSpinner13.getValue();
        int mois = (int)jSpinner14.getValue();
        int annee = (int)jSpinner15.getValue();
        Date date = new Date(annee, mois-1, jour);
        
        int heures = (int)jSpinner16.getValue();
        int minutes = (int)jSpinner17.getValue();
        Time time = new Time(heures, minutes, 0);
        
        int codeP = Integer.parseInt(jTextField17.getText());
        String motif = jTextField14.getText();
        int matricule = Integer.parseInt(jTextField18.getText());
        
        GestionRV grv = new GestionRV();
        RV rdv = new RV(date, time, codeP, motif, matricule);
        grv.ajouterRV(rdv);
        
       //reinitialiser
       jSpinner13.setValue(1);
       jSpinner14.setValue(1);
       jSpinner15.setValue(2022);
       
       jSpinner16.setValue(8);
       jSpinner17.setValue(0);
       
       jTextField14.setText("");
       jTextField17.setText("");
       jTextField18.setText("");
       
       remplirTableauRV();
       
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
        //BOUTON AJOUTER UN NOUVEAU DOSSIER MEDICAL
        
        //recuperer la saisie
        int codeP = Integer.parseInt(jTextField19.getText());
        
        GestionPatient gp = new GestionPatient();    
                
        Patient p = gp.rechercherPatient(codeP);
        //pour creer un dossier il faut que ce patient existe
        if(p == null) {
            //si le patient n'existe pas
            JOptionPane.showMessageDialog(null, "Ce patient n'existe pas");
        } else {
            // si le patient existe
            GestionDM gdm = new GestionDM();
            DossierPatient dp = gdm.afficherDossier(codeP);
            Date dateCreation = new Date();
            
            //verifier s'il a deja un dossier medical
            if(dp == null) {
                //il y a pas de dossier on peut donc en creer
                dp = new DossierPatient(codeP, dateCreation);
                gdm.ajouterDM(dp);
            } else {
                JOptionPane.showMessageDialog(null, "Ce patient a deja un dossier medical");
            }
        }
        
        //effacer la saisie
        jTextField19.setText("");
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
        //RECHERCHER DOSSIER MEDICAL PAR codePatient
        
        //recuperer codeP
        int codeP = Integer.parseInt(jTextField20.getText());
        
        GestionDM gdm = new GestionDM();
        DossierPatient dp = gdm.afficherDossier(codeP);
        
        if(dp == null) {
            //si le dossier n'existe pas
            JOptionPane.showMessageDialog(null, "Pas de Dossier correspondant a ce code patient");
            jTextField20.setText("");
        } else {
            //si le dossier existe
            GestionPatient gp = new GestionPatient();
            Patient p = gp.rechercherPatient(codeP);
            //remplir les champs
            jTextField21.setText(Integer.toString(dp.getNumDP()));
            jTextField22.setText(p.getPrenom());
            jTextField23.setText(p.getNom());
            jTextField24.setText(Integer.toString(p.getAge()));
            
            //griser les champs
            jTextField20.setEnabled(false);
            jButton14.setEnabled(false);
            
            
            //enable ajoutObs
            jButton15.setEnabled(true);
            jTextArea1.setText("");
            
            //mettre ses suivi dossier
            ResultSet rs = gdm.listerSD(dp.getNumDP());
            dtm = new DefaultTableModel();
            jTable3.setModel(dtm);            
            dtm.addColumn("id");dtm.addColumn("numDP");dtm.addColumn("Observations");dtm.addColumn("date Obs.");
            
            try {
                while(rs.next()) {
                    int id = rs.getInt("id");
                    int numDP = rs.getInt("numDP");
                    String obs = rs.getString("observation");
                    String dateObs = Utiles.toDisplayedDateRS(rs.getDate("dateObs").toString());
                    
                    Object[] ob = {id, numDP, obs, dateObs};
                    dtm.addRow(ob);
                }
            } catch (SQLException ex) {
                Logger.getLogger(AccueilSecretaire.class.getName()).log(Level.SEVERE, null, ex);
            }          
            
        }
        
        
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
        //AJOUTER OBSERVATION
        GestionDM gdm = new GestionDM();
        SuiviDossier sd = null;
        
        //recup saisie
        String obs = jTextArea1.getText();
        
        if(obs.equals("")) {
            JOptionPane.showMessageDialog(null, "Saisir une observation svp");
            
        } else {
            int numDP = Integer.parseInt(jTextField21.getText());
            Date dateObs = new Date();
            
            sd = new SuiviDossier(numDP, obs, dateObs);
            gdm.ajouterObs(sd);
         
            //mettre a jour le tableau
            ResultSet rs = gdm.listerSD(sd.getNumDP());
            dtm = new DefaultTableModel();
            jTable3.setModel(dtm);            
            dtm.addColumn("id");dtm.addColumn("numDP");dtm.addColumn("Observations");dtm.addColumn("date Obs.");
            
            try {
                while(rs.next()) {
                    int id = rs.getInt("id");
                    int nDP = rs.getInt("numDP");
                    String obsr = rs.getString("observation");
                    String dObs = Utiles.toDisplayedDateRS(rs.getDate("dateObs").toString());
                    
                    Object[] ob = {id, nDP, obsr, dObs};
                    dtm.addRow(ob);
                }
            } catch (SQLException ex) {
                Logger.getLogger(AccueilSecretaire.class.getName()).log(Level.SEVERE, null, ex);
            }          
        }
        
        //faire le menage
        jTextField20.setText("");
        jTextField21.setText("");
        jTextField22.setText("");
        jTextField23.setText("");
        jTextField24.setText("");
        jTextArea1.setText("");
        
        jTextField20.setEnabled(true);
        jButton14.setEnabled(true);
        jButton15.setEnabled(false);
        
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
        //REINITIALISER GESTION DM
        
        //vider les champs
        jTextField19.setText("");
        jTextField20.setText("");
        jTextField21.setText("");
        jTextField22.setText("");
        jTextField23.setText("");
        jTextField24.setText("");
        jTextArea1.setText("");
        
        jButton14.setEnabled(true);
        jButton15.setEnabled(false);
        
        jTable3.setModel(null);
    }//GEN-LAST:event_jButton16ActionPerformed

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
            java.util.logging.Logger.getLogger(AccueilSecretaire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AccueilSecretaire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AccueilSecretaire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AccueilSecretaire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AccueilSecretaire().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner10;
    private javax.swing.JSpinner jSpinner11;
    private javax.swing.JSpinner jSpinner12;
    private javax.swing.JSpinner jSpinner13;
    private javax.swing.JSpinner jSpinner14;
    private javax.swing.JSpinner jSpinner15;
    private javax.swing.JSpinner jSpinner16;
    private javax.swing.JSpinner jSpinner17;
    private javax.swing.JSpinner jSpinner3;
    private javax.swing.JSpinner jSpinner5;
    private javax.swing.JSpinner jSpinner6;
    private javax.swing.JSpinner jSpinner7;
    private javax.swing.JSpinner jSpinner8;
    private javax.swing.JSpinner jSpinner9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
