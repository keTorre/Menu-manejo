/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.controlador;

import javax.swing.JOptionPane;

/**
 *
 * @author PC6-LAB2
 */
public class Coordinador {

    public String asignarAtributos() {
        String opciones="seleccione una opcion \n"
        +"1-Asignar placa \n"
        + "2-Asignar marca\n"
        + "3-Asignar chasis\n"
        + "4-Asignar color\n"
        + "5-Asignar modelo\n";
        return opciones;
        
    }
 public String retornarAtributos() {
        String opciones =    "seleccione una opcion \n"
        +"1-Retornar placa \n"
        + "2-Retornar marca\n"
        + "3-Retornar chasis\n"
        + "4-Retornar color\n"
        + "5-Retornar modelo\n";
        return opciones;
        
    }

public void menu() {
        String op = "";
        do{
            op= JOptionPane.showInputDialog("selecione una opcion\n"
                    + "1-Asignar atributos\n"
                    + "2-Retornar atributo\n"
                    +"3-Salir\n");
        switch(op){
            case "1":
                JOptionPane.showInputDialog(asignarAtributos());
            break;
             case "2":
                 JOptionPane.showInputDialog(retornarAtributos());
            break;
            
        }
        } while (!op.equals("3"));
        
    }
   
}
