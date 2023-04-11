public class Cachorro extends HerancaPolimorfismoPOO {
    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    public void fazerSom() {
        System.out.println("O cachorro está latindo.");
    }
}
