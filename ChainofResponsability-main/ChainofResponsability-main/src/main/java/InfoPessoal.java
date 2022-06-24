public class InfoPessoal extends Cliente{
    private String nome;
    private String cpf;
    private String xml;

    public InfoPessoal(Cliente proximo) {
        super(proximo);

    }

    public InfoPessoal(){

    }

    @Override
    protected String gerarXML(String dados) {
        this.nome = "João";
        this.cpf = "000.000.000-11";
        this.xml = "<infoPessoal>";
        return xml;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getXml() {
        return xml;
    }

    public void setXml(String xml) {
        this.xml = xml;
    }


}