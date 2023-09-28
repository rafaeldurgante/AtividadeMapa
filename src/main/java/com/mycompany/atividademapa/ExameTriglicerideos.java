package com.mycompany.atividademapa;

/**
 *
 * @author Rafael Durgante
 */
public class ExameTriglicerideos extends Exame{
    private final double quantidadeTriglicerideos;
    
    public ExameTriglicerideos(Pessoa paciente, double quantidadeTriglicerideos) {
        super(paciente, quantidadeTriglicerideos);
        this.quantidadeTriglicerideos = quantidadeTriglicerideos;
    }

    @Override
    public String classificarResultado() {
        if (paciente.calculaIdade() <= 9) {
            if (quantidadeTriglicerideos < 75) {
                return "Normal";
            } else {
                return "Elevado";
            }
        } else if (paciente.calculaIdade() <= 19) {
            if (quantidadeTriglicerideos < 90) {
                return "Normal";
            } else {
                return "Elevado";
            }
        } else {
            if (quantidadeTriglicerideos < 150) {
                return "Normal";
            } else {
                return "Elevado";
            }
        }
    }
}

