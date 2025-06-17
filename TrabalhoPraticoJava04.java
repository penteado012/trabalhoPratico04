/*
Nome: Kaik Persike Maiorquino
Prontuario: CB3029689

Nome: Matheus Penteado de Barros
Prontuario: CB3031501
*/
package com.mycompany.trabalhopraticojava04;

public class TrabalhoPraticoJava04 {

    public static void main(String[] args) {
        System.out.println("=== Teste com entrada do usuario ===");
        Data data1 = new Data();
        System.out.println("Dia: " + data1.retDia());
        System.out.println("Mes: " + data1.retMes());
        System.out.println("Ano: " + data1.retAno());
        
        data1.mostra1();
        data1.mostra2();
        
        System.out.println("=== Teste com entrada do usuario (setters) ===");
        
        data1.entraDia(0); // exibe erro, pede para digitar de novo
        data1.entraMes(2);
        data1.entraAno(2025);
        
        data1.mostra1();
        data1.mostra2();
        
        System.out.println("E bissexto? " + (data1.bissexto() ? "Sim" : "Nao"));

        System.out.println("Dias transcorridos: " + data1.diasTranscorridos());
        
        System.out.println("=== Teste com entrada do usuario (encapsulamento) ===");
        
        Data data2 = new Data(12, 2, 2006);
        
        data2.mostra1();
        data2.mostra2();
        
        Data.apresentaDataAtual();
    }
    
}
