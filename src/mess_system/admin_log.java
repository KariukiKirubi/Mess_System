/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mess_system;

import java.awt.TrayIcon;
import java.awt.event.KeyEvent;
import java.io.*;
import java.sql.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author Shazka
 */
public class admin_log extends javax.swing.JFrame {

    DisplayTrayIcon DTI = new DisplayTrayIcon();

    int timeRun = 0;
    int tymerun;
        Connection conn = null;
       PreparedStatement pst =  null;
       ResultSet rs = null;

    /**
     * Creates new form admin_log
     */
    public admin_log() {

        initComponents();
        my_voice();
        NotificationShit();
        jPswd.setEnabled(false);
        load1.setVisible(false);

        new Thread() {
            public void run() {
                jPswd.setEnabled(true);
                load1.setVisible(true);
                /*
                 try {
                 Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + "C:\\wamp\\wampmanager.exe");
                 } catch (Exception e) {
                 JOptionPane.showMessageDialog(null, "Error");
                 }
                 */
                while (timeRun == 0) {
                    Calendar cal = new GregorianCalendar();

                    int hour = cal.get(Calendar.HOUR);
                    int min = cal.get(Calendar.MINUTE);
                    int sec = cal.get(Calendar.SECOND);
                    int AM_PM = cal.get(Calendar.AM_PM);
                    String day_night = "";

                    if (AM_PM == 1) {
                        day_night = "PM";
                    } else {
                        day_night = "AM";
                    }
                    String time = hour + ":" + min + ":" + sec;

                    Clock.setText(time);
                }

            }

        }.start();
    }

    //The Voice shit and crap happens here______________________________________
    public void my_voice() {
        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        String url = "jdbc:mysql://localhost:3306/";
        String driver = "com.mysql.jdbc.Driver";
        String userName = "root";
        String pwd = "";
        String tb = "settings";
        String db = "mess";

        try {
            Class.forName(driver).newInstance();
            con = DriverManager.getConnection(url + db, userName, pwd);
            try {

                String querry = "SELECT * FROM " + tb + " WHERE my_id_code = 1";

                pst = con.prepareStatement(querry);
                rs = pst.executeQuery();

                if (rs.next()) {
                    int f = rs.getInt("my_voice_code");

                    if (f == 1) {
                        InputStream in;

                        try {
                            //in = new FileInputStream(new File("F:\\PROJECTS\\myJavaApp\\welcome.wav"));
                            
                            //in = new FileInputStream(new File("welcome.wav"));
//                            in = new FileInputStream(new File("C:\\welcome.wav"));
//                            AudioStream audios = new AudioStream(in);
//                            AudioPlayer.player.start(audios);

                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, e);

                        }
                         try {
                                        Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + "C:\\Mess_System\\Welcome.vbs");
                                        //this.dispose();
                                    } catch (Exception ex) {
                                        JOptionPane.showMessageDialog(null, ex.getMessage());
                                    }
                    } else if (f == 2) {

                    }

                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException t) {
            JOptionPane.showMessageDialog(null, "SYSTEM CONNECTION ERROR.");
        }

    }
    //The Voice shit and crap happens here______________________________________

