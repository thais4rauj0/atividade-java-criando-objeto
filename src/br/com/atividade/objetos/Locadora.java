package br.com.atividade.objetos;

public class Locadora {
    private int idLocadora;
    private String logo;
    private String nome;
    private String CNPJ;

    public Locadora(Integer idLocadora, String logo, String nome, String CNPJ) {
        this.idLocadora = idLocadora;
        this.logo = logo;
        this.nome = nome;
        this.CNPJ = CNPJ;
    }

    public Locadora() {
    }

    public Integer getIdLocadora() {
        return idLocadora;
    }

    public void setIdLocadora(Integer idLocadora) {
        this.idLocadora = idLocadora;
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
                "\n Logo: " + logo +
                "\n Nome: " + nome  +
                "\n CNPJ: " + CNPJ;
    }
}
