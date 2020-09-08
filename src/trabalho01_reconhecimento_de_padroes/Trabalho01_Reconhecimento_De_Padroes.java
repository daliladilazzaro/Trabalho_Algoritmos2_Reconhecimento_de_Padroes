/*Entrega de trabalho TADS - Turma B
Nós, 
Dalila Di Lazzaro,
João Pedro Santos Costa
Renê Alves da Silva
declaramos que
todas as respostas são fruto de nosso próprio trabalho,
não copiamos respostas de colegas externos à equipe,
não disponibilizamos nossas respostas para colegas externos à equipe e
não realizamos quaisquer outras atividades desonestas para nos beneficiar ou prejudicar outros.*/
package trabalho01_reconhecimento_de_padroes;

import java.io.BufferedReader;
import java.io.FileReader;


public class Trabalho01_Reconhecimento_De_Padroes {

   public static void main(String[] args) throws Exception{

       //aqui ta com erro
        double [][] matriz = LerArquivo("matriz.txt");   
     
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(matriz[i] [j] + " ");
            }
            
        }
        
        System.out.println();

    }

    public static double[][] funcaoReconhecimentoPadroes(double[][] matriz) {
        return null;
    }

     public static double[][] LerArquivo(String Arquivo, double[][] matriz) throws Exception
    {
        FileReader arquivoGravado = new FileReader(Arquivo);
        
        BufferedReader ler = new BufferedReader(arquivoGravado);
        
        String linha1 = ler.readLine();
        String linha2 = ler.readLine();
        
        ler.close();
        
        //converter String para double
        double linhas = Double.parseDouble(linha1);
        double colunas = Double.parseDouble(linha2); 
        //aqui ta com erro
        matriz[][]=new double[linhas][colunas];
      
        
        String[] dados = linha1.split(" ");
        
        for (int i = 0; i < matriz.length; i++) 
        {
            for (int j = 0; j < matriz.length; j++) 
            {
             //ta com erro   matriz[i][j]= Float.parseFloat(dados[i][j]);
            }
            
        }
        
        return matriz;
    }

}
