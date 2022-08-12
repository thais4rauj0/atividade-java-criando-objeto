package br.com.atividade.objetos;

public class Avaliacao{

    private int idAvaliacao;

    private int idCliente;

    private int idLocadora;
    private String descricao;
    private float nota;


    public Avaliacao(int idAvaliacao, String descricao, float nota, int idCliente, int idLocadora) {
        this.idAvaliacao = idAvaliacao;
        this.descricao = descricao;
        this.nota = nota;
        this.idCliente = idCliente;
        this.idLocadora = idLocadora;
    }

    public Avaliacao() {
    }

    public int getIdAvaliacao() {
        return idAvaliacao;
    }

    public void setIdAvaliacao(int idAvaliacao) {
        this.idAvaliacao = idAvaliacao;
    }

    public int getIdCliente(){
        return idCliente;
    }

    public void setIdCliente(int idCliente){
        this.idCliente = idCliente;
    }

    public int getIdLocadora(){
        return idLocadora;
    }

    public void setIdLocadora(int idLocadora){
        this.idLocadora = idLocadora;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }


    @Override
    public String toString() {
        return "\n --------------AVALIAÇÃO---------------" +
                "\n ID da Avaliação: " + idAvaliacao +
                "\n Cliente: " + idCliente +
                "\n Locadora: " + idLocadora +
                "\n Descrição: " + descricao +
                "\n Nota: " + nota;
    }
}
