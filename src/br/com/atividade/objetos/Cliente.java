package br.com.atividade.objetos;

public class Cliente {
    private int idCliente;
    private String dataCriacao;
    private String dataNascimento;
    private String nome;
    private String email;
    private String cpf;
    private String celular;

    public Cliente(int idCliente, String dataCriacao, String dataNascimento, String nome, String email, String cpf, String celular) {
        this.idCliente = idCliente;
        this.dataCriacao = dataCriacao;
        this.dataNascimento = dataNascimento;
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.celular = celular;
    }

    public Cliente() {
    }


    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(String dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    @Override
    public String toString() {
        return "\n----------CLIENTE---------------"+
                "\n ID do Cliente: " + idCliente +
                "\n Data da criação: " + dataCriacao +
                "\n Data de Nascimento: " + dataNascimento +
                "\n Nome: " + nome +
                "\n Email: " + email +
                "\n CPF: " + cpf +
                "\n Celular: " + celular ;
    }
}
