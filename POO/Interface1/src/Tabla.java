
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Carlos Vilchis
 */
public interface Tabla {

    public void alta(String [] campos);

    public void baja(int id);

    public DefaultTableModel consulta();

    public void modificacion(String [] campos,int id);
}
