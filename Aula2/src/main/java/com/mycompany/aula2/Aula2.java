/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula2;

/**
 *
 * @author aluno
 */
public class Aula2 {

    public static void main(String[] args) {
       SalaDeAula.professor = "Edson";
       SalaDeAula.ensinar();
       
       SalaDeAula a1 = new SalaDeAula();
       a1.aluno = "Ryan";
       System.out.println(a1.professor);
       
       SalaDeAula a2 = new SalaDeAula();
       a2.aluno = "Mindiski";
       System.out.println(a2.professor);
       
       
    }
}
