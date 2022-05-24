package Entidades;

public class Product {
    public String name;
    public double price;
    public int qtd;

    public double PrecoEmEstoque(){
        return price + qtd;
    }
    public void addEstoque(int qtd){
        this.qtd += qtd;
    }
    public void removEstoque(int qtd){
        this.qtd -= qtd;
    }
}