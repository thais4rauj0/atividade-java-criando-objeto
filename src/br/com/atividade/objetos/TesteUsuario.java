package br.com.atividade.objetos;


import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class TesteUsuario {

    public static void main(String[] args){

        Aluguel aluguel = new Aluguel();
        aluguel.setIdAluguel(1);
        aluguel.setTipoAluguel("Carro de Passeio");
        aluguel.setValor(2500);
        aluguel.setKmRodado(25);
        aluguel.setDataDevolucao("25/08/2022");
        aluguel.setDataRetirada("11/08/2022");

        System.out.println(aluguel);

        Cliente cliente = new Cliente();
        cliente.setIdCliente(1);
        cliente.setNome("Roberta");
        cliente.setCpf("000.111.222-33");
        cliente.setDataNascimento("01/02/1996");
        cliente.setEmail("emaildaroberta@email.com");
        cliente.setCelular("(11) 9 7744 8899");
        cliente.setDataCriacao("11/08/2022");

        System.out.println(cliente);

        Endereco endereco = new Endereco();
        endereco.setIdEndereco(1);
        endereco.setTipoLogradouro("RUA");
        endereco.setLogradouro("Thomaz Gonzaga");
        endereco.setComplemento("");
        endereco.setCep("00011-222");
        endereco.setCidade("São Paulo");
        endereco.setNumero(61);
        endereco.setBairro("Liberdade");
        endereco.setComplemento("Bloco C");
        endereco.setUf("SP");

        System.out.println(endereco);

        Avaliacao avaliacao = new Avaliacao();
        avaliacao.setIdAvaliação(1);
        avaliacao.setDescricao("Carro legal");
        avaliacao.setNota(2);

        System.out.println(avaliacao);

        Locadora locadora = new Locadora();
        locadora.setIdLocadora(1);
        locadora.setCNPJ("000.111.222/0033-44");
        locadora.setNome("Novida");
        locadora.setLogo("url");

        System.out.println(locadora);

        Veiculo veiculo = new Veiculo();
        veiculo.setIdVeiculo(1);
        veiculo.setKm(25);
        veiculo.setCor("Preto");
        veiculo.setImagem("url");
        veiculo.setChassi("1AB CD23E F 4 5 678901");
        veiculo.setAno(2012);
        veiculo.setMarca("Volkswagen");
        veiculo.setModelo("CrossFox");
        veiculo.setPlaca("BRA2E22");

        System.out.println(veiculo);









    }
}
