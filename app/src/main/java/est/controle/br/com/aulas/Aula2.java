package est.controle.br.com.aulas;

import java.util.Scanner;

public class Aula2 implements Aula {
    private Scanner scanner;
    public Aula2(Scanner scanner) {
        System.out.println("\nAula 2 - Switch case\n");
        this.scanner = scanner;
    }

    @Override
    public void execute() {
        System.out.print("Digite um número de 1 a 7: ");
        int dia = this.scanner.nextInt();
        String message = "";
        switch (dia) {
            case 1,7-> {
                String diaDaSemana = (dia == 1) ? "Domingo" : "Sábado";
                message = "Fim de semana: " + diaDaSemana;
            }
            case 2-> message = "Segunda-feira";
            case 3-> message = "Terça-feira";
            case 4-> message = "Quarta-feira";
            case 5-> message = "Quinta-feira";
            case 6-> message = "Sexta-feira";
            default -> message = "Número inválido";
        }
        System.out.println(message);
    }
}
