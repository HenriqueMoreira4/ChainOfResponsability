public class InfoEmpresa extends Cliente{
    private String endereco;
    private String nomeEmpresa;
    private String xml;

    public InfoEmpresa(Cliente proximo) {
        super(proximo);

    }

    @Override
    protected String gerarXML(String dados) {
        this.endereco = "Av. A";
        this.nomeEmpresa = "Empresa";
        this.xml = "<infoEmpresa>xxxxx</infoEmpresa>";
        return xml;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public String getXml() {
        return xml;
    }

    public void setXml(String xml) {
        this.xml = xml;
    }


}