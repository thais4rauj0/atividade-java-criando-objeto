package br.com.atividade.objetos;

public class Aluguel{
    private int idAluguel;
    private int idCliente;
    private int idVeiculo;
    private String tipoAluguel;
    private String dataRetirada;
    private String dataDevolucao;
    private float kmRodado;
    private float valor;

    //Construtor cheio
    public Aluguel(int idAluguel, int idCliente, int idVeiculo, String tipoAluguel, String dataRetirada, String dataDevolucao, float kmRodado, float valor) {
        this.idAluguel = idAluguel;
        this.idCliente = idCliente;
        this.idVeiculo = idVeiculo;
        this.tipoAluguel = tipoAluguel;
        this.dataRetirada = dataRetirada;
        this.dataDevolucao = dataDevolucao;
        this.kmRodado = kmRodado;
        this.valor = valor;
    }

    //Construtor vazio
    public Aluguel() {
    }

    //Getters e Setters
    public int getIdAluguel() {
        return idAluguel;
    }

    public void setIdAluguel(int idAluguel) {
        this.idAluguel = idAluguel;
    }

    public int getIdCliente(){
        return idCliente;
    }

    public void setIdCliente(int idCliente){
        this.idCliente = idCliente;
    }
    public int getIdVeiculo(){
        return idVeiculo;
    }
    public void setIdVeiculo(int idVeiculo){
        this.idVeiculo= idVeiculo;
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
        return "\n--------------------ALUGUEL--------------------" +
                "\n ID do Aluguel: " + idAluguel +
                "\n ID do cliente: "+ idCliente +
                "\n ID do Veículo: " + idVeiculo +
                "\n Tipo do Aluguel: " + tipoAluguel +
                "\n Data da retirada: " + dataRetirada +
                "\n Data da devolução: " + dataDevolucao +
                "\n KM rodados: " + kmRodado + " km" +
                "\n Valor do Aluguel: " + "R$ " + valor;
    }
}
