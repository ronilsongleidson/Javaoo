package br.com.javaoo.comoo;

import br.com.javaoo.entities.Retangulo;

public class Aplicacao {

    public static void main(String[] args) {
        Retangulo r = new Retangulo();

        r.setAltura(3.0);
        r.setLargura(4.0);

        System.out.println("AREA = " + r.area);
        System.out.println("Perimeter = " + r.perimetro);
        System.out.println("Diagonal = " + r.diagonal);
    }

}
