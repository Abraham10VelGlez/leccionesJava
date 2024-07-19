import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author carlos
 */
public class Alumno extends Conexion implements Tabla {

    @Override
    public void alta(String[] campos) {
        this.consulta = "INSERT INTO upvtalumno VALUES " + " (null,'" + campos[0] + "','" + campos[1] + "','" + campos[2] + "','" + campos[3] + "','" + campos[4] + "')";
        this.ejecutarConsulta();
    }

    @Override
    public void baja(int id) {
        this.consulta = "DELETE FROM upvtalumno WHERE id=" + id;
        this.ejecutarConsulta();
    }

    @Override
    public DefaultTableModel consulta() {
        this.consulta = "SELECT * FROM upvtalumno";
        DefaultTableModel modelo=new DefaultTableModel();
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido Paterno");
        modelo.addColumn("Apellido Materno");
        modelo.addColumn("Matricula");
        modelo.addColumn("Carrera");
        
        return modelo;

    }

    @Override
    public void modificacion(String[] campos, int id) {
    }

}
