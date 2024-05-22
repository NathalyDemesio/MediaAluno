import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    //INICIALIZAÇÃO DE VARIÁVEIS
    int nota = 0;
    float mediaAritmetica = 0.0f;
    float mediaPonderada = 0.0f;
    int media = 0;

    //CAPTURA DE DADOS DO TECLADO
    Scanner entrada = new Scanner(System.in);

    //ESCOLHA DE MÉDIA
    System.out.print("Qual média você quer? (mediaArit = 1) (mediaPond = 2): ");
    media = entrada.nextInt();
    

    //ESTRUTURA DE REPETIÇÃO FOR PARA LEITURA DO TECLADO E ADIÇÃO NAS MÉDIAS
    for (int i = 1; i <= 4; i++) {

      System.out.print("Digite a nota " + i + ": ");
      nota = entrada.nextInt();
      
      if (media == 1) {
        mediaAritmetica += nota;
      } else {
        if ((i == 1) || (i == 2)) {
          mediaPonderada += nota * 2;
        } else {
          mediaPonderada += nota * 3;
        }
      }
      
    }
    

    //CALCULAR MÉDIAS
    mediaAritmetica /= 4;
    mediaPonderada /= 10;

    //ESTRUTURA DE DECISÃO PARA MOSTRAR RESPOSTA
    if (media == 1) {
      System.out.println("A média aritmética é " + mediaAritmetica);

      if (mediaAritmetica >= 7) {
        System.out.println("Você foi aprovado! :D");
      } else {
        System.out.println("Você foi reprovado! :(");
      }
    } else {
      System.out.println("A média ponderada é " + mediaPonderada);

      if (mediaPonderada >= 7) {
        System.out.println("Você foi aprovado! :D");
      } else {
        System.out.println("Você foi reprovado! :(");
      }
    }
   
  }
}
