package est.controle.br.com.aulas;

import java.util.Scanner;

public class Aula1 implements Aula {

    private Scanner scanner = new Scanner(System.in);

    public Aula1(Scanner scanner) {
        this.scanner = scanner;
        System.out.println("\nAula 1 - Checando idade\n");
    }

    @Override
    public void execute() {
        System.out.print("Digite sua idade: ");
        int idade = this.scanner.nextInt();

        System.out.print("Você é emancipado? (s/n) ");
        boolean emancipado = this.scanner.next().equalsIgnoreCase("s");
        String message ="";

        // Com uma linha de codigo não precisa de chaves, mas é uma boa prática colocar as chaves para melhor leitura do código
        if (idade >= 18) {
            message = "Você é maior de idade";
        } else if (idade >=16 && emancipado) {
            message ="Você é emancipado e menor de idade.";
        } else {
            message ="Você é menor de idade.";
        }
        System.out.println(message);
        
    }
}
