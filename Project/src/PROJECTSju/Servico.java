package PROJECTSju;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;

/**
 * Classe que disponibiliza um conjunto de metodos para realizar uma gestao de servicos numa empresa que compra e vende veiculos
 *
 * @author Juda Imbo
 */
public class Servico implements Serializable {
    /**
     * Variavel utilizada para identificar um servico
     */
    private int numero;
    /**
     *Variavel utilizada para registar um veiculo envolvido num servico
     */
    private Veiculo veiculo;
    /**
     * Variavel utilizada para registar uma data de inicio de um servico
     */
    private Calendar dataIni;
    /**
     * Variavel utilizada para registar uma data de fim de um servico
     */
    private Calendar dataFim;
    /**
     * Variavel utilizada para registar um funcionario envolvido num servico
     */
    private Funcionario funcionario;
    /**
     * Variavel utilizada para indicar em que estado se encontra: I-iniciado N-negociacao C-concluido
     */
    private char estado = 'I';
    /**
     *Variavel utilizada para indicar em que condicao se encontra: S- com sucesso I- sem sucesso
     */
    private String condicao = "";
    /**
     *Variavel utilizada para registar o preco final de um servico
     */
    private double precoFinal=0;
    /**
     *Variavel utilizada para registar um cliente envolvido num servico
     */
    private Cliente cliente;


    /**
     * Construtor da Classe Servico
     *
     * @param veiculo recebe um veiculo do tipo veiculo
     * @param dataIni recebe uma data do tipo calendar
     * @param funcionario recebe um funcionario do tipo funcionario
     * @param cliente recebe um cliente do tipo cliente
     */
    public Servico(Veiculo veiculo, Calendar dataIni, Funcionario funcionario, Cliente cliente) {
        this.veiculo = veiculo;
        this.dataIni = dataIni;
        this.funcionario = funcionario;
        this.cliente = cliente;

    }


    public Veiculo getVeiculo() {
        return veiculo;
    }

    public Calendar getDataIni() {
        return dataIni;
    }

    public Calendar getDataFim() {
        return dataFim;
    }

    public void setDataFim(Calendar dataFim) {
        this.dataFim = dataFim;
    }

    public char getEstado() {
        return estado;
    }

    public void setEstado(char estado) {
        this.estado = estado;
    }

    public void setCondicao(String condicao) {
        this.condicao = condicao;
    }

    public void setPrecoFinal(double precoFinal) {
        this.precoFinal = precoFinal;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }


    /**
     * Arraylist que guarda todas as negociacoes
     */
    ArrayList<Negociacao> negociacoes = new ArrayList<>();


    /**
     * Funcao para mostrar uma lista de negociacoes
     *
     * @return devolve uma string com as negociacoes
     */
    public String mostrarNegociacoes() {
        StringBuilder s = new StringBuilder("");
        for (int i = 0; i < negociacoes.size(); i++) {
            s.append("Negociações associadas: \n").append(negociacoes.get(i)).append("\n");
        }
        return s.toString();
    }

    /**
     * Metodo que permite adicionar uma negociacao
     *
     * @param n recebe uma negociacao do tipo negociacao
     */
    public void adicionarNegociacao(Negociacao n) {
        negociacoes.add(n);
        n.setNumero(negociacoes.size());
    }

    /**
     * Metodo para obter uma negociacao
     *
     * @param posicao recebe o endereco da negociacao do tipo inteiro
     * @return devolve a posicao onde a negociacao esta
     */
    public Negociacao obterNegociacoes(int posicao) {
        return negociacoes.get(posicao);
    }

    @Override
    public String toString() {

        String str = "";
        str += "Servico{" +
                "numero=" + numero +
                ", veiculo=" + veiculo.getMatricula() +
                ", dataIni=" +  + dataIni.get(Calendar.DATE)+ "-"+dataIni.get(Calendar.MONTH)+"-"+dataIni.get(Calendar.YEAR);
        if (dataFim != null)
            str += ", dataFim=" + dataFim.get(Calendar.DATE)+ "-"+dataFim.get(Calendar.MONTH)+"-"+dataFim.get(Calendar.YEAR);

        str += ", funcionario=" + funcionario.getNome() +
                ", estado=" + estado +
                ", condicao='" + condicao + '\'' +
                ", precoFinal=" + precoFinal +
                ", cliente=" + cliente.getNif() +
                '}';

        return str;
    }
}
