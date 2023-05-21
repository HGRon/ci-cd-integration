package entities;

import exceptions.FalhaContrato;
import org.junit.Test;
import services.Contratar;

import static org.junit.Assert.*;

public class ContratoTest {

    @Test(expected = FalhaContrato.class)
    public void deveFalharNoContratoMenor16Parcial() throws FalhaContrato {
        Pessoa pessoa = new Pessoa("Pedrico", 15);

        new Contratar().criaContratacao(pessoa, TipoContrato.TEMPO_PARCIAL);
    }

    @Test(expected = FalhaContrato.class)
    public void deveFalharNoContratoMenor16Integral() throws FalhaContrato {
        Pessoa pessoa = new Pessoa("Pedrico", 15);

        new Contratar().criaContratacao(pessoa, TipoContrato.INTEGRAL);
    }

    @Test()
    public void deveSucederNoContratoMenor18Parcial() throws FalhaContrato {
        Pessoa pessoa = new Pessoa("Marcio", 17);

        Contrato contrato = new Contratar().criaContratacao(pessoa, TipoContrato.TEMPO_PARCIAL);

        assertNotNull(contrato);
    }

    @Test(expected = FalhaContrato.class)
    public void deveFalharNoContratoMenor18Integral() throws FalhaContrato {
        Pessoa pessoa = new Pessoa("Marcio", 17);

        new Contratar().criaContratacao(pessoa, TipoContrato.INTEGRAL);
    }

    @Test()
    public void deveSucederNoContratoMaior18Parcial() throws FalhaContrato {
        Pessoa pessoa = new Pessoa("Alessandra", 20);

        Contrato contrato = new Contratar().criaContratacao(pessoa, TipoContrato.TEMPO_PARCIAL);

        assertNotNull(contrato);
    }

    @Test()
    public void deveSucederNoContratoMaior18Integral() throws FalhaContrato {
        Pessoa pessoa = new Pessoa("Alessandra", 20);

        Contrato contrato = new Contratar().criaContratacao(pessoa, TipoContrato.INTEGRAL);

        assertNotNull(contrato);
    }

    @Test(expected = FalhaContrato.class)
    public void deveFalharNoContratoMaior55Integral() throws FalhaContrato {
        Pessoa pessoa = new Pessoa("Enzo", 60);

        new Contratar().criaContratacao(pessoa, TipoContrato.INTEGRAL);
    }

    @Test(expected = FalhaContrato.class)
    public void deveFalharNoContratoMaior55Parcial() throws FalhaContrato {
        Pessoa pessoa = new Pessoa("Enzo", 60);

        new Contratar().criaContratacao(pessoa, TipoContrato.TEMPO_PARCIAL);
    }

}
