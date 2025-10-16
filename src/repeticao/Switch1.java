package repeticao;

@SuppressWarnings("all")
public class Switch1 {
    public static void main(String[] args) {

        int idade = 0;

        switch (idade) {
            case 3:
                System.out.println("Sabe Java");
            case 2:
                System.out.println("Sabe falar");
            case 1:
                System.out.println("Sabe andar");
            case 0:
                System.out.println("Sabe respirar");
            default:
                System.out.println("Idade inválida");

        }

        String faixa = "Preta";
        switch (faixa) {

            case "Preta":
                System.out.println("Sabe Bassai-Dai");
            case "Marrom":
                System.out.println("Sabe Tekki Shodan");
            case "Roxa":
                System.out.println("Sabe Heian Godan");
            case "Verde":
                System.out.println("Sabe Heian Yodan");
            case "Laranja":
                System.out.println("Sabe Heian Sandam");
            case "Vermelha":
                System.out.println("Sabe Heian Nidan");
            case "Amarela":
                System.out.println("Sabe Heian Shodan");
                break;
            default:
                System.out.println("não sei de nada !");
        }
    }
}
