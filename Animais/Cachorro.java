package Animais;

public class Cachorro extends Animal {
    private int tamanhoDoRabo;
    static int numeroDeCachorros;

    // Construtor
    public Cachorro(String nome, String cor, double peso, int altura, String estadoDeEspirito, int tamanhoDoRabo) {
        super(nome, cor, peso, altura); // Chama o construtor da superclasse
        this.setEstadoDeEspirito(estadoDeEspirito); 
        this.tamanhoDoRabo = tamanhoDoRabo;
        numeroDeCachorros++;
    }

    // Métodos
    public int getNumeroDeCachorros() {
        return numeroDeCachorros;
    }

    public static void setNumeroDeCachorros(int numeroDeCachorros) {
        Cachorro.numeroDeCachorros = numeroDeCachorros;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getTamanhoDoRabo() {
        return tamanhoDoRabo;
    }

    public void setTamanhoDoRabo(int tamanhoDoRabo) {
        this.tamanhoDoRabo = tamanhoDoRabo;
    }

    public String pegar() {
        return "bolinha";
    }

    public String interagir(String acao) {
        switch (acao) {
            case "carinho":
                this.setEstadoDeEspirito("feliz");
                break;
            case "vai dormir":
                this.setEstadoDeEspirito("bravo");
                break;
            case "pisar na pata":
                this.setEstadoDeEspirito("triste");
                break;
            default:
                this.setEstadoDeEspirito("neutro");
                break;
        }
        return this.getEstadoDeEspirito(); 
    }

    @Override
    public void soar() {
        System.out.println("au au");
    }

    @Override
    public String getEstadoDeEspirito() { 
        return this.estadoDeEspirito;
    }
}
