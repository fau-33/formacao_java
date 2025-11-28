package composicao_exercicios.umpraum;

@SuppressWarnings("all")
public class Computador {
    private String processador;
    // Uma instância da classe Gabinete (para implementar a composição).
    private Gabinete gabinete;

   // A classe Computador deve ter um construtor que receba o nome do processador, o modelo do gabinete e a cor do gabinete. Dentro deste construtor, você deve instanciar o objeto Gabinete.
    public Computador(String processador, String modelo, String cor) {
        this.processador = processador;
        this.gabinete = new Gabinete(modelo, cor);
    }


    public void montarSistema() {
        System.out.println("-------- SISTEMA MONTADO --------");
        System.out.println("Processador: " + this.processador);

        System.out.println("Modelo do Gabinete: " + this.gabinete.getModelo());
        System.out.println("Cor do Gabinete: " + this.gabinete.getCor());
        System.out.println("-----------------------------");

    }


}
