/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cores;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;

public class  cores extends JFrame {
    JButton botao = new JButton("Texto");
    Font fonte = new Font("Courier New",Font.ITALIC|Font.BOLD, 80);
    Color cor = new Color(206, 219, 230);
    Color cor2 = new Color(165, 7, 62);
    public cores(){
        botao.setForeground(cor);
        botao.setBackground(cor2);
        botao.setFont(fonte);
        add(botao);
        
        setTitle("Titulo Janela");
        setSize(500,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public static void main(String[] args){
    new cores();
    }
}
