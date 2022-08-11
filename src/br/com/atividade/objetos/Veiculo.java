package br.com.atividade.objetos;

public class Veiculo {
    private int idVeiculo;
    private String cor;
    private String placa;
    private String chassi;
    private String modelo;
    private String marca;
    private String imagem;
    private int ano;
    private float km;

    public Veiculo(int idVeiculo, String cor, String placa, String chassi, String modelo, String marca, String imagem, int ano, float km) {
        this.idVeiculo = idVeiculo;
        this.cor = cor;
        this.placa = placa;
        this.chassi = chassi;
        this.modelo = modelo;
        this.marca = marca;
        this.imagem = imagem;
        this.ano = ano;
        this.km = km;
    }

    public Veiculo() {
    }

    public int getIdVeiculo() {
        return idVeiculo;
    }

    public void setIdVeiculo(int idVeiculo) {
        this.idVeiculo = idVeiculo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public float getKm() {
        return km;
    }

    public void setKm(float km) {
        this.km = km;
    }

    @Override
    public String toString() {
        return "-----------------VEÍCULO----------------" +
                "\n ID do Veículo: " + idVeiculo +
                "\n Cor: " + cor +
                "\n Placa: " + placa +
                "\n Chassi: " + chassi +
                "\n Modelo: " + modelo  +
                "\n Marca: " + marca +
                "\n Imagem" + imagem +
                "\n Ano: " + ano +
                "\n KM:" + km;
    }
}
