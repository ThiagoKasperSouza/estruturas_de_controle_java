package est.controle.br.com.aulas;

import java.util.Scanner;

public class Aula4 implements Aula {
    private Scanner scanner;
    public Aula4(Scanner scanner) {
        this.scanner = scanner;
        System.out.println("\nAula 4 - Estruturas de repetição - while e do-while\n");
    }

    @Override
    public void execute() {
        String name = "";
        System.out.println("\nLoop com while:\n");
        while(!name.equalsIgnoreCase("sair")) {
            System.out.print("Digite seu nome (ou 'sair' para encerrar): ");
            name = this.scanner.next();
            if (!name.equalsIgnoreCase("sair")) {
                System.out.println("Olá, " + name + "!");
            } else {
                break;
            }
        }

        System.out.println("\nAgora com do-while:\n");
        do {
            System.out.print("Digite seu nome (ou 'sair' para encerrar): ");
            name = this.scanner.next();
            if (!name.equalsIgnoreCase("sair")) {
                System.out.println("Olá, " + name + "!");
            } else {
                break;
            }
        } while (!name.equalsIgnoreCase("sair"));
    }
    
}