    //The Voice shit and crap happens here______________________________________
    public void NotificationShit() {
        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        String url = "jdbc:mysql://localhost:3306/";
        String driver = "com.mysql.jdbc.Driver";
        String userName = "root";
        String pwd = "";
        String tb = "settings";
        String db = "mess";

        try {
            Class.forName(driver).newInstance();
            con = DriverManager.getConnection(url + db, userName, pwd);
            try {

                String querry = "SELECT * FROM " + tb + " WHERE my_id_code = 2";

                pst = con.prepareStatement(querry);
                rs = pst.executeQuery();

                if (rs.next()) {
                    int f = rs.getInt("my_voice_code");

                    if (f == 1) {
                        try {
                            
                             try {
                                        Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + "C:\\Windows\\System32\\osk.exe");
                                        Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + "‪C:\\Windows\\System32\\osk.exe");
                                        //this.dispose();
                                      //  DisplayTrayIcon.trayIcon.displayMessage("Application Information", "TOUCH SCREEN HAS BEEN ACTIVATED SUCCESSFULLY", TrayIcon.MessageType.INFO);

                                    } catch (Exception ex) {
                                        JOptionPane.showMessageDialog(null, ex.getMessage());
                                    }
                            
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, e);
          
                        }
                    } else if (f == 2) {
                              //   DisplayTrayIcon.trayIcon.displayMessage("Application Information", "TOUCH SCREEN HAS BEEN DEACTIVATED ", TrayIcon.MessageType.INFO);

                    }

                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException t) {
            JOptionPane.showMessageDialog(null, "SYSTEM CONNECTION ERROR.");
        }

    }

    //The Voice shit and crap happens here______________________________________
    //The Notification tray poop is all happening here__________________________
    //ADMINISTRATOR______________________________________________________________
    public void AdminLoginNotificationShit() {
        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        String url = "jdbc:mysql://localhost:3306/";
        String driver = "com.mysql.jdbc.Driver";
        String userName = "root";
        String pwd = "";
        String tb = "settings";
        String db = "mess";

        try {
            Class.forName(driver).newInstance();
            con = DriverManager.getConnection(url + db, userName, pwd);
            try {

                String querry_me = "SELECT * FROM " + tb + " WHERE my_id_code = 2";

                pst = con.prepareStatement(querry_me);
                rs = pst.executeQuery();

                if (rs.next()) {
                    int f = rs.getInt("my_voice_code");

                    if (f == 1) {
                        try {
                            DisplayTrayIcon.trayIcon.displayMessage("Application Information[---]", "You have logged into the system successfully.", TrayIcon.MessageType.INFO);

                            try {
                                Thread.sleep(3000);

                            } catch (Exception e) {
                            }

                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, e);

                        }
                    } else if (f == 2) {

                    }

                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException t) {
            JOptionPane.showMessageDialog(null, "SYSTEM CONNECTION ERROR.");
        }
    }
    
            public void AdminLoginNotificationShit2() {
        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        String url = "jdbc:mysql://localhost:3306/";
        String driver = "com.mysql.jdbc.Driver";
        String userName = "root";
        String pwd = "";
        String tb = "settings";
        String db = "mess";

        try {
            Class.forName(driver).newInstance();
            con = DriverManager.getConnection(url + db, userName, pwd);
            try {

                String querry_me = "SELECT * FROM " + tb + " WHERE my_id_code = 2";

                pst = con.prepareStatement(querry_me);
                rs = pst.executeQuery();

                if (rs.next()) {
                    int f = rs.getInt("my_voice_code");

                    if (f == 1) {
                        try {
                            DisplayTrayIcon.trayIcon.displayMessage("Application Information[ADMINISTRATOR]", "You have logged into the system successfully.", TrayIcon.MessageType.INFO);

                            try {
                                Thread.sleep(3000);

                            } catch (Exception e) {
                            }

                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, e);

                        }
                    } else if (f == 2) {

                    }

                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException t) {
            JOptionPane.showMessageDialog(null, "SYSTEM CONNECTION ERROR.");
        }
    }

    public void FailedAdminLoginNotificationShit() {
        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        String url = "jdbc:mysql://localhost:3306/";
        String driver = "com.mysql.jdbc.Driver";
        String userName = "root";
        String pwd = "";
        String tb = "settings";
        String db = "mess";

        try {
            Class.forName(driver).newInstance();
            con = DriverManager.getConnection(url + db, userName, pwd);
            try {

                String querry_me = "SELECT * FROM " + tb + " WHERE my_id_code = 2";

                pst = con.prepareStatement(querry_me);
                rs = pst.executeQuery();

                if (rs.next()) {
                    int f = rs.getInt("my_voice_code");

                    if (f == 1) {
                        try {
                            DisplayTrayIcon.trayIcon.displayMessage("Application Information[Administrator]", "Log in to The Student Mess Management software failed.Try again.", TrayIcon.MessageType.ERROR);

                            try {
                                Thread.sleep(3000);

                            } catch (Exception e) {
                            }

                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, e);

                        }
                    } else if (f == 2) {

                    }

                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException t) {
            JOptionPane.showMessageDialog(null, "SYSTEM CONNECTION ERROR.");
        }
    }

    public void StaffLoginNotificationShit() {
        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        String url = "jdbc:mysql://localhost:3306/";
        String driver = "com.mysql.jdbc.Driver";
        String userName = "root";
        String pwd = "";
        String tb = "settings";
        String db = "mess";

        try {
            Class.forName(driver).newInstance();
            con = DriverManager.getConnection(url + db, userName, pwd);
            try {

                String querry_me = "SELECT * FROM " + tb + " WHERE my_id_code = 2";

                pst = con.prepareStatement(querry_me);
                rs = pst.executeQuery();

                if (rs.next()) {
                    int f = rs.getInt("my_voice_code");

                    if (f == 1) {
                        try {
                            DisplayTrayIcon.trayIcon.displayMessage("Application Information[STUDENT]", "You have logged into the system successfully.", TrayIcon.MessageType.INFO);

                            try {
                                Thread.sleep(3000);

                            } catch (Exception e) {
                            }

                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, e);

                        }
                    } else if (f == 2) {

                    }

                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException t) {
            JOptionPane.showMessageDialog(null, "SYSTEM CONNECTION ERROR.");
        }
    }

    public void FailedStaffLoginNotificationShit() {
        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        String url = "jdbc:mysql://localhost:3306/";
        String driver = "com.mysql.jdbc.Driver";
        String userName = "root";
        String pwd = "";
        String tb = "settings";
        String db = "mess";

        try {
            Class.forName(driver).newInstance();
            con = DriverManager.getConnection(url + db, userName, pwd);
            try {

                String querry_me = "SELECT * FROM " + tb + " WHERE my_id_code = 2";

                pst = con.prepareStatement(querry_me);
                rs = pst.executeQuery();

                if (rs.next()) {
                    int f = rs.getInt("my_voice_code");

                    if (f == 1) {
                        try {
                            DisplayTrayIcon.trayIcon.displayMessage("Application Information[Staff]", "Log in to The Student Mess Management software failed.Try again.", TrayIcon.MessageType.ERROR);
                            try {
                                Thread.sleep(3000);

                            } catch (Exception e) {
                            }

                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, e);

                        }
                    } else if (f == 2) {

                    }

                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException t) {
            JOptionPane.showMessageDialog(null, "SYSTEM CONNECTION ERROR.");
        }
    }

    //The Notification tray poop is all happening here__________________________
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        load1 = new javax.swing.JLabel();
        txt_lb = new javax.swing.JLabel();
        txt_lb1 = new javax.swing.JLabel();
        com_sel = new javax.swing.JComboBox();
        jLforgot_pswd = new javax.swing.JLabel();
        jPswd = new javax.swing.JPasswordField();
        Clock = new javax.swing.JLabel();
        jTuserId = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        jLabel4.setText("jLabel4");

        jLabel5.setText("jLabel5");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/details/background.jpg"))); // NOI18N
        jLabel1.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentRemoved(java.awt.event.ContainerEvent evt) {
                jLabel1ComponentRemoved(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("THE STUDENTS MESS MANAGEMENT SOFTWARE");
        setMaximumSize(new java.awt.Dimension(500, 312));
        setMinimumSize(new java.awt.Dimension(500, 312));
        setUndecorated(true);
        setOpacity(0.0F);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel3.setForeground(new java.awt.Color(0, 204, 0));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/archive.png"))); // NOI18N
        jLabel3.setText("LOGIN");
        jLabel3.setToolTipText("STAFF ALTERNATIVE LOG IN");
        jLabel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3);
        jLabel3.setBounds(370, 210, 80, 30);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/details/user.png"))); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(10, 10, 200, 40);

        load1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/details/Loading-Animated-GIF.gif"))); // NOI18N
        getContentPane().add(load1);
        load1.setBounds(290, 260, 150, 18);
        getContentPane().add(txt_lb);
        txt_lb.setBounds(320, 10, 0, 0);
        getContentPane().add(txt_lb1);
        txt_lb1.setBounds(320, 40, 0, 0);

        com_sel.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        com_sel.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--select user--", "ADMINISTRATOR", "STAFF", "STUDENT" }));
        com_sel.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                com_selItemStateChanged(evt);
            }
        });
        com_sel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                com_selActionPerformed(evt);
            }
        });
        getContentPane().add(com_sel);
        com_sel.setBounds(20, 150, 150, 30);

        jLforgot_pswd.setFont(new java.awt.Font("Mistral", 0, 20)); // NOI18N
        jLforgot_pswd.setForeground(new java.awt.Color(0, 102, 102));
        jLforgot_pswd.setText("     Forgot  PassWord?");
        jLforgot_pswd.setToolTipText("Click to retrive your password");
        jLforgot_pswd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLforgot_pswdMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLforgot_pswdMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLforgot_pswdMouseExited(evt);
            }
        });
        getContentPane().add(jLforgot_pswd);
        jLforgot_pswd.setBounds(170, 200, 190, 50);

        jPswd.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPswd.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPswd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPswdActionPerformed(evt);
            }
        });
        jPswd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPswdKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jPswdKeyReleased(evt);
            }
        });
        getContentPane().add(jPswd);
        jPswd.setBounds(350, 170, 120, 30);

        Clock.setFont(new java.awt.Font("LcdD", 0, 24)); // NOI18N
        Clock.setForeground(new java.awt.Color(255, 255, 255));
        Clock.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Clock.setText("12:12;12 pm");
        getContentPane().add(Clock);
        Clock.setBounds(120, 250, 150, 40);

        jTuserId.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTuserId.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(jTuserId);
        jTuserId.setBounds(200, 170, 120, 30);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/details/user-id.png"))); // NOI18N
        jLabel8.setText("jLabel8");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(200, 150, 60, 20);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/details/password.png"))); // NOI18N
        getContentPane().add(jLabel10);
        jLabel10.setBounds(350, 150, 80, 20);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/details/select.png"))); // NOI18N
        getContentPane().add(jLabel11);
        jLabel11.setBounds(20, 130, 90, 20);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/details/41-Clock-icon.png"))); // NOI18N
        getContentPane().add(jLabel13);
        jLabel13.setBounds(70, 220, 50, 48);

        jLabel9.setFont(new java.awt.Font("Mistral", 0, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Authentification PassWord:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(270, 100, 190, 21);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/details/cancel-icon.png"))); // NOI18N
        jLabel7.setToolTipText("EXIT");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel7);
        jLabel7.setBounds(440, 0, 50, 50);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/details/PadLock-icon.png"))); // NOI18N
        jLabel14.setToolTipText("STAFF ALTERNATIVE LOG IN");
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel14);
        jLabel14.setBounds(210, 80, 50, 50);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/details/background.jpg"))); // NOI18N
        getContentPane().add(jLabel12);
        jLabel12.setBounds(0, -10, 510, 330);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/details/PadLock-icon.png"))); // NOI18N
        jLabel15.setToolTipText("STAFF ALTERNATIVE LOG IN");
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel15);
        jLabel15.setBounds(210, 80, 50, 50);

        setSize(new java.awt.Dimension(492, 293));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPswdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPswdKeyReleased


    }//GEN-LAST:event_jPswdKeyReleased

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
       

            Connection con = null;
            PreparedStatement pst = null;
            PreparedStatement pst_ = null;
            ResultSet rs = null;
            ResultSet rs_ = null;
            String url = "jdbc:mysql://localhost:3306/";
            String driver = "com.mysql.jdbc.Driver";
            String userName = "root";
            String pwd = "";
            String tb = "staff_details";
            String tb2 = "student_reg";
             String tb4 = "admin_data";
            String tb3 = "settings";
            String db = "mess";
            String util = "net.prteanit.sql.DbUtils.resultSetToTableModel";

            String co = (String) com_sel.getSelectedItem();
            String txt = jPswd.getText();

            if (co.equals("--select user--")) {
                JOptionPane.showMessageDialog(null, "You did not select an option.\n\tThank You.");
            }

            //ADMINISTRATOR_________________________________________________________
                    if (co.equals("ADMINISTRATOR")) {
                            jTuserId.setText("Admin");
                try {
                    Class.forName(driver).newInstance();
                    con = DriverManager.getConnection(url + db, userName, pwd);

                    try {
                        String pass = jPswd.getText();
                        String admin = jTuserId.getText().toString().toUpperCase();

                        String querry = "SELECT * FROM " + tb4 + " WHERE User_Id = '" + admin + "'";
                        pst = con.prepareStatement(querry);
                        rs = pst.executeQuery();

                        if (rs.next()) {
                            String i = rs.getString("User_Id");
                            String p = rs.getString("Pswd");

                            Statement sn = con.createStatement();
                            long time = System.currentTimeMillis();
                            java.sql.Timestamp timestamp = new java.sql.Timestamp(time);

                            if (pass.equals(p) ) {

                               // String sql = "update admin_data set log_date= '" + timestamp + "' where id='" + i + "'";
                                String sql = "INSERT INTO admin_logs (User_Id,Time) VALUES ('" + admin + "','" + timestamp + "')  ";
                               
                                sn.executeUpdate(sql);

                                current_user();
                               MainFrame kk=new MainFrame();
                               kk.setVisible(true);
                               this.dispose();
                                AdminLoginNotificationShit();

                            } else {
                                //A method ic comming here
                                FailedAdminLoginNotificationShit();
                                JOptionPane.showMessageDialog(null, "Enter correct credentials first");
                                jTuserId.setText("");
                                jPswd.setText("");
                            }
                        }
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, e);
                    }
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException t) {
                    JOptionPane.showMessageDialog(null, "SYSTEM ERROR!!\nPLEASE CONFIRM YOUR DATABASE IS UP AND RUNNING.");
                }
            }
            
            if (co.equals("STAFF")) {

                try {
                    Class.forName(driver).newInstance();
                    con = DriverManager.getConnection(url + db, userName, pwd);

                    try {
                        String pass = jPswd.getText();
                        String staff = jTuserId.getText().toString().toUpperCase();

                        String querry = "SELECT * FROM " + tb + " WHERE StaffNo = '" + staff + "'";
                        pst = con.prepareStatement(querry);
                        rs = pst.executeQuery();

                        if (rs.next()) {
                            String i = rs.getString("StaffNo");
                            String p = rs.getString("Pswd");

                            Statement sn = con.createStatement();
                            long time = System.currentTimeMillis();
                            java.sql.Timestamp timestamp = new java.sql.Timestamp(time);

                            if (pass.equals(p) && staff.equals(i)) {

                               // String sql = "update admin_data set log_date= '" + timestamp + "' where id='" + i + "'";
                                String sql = "INSERT INTO staff_log (StaffNo,Time) VALUES ('" + staff + "','" + timestamp + "')  ";
                               
                                sn.executeUpdate(sql);

                                 current_user();
                               MainFrameStaff kk=new MainFrameStaff();
                               kk.setVisible(true);
                               this.dispose();
                                AdminLoginNotificationShit2();

                            } else {
                                //A method ic comming here
                                FailedAdminLoginNotificationShit();
                                JOptionPane.showMessageDialog(null, "Enter correct credentials first");
                                jTuserId.setText("");
                                jPswd.setText("");
                            }
                        }
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, e);
                    }
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException t) {
                    JOptionPane.showMessageDialog(null, "SYSTEM ERROR!!\nPLEASE CONFIRM YOUR DATABASE IS UP AND RUNNING.");
                }
            }

            //STAFF_________________________________________________________________
            if (co.equals("STUDENT")) {

                try {
                    Class.forName(driver).newInstance();
                    con = DriverManager.getConnection(url + db, userName, pwd);

                    try {
                        String pass = jPswd.getText();
                        String reg = jTuserId.getText().toString().toUpperCase();

                        String querry = "SELECT * FROM " + tb2 + " WHERE Reg_No = '" + reg + "'";
                        pst = con.prepareStatement(querry);
                        rs = pst.executeQuery();

                        if (rs.next()) {
                            String reg2= rs.getString("Reg_No");
                            String p = rs.getString("Pswd");

                            Statement sn = con.createStatement();
                            long time = System.currentTimeMillis();
                            java.sql.Timestamp timestamp = new java.sql.Timestamp(time);

                            
                           //JOptionPane.showMessageDialog(null, p);
                            if (pass.equals(p) ) {

                                //String sql = "update staff_data set log_date= '" + timestamp + "' where id='" + i + "'";
                                 String sql = "INSERT INTO student_log (Reg_No,Time) VALUES ('" + reg + "','" + timestamp + "')  ";
                                sn.executeUpdate(sql);
                                //A method is comming here
                                StaffLoginNotificationShit();
                                
                                  current_user();
                                  MainFrameStudent kk=new MainFrameStudent();
                                  kk.setVisible(true);
                                  this.dispose();

                            } else {
                                //A method is comming here
                                FailedStaffLoginNotificationShit();
                                JOptionPane.showMessageDialog(null, "Enter correct Credentials first");
                                jTuserId.setText("");
                                jPswd.setText("");
                            }
                        }
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, e);
                    }
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException t) {
                    JOptionPane.showMessageDialog(null, "SYSTEM ERROR!!\nPLEASE CONFIRM YOUR DATABASE IS UP AND RUNNING.");
                }
            }
        
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel1ComponentRemoved(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jLabel1ComponentRemoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1ComponentRemoved

    private void com_selItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_com_selItemStateChanged

    }//GEN-LAST:event_com_selItemStateChanged

    private void jPswdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPswdKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            Connection con = null;
            PreparedStatement pst = null;
            PreparedStatement pst_ = null;
            ResultSet rs = null;
            ResultSet rs_ = null;
            String url = "jdbc:mysql://localhost:3306/";
            String driver = "com.mysql.jdbc.Driver";
            String userName = "root";
            String pwd = "";
            String tb = "staff_details";
            String tb2 = "student_reg";
             String tb4 = "admin_data";
            String tb3 = "settings";
            String db = "mess";
            String util = "net.prteanit.sql.DbUtils.resultSetToTableModel";

            String co = (String) com_sel.getSelectedItem();
            String txt = jPswd.getText();

            if (co.equals("--select user--")) {
                JOptionPane.showMessageDialog(null, "You did not select an option.\n\tThank You.");
            }

            //ADMINISTRATOR_________________________________________________________
                    if (co.equals("ADMINISTRATOR")) {
                            jTuserId.setText("Admin");
                try {
                    Class.forName(driver).newInstance();
                    con = DriverManager.getConnection(url + db, userName, pwd);

                    try {
                        String pass = jPswd.getText();
                        String admin = jTuserId.getText().toString().toUpperCase();

                        String querry = "SELECT * FROM " + tb4 + " WHERE User_Id = '" + admin + "'";
                        pst = con.prepareStatement(querry);
                        rs = pst.executeQuery();

                        if (rs.next()) {
                            String i = rs.getString("User_Id");
                            String p = rs.getString("Pswd");

                            Statement sn = con.createStatement();
                            long time = System.currentTimeMillis();
                            java.sql.Timestamp timestamp = new java.sql.Timestamp(time);

                            if (pass.equals(p) ) {

                               // String sql = "update admin_data set log_date= '" + timestamp + "' where id='" + i + "'";
                                String sql = "INSERT INTO admin_logs (User_Id,Time) VALUES ('" + admin + "','" + timestamp + "')  ";
                               
                                sn.executeUpdate(sql);

                               current_user();
                               MainFrame kk=new MainFrame();
                               kk.setVisible(true);
                               this.dispose();
                                AdminLoginNotificationShit();

                            } else {
                                //A method ic comming here
                                FailedAdminLoginNotificationShit();
                                JOptionPane.showMessageDialog(null, "Enter correct credentials first");
                                jTuserId.setText("");
                                jPswd.setText("");
                            }
                        }
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, e);
                    }
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException t) {
                    JOptionPane.showMessageDialog(null, "SYSTEM ERROR!!\nPLEASE CONFIRM YOUR DATABASE IS UP AND RUNNING.");
                }
            }
            
            if (co.equals("STAFF")) {

                try {
                    Class.forName(driver).newInstance();
                    con = DriverManager.getConnection(url + db, userName, pwd);

                    try {
                        String pass = jPswd.getText();
                        String staff = jTuserId.getText().toString().toUpperCase();

                        String querry = "SELECT * FROM " + tb + " WHERE StaffNo = '" + staff + "'";
                        pst = con.prepareStatement(querry);
                        rs = pst.executeQuery();

                        if (rs.next()) {
                            String i = rs.getString("StaffNo");
                            String p = rs.getString("Pswd");

                            Statement sn = con.createStatement();
                            long time = System.currentTimeMillis();
                            java.sql.Timestamp timestamp = new java.sql.Timestamp(time);

                            if (pass.equals(p) && staff.equals(i)) {

                               // String sql = "update admin_data set log_date= '" + timestamp + "' where id='" + i + "'";
                                String sql = "INSERT INTO staff_log (StaffNo,Time) VALUES ('" + staff + "','" + timestamp + "')  ";
                               
                                sn.executeUpdate(sql);

                                 current_user();
                               MainFrameStaff kk=new MainFrameStaff();
                               kk.setVisible(true);
                               this.dispose();
                                AdminLoginNotificationShit2();

                            } else {
                                //A method ic comming here
                                FailedAdminLoginNotificationShit();
                                JOptionPane.showMessageDialog(null, "Enter correct credentials first");
                                jTuserId.setText("");
                                jPswd.setText("");
                            }
                        }
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, e);
                    }
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException t) {
                    JOptionPane.showMessageDialog(null, "SYSTEM ERROR!!\nPLEASE CONFIRM YOUR DATABASE IS UP AND RUNNING.");
                }
            }

            //STAFF_________________________________________________________________
            if (co.equals("STUDENT")) {

                try {
                    Class.forName(driver).newInstance();
                    con = DriverManager.getConnection(url + db, userName, pwd);

                    try {
                        String pass = jPswd.getText();
                        String reg = jTuserId.getText().toString().toUpperCase();

                        String querry = "SELECT * FROM " + tb2 + " WHERE Reg_No = '" + reg + "'";
                        pst = con.prepareStatement(querry);
                        rs = pst.executeQuery();

                        if (rs.next()) {
                            String reg2= rs.getString("Reg_No");
                            String p = rs.getString("Pswd");

                            Statement sn = con.createStatement();
                            long time = System.currentTimeMillis();
                            java.sql.Timestamp timestamp = new java.sql.Timestamp(time);

                            
                           //JOptionPane.showMessageDialog(null, p);
                            if (pass.equals(p) ) {

                                //String sql = "update staff_data set log_date= '" + timestamp + "' where id='" + i + "'";
                                 String sql = "INSERT INTO student_log (Reg_No,Time) VALUES ('" + reg + "','" + timestamp + "')  ";
                                sn.executeUpdate(sql);
                                //A method is comming here
                                StaffLoginNotificationShit();
                                current_user();
                                  MainFrameStudent kk=new MainFrameStudent();
                                  kk.setVisible(true);
                                  this.dispose();

                            } else {
                                //A method is comming here
                                FailedStaffLoginNotificationShit();
                                JOptionPane.showMessageDialog(null, "Enter correct Credentials first");
                                jTuserId.setText("");
                                jPswd.setText("");
                            }
                        }
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, e);
                    }
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException t) {
                    JOptionPane.showMessageDialog(null, "SYSTEM ERROR!!\nPLEASE CONFIRM YOUR DATABASE IS UP AND RUNNING.");
                }
            }
        }
    }//GEN-LAST:event_jPswdKeyPressed

    private void jPswdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPswdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPswdActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        for (double i = 0.0; i <= 1.0; i = i + 0.1) {
            String val = i + "F";
            float f = Float.valueOf(val);
            this.setOpacity(f);

            try {
                Thread.sleep(100);

            } catch (Exception e) {

            }

        }
    }//GEN-LAST:event_formWindowOpened

    private void com_selActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_com_selActionPerformed
       String co = (String) com_sel.getSelectedItem();
             if (co.equals("ADMINISTRATOR")) {
             jTuserId.setText("Admin");
             }
    }//GEN-LAST:event_com_selActionPerformed

    private void jLforgot_pswdMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLforgot_pswdMouseEntered
         jLforgot_pswd.setForeground(new java.awt.Color(255, 255, 0));
       //jLforgot_pswd.setForeground(new java.awt.Color(0, 102, 102));
    }//GEN-LAST:event_jLforgot_pswdMouseEntered

    private void jLforgot_pswdMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLforgot_pswdMouseExited
        jLforgot_pswd.setForeground(new java.awt.Color(0, 102, 102));
        jLforgot_pswd.setForeground(new java.awt.Color(0, 102, 102));
    }//GEN-LAST:event_jLforgot_pswdMouseExited

    private void jLforgot_pswdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLforgot_pswdMouseClicked
                    Request_Pswd kk=new Request_Pswd();
                    kk.setVisible(true);
                    // TODO add your handling code here:
    }//GEN-LAST:event_jLforgot_pswdMouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
         System.exit(0);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel15MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {

            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                 javax.swing.UIManager.setLookAndFeel(info.getClassName());
                 break;
                 }
                 
               // UIManager.setLookAndFeel("com.jtattoo.plaf.noire.NoireLookAndFeel");
               // UIManager.setLookAndFeel("com.jtattoo.plaf.aero.AeroLookAndFeel");
                //UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
                //UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(admin_log.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admin_log.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admin_log.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admin_log.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                Calendar expireDate = Calendar.getInstance();
                expireDate.set(2018, 10, 30);
                if (Calendar.getInstance().after(expireDate)) {
                    JOptionPane.showMessageDialog(null, "THE SOFTWARE HAS EXPIRED.");
                    int p = JOptionPane.showConfirmDialog(null, "DO YOU WANT TO ACTIVATE?", "LEAVE", JOptionPane.YES_NO_CANCEL_OPTION);
                    if (p == 0) {
                        activation av = new activation();
                        av.setVisible(true);
                    } else if (p == 1) {
                        System.exit(0);
                    }
                } else {
                    try {
                        Thread.sleep(5000);

                    } catch (Exception e) {
                    }
                    new admin_log().setVisible(true);
                }
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Clock;
    private javax.swing.JComboBox com_sel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLforgot_pswd;
    private javax.swing.JPasswordField jPswd;
    private javax.swing.JTextField jTuserId;
    private javax.swing.JLabel load1;
    private javax.swing.JLabel txt_lb;
    private javax.swing.JLabel txt_lb1;
    // End of variables declaration//GEN-END:variables

    
    public void current_user(){
    
         Connect connectobj = new Connect();
        conn = connectobj.connectdb();
        
        String regno=jTuserId.getText();
        
         try {
            //String sgl="INSERT INTO `banking`(`accnt`, `Name`, `IdNo.`, `PhoneNo`, `Email`, `Nationality`, `Occupation`, `Gender`, `MaritualStatus`, `Date`, `Balance`) VALUES ("342","karis","867","34546","karijavade","kenyan","programmer","male","single","hrjh","44232"")";
            String sql = "UPDATE `current_user` SET `RegNo`='"+regno+"' WHERE `Id`=1";

            pst = conn.prepareStatement(sql);
            pst.execute();

            //JOptionPane.showMessageDialog(null, "logs updated Successfully");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());

        }
    
    }
    
}
