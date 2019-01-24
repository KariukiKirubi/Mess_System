/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mess_system;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Karis
 */
public class getMean {
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    Statement stm = null;
    
    public float getMG(String day, String month, String year)
    {
        float mg = 0;
          Connect connectobj = new Connect();
        conn = connectobj.connectdb();
             //refresh
           try{
               String sql ="SELECT * FROM `records` WHERE `Day` = '"+day+"' AND `Month` = '"+month+"' AND `Year` = '"+year+"' "; 
               stm=conn.prepareStatement(sql);
                rs=stm.executeQuery(sql);
                while(rs.next())
                {
                    mg = rs.getFloat("Total");
                }
            }catch(Exception e)
            {
               e.printStackTrace();
                
            }
        return mg;
    }
    
}
