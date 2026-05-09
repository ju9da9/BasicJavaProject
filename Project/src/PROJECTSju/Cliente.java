package PROJECTSju;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;

/**
 * Classe que disponibiliza um conjunto de metodos para realizar uma gestao de clientes numa empresa que compra e vende veiculos
 *
 * @author Juda Imbo
 */
public class Cliente extends Pessoa implements Serializable {
    /**
     *Variavel utilizada para registar a data de entrada do cliente na gestao de compra e venda de veiculos
     */
    private Calendar dataEntrada;

    /**
     * Construtor da classe Cliente
     *
     * @param nif recebe um numero de identificacao fiscal do tipo inteiro
     * @param nome recebe um nome de um individuo do tipo string
     * @param morada recebe uma morada do tipo string
     * @param telefone recebe um telefone do tipo inteiro
     * @param dataEntrada recebe uma data do tipo Calendar
     */
    public Cliente(int nif, String nome, String morada, int telefone, Calendar dataEntrada) {
        super(nif, nome, morada, telefone);
        this.dataEntrada = dataEntrada;
    }



    /**
     * Arraylist que guarda todas as compras
     */
    ArrayList<Servico> compras = new ArrayList<>();

    /**
     * Metodo que permite adicionar uma compra
     *
     * @param c recebe uma compra do tipo servico
     */
    public void adicionarCompra(Servico c) {
        compras.add(c);
        c.setNumero(compras.size());
    }


    /**
     * Metodo para mostrar uma lista de Compras realizadas
     *
     * @return devolve uma string com as compras
     */
    public String mostrarCompras() {
        StringBuilder s = new StringBuilder("");
        for (int i = 0; i < compras.size(); i++) {
            s.append("Compras associadas: ").append("\n").append(compras.get(i)).append("\n");
        }
        return s.toString();
    }


    /**
     * Arraylist que guarda todas as vendas
     */
    ArrayList<Servico> vendas = new ArrayList<>();


    /**
     * Metodo que permite adicionar uma venda e preenche a numeracao automatica
     *
     * @param v recebe uma venda do tipo servico
     */
    public void adicionarVenda(Servico v) {
        vendas.add(v);
        v.setNumero(vendas.size());
    }

    /**
     * Metodo que permite mostrar todas as vendas e os seus dados
     *
     * @return devolve uma string com todas as vendas
     */
    public String mostrarVendas() {
        StringBuilder s = new StringBuilder("");
        for (int i = 0; i < vendas.size(); i++) {
            s.append("Vendas associadas: ").append("\n").append(vendas.get(i)).append("\n");
        }
        return s.toString();
    }



    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("");
        str.append("\n--Cliente---");
        str.append(super.toString());
        str.append("\nData Entrada: ").append(dataEntrada.get(Calendar.DATE)).append("-").append(dataEntrada.get(Calendar.MONTH)).append("-").append(dataEntrada.get(Calendar.YEAR));


        return str.toString();
    }
}
