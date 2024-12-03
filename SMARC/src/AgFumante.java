import java.util.Scanner;

public class AgFumante {
    public void testeFangerstrom(){
        int x;

    }

    public int questionario() {
            Scanner resposta = new Scanner(System.in);
            int resultado = 0;

            // Pergunta 1
            System.out.println("1. Quanto tempo depois de acordar você usa seu 1º cigarro?");
            System.out.println("0 - Após 60 minutos");
            System.out.println("1 - Entre 31 e 60 minutos");
            System.out.println("2 - Entre 5 e 30 minutos");
            System.out.println("3 - Dentro de 5 minutos");
            resultado += resposta.nextInt();

            // Pergunta 2
            System.out.println("\n2. Você acha difícil não fumar em locais onde é proibido?");
            System.out.println("1 - Sim");
            System.out.println("0 - Não");
            resultado += resposta.nextInt();

            // Pergunta 3
            System.out.println("\n3. Qual cigarro do dia você considera mais difícil de largar?");
            System.out.println("1 - O primeiro");
            System.out.println("0 - Outro");
            resultado += resposta.nextInt();

            // Pergunta 4
            System.out.println("\n4. Quantos cigarros você fuma por dia?");
            System.out.println("0 - 10 ou menos");
            System.out.println("1 - 11 a 20");
            System.out.println("2 - 21 a 30");
            System.out.println("3 - 31 ou mais");
            resultado += resposta.nextInt();

            // Pergunta 5
            System.out.println("\n5. Você fuma mais frequentemente nas primeiras horas após acordar?");
            System.out.println("1 - Sim");
            System.out.println("0 - Não");
            resultado += resposta.nextInt();

            // Pergunta 6
            System.out.println("\n6. Você fuma mesmo estando tão doente que precisa ficar na cama?");
            System.out.println("1 - Sim");
            System.out.println("0 - Não");
            resultado += resposta.nextInt();

            resposta.close();
            return resultado;
        }
}
