//Escreva um programa que calcule o IMC de um indivíduo, utilizando a
//fórmula IMC = peso / altura2



import java.util.Scanner;

public class calculadoraIMC {
  
  public static void main(String[] args) {
      
      Scanner scanner = new Scanner(System.in);

      //teclado de qual tipo!
      System.out.println("Digite seu nome:");
      String nome =  scanner.nextLine();
      System.out.println ("Digite sua idade:");
      int  idade = scanner.nextInt();
      System.out.println("Digite o peso em quilogramas:");
      double peso  = scanner.nextDouble();
      System.out.println("Digite a altura em metros:");
      double altura = scanner.nextDouble();

      double imc  = peso / (altura * altura);

      //mostrar é rescultado!
      System.out.println("O IMC é: " + imc);
      System.out.printf ("Seu nome: " + nome + "\n");
      System.out.println("O Seu Idade é: " + idade );


      //tipo Otimo, bem, mal, ruim
      if (imc < 18.5)
      System.out.println ("Abaixo do peso ideal, vamos melhorar!");
      
      else if ((imc > 18.5) &&(imc <24.9))
          System.out.println ("Voce esta no peso ideal, parabens!");

      else if ((imc > 25.0)&& (imc <29.9))
          System.out.println("Voce está com excesso de peso, vamos melhorar!");
      else if ((imc > 30.0) && (imc <34.9))
          System.out.println("Obesidade Classe I, cuidado!");
      else if ((imc > 35.0) && (imc <39.9))
          System.out.println ("Obesidade Classe II, ainda temos como mudar isso!");
      else if (imc >= 40)
          System.out.println ("Obesidade Classe III, procure ajuda, nada está perdido!");
             
        System.out.println("Obrigado :)");

      scanner.close();
  }
}
