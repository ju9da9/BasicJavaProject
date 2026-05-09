package PROJECTSju;

import java.io.Serializable;

/**
 * Classe que disponibiliza um conjunto de metodos para realizar uma gestao de veiculos numa empresa que compra e vende veiculos
 *
 * @author Juda Imbo
 */
public class Veiculo implements Serializable {

    /**
     *Variavel utilizada para registar a identificacao do veiculo
     */
    private String matricula;
    /**
     *Variavel utilizada para registar o nome da marca do veiculo
     */
    private String marca;
    /**
     *Variavel utilizada para registar o nome do modelo da marca do veiculo
     */
    private String modelo;
    /**
     *Variavel utilizada para registar o tipo de combustivel que o veiculo utiliza
     */
    private String tipoCombustivel;
    /**
     *Variavel utilizada para registar o numero de quilometros que o veiculo ja percorreu
     */
    private int numQuilometros;
    /**
     *Variavel utilizada para indicar em que estado se encontra: 1-em aquisicao 2-adquirido 3-para venda 4-vendido
     */
    private int estado = 1;
    /**
     *Variavel utilizada para registar o preco de venda do veiculo
     */
    private double precoVenda=0;
    /**
     *Variavel utilizaada para registar as caracteristicas do veiculo
     */
    private String caracteristicas;
    /**
     *Variavel utilizada para contabilizar o numero de manutencoes realizadas no veiculo
     */
    private int numManutencoes=0;
    /**
     *Variavel utilizada para determinar se o veiculo se encontra em reparacao de momento
     */
    private boolean emReparacao;

    /**
     * Construtor da classe Veiculo
     *
     * @param matricula recebe uma matricula do tipo string
     * @param marca recebe um nome da marca do tipo string
     * @param modelo recebe um nome do modelo do tipo string
     * @param tipoCombustivel recebe o um nome do tipo de combustivel do tipo string
     * @param numQuilometros recebe um numero de quilometros do tipo inteiro
     * @param caracteristicas recebe um texto com as caracteristicas do veiculo do tipo string
     */
    public Veiculo(String matricula, String marca, String modelo, String tipoCombustivel, int numQuilometros, String caracteristicas) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.tipoCombustivel = tipoCombustivel;
        this.numQuilometros = numQuilometros;
        this.caracteristicas = caracteristicas;
    }

    public boolean isEmReparacao() {
        return emReparacao;
    }

    public void setEmReparacao(boolean emReparacao) {
        this.emReparacao = emReparacao;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public void setNumQuilometros(int numQuilometros) {
        this.numQuilometros = numQuilometros;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public double getPrecoVenda() { return precoVenda; }

    public void setPrecoVenda(double precoVenda) { this.precoVenda = precoVenda; }

    public int getNumManutencoes() { return numManutencoes; }

    public void setNumManutencoes() { this.numManutencoes++; }

    @Override
    public String toString() {
        return "Veiculo{" +
                "matricula='" + matricula + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", tipoCombustivel='" + tipoCombustivel + '\'' +
                ", numQuilometros=" + numQuilometros +
                ", estado=" + estado +
                ", precoVenda=" + getPrecoVenda() +
                ", caracteristicas='" + caracteristicas + '\'' +
                ", numManutencoes=" + getNumManutencoes() +
                ", emReparacao=" + emReparacao +
                '}';
    }
}

