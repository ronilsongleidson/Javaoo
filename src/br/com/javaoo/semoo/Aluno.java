package br.com.javaoo.semoo;

import br.com.javaoo.entities.DadosAlunos;

import java.util.Locale;
import java.util.Scanner;

public class Aluno {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        DadosAlunos a = new DadosAlunos();


        System.out.println("Digite o nome do Aluno: ");
        a.setName(scanner.nextLine());
        System.out.println();
        System.out.println("Digite as Notas: ");
        a.setNota1(scanner.nextDouble());
        a.setNota2(scanner.nextDouble());
        a.setNota3(scanner.nextDouble());
        System.out.println(a.getName());
        System.out.println("Nota Final " + a.somaNotas());

        a.statusAluno();


        scanner.close();

    }
}
