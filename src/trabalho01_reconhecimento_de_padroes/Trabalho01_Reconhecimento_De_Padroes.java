/*Entrega de trabalho TADS - Turma B
Nós, 
Dalila Di Lazzaro,
João Pedro Santos Costa
Nome completo 3
declaramos que
todas as respostas são fruto de nosso próprio trabalho,
não copiamos respostas de colegas externos à equipe,
não disponibilizamos nossas respostas para colegas externos à equipe e
não realizamos quaisquer outras atividades desonestas para nos beneficiar ou prejudicar outros.*/
package trabalho01_reconhecimento_de_padroes;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.Random;

public class Trabalho01_Reconhecimento_De_Padroes {

    public static void main(String[] args) {

        int linhas = 0, colunas = 0, i = 0;
        //linha de código para ler do teclado
        Scanner lerTeclado = new Scanner(System.in);

        //como a quantidade de linhas e colunas tem que ser >=3, fiz o do while
        do {
            //Ler a quantidade de linhas e colunas que terão na matriz
            System.out.print("Informe a dimensão de linhas: ");
            linhas = lerTeclado.nextInt();
            System.out.print("Informe a dimensão de colunas: ");
            colunas = lerTeclado.nextInt();
            //caso a quantidade informada for <3
            if (linhas < 3) {
                System.out.println("\nPor favor, informe uma linha com valor igual ou maior que 3.");
                System.out.print("Informe a dimensão de linhas valor igual ou superior a 3: ");
                linhas = lerTeclado.nextInt();
                i++;//aqui é pra ele continuar rodando
            } else if (colunas < 3) {
                System.out.println("\nPor favor, informe uma coluna com valor igual ou maior que 3.");
                System.out.print("Informe a dimensão de colunas valor igual ou superior a 3: ");
                colunas = lerTeclado.nextInt();
                i++;
            }
            i++;
        } while (linhas < 3 && colunas < 3); //aqui, ele deve rodar enquanto for <3

        //código para criar matriz, juntamente com a quantidade de linhas e colunas lidas anteriormente/ ponto flutuante
        float matriz[][] = new float[linhas][colunas];

        //chamando as funções para poder imprimir na tela
        funcaoGerarAleatoriedadeMatriz(matriz);
        funcaoImprimeMatriz(matriz);//void-não tem retorno

    }

    public static float[][] funcaoReconhecimentoPadroes(float[][] matriz) {
        funcaoImprimeMatriz(matriz);

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

            }
        }

        return matriz;
    }

//função para imprimir a matriz gerada em funcaoGerarAleatoriedadeMatriz
    public static void funcaoImprimeMatriz(float[][] matriz) {

        //linha de código para limitar a quantidade de caracteres
        DecimalFormat valorParaDecimal = new DecimalFormat("0.0");

        //chamando a funcaoGerarAleatoriedadeMatriz pois lá onde gerou os valores
        float matriz2[][] = funcaoGerarAleatoriedadeMatriz(matriz);

        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                //aqui ele imprime e limita a quantidade de numeros para depois da virgula
                System.out.print(valorParaDecimal.format(matriz2[i][j]) + " ");
            }
            System.out.println("");//Ele pula a linha para a matriz
        }
        // return matriz2;
    }

//essa função é para gerar os valores aleatórios da Matriz a partir de Random
    public static float[][] funcaoGerarAleatoriedadeMatriz(float[][] matriz) {
        //Código Random para gerar valores aleatórios, incluindo valor 1 para gerar de 0.0 até 1.0
        Random numerosAleatorios = new Random(1);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                //inclusão de valor no random, pra poder gerar dentro desse valor, e +1 pra não gerar velor negativo
                matriz[i][j] = numerosAleatorios.nextFloat();
            }
        }

        return matriz;
    }
}
