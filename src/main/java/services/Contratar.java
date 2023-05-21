package services;

import exceptions.FalhaContrato;
import integracao.Contrato;
import integracao.Pessoa;
import integracao.TipoContrato;

public class Contratar {

    public Contrato criaContratacao(Pessoa pessoa, TipoContrato tipo) throws FalhaContrato {
        if (pessoa.getIdade() < 16 || pessoa.getIdade() > 55) {
            throw new FalhaContrato("Não é possível contratar uma pessoa menor de 16 anos ou maior de 55 anos");
        }

        if (pessoa.getIdade() < 18 && tipo != TipoContrato.TEMPO_PARCIAL) {
            throw new FalhaContrato("Não é possível contratar uma pessoa menor de 18 anos em tempo integral");
        }

        return new Contrato(pessoa, tipo);
    }

}
