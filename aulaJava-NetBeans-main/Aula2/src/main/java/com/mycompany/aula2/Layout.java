/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula2;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author aluno
 */
public class Layout extends JFrame{
    JButton botao = new JButton("Teste1");
    JButton botao2 = new JButton("Teste2");
    JButton botao3 = new JButton("Teste3");
    JButton botao4 = new JButton("Teste4");
    
    public Layout(){
        
        setLayout(new GridLayout(2,2));
        add(botao);
        add(botao2);
        add(botao3);
        add(botao4);
       /*add(BorderLayout.NORTH, botao); 
       add(BorderLayout.SOUTH, botao2);*/
        
        
        
        setTitle("Titulo Janela");
        setSize(500,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    public static void main(String[] args){
    new Layout();    
    }
}
