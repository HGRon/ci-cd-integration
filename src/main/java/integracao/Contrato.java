package integracao;

public class Contrato {

    private Pessoa pessoa;
    private TipoContrato tipo;

    public Contrato(Pessoa pessoa, TipoContrato tipo) {
        this.pessoa = pessoa;
        this.tipo = tipo;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public TipoContrato getTipo() {
        return tipo;
    }

    public void setTipo(TipoContrato tipo) {
        this.tipo = tipo;
    }
}
