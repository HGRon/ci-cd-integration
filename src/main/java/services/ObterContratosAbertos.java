package services;

import entities.Pessoa;

import java.util.Arrays;
import java.util.List;

public class ObterContratosAbertos {

    public List<Pessoa> getPessoasComContratosParciaisPendentes() {
        return Arrays.asList(
                new Pessoa("Willian", 19),
                new Pessoa("Marcos", 23),
                new Pessoa("Sara", 25),
                new Pessoa("Fabiana", 20),
                new Pessoa("Clarice", 29),
                new Pessoa("Ana", 17),
                new Pessoa("Gabriel", 24)
        );
    }

    public List<Pessoa> getPessoasComContratosIntegraisPendentes() {
        return Arrays.asList(
                new Pessoa("Jorge", 20),
                new Pessoa("Rodrigo", 26),
                new Pessoa("Lara", 19),
                new Pessoa("Rita", 42),
                new Pessoa("Janaina", 53),
                new Pessoa("Celso", 19),
                new Pessoa("Arthur", 32)
        );
    }

}
