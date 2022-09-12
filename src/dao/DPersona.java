package dao;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

import modelos.*;

/*import modelos.Persona;
import modelos.Sexo;*/

public class DPersona {
    private ArrayList<Persona> listPersona = new ArrayList<>();

    public DPersona() {
    }

    public DPersona(ArrayList<Persona> listPersona) {
        this.listPersona = listPersona;
    }

    public ArrayList<Persona> getListPersona() {
        return listPersona;
    }

    public void setListPersona(ArrayList<Persona> listPersona) {
        this.listPersona = listPersona;
    }
    
    /**
     * Permite agregar un nuevo regustro a mi lsta
     * @param id
     * @param nombre
     * @param apellido
     * @param email
     * @param sexo
     * @return 
     */
    public int agregarPersona(int id, String nombre, 
            String apellido, String email, Sexo sexo) {
        int b = 0; 
        Persona pers = new Persona(id, nombre , apellido, email, sexo);
        listPersona.add(pers);
        b = 1; 
        return b;
    }
    
    /**
     * Devuelve una tabla con los registros
     * almacenados en el listado de personas
     * @return 
     */
    public DefaultTableModel getListPer() {
        DefaultTableModel dtm;
        dtm = new DefaultTableModel();
        String titulo[] = {"ID", "NOMBRES", "APELLIDOS", "EMAIL", "SEXO"};
        
        //asgina los encabezados a la tabla
        dtm.setColumnIdentifiers(titulo);
        
        //estoy usando ciclo for each
        for (Persona per: listPersona) {
            String reg[] = new String[5];
            reg[0] = "" + per.getId();
            reg[1] = per.getNombre();
            reg[2] = per.getApellido();
            reg[3] = per.getEmail();
            reg[4] = "" + per.getSexo();
            
            dtm.addRow(reg);
        } 
        
        return dtm;
    }
}
