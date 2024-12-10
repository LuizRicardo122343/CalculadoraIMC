package grupo;

import java.util.Scanner;

public class ExercicioIMC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Exercicio IMC - Calculadora de IMC" + "\n");

        System.out.println("Digite o nome da pessoa: ");
        String nome = sc.nextLine();

        System.out.println("Digite a idade da pessoa: ");
        int idade = sc.nextInt();

        System.out.println("Digite o peso da pessoa (kg): ");
        double peso = sc.nextDouble();

        System.out.println("Digite a altura da pessoa (m): ");
        double altura = sc.nextDouble();

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    
        double imc = calcularIMC(peso, altura);

        classificarPessoa(imc);

        System.out.println("IMC: " + imc);
        
        sc.close();
    }
    
    public static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);

    }
    public static void classificarPessoa(double imc) {
        String classificacao;

        if (imc < 18.5) {
            classificacao = "A pessoa está abaixo do peso.";
        } else if (imc > 18.5 && imc < 25) {
            classificacao = "A pessoa está no peso normal.";
        } else if (imc > 25.0 && imc < 29.9) {
            classificacao = "A pessoa está com sobrepeso.";
        } else if (imc > 30.0 && imc < 34.9) {
            classificacao = "A pessoa está com obesidade grau I.";
        } else if (imc > 35.0 && imc < 39.9) {
            classificacao = "A pessoa está com obesidade grau II.";
        } else {
            classificacao = "A pessoa está com obesidade grau III.";
        }

        System.out.println(classificacao);

    }
}
