/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package laesmeraldasanfelipe;

import javax.swing.UIManager;

/**
 *
 * @author luisa
 */
public class LaEsmeraldaSanfelipe {

    public static String usuario;
    public static String contraseña;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (UIManager.LookAndFeelInfo laf : UIManager.getInstalledLookAndFeels()) {
            if ("Nimbus".equals(laf.getName()))
try {
                UIManager.setLookAndFeel(laf.getClassName());
            } catch (Exception ex) {
            }
        }
        new login().setVisible(true);
    }
    
}
