/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package managmentsystem.crowdfundingproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ZARYAB KHAN
 */
class ConnectionProvider {
    public static Connection getCon()
    {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/crowdfunding","root","zaryab");
            return con;
        }
        catch(ClassNotFoundException | SQLException e)
        {
            return null;
        }
    }
}
