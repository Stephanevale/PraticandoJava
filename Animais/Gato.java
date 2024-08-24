package Animais;

// classe
public class Gato extends Animal {
    static int numeroDeGatos;

    public Gato(String nome, String cor, double peso, int altura) {
        super(nome, cor, peso, altura); 
        numeroDeGatos++;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "nome='" + nome + '\'' +
                '}';
    }

    @Override
    public void soar() {
        System.out.println("Miau");
    }

    @Override
    public String getEstadoDeEspirito() {
        return super.getEstadoDeEspirito(); // Implementa a interface
    }
}
