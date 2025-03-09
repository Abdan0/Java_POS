/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package main;
import java.sql.DriverManager;
import com.mysql.cj.jdbc.Driver;
import com.mysql.cj.xdevapi.Statement;
import config.Koneksi;
import java.awt.Desktop;
import java.io.File;
import java.io.InputStream;
import java.net.URI;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;
import static java.util.Objects.hash;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.Document;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Wahyu
 */
public class laporan extends javax.swing.JPanel {

    /**
     * Creates new form laporan
     */
    private Connection conn;
    private Object parameter;
    public laporan() {
        initComponents();
        conn = Koneksi.getConnection();
        JasperReport JasRep;
        JasperPrint JasPri;
        Map param = new HashMap();
        JasperDesign JasDes;
        getData();
    }
    
    private void getData() {
        DefaultTableModel model1barangmasuk = (DefaultTableModel) tb_lprbrgmsk.getModel();
        model1barangmasuk.setRowCount(0);
        
        
        try{
            String sql = "Select * From tbl_barangmasuk";
            PreparedStatement st = conn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            
            while(rs.next()){
                String no_msk = rs.getString("no_masuk");
                String tgl_msk = rs.getString("tgl_masuk");
                String id_diss = rs.getString("id_distributor");
                String id_uss = rs.getString("id_pengguna");
                
                
                
                Object[] rowData = {no_msk, tgl_msk, id_diss, id_uss};
                model1barangmasuk.addRow(rowData);
            }
            
            rs.close();
            st.close();
            
        } catch (Exception e){
            Logger.getLogger(brngmsk.class.getName()).log(Level.SEVERE, null, e);
        }
        
        DefaultTableModel model2barangkeluar = (DefaultTableModel) tb_lprbrgklr.getModel();
         model2barangkeluar.setRowCount(0);
        try{
            String sql = "Select * From tbl_barangkeluar";
            PreparedStatement st = conn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            
            while(rs.next()){
                String no_klr = rs.getString("no_keluar");
                String tgl_klr = rs.getString("tgl_keluar");
                String ttl_klr = rs.getString("total_keluar");
                String id_uss= rs.getString("id_pengguna");
               
                Object[] rowData = {no_klr, tgl_klr, ttl_klr, id_uss};
                model2barangkeluar.addRow(rowData);
            }
            
            rs.close();
            st.close();
            
        } catch (Exception e){
            Logger.getLogger(brngklr.class.getName()).log(Level.SEVERE, null, e);
        }
        
        DefaultTableModel model3lpr_transaksi = (DefaultTableModel) tb_lprtransaksi.getModel();
        model3lpr_transaksi.setRowCount(0);
        
        try{
            String sql = "Select * From transaksi";
            PreparedStatement st = conn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            
            while(rs.next()){
                String pesan = rs.getString("no_pesan");
                String tgl = rs.getString("tanggal");
                String id_dis = rs.getString("id_distributor");
                String nama_dis = rs.getString("nama_distributor");
                String kd_brg = rs.getString("kode_barang");
                String nama_brg = rs.getString("nama_barang");
                String hrg = rs.getString("harga");
                String jumlah = rs.getString("jumlah");
                String sub = rs.getString("sub_total");
                
                
                
                Object[] rowData = {pesan, tgl, id_dis, nama_dis, kd_brg, nama_brg, hrg, jumlah, sub};
                model3lpr_transaksi.addRow(rowData);
            }
            
            rs.close();
            st.close();
            
        } catch (Exception e){
            Logger.getLogger(laporan.class.getName()).log(Level.SEVERE, null, e);
        }

    }
    
     

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tab_brgmsk = new javax.swing.JTabbedPane();
        lprbrgmsk = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_lprbrgmsk = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btn_ctklprmsk = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        lprbrgklr = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btn_ctklprklr = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb_lprbrgklr = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btn_ctktransaksi = new javax.swing.JButton();
        btn_cancel = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tb_lprtransaksi = new javax.swing.JTable();

        jPanel1.setLayout(new java.awt.CardLayout());

