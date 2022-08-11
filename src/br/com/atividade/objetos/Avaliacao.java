package br.com.atividade.objetos;

public class Avaliacao{

    private int idAvaliação;
    private String descricao;
    private float nota;



    public Avaliacao(int idAvaliação, String descricao, float nota) {
        this.idAvaliação = idAvaliação;
        this.descricao = descricao;
        this.nota = nota;
    }

    public Avaliacao() {
    }

    public int getIdAvaliação() {
        return idAvaliação;
    }

    public void setIdAvaliação(int idAvaliação) {
        this.idAvaliação = idAvaliação;
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
        return "\n --------------AVALIAÇÃO---------------" + "\n ID da Avaliação: " + idAvaliação +
                "\n Descrição: " + descricao +
                "\n Nota: " + nota;
    }
}
