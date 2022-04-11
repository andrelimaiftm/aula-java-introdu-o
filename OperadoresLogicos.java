import java.util.Scanner;

public class OperadoresLogicos {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Nome: ");
        String nome = entrada.nextLine();

        System.out.println("Peso: ");
        int peso = entrada.nextInt();

        System.out.println("Altura: ");
        double altura = entrada.nextDouble();

        System.out.println("Sexo ('M' para Masculino ou 'F' para Feminino): ");
        char sexo = entrada.next().charAt(0);

        double imc = peso / (altura * altura);

        //      A      &&     B
       /* if(sexo == 'F' && imc < 19.1){
            System.out.println("Abaixo do peso.");
        }else if(sexo == 'F' && imc <= 25.8){
            System.out.println("Peso ideal");
        }else if(sexo == 'F' && imc <= 27.3){
            System.out.println("Um pouco acima do peso");
        }else if(sexo == 'M' && imc <= 26.4){
            System.out.println("Abaixo do peso");
        }*/
        //______________A_____________ ||  ____________B_____________
        if((sexo == 'F' && imc < 19.1) || (sexo == 'M' && imc < 20.7)){
            System.out.println("Abaixo do peso.");
        }else if((sexo == 'F' && imc <= 25.8) || (sexo == 'M' && imc <= 26.4)){
            System.out.println("Peso ideal.");
        }else if((sexo == 'F' && imc <= 27.3) || (sexo == 'M' && imc <= 27.8)){
            System.out.println("Um pouco acima do peso");
        }else if((sexo == 'F' && imc <= 32.3) || (sexo == 'M' && imc <= 31.1)){
            System.out.println("Acima do peso ideal.");
        }else if((sexo == 'F' && imc > 32.3 ) || (sexo == 'M' && imc > 31.1)){
            System.out.println("Obeso.");
        }
    }
}
