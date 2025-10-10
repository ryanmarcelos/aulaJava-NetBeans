/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TextoJanela;

import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Label extends JFrame{
    Font grande = new Font("Serif", Font.BOLD, 50);
        JLabel legenda = new JLabel("Texto");
    
    public Label(){
        legenda.setFont(grande);
        legenda.setText("Aoooooooo Pôtenciaaa");
        legenda.setHorizontalAlignment(SwingConstants.CENTER);
        add(legenda);
             
        setTitle("Titulo Janela");
        setSize(500,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
         public static void main(String[] args) {
        new Label();
    }
}