        tb_lprbrgmsk.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "No_Masuk", "Kode_Barang", "Jumlah_Masuk", "Subtotal"
            }
        ));
        jScrollPane1.setViewportView(tb_lprbrgmsk);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("LAPORAN BARANG MASUK");

        btn_ctklprmsk.setText("CETAK");
        btn_ctklprmsk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ctklprmskActionPerformed(evt);
            }
        });

        jButton2.setText("CANCEL");

        javax.swing.GroupLayout lprbrgmskLayout = new javax.swing.GroupLayout(lprbrgmsk);
        lprbrgmsk.setLayout(lprbrgmskLayout);
        lprbrgmskLayout.setHorizontalGroup(
            lprbrgmskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lprbrgmskLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(lprbrgmskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1034, Short.MAX_VALUE)
                    .addGroup(lprbrgmskLayout.createSequentialGroup()
                        .addGroup(lprbrgmskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(lprbrgmskLayout.createSequentialGroup()
                                .addComponent(btn_ctklprmsk)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton2)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        lprbrgmskLayout.setVerticalGroup(
            lprbrgmskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lprbrgmskLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(lprbrgmskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_ctklprmsk)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
                .addContainerGap())
        );

        tab_brgmsk.addTab("LAPORAN BARANG MASUK", lprbrgmsk);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("LAPORAN BARANG KELUAR");

        btn_ctklprklr.setText("CETAK");
        btn_ctklprklr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ctklprklrActionPerformed(evt);
            }
        });

        jButton4.setText("CANCEL");

        tb_lprbrgklr.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nomor Keluar", "Tanggal Keluar", "Total Keluar", "Id Pengguna"
            }
        ));
        jScrollPane2.setViewportView(tb_lprbrgklr);

        javax.swing.GroupLayout lprbrgklrLayout = new javax.swing.GroupLayout(lprbrgklr);
        lprbrgklr.setLayout(lprbrgklrLayout);
        lprbrgklrLayout.setHorizontalGroup(
            lprbrgklrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lprbrgklrLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(lprbrgklrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1034, Short.MAX_VALUE)
                    .addGroup(lprbrgklrLayout.createSequentialGroup()
                        .addGroup(lprbrgklrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(lprbrgklrLayout.createSequentialGroup()
                                .addComponent(btn_ctklprklr)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton4)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        lprbrgklrLayout.setVerticalGroup(
            lprbrgklrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lprbrgklrLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(lprbrgklrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_ctklprklr)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
                .addContainerGap())
        );

        tab_brgmsk.addTab("LAPORAN BARANG KELUAR", lprbrgklr);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setText("LAPORAN TRANSAKSI");

        btn_ctktransaksi.setText("CETAK");

        btn_cancel.setText("CANCEL");

        tb_lprtransaksi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nomer_Pesan", "Tanggal", "Id_Distributor", "Nama_Distributor", "Kode_Barang", "Nama_Barang", "Harga", "Jumlah", "Sub_Total"
            }
        ));
        jScrollPane3.setViewportView(tb_lprtransaksi);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1034, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(btn_ctktransaksi)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_cancel))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_ctktransaksi)
                    .addComponent(btn_cancel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
                .addContainerGap())
        );

        tab_brgmsk.addTab("LAPORAN TRANSAKSI", jPanel4);

        jPanel1.add(tab_brgmsk, "card2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ctklprmskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ctklprmskActionPerformed
     
    }//GEN-LAST:event_btn_ctklprmskActionPerformed

    private void btn_ctklprklrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ctklprklrActionPerformed
        // TODO add your handling code here:
        try {
            File namafile = new File("src/Laporan/laporan_barangkeluar.jrxml");
            JasperPrint jp = JasperFillManager.fillReport(namafile.getPath(), null, Koneksi.getConnection());
            JasperViewer.viewReport(jp, false);
        } catch (JRException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btn_ctklprklrActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancel;
    private javax.swing.JButton btn_ctklprklr;
    private javax.swing.JButton btn_ctklprmsk;
    private javax.swing.JButton btn_ctktransaksi;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel lprbrgklr;
    private javax.swing.JPanel lprbrgmsk;
    private javax.swing.JTabbedPane tab_brgmsk;
    private javax.swing.JTable tb_lprbrgklr;
    private javax.swing.JTable tb_lprbrgmsk;
    private javax.swing.JTable tb_lprtransaksi;
    // End of variables declaration//GEN-END:variables


}
