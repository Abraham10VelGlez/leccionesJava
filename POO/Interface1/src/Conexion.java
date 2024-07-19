import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Carlos Vilchis
 */
public class Conexion {

    private Connection db = null;//crea conexion
    private Statement datarequest;//ejecuta las sentencia
    private ResultSet resultado;//Guarda el resultado de las consultas
    private String url = "jdbc:mysql://localhost:8080/baseprueba";
    private String usuario = "root";
    String password = "";
    String consulta = "";

    public Conexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            db = (Connection) DriverManager.getConnection(url, usuario, password);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void ejecutarConsulta() {
        try {
            datarequest = (Statement) db.createStatement();
            datarequest.execute(consulta);
            System.out.println(consulta);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public  ResultSet obtenerConsulta() {
        try {
            datarequest = (Statement) db.createStatement();
            datarequest.executeQuery(consulta);

        } catch (Exception e) {
            System.out.println(e);
            
        }
        return null;
    }
    
    public static void main(String[] args) {
        Conexion conec= new Conexion();
        
    }
}
