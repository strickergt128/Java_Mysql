
package Clases;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Coneccion {
    private static Connection conn;
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String user = "root";
    private static final String password = "";
    private static final String url = "jdbc:mysql://localhost:3306/tienda";

    public Coneccion() {
        conn = null;
        
        try{
            Class.forName(driver);
            conn = (Connection) DriverManager.getConnection(url, user, password);
            
            if (conn != null) {
                System.out.println("Conección Establecida...");
            }
            
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("Error de Conección "+e);
        }
    }
    
    
    //Metodo para Retornar la Conección
    public Connection getConnection(){
        return conn;
    }
    
    //Metodo para desconectarse de la bd
    public void desconectar(){
        conn = null;
        
        if (conn == null) {
            System.out.println("Coneccion Terminada...");
        }
    }
    
    
}
