package br.senai.arquivo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Arquivo {
	
	//Cria o Arquivo Quando Esse Não Existir e Grava Dados no Arquivo

	public boolean escrever(String caminho, String texto) {
		
		try {
			
			//OBJETO QUE REPRESENTA O ARQUIVO
			FileWriter arquivo = new FileWriter(caminho);
			
			//OBJETO QUE REPRESENTA A MANIPULAÇÃO (ESCREVER) DOS DADOS DO ARQUIVO
			PrintWriter escreverArq = new PrintWriter(arquivo);
			
			escreverArq.append(texto);
			escreverArq.close();
			return true;
			
		} catch (IOException e) {
			
			System.out.println("ERRO: " +e.getMessage());
			return false;
			
		}
		
	}
	
	public String ler(String caminho) {
		
		String conteudo = "";
		
		try {
			
			//Representa o Arquivo em Modo de Leitura
			FileReader arquivo = new FileReader(caminho);
			
			//Representa o Dado de Leitura na Mémoria Principal do Programa
			BufferedReader lerArquivo = new BufferedReader(arquivo);
			
			String linha;
			linha = lerArquivo.readLine();
			
			while (linha != null) {
				
				conteudo += linha +"\n";
				linha = lerArquivo.readLine();
				
			}
			arquivo.close();
			return conteudo;
			
		} catch (IOException e) {
			
			System.out.println("Erro: " +e);
			return "";
			
		}
		
	}
	
}
