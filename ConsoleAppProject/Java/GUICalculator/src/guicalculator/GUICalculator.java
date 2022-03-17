/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guicalculator;

/**
 *
 * @author 100152067
 */
public class GUICalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });   // TODO code application logic here
    
    
    
    }
    
}
