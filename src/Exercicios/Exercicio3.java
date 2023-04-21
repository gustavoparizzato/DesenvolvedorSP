package Exercicios;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.json.JSONArray;

public class Exercicio3 {
    
    public static void main(String[] args) throws IOException{
  
/*
JSON utilizado disponível no arquivo 'faturamento.json' dentro do pacote.
Estou atualizando o projeto novamente para informar através deste comentário que não vi os arquivos disponibilizados para utilizar no programa, 
peço desculpas.
*/
  
        String json = "c:\\faturamento.json";
        JSONArray faturamentoJsonArray = new JSONArray(new String(Files.readAllBytes(Paths.get(json))));
        double[] faturamentoDiario = new double[faturamentoJsonArray.length()];
        
        for (int i = 0; i < faturamentoJsonArray.length(); i++) {
            faturamentoDiario[i] = faturamentoJsonArray.getDouble(i);
        }
        
        double menorFaturamento = faturamentoDiario[0];
        double maiorFaturamento = faturamentoDiario[0];
        double somaFaturamento = faturamentoDiario[0];
        int diasComFaturamento = 1;
        
        for (int i = 1; i < faturamentoDiario.length; i++) {
            if (faturamentoDiario[i] < menorFaturamento && faturamentoDiario[i] > 0) {
                menorFaturamento = faturamentoDiario[i];
            }
            if (faturamentoDiario[i] > maiorFaturamento) {
                maiorFaturamento = faturamentoDiario[i];
            }
            if (faturamentoDiario[i] > 0) {
                somaFaturamento += faturamentoDiario[i];
                diasComFaturamento++;
            }
        }
        
        double mediaFaturamento = somaFaturamento / diasComFaturamento;
        
        int diasAcimaDaMedia = 0;
        
        for (int i = 0; i < faturamentoDiario.length; i++) {
            if (faturamentoDiario[i] > mediaFaturamento) {
                diasAcimaDaMedia++;
            }
        }
        
        System.out.println("Menor faturamento diário: " + menorFaturamento);
        System.out.println("Maior faturamento diário: " + maiorFaturamento);
        System.out.println("Número de dias com faturamento acima da média mensal: " + diasAcimaDaMedia);
    }
}

