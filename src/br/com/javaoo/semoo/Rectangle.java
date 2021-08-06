package br.com.javaoo.semoo;

public class Rectangle {

    public static void main(String[] args) {
        double largura = 3.0;
        double altura = 4.00;
        double perimetro = 2.0 * largura + 2.0 * altura;
        double diagonal = Math.sqrt(Math.pow(largura, 2) + Math.pow(altura, 2));;
        double area = largura * altura;

        System.out.println("AREA = " + area);
        System.out.println("Perimeter = " + perimetro);
        System.out.println("Diagonal = " + diagonal);


    }
}
