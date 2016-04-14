/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TemperatureConverter;

import javax.swing.UIManager;

/**
 *
 * @author Jennifer
 */
public class Startup {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
     // Set default look and feel for system
        try {
            UIManager.setLookAndFeel( UIManager.getSystemLookAndFeelClassName() );
        } catch (Exception e) {
            // Likely the L&F class is not in the class path; 
            // just ignore and use default L&F. Program will not crash
            // because we caught the exception
        }
            
        /* 
            Create and display the form. This is the main job of a startup
            class in a GUI program. This code creates the GUI object on
            a separate thread. We will discuss threading in a later class.
        */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }
}
