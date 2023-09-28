package com.mycompany.atividademapa;

/**
 *
 * @author Rafael Durgante
 */
public class ExameGlicemia extends Exame {
    
    private final double quantidadeGlicose;
    
    public ExameGlicemia (Pessoa paciente, double valor){
        super(paciente, valor);
        this.quantidadeGlicose = valor;
            }

    @Override
    public String classificarResultado() {
        if (quantidadeGlicose <= 100){
            return "Normoglicemia";
        }else if (quantidadeGlicose <= 126 ){
            return "Pré-Diabetes";
        }else {
            return "Diabetes estabelecida";
        }
    }
}
