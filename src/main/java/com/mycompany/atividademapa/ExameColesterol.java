package com.mycompany.atividademapa;

/**
 *
 * @author Rafael Durgante
 */
public class ExameColesterol extends Exame{
    
    private final double ValorLDL;
    private final double ValorHDL;
    private final String risco;

    public ExameColesterol(Pessoa paciente, double valorLDL, double valorHDL, String risco) {
        super(paciente, valorHDL );
        this.ValorLDL = valorLDL;
        this.ValorHDL = valorHDL;
        this.risco = risco;
    }

        @Override
        public String classificarResultado() {
            String classificacaoLDL ="LDL: ";
        switch (risco) {
            case "B":
                classificacaoLDL += (ValorLDL <100) ? "Baixo" : "Alto";
                break;
            case "M":
                classificacaoLDL +=(ValorLDL <70) ? "Baixo" : "Alto";
                break;
            case "A":
                classificacaoLDL +=(ValorLDL <50) ? "Baixo" : "Alto";
                break;
            default:
                break;
        }
            String classificacaoHDL ="HDL: ";
            if (paciente.calculaIdade() <=19) {
                classificacaoHDL += (ValorHDL >45) ? "BOM" : "RUIM";
            }else {
                classificacaoHDL += (ValorHDL >40) ? "BOM" : "RUIM";
            }
            return classificacaoLDL +", "+classificacaoHDL;
        }
    }

