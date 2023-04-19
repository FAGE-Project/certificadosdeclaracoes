package br.com.cedi.util.utilitarios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

        
    public class LeitorCsv {

        
            private String csvFile = "";
            // le o arquivo e retorna no formato de texto separado por ; 
            
            public static String lerCSV(String arquivoCSV) {
            StringBuilder conteudo = new StringBuilder();
    
            try (BufferedReader br = new BufferedReader(new FileReader(arquivoCSV))) {
                String linha;
                while ((linha = br.readLine()) != null) {
                    String[] valores = linha.split(";");
                    for (String valor : valores) {
                        conteudo.append(valor).append(",");
                    }
                    conteudo.deleteCharAt(conteudo.length() - 1);
                    conteudo.append(";"+"\n");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
    
            return conteudo.toString();
        }
            

    public String getCsvFile() {
		return csvFile;
	}
    public void setCsvFile(String csvFile) {
		this.csvFile = csvFile;
	}
}