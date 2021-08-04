package br.com.javaoo.entities;

public class Product {


    private String name;
    private double price;
    private int quantity;
    private String color;


    //metodos acessores
    public void setName(String nome){

        this.name = nome;

    }

    public String getName(){

        return name;
    }



    public void setPrice(double price){

        this.price = price;

    }

    public double getPrice(){

        return price;
    }


    public void setQuantity(int quantidade){

        this.quantity = quantidade;

    }

    public int getQuantity(){

        return quantity;
    }

    public void setColor(String cor){
        this.color = cor;

    }

    public String getColor() {

        return color;
    }

    public double totalValueInStok(){

        return quantity * price;
    }

    public void addProducts(int quantity){
        if (quantity < 0){
            return;
        }
        this.quantity += quantity;
    }

    public void removeProducts(int quantity){
        if (this.quantity < quantity ){
            return;
        }
        this.quantity -= quantity;
    }

}
