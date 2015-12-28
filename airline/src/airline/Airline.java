/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
 package airline;
 import java.sql.Connection;
 import java.sql.DriverManager;
 import java.sql.ResultSet;
 import java.sql.Statement; 

/**
 *
 * @author RABI
 */
public class Airline {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        
        
        try {
             Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
             Connection connection = DriverManager
                     .getConnection(
                             "jdbc:sqlserver://localhost:1433;databaseName=r;selectMethod=cursor",
                             "sa", "12345");

             System.out.println("DATABASE NAME IS:"
                     + connection.getMetaData().getDatabaseProductName());
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement
                     .executeQuery("SELECT pass_name FROM passenger");
             while (resultSet.next()) {
                 System.out.println("passenger name:"
                         + resultSet.getString("pass_name"));
             }
         } catch (Exception e) {
             e.printStackTrace();
         }
        //passenger pass=new passenger();
        //pass.setVisible(true);
    
    log_in lg=new log_in();
    lg.setVisible(true);

    }
    
    }

