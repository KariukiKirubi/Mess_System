/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mess_system;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Shazka Systems
 */
public class view_complain extends javax.swing.JInternalFrame {
              int tymrun;
        
         Connection conn = null;
       PreparedStatement pst =  null;
       ResultSet rs = null;
    /**
     * Creates new form view_complain
     */
    public view_complain() {
        initComponents();
        time();
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
        jLabel2 = new javax.swing.JLabel();
        jTreg = new javax.swing.JTextField();
        jTsubject = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTcomplainNo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTname = new javax.swing.JTextField();
        jTemail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTtime = new javax.swing.JTextField();
        jTdate = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        Clock = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTsearch1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setTitle("View Complains Of the Students");
        setToolTipText("Powered by shazka systems");

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("LcdD", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 0));
        jLabel1.setText("Enter Reg No");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 20, 113, 28);

        jLabel2.setFont(new java.awt.Font("LcdD", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 0));
        jLabel2.setText("Enter Subject");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 80, 113, 28);

        jTreg.setFont(new java.awt.Font("Lucida Calligraphy", 0, 12)); // NOI18N
        jTreg.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTreg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTregKeyReleased(evt);
            }
        });
        jPanel1.add(jTreg);
        jTreg.setBounds(150, 30, 171, 30);

        jTsubject.setFont(new java.awt.Font("Lucida Calligraphy", 0, 12)); // NOI18N
        jTsubject.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(jTsubject);
        jTsubject.setBounds(150, 80, 171, 30);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(370, 110, 420, 280);

        jLabel3.setFont(new java.awt.Font("LcdD", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 0, 153));
        jLabel3.setText("Message");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(490, 60, 154, 44);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/details/close_16.png"))); // NOI18N
        jButton1.setText("Clear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(630, 420, 99, 32);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/details/Success.png"))); // NOI18N
        jButton2.setText("Send ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(380, 420, 122, 30);

        jTcomplainNo.setFont(new java.awt.Font("Lucida Calligraphy", 0, 12)); // NOI18N
        jTcomplainNo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(jTcomplainNo);
        jTcomplainNo.setBounds(150, 140, 171, 30);

        jLabel4.setFont(new java.awt.Font("LcdD", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 204, 0));
        jLabel4.setText("Complain Number");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 140, 122, 28);

        jTname.setFont(new java.awt.Font("Lucida Calligraphy", 0, 12)); // NOI18N
        jTname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(jTname);
        jTname.setBounds(390, 30, 200, 40);

        jTemail.setFont(new java.awt.Font("Lucida Calligraphy", 0, 12)); // NOI18N
        jTemail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(jTemail);
        jTemail.setBounds(600, 30, 210, 40);

        jLabel5.setFont(new java.awt.Font("LcdD", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 204, 0));
        jLabel5.setText("Time");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(20, 260, 113, 28);

        jLabel6.setFont(new java.awt.Font("LcdD", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 204, 0));
        jLabel6.setText("Date");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(20, 200, 113, 28);

        jTtime.setFont(new java.awt.Font("Lucida Calligraphy", 0, 12)); // NOI18N
        jTtime.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(jTtime);
        jTtime.setBounds(150, 260, 171, 30);

        jTdate.setFont(new java.awt.Font("Lucida Calligraphy", 0, 12)); // NOI18N
        jTdate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(jTdate);
        jTdate.setBounds(150, 210, 171, 30);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/details/41-Clock-icon.png"))); // NOI18N
        jPanel1.add(jLabel13);
        jLabel13.setBounds(10, 410, 50, 48);

        Clock.setFont(new java.awt.Font("LcdD", 1, 36)); // NOI18N
        Clock.setForeground(new java.awt.Color(204, 0, 204));
        Clock.setText("time");
        jPanel1.add(Clock);
        Clock.setBounds(100, 410, 230, 48);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/shaz.png"))); // NOI18N
        jPanel1.add(jLabel8);
        jLabel8.setBounds(10, 0, 820, 410);

        jTsearch1.setFont(new java.awt.Font("LBC Cool 2", 0, 14)); // NOI18N
        jTsearch1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTsearch1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTsearch1KeyReleased(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/2.png"))); // NOI18N
        jLabel7.setToolTipText("Enter Student registration number");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 837, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(320, 320, 320)
                                .addComponent(jLabel7))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(329, 329, 329)
                                .addComponent(jTsearch1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jTsearch1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTregKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTregKeyReleased
       
    }//GEN-LAST:event_jTregKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        clear();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        send();

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTsearch1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTsearch1KeyReleased
        search();
        //image_return();
    }//GEN-LAST:event_jTsearch1KeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Clock;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTcomplainNo;
    private javax.swing.JTextField jTdate;
    private javax.swing.JTextField jTemail;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTname;
    private javax.swing.JTextField jTreg;
    private javax.swing.JTextField jTsearch1;
    private javax.swing.JTextField jTsubject;
    private javax.swing.JTextField jTtime;
    // End of variables declaration//GEN-END:variables
        
           public void time(){
           
        new Thread (){
        public void run(){
        while (tymrun==0){
            Calendar kk=new GregorianCalendar ();
            int hour=kk.get(Calendar.HOUR);
            int min=kk.get(Calendar.MINUTE);
            int sec=kk.get(Calendar.SECOND);
            int AM_PM=kk.get(Calendar.AM_PM);
            int macro=kk.get(Calendar.MILLISECOND);
            int month=kk.get(Calendar.MONTH);
            int year=kk.get(Calendar.YEAR);
            String dert,karis;
            if(AM_PM==0){
            dert="AM";
            }
            else 
                dert="PM";
            if(hour<10){
            karis="0"+hour+":"+min+":"+sec+":"+dert;
            }else
                if(min<10){
            karis=hour+":"+"0"+min+":"+sec+":"+dert;
            }else
                    if(sec<10){
            karis=hour+":"+min+":"+"0"+sec+":"+dert;
            }else
              if(hour==0){
            karis="12"+":"+min+":"+sec+":"+dert;
            }
            else
            karis=hour+":"+min+":"+sec+":"+dert;
            Clock.setText(karis);
            
              }
        }
        
        }.start();
        GregorianCalendar kk=new GregorianCalendar();
        DateFormat karis= DateFormat.getDateInstance();
        java.util.Date java=kk.getTime();
        String s=karis.format(java);
       jTdate.setText(s);
       
       String time=Clock.getText();
        jTtime.setText(time);
        } 

    void setLocationRelativeTo(MainFrame aThis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void send(){
        
        if(jTreg.getText().equals("")){
        JOptionPane.showMessageDialog(rootPane, "Enter Registration Number", "Invalid Credentials", JOptionPane.ERROR_MESSAGE);
        }else 
         if(jTsubject.getText().equals("")){
        JOptionPane.showMessageDialog(rootPane, "Enter the Subject of the Message", "Invalid Credentials", JOptionPane.ERROR_MESSAGE);
        }  else
          if(jTextArea1.getText().equals("")){
        JOptionPane.showMessageDialog(rootPane, "Enter the Message", "Invalid Credentials", JOptionPane.ERROR_MESSAGE);
        }   else
        if(jTname.getText().equals("")){
        JOptionPane.showMessageDialog(rootPane, "Enter A valid Registration Number", "Invalid Credentials", JOptionPane.ERROR_MESSAGE);
        }else{
        Connect connectobj = new Connect();
        conn = connectobj.connectdb();
        
         GregorianCalendar kk=new GregorianCalendar();
        DateFormat karis= DateFormat.getDateInstance();
        java.util.Date java=kk.getTime();
        String s=karis.format(java);
        jTdate.setText(s);
        
        String time=Clock.getText();
        jTtime.setText(time);
        String numb=jTcomplainNo.getText();
        if (numb.equals("" )){
              int num;
        Random kkk = new Random();
        num = kkk.nextInt((9999) + 2000);
        jTcomplainNo.setText(String.valueOf(num));
        getToolkit().beep();
        
         String reg=jTreg.getText();
        String name=jTname.getText();
        String mail=jTemail.getText();
        String number=jTcomplainNo.getText();
        String subject=jTsubject.getText();
        String date=jTdate.getText();
        String tym=jTtime.getText();
        String message=jTextArea1.getText();
        
         try {
            //String sgl="INSERT INTO `banking`(`accnt`, `Name`, `IdNo.`, `PhoneNo`, `Email`, `Nationality`, `Occupation`, `Gender`, `MaritualStatus`, `Date`, `Balance`) VALUES ("342","karis","867","34546","karijavade","kenyan","programmer","male","single","hrjh","44232"")";
            String sql = "INSERT INTO `complain`(`reg_no`, `name`, `email`, `complain_no`, `subject`, `date`, `time`, `message`)VALUES "
                    + "('" + reg + "','" + name + "','" + mail + "','" + number + "',"
                    + "'" + subject + "','" + date + "','" + tym + "','" + message + "')";

            pst = conn.prepareStatement(sql);
            pst.execute();

            sending call=new sending();
                 call.setVisible(true);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());

        }
        
        }  else{
        
        String reg=jTreg.getText();
        String name=jTname.getText();
        String mail=jTemail.getText();
        String number=jTcomplainNo.getText();
        String subject=jTsubject.getText();
        String date=jTdate.getText();
        String tym=jTtime.getText();
        String message=jTextArea1.getText();
        
         try {
            //String sgl="INSERT INTO `banking`(`accnt`, `Name`, `IdNo.`, `PhoneNo`, `Email`, `Nationality`, `Occupation`, `Gender`, `MaritualStatus`, `Date`, `Balance`) VALUES ("342","karis","867","34546","karijavade","kenyan","programmer","male","single","hrjh","44232"")";
            String sql = "INSERT INTO `complain`(`reg_no`, `name`, `email`, `complain_no`, `subject`, `date`, `time`, `message`)VALUES "
                    + "('" + reg + "','" + name + "','" + mail + "','" + number + "',"
                    + "'" + subject + "','" + date + "','" + tym + "','" + message + "')";

            pst = conn.prepareStatement(sql);
            pst.execute();

            sending call=new sending();
                 call.setVisible(true);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());

        }
        }
        }
    
    }
            public void search(){
     String search=jTsearch1.getText();
     
     jTcomplainNo.setText(search);
         Connect connectobj = new Connect();
        conn = connectobj.connectdb();

        String number = jTcomplainNo.getText();
        try {
            Statement stm = conn.createStatement();
            String sql = "select * from complain where complain_no = '" + number + "'";
            rs = stm.executeQuery(sql);

            while (rs.next()) {
                    //out_table.setModel(DbUtils.resultSetToTableModel(rs));
                    String regno = rs.getString("reg_no");                    
                    String name = rs.getString("name");                    
                    String email = rs.getString("email");                    
                    String subject = rs.getString("subject");              
                    String date = rs.getString("date");
                    String time = rs.getString("time");
                    String message = rs.getString("message");
                    
                                     
                    jTname.setText(name);
                    jTemail.setText(email);
                    jTreg.setText(regno);
                    jTsubject.setText(subject);
                    jTtime.setText(time);
                    jTdate.setText(date);
                    jTextArea1.setText(message);
                    
                 }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());

        }
   }
            
              public void  clear(){
                  
              jTreg.setText("");
              jTname.setText("");
              jTemail.setText("");
              jTsubject.setText("");
              jTcomplainNo.setText("");
              jTextArea1.setText("");
              jTtime.setText("");
              jTdate.setText("");
              jTsearch1.setText("");
               getToolkit().beep();
              }

}
