/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.aldrin.rl;

/**
 *
 * @author Java Programming with Aldrin
 */
import com.aldrin.rl.gui.JFrameApp;
import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.*;

public class RememberLogin extends JFrame {


    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            FlatLightLaf.setup();
            System.setProperty("flatlaf.menuBarEmbedded", "false");
            JFrameApp app = new JFrameApp();
            app.setVisible(true);
        });
    }
}
