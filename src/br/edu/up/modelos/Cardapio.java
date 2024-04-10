package br.edu.up.modelos;

public class Cardapio {

    //Relações TEM UM
    private Gerente gerente;
    private Prato[] pratos;
    private Bebida[] bebidas;
    private Sobremesa[] sobremesas;
    
    
    public Cardapio() {
    }
    
    public Cardapio(Gerente gerente) {
        this.gerente = gerente;
    }
      
    public Cardapio(Prato[] pratos, Bebida[] bebidas, Sobremesa[] sobremesas) {
        this.pratos = pratos;
        this.bebidas = bebidas;
        this.sobremesas = sobremesas;
    }
    
    public Cardapio(Gerente gerente, Prato[] pratos, Bebida[] bebidas, Sobremesa[] sobremesas) {
        this.gerente = gerente;
        this.pratos = pratos;
        this.bebidas = bebidas;
        this.sobremesas = sobremesas;
    }
    
    
    public Gerente getGerente() {
        return gerente;
    }
    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }
    public Prato[] getPratos() {
        return pratos;
    }
    public void setPratos(Prato[] pratos) {
        this.pratos = pratos;
    }
    public Bebida[] getBebidas() {
        return bebidas;
    }
    public void setBebidas(Bebida[] bebidas) {
        this.bebidas = bebidas;
    }
    public Sobremesa[] getSobremesas() {
        return sobremesas;
    }
    public void setSobremesas(Sobremesa[] sobremesas) {
        this.sobremesas = sobremesas;
    }  
}
