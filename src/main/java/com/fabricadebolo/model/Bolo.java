package main.java.com.fabricadebolo.model;

public class Bolo {
    String sabor;
    int tamanho;

    //Constructor (forno)
    public Bolo(String sabor, int tamanho) {
        this.sabor = sabor;
        this.tamanho = tamanho;
    }

    //Método para exibir o bolo pronto
    public void exibirDetalhes() {
        System.out.println("Bolo de " + sabor + " de tamanho " + tamanho + " cm.");
    }
}
