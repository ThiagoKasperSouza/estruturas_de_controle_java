package est.controle.br.com.aulas;

public class Aula3 implements Aula {

    public Aula3() {
        System.out.println("\nAula 3 - Estruturas de repetição - Loops for\n");
    }

    @Override
    public void execute() {
        /*  Loop infinito
            for (;;) {
                if (this.scanner.nextLine().equalsIgnoreCase("sair")) {
                    break;
                }
            }
         */

        System.out.println("\nLoop com for (com indice):\n");
        for (int i = 0; i < 5; i++) {
            System.out.println("For: " + i);
        }

        System.out.println("\nLoop com for (sem indice):\n");
        String[] nomes = {"Thiago", "João", "Maria", "José"};
        for (String nome : nomes) {
            System.out.println("For: " + nome);
        }
    }
    
}
