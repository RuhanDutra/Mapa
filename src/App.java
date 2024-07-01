import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Cria o scanner para capturar os valores digitados pelos usuários
        Scanner scanner = new Scanner(System.in);
        // Escreve na tela a mensagem de orientação para o usuário
        System.out.println("Digite o primeiro: ");
        // Salva em uma variável o valor digitado pelo usuário
        double num1 = scanner.nextDouble();
        System.out.println("Digite a operação (+, -, *, /): ");
        String operation = scanner.next();
        System.out.println("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        double resultado = 0;
        
        // Usa o switch case (mecanismo de controle de seleção) para decidir qual operação fazer a depender da entrada do usário
        switch (operation) {
            case "+":
                resultado = num1 + num2;
                break;
            case "-":
                resultado = num1 - num2;
                break;
            case "*":
                resultado = num1 * num2;
                break;
            case "/":
            // Evita a divisão por 0 
                if (num2 != 0) {
                    resultado = num1 / num2;
                }
                break;
            default:
                // Mostra essa mensagem ao usuário caso ele não digite nenhuma das opções pré estabelecidas
                System.out.println("Operação não identificada.");
                return;
        }
        // Mostra o resultado na tela
        System.out.println("Resultado: " + resultado);
    }
}
