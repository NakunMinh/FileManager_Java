/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trangchinh;

import DoiTenFile.DoiTenFile;
import TaoFile.TaoFile;
import TaoFolder.TaoFolder;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;
import javax.swing.JList;
import net.lingala.zip4j.core.ZipFile;
import net.lingala.zip4j.exception.ZipException;

/**
 *
 * @author Minh Nhi
 */
public class NewJFrameTrangchinh extends javax.swing.JFrame {
    /**
     * Creates new form NewJFrameTrangchinh
     */
    public NewJFrameTrangchinh() {
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

        button8 = new java.awt.Button();
        panel4 = new java.awt.Panel();
        label2 = new java.awt.Label();
        panel1 = new java.awt.Panel();
        btnTaoFile = new java.awt.Button();
        btnTaoFolder = new java.awt.Button();
        btnXoa = new java.awt.Button();
        btnDoiTen = new java.awt.Button();
        btnSaoChep = new java.awt.Button();
        btnNen = new java.awt.Button();
        btnGiaiNen = new java.awt.Button();
        panel2 = new java.awt.Panel();
        panel3 = new java.awt.Panel();
        scrollPane1 = new java.awt.ScrollPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        listTrai = new javax.swing.JList<>();
        panel6 = new java.awt.Panel();
        txtTrai = new java.awt.TextField();
        btnGoTrai = new java.awt.Button();
        panel8 = new java.awt.Panel();
        txtTrai1 = new javax.swing.JTextField();

        button8.setLabel("button8");

        label2.setAlignment(java.awt.Label.CENTER);
        label2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        label2.setText("Quản lý file");

        javax.swing.GroupLayout panel4Layout = new javax.swing.GroupLayout(panel4);
        panel4.setLayout(panel4Layout);
        panel4Layout.setHorizontalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panel4Layout.setVerticalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel1.setLayout(new java.awt.GridLayout(1, 7));

        btnTaoFile.setLabel("Tạo file");
        btnTaoFile.setName("btnTaoFile"); // NOI18N
        btnTaoFile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTaoFileMouseClicked(evt);
            }
        });
        panel1.add(btnTaoFile);

        btnTaoFolder.setLabel("Tạo folder");
        btnTaoFolder.setName("btnTaoFolder"); // NOI18N
        btnTaoFolder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTaoFolderMouseClicked(evt);
            }
        });
        panel1.add(btnTaoFolder);

        btnXoa.setLabel("Xóa");
        btnXoa.setName("btnXoa"); // NOI18N
        btnXoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnXoaMouseClicked(evt);
            }
        });
        panel1.add(btnXoa);

        btnDoiTen.setLabel("Đổi tên");
        btnDoiTen.setName("btnDoiTen"); // NOI18N
        btnDoiTen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDoiTenMouseClicked(evt);
            }
        });
        panel1.add(btnDoiTen);

        btnSaoChep.setLabel("Sao chép");
        btnSaoChep.setName("btnSaoChep"); // NOI18N
        btnSaoChep.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSaoChepMouseClicked(evt);
            }
        });
        panel1.add(btnSaoChep);

        btnNen.setLabel("Nén");
        btnNen.setName("btnNen"); // NOI18N
        btnNen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNenMouseClicked(evt);
            }
        });
        panel1.add(btnNen);

        btnGiaiNen.setLabel("Giải nén");
        btnGiaiNen.setName("btnGiaiNen"); // NOI18N
        btnGiaiNen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGiaiNenMouseClicked(evt);
            }
        });
        panel1.add(btnGiaiNen);

        panel2.setLayout(new java.awt.GridLayout(1, 2));

        panel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        listTrai.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listTrai.setName("listTrai"); // NOI18N
        listTrai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listTraiMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(listTrai);

        scrollPane1.add(jScrollPane3);

        panel6.setLayout(new java.awt.GridLayout(1, 2));

        txtTrai.setText("E:\\\\");
            panel6.add(txtTrai);

            btnGoTrai.setLabel("Go");
            btnGoTrai.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    btnGoTraiMouseClicked(evt);
                }
            });
            panel6.add(btnGoTrai);

            panel8.setLayout(new java.awt.GridLayout(1, 2));

            txtTrai1.setText("E:\\\\");
                panel8.add(txtTrai1);

                javax.swing.GroupLayout panel3Layout = new javax.swing.GroupLayout(panel3);
                panel3.setLayout(panel3Layout);
                panel3Layout.setHorizontalGroup(
                    panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(scrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panel6, javax.swing.GroupLayout.DEFAULT_SIZE, 487, Short.MAX_VALUE)
                            .addComponent(panel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                );
                panel3Layout.setVerticalGroup(
                    panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addComponent(panel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(scrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE))
                );

                panel2.add(panel3);

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                );
                layout.setVerticalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );

                pack();
            }// </editor-fold>//GEN-END:initComponents

    private void listTraiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listTraiMouseClicked
        // TODO add your handling code here:
        JList thelist = (JList)evt.getSource();
        if (evt.getClickCount() == 1) {
            int index = thelist.locationToIndex(evt.getPoint());
            if (index >= 0) {
                Object o = thelist.getModel().getElementAt(index);
                txtTrai1.setText(txtTrai.getText() + o.toString());
            //System.out.println("Clicked on: " + o.toString());
            }
        }
        if (evt.getClickCount() == 2){
            int index = thelist.locationToIndex(evt.getPoint());
            if (index >= 0){
                File dir = new File(txtTrai1.getText() + "\\");
                String[] children = dir.list();
                if (children == null) {
                    System.out.println( "Either dir does not exist or is not a directory");
                }
                else {
                    listTrai.setListData(children);
                    txtTrai.setText(txtTrai1.getText() + "\\");
                }       
            }
        }
    }//GEN-LAST:event_listTraiMouseClicked

    //nut Go ben Trai
    private void btnGoTraiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGoTraiMouseClicked
        // TODO add your handling code here:
        //lay danh sach thu muc + file trong txtTrai
        //Dua vao listTrai
        File dir = new File(txtTrai.getText());
        String[] children = dir.list();
        if (children == null) {
            System.out.println( "Either dir does not exist or is not a directory");
        }
	else {
            //for (int i=0; i< children.length; i++) {
                //String filename = children[i];
                //System.out.println(filename);
            //}
            listTrai.setListData(children);
        }
    }//GEN-LAST:event_btnGoTraiMouseClicked
    //nut Tao File
    private void btnTaoFileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTaoFileMouseClicked
        // TODO add your handling code here:
        TaoFile t = new TaoFile(txtTrai.getText());
        t.setVisible(true);
    }//GEN-LAST:event_btnTaoFileMouseClicked

    private void btnTaoFolderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTaoFolderMouseClicked
        // TODO add your handling code here:
        TaoFolder f = new TaoFolder(txtTrai.getText());
        f.setVisible(true);
    }//GEN-LAST:event_btnTaoFolderMouseClicked

    private static void XoaThuMuc(File file) throws IOException {
        if (file.isDirectory()) {
            // directory is empty, then delete it
            if (file.list().length == 0) {
                file.delete();
                System.out.println("Directoryeleted : "
                        + file.getAbsolutePath());
            } else {
                // list all the directory contents
                String files[] = file.list();
                for (String temp : files) {
                    // construct the file structure
                    File fileDelete = new File(file, temp);
                    // recursive delete
                    XoaThuMuc(fileDelete);
                }
                // check the directory again, if empty then delete it
                if (file.list().length == 0) {
                    file.delete();
                    System.out.println("Directoryeleted : "
                            + file.getAbsolutePath());
                }
            }
        } else {
            // if file, then delete it
            file.delete();
            System.out.println("Fileeleted : " + file.getAbsolutePath());
        }
    }
    
    private void btnXoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXoaMouseClicked
        // TODO add your handling code here:
        File file = new File(txtTrai1.getText());
        if (file.isFile()){
            file.delete();
        }
        if (file.isDirectory()){
            try {
                XoaThuMuc(file);
            } catch (IOException ex) {
                Logger.getLogger(NewJFrameTrangchinh.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnXoaMouseClicked

    private void btnNenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNenMouseClicked
        // TODO add your handling code here:
        File file = new File(txtTrai1.getText());
        if (file.isFile()){
            byte[] buffer = new byte[1024];
            try{
                FileOutputStream fos = new FileOutputStream(txtTrai.getText() + "\\default.zip");
                ZipOutputStream zos = new ZipOutputStream(fos);
                ZipEntry ze = new ZipEntry(txtTrai1.getText());
                zos.putNextEntry(ze);
                FileInputStream in = new FileInputStream(txtTrai1.getText());
                int len;
                while ((len = in.read(buffer)) > 0) {
                    zos.write(buffer, 0, len);
                }
                in.close();
                zos.closeEntry();
                zos.close();
                System.out.println("Done");
            }catch(IOException e){
                e.printStackTrace();
            }
        }
        if (file.isDirectory()){
            String zipFile = txtTrai.getText() + "default.zip";
            String srcDir = txtTrai1.getText();
            try{
                byte[] buffer = new byte[1024];
                FileOutputStream fos = new FileOutputStream(zipFile);
                ZipOutputStream zos = new ZipOutputStream(fos);
                File dir = new File(srcDir);
                File[] files = dir.listFiles();
                for (int i = 0; i < files.length; i++) {
                    System.out.println("Adding file: " + files[i].getName());
                    FileInputStream fis = new FileInputStream(files[i]);
                    zos.putNextEntry(new ZipEntry(files[i].getName()));
                    int length;
                    while ((length = fis.read(buffer)) > 0) {
                        zos.write(buffer, 0, length);
                    }
                    zos.closeEntry();
                    fis.close();
                }
                zos.close();
                
            }catch(IOException ioe){
                System.out.println("Error creating zip file" + ioe);

            }
        }
    }//GEN-LAST:event_btnNenMouseClicked

    private void btnGiaiNenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGiaiNenMouseClicked
        try {
            // TODO add your handling code here:
            ZipFile zFile = new ZipFile(txtTrai1.getText());
            zFile.extractAll(txtTrai.getText() + "thu muc giai nen");
        } catch (ZipException ex) {
            Logger.getLogger(NewJFrameTrangchinh.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnGiaiNenMouseClicked

    private void btnDoiTenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDoiTenMouseClicked
        // TODO add your handling code here:
        DoiTenFile f = new DoiTenFile(txtTrai1.getText(), txtTrai.getText());
        f.setVisible(true);
    }//GEN-LAST:event_btnDoiTenMouseClicked

    private void btnSaoChepMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaoChepMouseClicked
        // TODO add your handling code here:
        File file = new File(txtTrai1.getText());
        if (file.isFile()){
            InputStream inStream = null;
            OutputStream outStream = null;
            try{
                File rootfile =new File(txtTrai1.getText());
                File copyfile =new File(txtTrai.getText() + "Copy.txt");

                inStream = new FileInputStream(rootfile);
                outStream = new FileOutputStream(copyfile);

                byte[] buffer = new byte[1024];

                int length;
                // Copy the file content in bytes.
                // Sao chep nội dung tập tin dưới dạng bytes.
                while ((length = inStream.read(buffer)) > 0){
                    outStream.write(buffer, 0, length);
                }

                inStream.close();
                outStream.close();

                System.out.println("File copy is successful!");

            }catch(IOException e){
                e.printStackTrace();
            }
        }
        if (file.isDirectory()){
            File srcFolder = new File(txtTrai1.getText());
            File destFolder = new File(txtTrai.getText() + "Copy");
            // make sure source exists
            if (!srcFolder.exists()) {
                System.out.println("Directory not exist.");
                System.exit(0);
            } else {
                try {
                    copyFolder(srcFolder, destFolder);
                } catch (IOException e) {
                    e.printStackTrace();
                    System.exit(0);
                }
            }
        }
    }//GEN-LAST:event_btnSaoChepMouseClicked

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
            java.util.logging.Logger.getLogger(NewJFrameTrangchinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrameTrangchinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrameTrangchinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrameTrangchinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrameTrangchinh().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button btnDoiTen;
    private java.awt.Button btnGiaiNen;
    private java.awt.Button btnGoTrai;
    private java.awt.Button btnNen;
    private java.awt.Button btnSaoChep;
    private java.awt.Button btnTaoFile;
    private java.awt.Button btnTaoFolder;
    private java.awt.Button btnXoa;
    private java.awt.Button button8;
    private javax.swing.JScrollPane jScrollPane3;
    private java.awt.Label label2;
    private javax.swing.JList<String> listTrai;
    private java.awt.Panel panel1;
    private java.awt.Panel panel2;
    private java.awt.Panel panel3;
    private java.awt.Panel panel4;
    private java.awt.Panel panel6;
    private java.awt.Panel panel8;
    private java.awt.ScrollPane scrollPane1;
    private java.awt.TextField txtTrai;
    private javax.swing.JTextField txtTrai1;
    // End of variables declaration//GEN-END:variables


    private void copyFolder(File src, File dest) throws FileNotFoundException, IOException {
        if (src.isDirectory()) {
            // if directory not exists, create it
            if (!dest.exists()) {
                dest.mkdir();
                System.out.println("Directoryed from " + src + " to " + dest);
                // list all the directory contents
                String files[] = src.list();
                for (String file : files) {
                    // construct the src and dest file structure
                    File srcFile = new File(src, file);
                    File destFile = new File(dest, file);
                    // recursive copy
                    copyFolder(srcFile, destFile);
                }
            }
        } else {
            // if file, then copy it
            // Use bytes stream to support all file types
            InputStream in = new FileInputStream(src);
            OutputStream out = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int length;
            // copy the file content in bytes
            while ((length = in.read(buffer)) > 0) {
                out.write(buffer, 0, length);
            }
            in.close();
            out.close();
            System.out.println("Fileed from " + src + " to " + dest);
        }
    }
}
