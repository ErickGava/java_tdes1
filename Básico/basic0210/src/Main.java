import  java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome;
        int idade;
        String cpf;
        float altura;
        double peso;
        boolean civil;

        System.out.print("Digite seu nome: ");
        nome = scanner.nextLine();
        System.out.print("Digite sua idade: ");
        idade = scanner.nextInt();
        System.out.print("Digite seu cpf: ");
        cpf = scanner.nextLine();
        cpf = scanner.nextLine();
        System.out.print("Digite sua altura: ");
        altura = scanner.nextFloat();
        System.out.print("Digite seu peso: ");
        peso = scanner.nextDouble();
        System.out.print("Digite seu estado civil:");
        civil = scanner.nextBoolean();


        System.out.println("Seu nome é: "+nome+", Sua idade é: "+idade+", Seu cpf é: "+cpf+", Sua altura é: "+altura+", Seu peso é: "+peso+", Seu estado civil é: "+civil);
    }
}