package br.com.atividade.objetos;

public class Endereco {
    private int idEndereco;
    private int idCliente;
    private int numero;
    private String logradouro;
    private String tipoLogradouro;
    private String complemento;
    private String uf;
    private String cidade;
    private String cep;
    private String bairro;

    public Endereco(int idEndereco, int idCliente, int numero, String logradouro, String tipoLogradouro, String complemento, String uf, String cidade, String cep, String bairro) {
        this.idEndereco = idEndereco;
        this.idCliente = idCliente;
        this.numero = numero;
        this.logradouro = logradouro;
        this.tipoLogradouro = tipoLogradouro;
        this.complemento = complemento;
        this.uf = uf;
        this.cidade = cidade;
        this.cep = cep;
        this.bairro = bairro;
    }

    public Endereco() {
    }

    public int getIdEndereco() {
        return idEndereco;
    }

    public void setIdEndereco(int idEndereco) {
        this.idEndereco = idEndereco;
    }

    public int getIdCliente(){
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getTipoLogradouro() {
        return tipoLogradouro;
    }

    public void setTipoLogradouro(String tipoLogradouro) {
        this.tipoLogradouro = tipoLogradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    @Override
    public String toString() {
        return "\n-------------ENDEREÇO---------------" +
                "\n ID do Endereço: " + idEndereco +
                "\n ID do Cliente: " + idCliente +
                "\n Tipo de Logradouro: " + tipoLogradouro +
                "\n Logradouro: " + logradouro +
                "\n Bairro: " + bairro  +
                "\n Número: " + numero +
                "\n Cidade: " + cidade+
                "\n UF: " + uf +
                "\n CEP: " + cep +
                "\n Complemento: " + complemento;
    }
}
