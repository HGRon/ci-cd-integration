import entities.Contrato;
import entities.Pessoa;
import entities.TipoContrato;
import exceptions.FalhaContrato;
import services.Contratar;
import services.ObterContratosAbertos;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws FalhaContrato {
        ObterContratosAbertos servico = new ObterContratosAbertos();
        Contratar contratar = new Contratar();

        List<Pessoa> parciais = servico.getPessoasComContratosParciaisPendentes();
        List<Pessoa> integrais = servico.getPessoasComContratosIntegraisPendentes();

        ArrayList<Contrato> contratos = new ArrayList<>();

        for (Pessoa p : parciais) {
            System.out.println("Contratando " + p.getNome() + "...");
            Contrato contrato = contratar.criaContratacao(p, TipoContrato.TEMPO_PARCIAL);

            contratos.add(contrato);
        }

        for (Pessoa p : integrais) {
            System.out.println("Contratando " + p.getNome() + "...");
            Contrato contrato = contratar.criaContratacao(p, TipoContrato.INTEGRAL);

            contratos.add(contrato);
        }

        System.out.println("Contratos finalizados!");
        System.out.println("----------------------");

        for (Contrato contrato : contratos) {
            System.out.println("Contrato " + contrato.getTipo().name() + ": " + contrato.getPessoa().getNome());
        }
    }

}
