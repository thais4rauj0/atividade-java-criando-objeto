package br.com.atividade.objetos;

public class Locadora {
    private int idLocadora;
    private int idVeiculo;
    private int idEndereco;
    private String logo;
    private String nome;
    private String CNPJ;

    public Locadora(int idLocadora, String logo, String nome, String CNPJ) {
        this.idLocadora = idLocadora;
        this.logo = logo;
        this.nome = nome;
        this.CNPJ = CNPJ;
    }

    public Locadora() {
    }

    public int getIdLocadora() {
        return idLocadora;
    }

    public void setIdLocadora(int idLocadora) {
        this.idLocadora = idLocadora;
    }

    public int getIdEndereco() {
        return idEndereco;
    }

    public void setIdEndereco(int idEndereco) {
        this.idEndereco = idEndereco;
    }

    public int getIdVeiculo() {
        return idVeiculo;
    }

    public void setIdVeiculo(int idVeiculo) {
        this.idVeiculo = idVeiculo;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    @Override
    public String toString() {
        return "------------LOCADORA-------------" +
                "\n ID da locadora: " + idLocadora  +
                "\n ID do Veículo: " + idVeiculo +
                "\n ID do Endereço: " + idEndereco +
                "\n Logo: " + logo +
                "\n Nome: " + nome  +
                "\n CNPJ: " + CNPJ;
    }
}
