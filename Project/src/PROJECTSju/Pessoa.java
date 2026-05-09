package PROJECTSju;

import java.io.Serializable;


/**
 *Classe base que disponibiliza um conjunto de metodos para realizar uma gestao de pessoas (quer funcionarios quer clientes) numa empresa que compra e vende veiculos
 *
 * @author Juda Imbo
 */
public class Pessoa implements Configuracoes, Serializable {
    /**
     *Variavel utilizada para registar o numero de identificacao da pessoa
     */
    protected int nif;

    /**
     *Variavel utilizada para registar o nome da pessoa
     */
    protected String nome;

    /**
     *Variavel utilizada para registar a morada da pessoa
     */
    protected String morada;

    /**
     *Variavel utilizada para registar o numero da pessoa
     */
    protected int telefone;

    /**
     *Construtor da classe Pessoa
     *
     * @param nif recebe um numero de identificacao fiscal do tipo inteiro
     * @param nome recebe um nome de uma pessoa do tipo string
     * @param morada recebe uma morada do tipo string
     * @param telefone recebe um numero de telefone do tipo string
     */
    public Pessoa(int nif, String nome, String morada, int telefone) {
        this.nif = nif;
        this.nome = nome;
        this.morada = morada;
        this.telefone = telefone;
    }

    public int getNif() {
        return nif;
    }

    public String getNome() {
        return nome;
    }

    public int getTelefone() {
        return telefone;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("");

        str.append("\nNIF:").append(nif);
        str.append("\nNome: ").append(nome);
        str.append("\nMorada: ").append(morada);
        str.append("\nTelefone: ").append(telefone);


        return str.toString();
    }
}
