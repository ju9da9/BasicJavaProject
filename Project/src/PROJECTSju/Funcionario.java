package PROJECTSju;

import java.io.Serializable;

/**
 * Classe que disponibiliza um conjunto de metodos para realizar uma gestao de funcionarios numa empresa que compra e vende veiculos
 *
 * @author Juda Imbo
 */
public class Funcionario extends Pessoa implements Serializable {

    /**
     *Variavel utilizada para registar a funcao do funcionario
     */
    private String funcao;

    /**
     *Variavel utilizada para registar o numero de servicos
     */
    private int numServicos;

    /**
     *Variavel utilizada para registar o numero de vendas
     */
    private int numVendas;

    /**
     *Variavel utilizada para registar se o funcionario ou nao
     */
    private char comercial;

    /**
     *Construtor da classe Funcionario
     *
     * @param nif recebe um numero de identificacao fiscal do tipo inteiro
     * @param nome recebe um nome de um individuo do tipo string
     * @param morada recebe uma morada do tipo string
     * @param telefone recebe um numero telefone do tipo inteiro
     * @param funcao recebe uma funcao do tipo string
     * @param comercial recebe uma resposta (sim ou nao) do tipo char
     */
    public Funcionario(int nif, String nome, String morada, int telefone, String funcao, char comercial) {
        super(nif, nome, morada, telefone);
        this.funcao = funcao;
        this.comercial = comercial;
    }

    /**
     *Metodo que obtem o numero de vendas realizadas
     * @return devolve o numero de vendas
     */
    public int getNumVendas() {
        return numVendas;
    }

    /**
     *Metodo que permite alterar o numero de vendas realizadas incrementado o seu valor
     */
    public void setNumVendas() {
        this.numVendas++ ;
    }

    /**
     *Metodo que obtem a funcao do funcionario
     * @return devolve a string com a funcao do funcionario escrito
     */
    public String getFuncao() {
        return funcao;
    }

    /**
     *Metodo que permite alterar a funcao do funcionario
     * @param funcao recebe a funcao do funcionario do tipo string
     */
    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    /**
     *Metodo que obtem o numero de servicos em que o funcionario esteve envolvido
     * @return devolve o numero de servicos
     */
    public int getNumServicos() {
        return numServicos;
    }

    /**
     *Metodo que permite alterar o numero de servicos em que o funcionario esteve envolvido incrementando
     */
    public void setNumServicos() {
        this.numServicos++;
    }

    /**
     *Metodo de obtem a resposta de que o funcionario e' comercial ou nao
     * @return devolve uma resposta (S ou N) do tipo char
     */
    public char getComercial() {
        return comercial;
    }


    /**
     *Mostra os dados do funcionario
     * @return devolve uma string com todos os dados do funcionario
     */
    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("");
        str.append("\n--Funcionario---");
        str.append(super.toString());
        str.append("\nFuncao: ").append(funcao);
        str.append("\nFuncionário comercial? ").append(comercial);
        str.append("\nNumero de servicos realizados: ").append(numServicos);

        return str.toString();
    }
}

