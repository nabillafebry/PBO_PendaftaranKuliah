/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daftar_kuliah;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Nabilla Febry
 */
public class frame_pendaftaran extends javax.swing.JFrame {

    /**
     * Creates new form frame_pendaftaran
     */
    public frame_pendaftaran() {
        initComponents();
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
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtno = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtnama = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtjenkel = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txttempat = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tgldaftar = new com.toedter.calendar.JDateChooser();
        tgllahir = new com.toedter.calendar.JDateChooser();
        txttelp = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtagama = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtalamat = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtjurusan = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblData = new javax.swing.JTable();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(203, 224, 203));
        jPanel1.setLayout(null);

        jLabel9.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel9.setText("FORM PENDAFTARAN KULIAH");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(300, 20, 300, 20);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 10, 890, 60);

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("No. Pendaftaran");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(10, 11, 140, 14);
        jPanel2.add(txtno);
        txtno.setBounds(10, 30, 150, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Nama Pendaftar");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(10, 70, 130, 14);
        jPanel2.add(txtnama);
        txtnama.setBounds(10, 90, 150, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Jenis Kelamin");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(10, 130, 140, 14);
        jPanel2.add(txtjenkel);
        txtjenkel.setBounds(10, 150, 150, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Tempat Lahir");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(10, 190, 120, 14);
        jPanel2.add(txttempat);
        txttempat.setBounds(10, 210, 150, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Tanggal Lahir");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(10, 250, 120, 14);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Tanggal Daftar");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(10, 370, 120, 14);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Jurusan yang dipilih");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(10, 430, 120, 14);
        jPanel2.add(tgldaftar);
        tgldaftar.setBounds(10, 390, 150, 30);
        jPanel2.add(tgllahir);
        tgllahir.setBounds(10, 270, 150, 30);
        jPanel2.add(txttelp);
        txttelp.setBounds(10, 630, 150, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("No. Telepon");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(10, 610, 120, 14);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Agama");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(10, 310, 120, 14);
        jPanel2.add(txtagama);
        txtagama.setBounds(10, 330, 150, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("Alamat");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(10, 490, 120, 14);
        jPanel2.add(txtalamat);
        txtalamat.setBounds(10, 510, 150, 30);
        jPanel2.add(txtemail);
        txtemail.setBounds(10, 570, 150, 30);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("Email");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(10, 550, 120, 14);

        txtjurusan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtjurusanActionPerformed(evt);
            }
        });
        jPanel2.add(txtjurusan);
        txtjurusan.setBounds(10, 450, 150, 30);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(10, 80, 280, 680);

        jPanel3.setBackground(new java.awt.Color(121, 193, 173));
        jPanel3.setLayout(null);

        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1);
        jButton1.setBounds(20, 10, 80, 23);

        jButton3.setText("Clear");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3);
        jButton3.setBounds(140, 10, 80, 23);

        jButton2.setText("Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2);
        jButton2.setBounds(260, 10, 80, 23);

        jButton6.setText("Print");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton6);
        jButton6.setBounds(380, 10, 80, 23);

        jButton5.setText("Refresh");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton5);
        jButton5.setBounds(500, 10, 80, 23);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(300, 80, 600, 40);

        jPanel4.setBackground(new java.awt.Color(204, 255, 204));
        jPanel4.setLayout(null);

        tblData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "nopendaftaran", "nama", "jenkel", "tempatlahir", "tgllahir", "agama", "tgldaftar", "jurusan", "alamat", "email", "telepon"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblData);

        jPanel4.add(jScrollPane1);
        jScrollPane1.setBounds(10, 10, 580, 350);

        jButton7.setText("EXIT");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton7);
        jButton7.setBounds(210, 380, 200, 40);

        getContentPane().add(jPanel4);
        jPanel4.setBounds(300, 130, 600, 630);

        setSize(new java.awt.Dimension(926, 814));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String daftar = dateFormat.format(tgllahir.getDate());
        String lahir = dateFormat.format(tgldaftar.getDate());

        if (txtno.getText().equals("") ||
            txtnama.getText().equals("") ||
            txtjenkel.getText().equals("") ||
            txttempat.getText().equals("") ||
            txtagama.getText().equals("") ||
            txtjurusan.getText().equals("") ||
            txtalamat.getText().equals("") ||
            txtemail.getText().equals("") ||
            txttelp.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this, "Harap Lengkapi Data", "Error", JOptionPane.WARNING_MESSAGE);
        }

        else
        {
            String SQL = "INSERT INTO tb_pendaftar VALUES ('"+txtno.getText()
            +"', '"+txtnama.getText()
            +"', '"+txtjenkel.getText()
            +"', '"+txttempat.getText()
            +"', '"+lahir
            +"', '"+txtagama.getText()
            +"', '"+daftar
            +"', '"+txtjurusan.getText()
            +"', '"+txtalamat.getText()
            +"', '"+txtemail.getText()
            +"', '"+txttelp.getText();

            int status = KoneksiDB.execute(SQL);

            if (status == 1)
            {
                JOptionPane.showMessageDialog(this, "Data berhasil ditambahkan", "Sukses", JOptionPane.INFORMATION_MESSAGE);
                selectData();
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Data gagal ditambahkan", "Sukses", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        txtno.setText("");
        txtnama.setText("");
        txtjenkel.setText("");
        txttempat.setText("");
        tgllahir.setDate(null);
        txtagama.setText("");
        tgldaftar.setDate(null);
        txtjurusan.setText("");
        txtemail .setText("");
        txtalamat.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int baris = tblData.getSelectedRow();

        if (baris != -1)
        {
            String nodaftar = tblData.getValueAt(baris, 1).toString();
            String SQL = "DELETE FROM tb_pendaftar WHERE no_pendaftar='"+nodaftar+"'";
            int status = KoneksiDB.execute(SQL);
            if (status==1)
            {
                JOptionPane.showMessageDialog(this, "Data berhasil dihapus", "Sukses", JOptionPane.INFORMATION_MESSAGE);
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Data gagal dihapus", "Gagal", JOptionPane.WARNING_MESSAGE);
            }
        }

        else
        {
            JOptionPane.showMessageDialog(this, "Pilih Baris Data Terlebih Dahulu", "Error", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        MessageFormat header = new MessageFormat("Pendaftaran Kuliah");
        MessageFormat footer = new MessageFormat("Page {0,number,integer}");

        try
        {
            tblData.print(JTable.PrintMode.FIT_WIDTH, header, footer, true, null, true, null);
        }
        catch (java.awt.print.PrinterException e)
        {
            System.err.format("Cannot Print %s%n", e.getMessage());
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        selectData();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void tblDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDataMouseClicked

    }//GEN-LAST:event_tblDataMouseClicked

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void txtjurusanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtjurusanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtjurusanActionPerformed

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
            java.util.logging.Logger.getLogger(frame_pendaftaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frame_pendaftaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frame_pendaftaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frame_pendaftaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frame_pendaftaran().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblData;
    private com.toedter.calendar.JDateChooser tgldaftar;
    private com.toedter.calendar.JDateChooser tgllahir;
    private javax.swing.JTextField txtagama;
    private javax.swing.JTextField txtalamat;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtjenkel;
    private javax.swing.JTextField txtjurusan;
    private javax.swing.JTextField txtnama;
    private javax.swing.JTextField txtno;
    private javax.swing.JTextField txttelp;
    private javax.swing.JTextField txttempat;
    // End of variables declaration//GEN-END:variables

    private void selectData() {
        String kolom[] = {"nopendaftar","nama","jenkel","tempatlahir","tgllahir","agama","tgldaftar", "jurusan", "alamat", "email", "telepon"};
        DefaultTableModel dtm = new DefaultTableModel(null, kolom);
        String SQL = "SELECT * FROM tb_pendaftar";
        ResultSet rs = KoneksiDB.executeQuery(SQL);
        try
        {
            while(rs.next())
            {
                String namapetugas = rs.getString(1);
                String noresi = rs.getString(2);
                String nopolisi = rs.getString(3);
                String jeniskendaraan = rs.getString(4);
                String tanggalmasuk = rs.getString(5);
                String tanggalkeluar = rs.getString(6);
                String jumlahhari = rs.getString(7);
                String harga = rs.getString(8);
                String data[] = {namapetugas, noresi, nopolisi, jeniskendaraan, tanggalmasuk, tanggalkeluar, jumlahhari, harga};
                dtm.addRow(data);
            }
        }
        catch (SQLException ex)
        {
            Logger.getLogger(frame_pendaftaran.class.getName()).log(Level.SEVERE, null, ex);
        }
        tblData.setModel(dtm);
    }
}
