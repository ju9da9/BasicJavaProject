package PROJECTSju;

import java.io.Serializable;
import java.util.Calendar;

/**
 * Classe que disponibiliza um conjunto de metodos para realizar uma gestao de negociacoes numa empresa que compra e vende veiculos
 *
 * @author Juda Imbo
 */
public class Negociacao implements Serializable {
    /**
     *Variavel utilizada para identificar uma negociacao
     */
    private int numero;
    /**
     *Variavel utilizada para registar umaa descricao da negociacao envolvida
     */
    private String descricao;
    /**
     *Variavel utilizada para registar umaa data da negociacao
     */
    private Calendar dataNegociacao;
    /**
     *Variavel utilizada para registar um preco do veiculo
     */
    private double precoVeiculo;
    /**
     *Variavel utilizada para registar um servico envolvido na negociacao
     */
    private Servico servico;

    /**
     *Construtor da classe negociacao
     *
     * @param descricao recebe um texto com uma descricao do tipo string
     * @param dataNegociacao recebe uma data do tipo calendar
     * @param precoVeiculo recebe um valor do preco do tipo double
     * @param servico recebe um servico do tipo servico
     */
    public Negociacao(String descricao, Calendar dataNegociacao, double precoVeiculo, Servico servico) {
        this.descricao = descricao;
        this.dataNegociacao = dataNegociacao;
        this.precoVeiculo = precoVeiculo;
        this.servico = servico;
    }


    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Negociacao{" +
                "Numero=" + numero +
                ", Descricao='" + descricao + '\'' +
                ", Data Negociacao=" + dataNegociacao.get(Calendar.DATE) +"-"+dataNegociacao.get(Calendar.MONTH)+"-"+dataNegociacao.get(Calendar.YEAR)+
                ", Preço do Veiculo=" + precoVeiculo +
                ", numero de servico=" + servico.getNumero() +
                '}';
    }
}
