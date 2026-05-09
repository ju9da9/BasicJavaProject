package PROJECTSju;

import java.io.Serializable;

/**
 * Classe que disponibiliza um conjunto de metodos para realizar uma gestao de manutencoes numa empresa
 *
 * @author Juda Imbo
 */
public class Manutencao implements Serializable {
    /**
     *Variavel utilizada para identificar uma manutencao
     */
    private int numero;              //não se pede por isso não entra no construtor e é automático, sequencial

    /**
     *Variavel utilizada para indicar em que estado se encontra: 1-iniciado 2-terminada
     */
    private int estado = 1;

    /**
     *Variavel utilizadaa para registar o local de intervencao
     */
    private String localIntervencao;

    /**
     *Variavel utilizada para registar o custo da manutencao
     */
    private double custo;  //não se pede, só no final

    /**
     *Variavel que permite registar um veiculo que esteja em manutencao
     */
    private Veiculo veiculo;

    /**
     *Construtor da classe Manutencao
     *
     * @param veiculo recebe um veiculo em manutencao do tipo veiculo
     * @param localIntervencao recebe um local de intervencao do tipo string
     */
    public Manutencao(Veiculo veiculo, String localIntervencao) {
        this.veiculo = veiculo;
        this.localIntervencao = localIntervencao;

    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }


    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("");
        str.append("\n--Manutenção---");
        str.append("\nNúmero de manutenção: ").append(numero);
        str.append("\nMatrícula do veículo: ").append(veiculo.getMatricula());
        str.append("\nEstado: ").append(estado);
        str.append("\nCusto de Manutenção: ").append(custo);
        str.append("\nLocal de Intervenção: ").append(localIntervencao);

        return str.toString();
    }
}
