public class Gato extends HerancaPolimorfismoPOO {
    public Gato(String nome) {
        super(nome);
    }

    @Override
    public void fazerSom() {
        System.out.println("O gato está miando.");
    }
}
