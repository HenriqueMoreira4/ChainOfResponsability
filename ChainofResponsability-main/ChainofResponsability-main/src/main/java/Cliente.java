public abstract class Cliente {
    private Cliente proximo;

    public Cliente(Cliente proximo) {
        this.proximo = proximo;
    }

    public Cliente() {}

    public String processarCadeia(String proximaClasse) {
        proximaClasse = gerarXML(proximaClasse);
        return proximo.processarCadeia(proximaClasse);
    }

    protected abstract String gerarXML(String dados);

    public Cliente getProximo() {
        return proximo;
    }

    public void setProximo(Cliente proximo) {
        this.proximo = proximo;
    }
}