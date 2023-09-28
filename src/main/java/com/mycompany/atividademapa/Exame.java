package com.mycompany.atividademapa;

import javax.swing.JOptionPane;

/**
 *
 * @author Rafael Durgante
 */
public class Exame {
    public Pessoa paciente;
    double valor;
    
    public Exame (Pessoa paciente, double valor){
        this.paciente = paciente;
        this.valor = valor;        
    }
    
    public String classificarResultado(){
        return "Resultado não disponivel para este exame.";
    }
            
    public void mostrarResultado(){
        JOptionPane.showMessageDialog(null,
                "Tipo: " + getClass().getSimpleName() +
                "\nPaciente: " + paciente.getNome() +
                "\nIdade: " + paciente.calculaIdade() +
                "\nTipo Sanguineo: " + paciente.getTipoSanguineo() +
                "\nValor: " + valor +
                "\nClassificação: " + classificarResultado());
    }

    public Pessoa getPaciente() {
        return paciente;
    }
    
    public void setPaciente (Pessoa paciente){
        this.paciente = paciente;
    }

    public double getValor() {
        return valor;
    }
    
    public void setValor(double valor){
        this.valor = valor;
    }
       
}
