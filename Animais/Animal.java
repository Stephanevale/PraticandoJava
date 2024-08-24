package Animais;

public abstract class Animal {
    protected String nome;
    protected String cor;
    protected int altura;
    protected double peso;
    protected String estadoDeEspirito;

    public Animal(String nome, String cor, double peso, int altura, String estadoDeEspirito){
        this.nome = nome;
        this.cor = cor;
        this.peso = peso;
        this.altura = altura;
        this.estadoDeEspirito = estadoDeEspirito;
    }

    public Animal(String nome, String cor, double peso, int altura) {
        this(nome, cor, peso, altura, "neutro");
    }

    public String getNome() { 
        return nome;
    }

    protected void comer(){
        System.out.println(nome + " está comendo.");
    }

    protected void dormir(){
        System.out.println(nome + " está dormindo.");
    }

    public void soar(){
        System.out.println(nome + " está emitindo um som.");
    }

    public String getEstadoDeEspirito() { 
        return estadoDeEspirito;
    }

    public void setEstadoDeEspirito(String estadoDeEspirito) {
        this.estadoDeEspirito = estadoDeEspirito;
    }
}










