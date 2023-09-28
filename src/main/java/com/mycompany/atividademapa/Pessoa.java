package com.mycompany.atividademapa;

/**
 *
 * @author Rafael Durgante
 */
public class Pessoa {

    private String nome;
    private String tipoSanguineo;
    private int anoNascimento;
    
    
    public Pessoa(String nome, String tipoSanguineo, int anoNascimento){
        this.nome = nome;
        this.tipoSanguineo = tipoSanguineo;
        this.anoNascimento = anoNascimento;
    }
    
    public int calculaIdade (){
        int anoAtual =2023; 
        return anoAtual - anoNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoSanguineo() {
        return tipoSanguineo;
    }

    public void setTipoSanguineo(String tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }
    
}
