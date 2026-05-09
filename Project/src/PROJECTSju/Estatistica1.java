package PROJECTSju;

import java.io.Serializable;

/**
 *
 * Classe auxiliar para a realizacao da funcao relacionada com o Preco total em vendas ou compras por ano
 *
 * @author Juda Imbo
 */
public class Estatistica1 implements Serializable {

    /**
     *Variavel utilizada para identificar uma estatistica relacionada com o Preco total em vendas ou compras por ano
     */
    private int numero;
    /**
     *Variavel utilizada para registar o ano
     */
    private int ano;
    /**
     *Variavel utilizada para registar o preco total de vendas de vendas
     */
    private double precoTotalVendas;
    /**
     *Variavel utilizada para registar o preco total de vendas de compras
     */
    private double precoTotalCompras;

    /**
     * Construtor da classe Estatistica 1
     *
     * @param ano recebe um numero do ano do tipo inteiro
     * @param precoTotalVendas recebe um valor do preco do tipo double
     * @param precoTotalCompras recebe um valor do preco do tipo double
     */
    public Estatistica1(int ano, double precoTotalVendas, double precoTotalCompras) {
        this.ano = ano;
        this.precoTotalVendas = precoTotalVendas;
        this.precoTotalCompras = precoTotalCompras;
    }

    public int getAno() {
        return ano;
    }

    public double getPrecoTotalVendas() {
        return precoTotalVendas;
    }

    public void setPrecoTotalVendas(double precoTotalVendas) { this.precoTotalVendas = precoTotalVendas; }

    public double getPrecoTotalCompras() {
        return precoTotalCompras;
    }

    public void setPrecoTotalCompras(double precoTotalCompras) {
        this.precoTotalCompras = precoTotalCompras;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Estatistica1{" +
                "numero=" + numero +
                ", ano=" + ano +
                ", precoTotalVendas=" + precoTotalVendas +
                ", precoTotalCompras=" + precoTotalCompras +
                '}';
    }
}

