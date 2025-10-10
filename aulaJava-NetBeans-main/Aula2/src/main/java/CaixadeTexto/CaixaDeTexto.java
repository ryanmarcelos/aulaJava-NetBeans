/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CaixadeTexto;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class CaixaDeTexto extends JFrame{
    JTextField caixa = new JTextField(30);
    JTextArea caixa2 = new JTextArea(10, 30); 
    
    public CaixaDeTexto(){
       setLayout(new FlowLayout());
       add(caixa);
       add(caixa2);
        
        setTitle("Titulo Janela");
        setSize(500,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    
    public static void main(String[] args) {
        new CaixaDeTexto();
    }
}
