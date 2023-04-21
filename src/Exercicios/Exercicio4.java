package Exercicios;

import java.util.HashMap;
import java.util.Map;

public class Exercicio4 {

	public static void main(String[] args) {
		
	        Map<String, Double> faturamento = new HashMap<>();
	        
	        faturamento.put("SP", 67836.43);
	        faturamento.put("RJ", 36678.66);
	        faturamento.put("MG", 29229.88);
	        faturamento.put("ES", 27165.48);
	        faturamento.put("Outros", 19849.53);

	        double total = faturamento.values().stream().mapToDouble(Double::doubleValue).sum();

	        Map<String, Double> percentuais = new HashMap<>();
	        for (String estado : faturamento.keySet()) {
	            double valor = faturamento.get(estado);
	            double percentual = (valor / total) * 100;
	            percentuais.put(estado, percentual);
	        }

	        System.out.println("Percentual de representação por estado:");
	        for (String estado : percentuais.keySet()) {
	            double percentual = percentuais.get(estado);
	            System.out.printf("%s - %.2f%%\n", estado, percentual);
	        }
	  }
}
