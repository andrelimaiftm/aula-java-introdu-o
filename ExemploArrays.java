public class ExemploArrays {
    
    public static void main(String[] args) {
       // int[] notas;
       // notas = new int[4];

    //   int[] notas = new int[4];
         int[] notas = new int[5];
       notas[0] = 10;
       notas[1] = 5;
       notas[2] = 8;
       notas[3] = 9;
       notas[4] = 7;

       System.out.println("Nota do primeiro aluno: " + notas[0]);

       System.out.println("Tamanho do array: " + notas.length);
       //for (int i = 0; i < 4; i++) {
        for (int i = 0; i < notas.length; i++) {
           System.out.println("Posicao[" + i +"] = " + notas[i]);
       }

    }

    
}
