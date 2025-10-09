/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula2;

/**
 *
 * @author aluno
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JOptionPane;
public class Botao extends JFrame implements ActionListener{

    JButton jb  = new JButton("Arlindo");
    JButton jb2  = new JButton("sair");
     
    public void actionPerformed(ActionEvent e){
    
        if(e.getSource()== jb){
            JOptionPane.showConfirmDialog(null, "Funcionando");
        }
        if(e.getSource()== jb2){
            System.exit(0);
        }
    
    }
     
     
     
    public Botao(){
         
        setTitle("Titulo Janela");
        setSize(600,400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(true);
        setLocationRelativeTo(null);
       
        jb.addActionListener(this);
        jb2.addActionListener(this);
        
        setLayout(null);
        jb.setBounds(100,300,100,60);
          jb2.setBounds(0,0,100,60);
        add(jb);
        add(jb2);
}

public static void main(String[]args){
    new Botao();
    
    }

    

}    