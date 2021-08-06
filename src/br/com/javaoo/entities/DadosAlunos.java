package br.com.javaoo.entities;

public class DadosAlunos {

    private String name;
    private double nota1;
    private double nota2;
    private double nota3;




    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }


    public double setNota2(double v) {
        return nota2 = nota2;
    }

    public double setNota3(double v) {
        return nota3 = nota3;
    }

    public double somaNotas(){return nota1 + nota2 + nota3;}

    public double faltaPonto(){
        if (somaNotas() < 60.0){
            return 60.0 - somaNotas();
        }else {
            return 0.0;
        }
    }

    public void statusAluno() {
        if (somaNotas() < 60.0){
            System.out.println("Reprovado");
            System.out.printf("Faltam: %.2f%n" + faltaPonto());
        }else {
            System.out.println("Aprovado");
        }
    }
}
