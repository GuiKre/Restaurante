package br.edu.up.modelos;

//Sobremesa é um item
public class Sobremesa extends Item {

    //Relações TEM UM
    private Ingrediente[] ingredientes;


    public Sobremesa() {
    }

    public Sobremesa(Ingrediente[] ingredientes) {
        this.ingredientes = ingredientes;
    }


    public Ingrediente[] getIngredientes() {
        return ingredientes;
    }
    public void setIngredientes(Ingrediente[] ingredientes) {
        this.ingredientes = ingredientes;
    }

    
}
