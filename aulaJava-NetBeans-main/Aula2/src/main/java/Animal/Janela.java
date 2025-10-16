/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Animal;

/**
 *
 * @author aluno
 */
import javax.swing.JFrame;
public class Janela extends JFrame{
    public Janela(){
    
    //JFrame jf = new JFrame();
    setTitle("Titulo da janela");
    setSize(500,400);
    setVisible(true);
    setLocationRelativeTo(null);
    setResizable(false);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
    public static void main(String[] args){
        new Janela();
    }
}
