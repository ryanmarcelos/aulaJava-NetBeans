/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula2;

/**
 *
 * @author aluno
 */
import java.util.Scanner;
import Animal.Gato;
public class Aula2 {

    public static void main(String[] args) {
       
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual seu nome? ");
        String palavra = entrada.nextLine();
       System.out.println("Qual sua idade? ");
       int numero = entrada.nextInt();
       
       System.out.println("Seu nome é " + palavra + " e sua idade é " + numero);
       entrada.close();
    }
}
