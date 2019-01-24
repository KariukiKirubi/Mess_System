/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mess_system;

import java.awt.Dimension;
import java.awt.Toolkit;
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
public class Complain extends javax.swing.JInternalFrame {
        int tymrun;
        
         Connection conn = null;
       PreparedStatement pst =  null;
       ResultSet rs = null;
       
    /**
     * Creates new form Complain
     */
    public Complain() {
        initComponents();
        
         Dimension d = Toolkit.getDefaultToolkit().getScreenSize();        
       
        setLocation(0, 0);
        setLocation(0, 0);
        time();
        
         int num;
        Random kk = new Random();
        num = kk.nextInt((9999) + 2000);
        jTcomplainNo.setText(String.valueOf("CPLN"+num));
        getToolkit().beep();
    }

    Complain(MainFrame mainFrame, boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        jtid = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/mess_system/splashy3.png"))); // NOI18N

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
        jScrollPane1.setBounds(360, 120, 430, 280);

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

        jTcomplainNo.setEditable(false);
        jTcomplainNo.setFont(new java.awt.Font("Lucida Calligraphy", 0, 12)); // NOI18N
        jTcomplainNo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(jTcomplainNo);
        jTcomplainNo.setBounds(150, 140, 171, 30);

        jLabel4.setFont(new java.awt.Font("LcdD", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 204, 0));
        jLabel4.setText("Complain Number");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 140, 122, 28);

        jTname.setEditable(false);
        jTname.setFont(new java.awt.Font("Lucida Calligraphy", 0, 12)); // NOI18N
        jTname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(jTname);
        jTname.setBounds(390, 30, 200, 40);

        jTemail.setEditable(false);
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

        jTtime.setEditable(false);
        jTtime.setFont(new java.awt.Font("Lucida Calligraphy", 0, 12)); // NOI18N
        jTtime.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(jTtime);
        jTtime.setBounds(150, 260, 171, 30);

        jTdate.setEditable(false);
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
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel8);
        jLabel8.setBounds(10, 0, 820, 410);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 837, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 13, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(295, 295, 295)
                .addComponent(jtid)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jtid))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       send();
      shazka_systems();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTregKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTregKeyReleased
       ret_data();
    }//GEN-LAST:event_jTregKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        clear();
    }//GEN-LAST:event_jButton1ActionPerformed


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
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTcomplainNo;
    private javax.swing.JTextField jTdate;
    private javax.swing.JTextField jTemail;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTname;
    private javax.swing.JTextField jTreg;
    private javax.swing.JTextField jTsubject;
    private javax.swing.JTextField jTtime;
    private javax.swing.JLabel jtid;
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
        jTcomplainNo.setText("COMP"+String.valueOf(num));
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
            public void ret_data(){
   
         Connect connectobj = new Connect();
        conn = connectobj.connectdb();

        String reg = jTreg.getText();
        try {
            Statement stm = conn.createStatement();
            String sql = "select * from student_reg where Reg_No = '" + reg + "'";
            rs = stm.executeQuery(sql);

            while (rs.next()) {
                    //out_table.setModel(DbUtils.resultSetToTableModel(rs));
                    String sname = rs.getString("S_Name");                    
                    String fname = rs.getString("F_Name");                    
                    String mname = rs.getString("M_Name");                    
                    String reg_no = rs.getString("Reg_No");              
                    String idno = rs.getString("Id_No");
                    String cos = rs.getString("Course");
                    String faculty = rs.getString("Faculty");
                    
                    String phone = rs.getString("Phone_No");                    
                    String email = rs.getString("Email");                    
                    String gender = rs.getString("Gender");                    
                    String doa = rs.getString("D_o_A");              
                    String dog = rs.getString("D_o_G");
                   String date = rs.getString("Date");              
                    String time = rs.getString("Time");
                   int bal = rs.getInt("Balance");              
                    String pswd = rs.getString("Pswd");
                      
                    String karis=sname+"  "+fname+"  "+mname;
                    
                    jTname.setText(karis);
                    jTemail.setText(email);
                    
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
               getToolkit().beep();
              }
              
              public void shazka_systems(){
//       INSERT INTO `mess`.`ozekimessageout` (`id`, `sender`, `receiver`, `msg`, `senttime`, `receivedtime`, `reference`, `status`, `msgtype`, 
//       `operator`, `errormsg`) VALUES ('3', '+254714950155', '+254706493656', 'Welcome to shazka systems,you have been registered successfully',
//       NULL, NULL, NULL, 'send', NULL, NULL, NULL);
       
         int num;
        Random kk = new Random();
        num = kk.nextInt((9999) + 2000);
        //jLserial.setText(String.valueOf("DT12B3J" +num+"HT7ES" ));
        getToolkit().beep();
           
             Connect connectobj = new Connect();
        conn = connectobj.connectdb();
        
        String reg=jTreg.getText();
//        int balance=Integer.parseInt(jLbal.getText());
//        int total=Integer.parseInt(jLTotal.getText());
     // String phone=jLphone.getText();
      String subject=jTsubject.getText();
       // int bal2=balance-total;
        String serial=jTcomplainNo.getText();
        String messo="ADMIN,You have a Complain From "+reg+" by the subject "+subject+"\n the reference number is "+serial ;
           
        
                try {
            Statement stm = conn.createStatement();
            String sql = "SELECT MAX(id) FROM `ozekimessageout` ";
            rs = stm.executeQuery(sql);

            while (rs.next()) {
                   
                   int bal = rs.getInt("MAX(id)");              
                   // JOptionPane.showMessageDialog(null, bal);                    
                   // jTbalance3.setText(String.valueOf(bal));
                   jtid.setText(String.valueOf(bal));
                 }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());

        }
        
        int idno=Integer.parseInt(jtid.getText());
        int idno2=idno+1;
        
           try {
            //String sgl="INSERT INTO `banking`(`accnt`, `Name`, `IdNo.`, `PhoneNo`, `Email`, `Nationality`, `Occupation`, `Gender`, `MaritualStatus`, `Date`, `Balance`) VALUES ("342","karis","867","34546","karijavade","kenyan","programmer","male","single","hrjh","44232"")";
            String sql = "INSERT INTO `mess`.`ozekimessageout` (`id`, `sender`, `receiver`, `msg`, `senttime`, `receivedtime`, `reference`, `status`, `msgtype`, \n" +
"       `operator`, `errormsg`) VALUES ('" + idno2 + "', '+254_706493656', '+254_706493656', '" + messo + "',\n" +
"       NULL, NULL, NULL, 'send', NULL, NULL, NULL);";

            pst = conn.prepareStatement(sql);
            pst.execute();

            JOptionPane.showMessageDialog(null, "Complain Sent Successfully");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());

        }
       }
}
