/*Entrega de trabalho
Nós, 
Dalila Di Lazzaro,
Nome completo 2
Nome completo 3
declaramos que
todas as respostas são fruto de nosso próprio trabalho,
não copiamos respostas de colegas externos à equipe,
não disponibilizamos nossas respostas para colegas externos à equipe e
não realizamos quaisquer outras atividades desonestas para nos beneficiar ou prejudicar outros.*/
package trabalho01_reconhecimento_de_padroes;

import java.util.Scanner;
import java.util.Random;

public class Trabalho01_Reconhecimento_De_Padroes {

    public static void main(String[] args) {

        int linhas = 0, colunas = 0;
        //linha de código para ler do teclado
        Scanner lerTeclado = new Scanner(System.in);

        //como a quantidade de linhas e colunas tem que ser >=3, fiz o do while
        do {
            //Ler a quantidade de linhas e colunas que terão na matriz
            System.out.print("Informe a dimensão de linhas valor igual ou superior a 3: ");
            linhas = lerTeclado.nextInt();
            System.out.print("Informe a dimensão de colunas valor igual ou superior a 3: ");
            colunas = lerTeclado.nextInt();
        } while (linhas >= 3 && colunas >= 3);

        //código para criar matriz, juntamente com a quantidade de linhas e colunas lidas anteriormente/ ponto flutuante
        float matriz[][] = new float[linhas][colunas];

    }

    public static void funcaoImprimeMatriz(float[][] matriz) {
        float matriz2[][] = funcaoGerarAleatoriedadeMatriz(matriz);
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                System.out.print(matriz2[i][j] + " ");
            }
            System.out.println("");
        }
        // return matriz2;
    }

//essa função é para gerar os valores aleatórios da Matriz a partir de Random
    public static float[][] funcaoGerarAleatoriedadeMatriz(float[][] matriz) {
        //Código Random para gerar valores aleatórios
        Random numerosAleatorios = new Random();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = numerosAleatorios.nextInt() + 1;
            }
        }

        return matriz;
    }
}
