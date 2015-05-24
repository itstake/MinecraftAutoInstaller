/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tk.itstake.minecraftmodautoinstaller;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Toolkit;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JScrollBar;

/**
 *
 * @author itstake
 */
public class EndDialog extends javax.swing.JFrame {

    /**
     * Creates new form EndDialog
     */
    Properties settings = new Properties();
    public static Font font;
    ColoredComponents cc = new ColoredComponents();
    Color colorCom = cc.getComponentColor();
    String installCom = null;
    Toolkit tk = Toolkit.getDefaultToolkit();
    Dimension screenSize = tk.getScreenSize();
    Dimension panelSize = this.getSize();
    private final ImageIcon wicon = new ImageIcon(getClass().getResource("/img/logoback.png"));
    public EndDialog() throws FontFormatException, IOException {
        SettingHandling sh = new SettingHandling();
        settings = sh.getSettingFile();
        installCom = new String(settings.getProperty("installcom").getBytes("ISO-8859-1"), "UTF-8");
        EndDialog.font = Font.createFont(Font.TRUETYPE_FONT, this.getClass().getResourceAsStream("/fonts/NanumBarunGothic.ttf")).deriveFont(Font.PLAIN, 0);
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
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("완료!");
        setIconImage(wicon.getImage());
        setLocation(screenSize.width/2-174,screenSize.height/2-90);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(font.deriveFont(Font.PLAIN, 24));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("설치가 완료되었습니다!");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 0, 330, 40);

        jButton1.setBackground(colorCom);
        jButton1.setFont(font.deriveFont(Font.PLAIN, 14));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("종료");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(130, 120, 90, 30);

        jLabel2.setFont(font.deriveFont(Font.PLAIN, 12));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("MMAI v1.0 by ITSTAKE, itstake.tk");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(120, 150, 210, 15);

        jPanel2.setBackground(colorCom);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 350, 40);

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(font.deriveFont(Font.PLAIN, 14));
        jTextArea1.setRows(5);
        jTextArea1.setText(installCom);
        jTextArea1.setBorder(null);
        jScrollPane1.setViewportView(jTextArea1);
        JScrollBar vertical = jScrollPane1.getVerticalScrollBar();
        vertical.setPreferredSize( new Dimension(0,0) );

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(20, 60, 310, 60);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(!settings.getProperty("endlink").equals("")) {
            openURL(settings.getProperty("endlink"));
        }
        openURL("http://itstake.tk/mmai");
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main() {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EndDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EndDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EndDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EndDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new EndDialog().setVisible(true);
                } catch (FontFormatException ex) {
                    Logger.getLogger(EndDialog.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(EndDialog.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    
    private static final String errMsg = "Error attempting to launch web browser";

   public static void openURL(String url) {
      String osName = System.getProperty("os.name");
      try {
         if (osName.startsWith("Mac OS")) {
            Class fileMgr = Class.forName("com.apple.eio.FileManager");
            Method openURL = fileMgr.getDeclaredMethod("openURL",
               new Class[] {String.class});
            openURL.invoke(null, new Object[] {url});
            }
         else if (osName.startsWith("Windows"))
            Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + url);
         else { //assume Unix or Linux
            String[] browsers = {
               "firefox", "opera", "konqueror", "epiphany", "mozilla", "netscape" };
            String browser = null;
            for (int count = 0; count < browsers.length && browser == null; count++)
               if (Runtime.getRuntime().exec(
                     new String[] {"which", browsers[count]}).waitFor() == 0)
                  browser = browsers[count];
            if (browser == null)
               throw new Exception("웹 브라우저를 찾을 수 없음");
            else
               Runtime.getRuntime().exec(new String[] {browser, url});
            }
         }
      catch (Exception e) {
         JOptionPane.showMessageDialog(null, errMsg + ":\n" + e.getLocalizedMessage());
         }
      }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
