package PROJECTSju;


/**
 * Classe complementar para a realizacao da funcao relacionada com numero total de servicos registados por mes num determinado ano
 * (ordenado de forma decrescente pelo total)
 *
 * @author Juda Imbo
 */
public class Estatistica2 {

    /**
     *Variavel utilizada para identificar uma estatistica relacionada com numero total de servicos registados por mes num determinado ano
     * (ordenado de forma decrescente pelo total)
     */
    private int numero;

    /**
     *Variavel utilizada para registar o ano da estatistica relacionada com numero total de servicos registados por mes num determinado ano
     * (ordenado de forma decrescente pelo total)
     */
    private int ano;
    /**
     *Variavel u
     */
    private int numtotalservicosmesano=0;
    /**
     *Variavel utilizada para registar o mes da estatistica relacionada com relacionada com numero total de servicos registados por mes num determinado ano
     * (ordenado de forma decrescente pelo total)
     */
    private int mes;

    /**
     *Construtor da estatistica 2
     *
     * @param ano recebe o numero do ano do tipo inteiro
     * @param mes recebe o numero do mes do tipo inteiro
     */
    public Estatistica2(int ano, int mes) {
        this.ano = ano;
        this.mes = mes;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getNumtotalservicosmesano() {
        return numtotalservicosmesano;
    }

    public void setNumtotalservicosmesano() {
        this.numtotalservicosmesano++;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    @Override
    public String toString() {
        return "Estatistica2{" +
                "numero=" + numero +
                ", ano=" + ano +
                ", numtotalservicosmesano=" + getNumtotalservicosmesano() +
                ", mes=" + mes +
                '}';
    }
}
