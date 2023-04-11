public class TestesPOO {
    public static void main(String[] args) {
        AbstracaoEncapsulamentoPOO pessoa = new AbstracaoEncapsulamentoPOO("João", 30);
        pessoa.imprimirDados();
        pessoa.setNome("Maria");
        pessoa.setIdade(25);
        pessoa.imprimirDados();

        HerancaPolimorfismoPOO animal1 = new Cachorro("Totó");
        HerancaPolimorfismoPOO animal2 = new Gato("Frajola");
        animal1.fazerSom();
        animal2.fazerSom();
    }
}