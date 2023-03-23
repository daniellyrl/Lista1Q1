package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pessoa p1 = new Pessoa();
        System.out.println("Qual é o seu nome? ");
        p1.setEndereço(sc.next());
        System.out.println("Qual o seu endereço? ");
        p1.setEndereço(sc.next());
        System.out.println("Qual a sua idade? ");
        p1.setIdade(sc.nextInt());
        p1.calculoidade();
        System.out.println("Sua idade atual é " + p1.getIdade());

    }
}
