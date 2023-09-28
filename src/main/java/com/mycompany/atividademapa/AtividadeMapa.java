package com.mycompany.atividademapa;

import javax.swing.JOptionPane;

/**
 * @author Rafael Durgante
 */
public class AtividadeMapa {

    public static void main(String[] args) {
        Pessoa pessoa = null;
        double quantidadeGlicose =0;
        double valorLDL =0;
        double valorHDL =0;
        String riscoColesterol = "";
        double valorTriglicerideos = 0;
        
        
        try{
            String nome = JOptionPane.showInputDialog("Digite o nome do paciente:");
            String tipoSanguineo = JOptionPane.showInputDialog("Digite o tipo sanguineo do paciente:");
            int anoNascimento = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de nascimento do paciente:"));
        
            pessoa = new Pessoa( nome, tipoSanguineo, anoNascimento);
    
            quantidadeGlicose = Double.parseDouble(JOptionPane.showInputDialog("Digite a Quantidade de Glicose"));
            
            valorLDL = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do LDL:"));
            valorHDL = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do HDL:"));
            riscoColesterol = JOptionPane.showInputDialog("Digite o risco do paciente (B-Baixo,M-Médio ou A-Alto):");
            
            valorTriglicerideos = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor dos Triglicerideos:"));
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Entrada inválida");
            System.exit(1);
        }
               
    Exame exameGlicemia = new ExameGlicemia(pessoa, quantidadeGlicose);
    Exame exameColesterol = new ExameColesterol (pessoa, valorLDL, valorHDL, riscoColesterol);
    Exame exameTriglicerideos = new ExameTriglicerideos(pessoa, valorTriglicerideos);
               
    exameGlicemia.mostrarResultado();
    exameColesterol.mostrarResultado();
    exameTriglicerideos.mostrarResultado();
    
    }
}
