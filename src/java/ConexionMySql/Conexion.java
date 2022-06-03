package ConexionMySql;

import java.sql.*;


public class Conexion {
  
    Connection con;
    public  Conexion(){
        
        
        
        try{
            
            
            Class.forName("com.mysql.jdbc.Driver");
            
            con=DriverManager.getConnection("jdbc:mysql://localhost/tallerutp","root","");
            
            
        } catch(Exception e)
            
        {
            
        System.err.println("Error al Conectar" + e);
        
        }
        
    }

 public  Connection  getConnection(){
     
     
 return  con;
 
               
            
        }
        
   
    
}




