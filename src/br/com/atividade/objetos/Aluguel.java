package br.com.atividade.objetos;

public class Aluguel{
    private int idAluguel;
    private String tipoAluguel;
    private String dataRetirada;
    private String dataDevolucao;
    private float kmRodado;
    private float valor;

    public Aluguel(int idAluguel, String tipoAluguel, String dataRetirada, String dataDevolucao, float kmRodado, float valor) {
        this.idAluguel = idAluguel;
        this.tipoAluguel = tipoAluguel;
        this.dataRetirada = dataRetirada;
        this.dataDevolucao = dataDevolucao;
        this.kmRodado = kmRodado;
        this.valor = valor;
    }

    public Aluguel() {
    }

    public int getIdAluguel() {
        return idAluguel;
    }

    public void setIdAluguel(int idAluguel) {
        this.idAluguel = idAluguel;
    }

    public String getTipoAluguel() {
        return tipoAluguel;
    }

    public void setTipoAluguel(String tipoAluguel) {
        this.tipoAluguel = tipoAluguel;
    }

    public String getDataRetirada() {
        return dataRetirada;
    }

    public void setDataRetirada(String dataRetirada) {
        this.dataRetirada = dataRetirada;
    }

    public String getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(String dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public float getKmRodado() {
        return kmRodado;
    }

    public void setKmRodado(float kmRodado) {
        this.kmRodado = kmRodado;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return " --------------------ALUGUEL--------------------" + "\n ID do Aluguel: " + idAluguel +
                "\n Tipo do Aluguel: " + tipoAluguel +
                "\n Data da retirada: " + dataRetirada +
                "\n Data da devolução: " + dataDevolucao +
                "\n KM rodados: " + kmRodado + " km" +
                "\n Valor do Aluguel: " + "R$ " + valor;
    }
}
