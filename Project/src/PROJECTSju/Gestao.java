package PROJECTSju;

import java.util.ArrayList;
import java.io.*;
import java.util.Collections;

/**
 * Classe que gere todos os dados envolvidos na gestao de uma empresa que compra e vende veiculos
 *
 * @author Juda Imbo
 */
public class Gestao {

    /**
     *Variavel que regista o numero de servicos nao concluidos com sucesso
     */
    private int servicosNaoConclSucesso; //numero não concluidos com sucesso

    /**
     * Metodo que obtem o numero de servicos nao concluidos com sucesso
     * @return devolve o numero de servicos nao concluidos com sucesso
     */
    public int getServicosNaoConclSucesso() {
        return servicosNaoConclSucesso;
    }

    /**
     *Metodo que contabiliza devolve o numero de servicos nao concluidos com sucesso
     */
    public void setServicosNaoConclSucesso() {
        this.servicosNaoConclSucesso++;
    }


    /////////////////////////////////Veículos//////////////////////////////
    /**
     * arraylist que guarda todos os veiculos
     */
    ArrayList<Veiculo> veiculos = new ArrayList<>();

    /**
     * Metodo que permite adicionar uma venda
     *
     * @param v recebe um veiculo do tipo veiculo
     */
    public void adicionarVeiculo(Veiculo v) {
        veiculos.add(v);

    }

    /**
     * Metodo que permite procurar o veículo desejado pela matricula
     *
     * @param matricula recebe uma matricula do tipo string
     * @return ou devolve a posicao onde se encontra os dados do veiculo ou devolve -1 ou seja nao foi encontrado o veiculo desejado
     */
    public int pesquisarVeiculo(String matricula) {
        StringBuilder s = new StringBuilder("");

        for (int i = 0; i < veiculos.size(); i++) {
            if (veiculos.get(i).getMatricula().toUpperCase().contains(matricula.toUpperCase())) {
                return i;
            }
        }
        return -1;
    }


    /**
     * Metodo para obter um veiculo
     *
     * @param posicao recebe o endereco do veiculo no sistema do tipo inteiro
     * @return devolve a posicao onde o veiculo se encontra
     */
    public Veiculo obterVeiculo(int posicao) {
        return veiculos.get(posicao);
    }


    /**
     * Metodo que obtém o numero total de veículos
     *
     * @return devolve o numero de veiculos introduzidos no sistema
     */
    public int getNumVeiculos() {
        return veiculos.size();
    }


    /**
     * Metodo para mostrar uma lista de veiculos
     *
     * @return devolve uma string com os veiculos com as matriculas do veiculos
     */
    public String mostrarVeiculo() {
        StringBuilder s = new StringBuilder("");
        for (int i = 0; i < veiculos.size(); i++) {
            s.append(veiculos.get(i).getMatricula()).append("\n");
        }
        return s.toString();
    }


    /**
     * Metodo para mostrar uma lista de veiculos que estao em aquisicao
     *
     * @return devolve uma string com as matriculas dos veiculos
     */
    public String mostrarVeiculo2() {
        StringBuilder s = new StringBuilder("");
        for (int i = 0; i < veiculos.size(); i++) {
            if (veiculos.get(i).getEstado() == 1) {
                s.append(veiculos.get(i).getMatricula()).append("\n");
            }

        }
        return s.toString();
    }

    /**
     * Metodo para mostrar uma lista de veiculos que estao em aquisicao
     *
     * @return devolve uma string com as matriculas dos veiculos
     */
    public String mostrarVeiculo3() {
        StringBuilder s = new StringBuilder("");
        for (int i = 0; i < veiculos.size(); i++) {
            if (veiculos.get(i).getEstado() == 2) {
                s.append(veiculos.get(i).getMatricula()).append("\n");
            }
        }
        return s.toString();
    }

    ////////////////////////////Clientes///////////////////////////////////////
    /**
     * Arraylist que guarda todos os clientes
     */
    ArrayList<Cliente> clientes = new ArrayList<>();



    /**
     * Metodo que permite adicionar um cliente
     *
     * @param c recebe um cliente do tipo cliente
     */
    public void adicionarCliente(Cliente c) {
        clientes.add(c);

        ///  c.setNif(clientes.size());   isto é para numeração automática
    }


    /**
     * Metodo que permite procurar o cliente desejado pelo nif
     *
     * @param nif recebe o numero de contribuinte do tipo inteiro
     * @return ou devolve a posicao onde se encontra os dados do cliente ou devolve -1 ou seja nao foi encontrado o cliente desejado
     */
    public int pesquisarCliente(int nif) {
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getNif() == nif) {
                return i;
            }
        }
        return -1;
    }


    /**
     * Metodo para obter um cliente
     *
     * @param posicao recebe o endereco do cliente no sistema do tipo inteiro
     * @return devlove a posicao onde o o cliente esta
     */
    public Cliente obterCliente(int posicao) {
        return clientes.get(posicao);
    }

    /**
     * Metodo que obtém o numero total de clientes
     *
     * @return devolve o numero de clientes introduzidos no sistema
     */
    public int getNumClientes() {
        return clientes.size();
    }


    /**
     * Metodo para mostrar uma lista de clientes
     *
     * @return devolve uma string com cllientes
     */
    public String mostrarClientes() {
        StringBuilder s = new StringBuilder("");
        for (int i = 0; i < clientes.size(); i++) {
            s.append(clientes.get(i).getNif()).append("\n");
        }
        return s.toString();
    }


    /////////////////////////////////Funcionários/////////////////////////////////
    /**
     * arraylist que guarda todos os funcionarios
     */
    ArrayList<Funcionario> funcionarios = new ArrayList<>();

    //Função para adicionar um funcionário

    /**
     * Metodo que permite adicionar um funcionario
     *
     * @param f recebe um funcionario do tipo funcionario
     */
    public void adicionarFuncionario(Funcionario f) {
        funcionarios.add(f);


    }

    //funcao para pesquisar no array

    /**
     * Metodo que permite procurar o funcionario desejado pelo nif
     *
     * @param nif recebe o numero de identificacao do tipo inteiro
     * @return ou devolve a posicao onde se encontra os dados do funcionario ou devolve -1 ou seja nao foi encontrado o funcionario desejado
     */
    public int pesquisarFuncionario(int nif) {
        for (int i = 0; i < funcionarios.size(); i++) {
            if (funcionarios.get(i).getNif() == nif) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Metodo que permite procurar o funcionario desejado pelo o numero de telefone
     *
     * @param telefone recebe o contacto do funcionario do tipo inteiro
     * @return ou devolve a posicao onde se encontra os dados do funcionario ou devolve -1 ou seja nao foi encontrado o funcionario desejado
     */
    public int pesquisarFuncionarioTelefone(int telefone) {
        for (int i = 0; i < funcionarios.size(); i++) {
            if (funcionarios.get(i).getTelefone() == telefone) {
                return i;
            }
        }
        return -1;
    }


    /**
     * Metodo para obter um funcionario
     *
     * @param posicao recebe o endereco do funcionario do tipo inteiro
     * @return devolve a posicao onde o funcionario esta
     */
    public Funcionario obterFuncionario(int posicao) {
        return funcionarios.get(posicao);
    }

    //funcao para obter o numero total de elementos do array

    /**
     * Metodo que obtem o numero total de veiculos
     *
     * @return devolve o numero total de funcionarios introduzidos no sistema
     */
    public int getNumFuncionarios() {
        return funcionarios.size();
    }

    /**
     * Metodo para mostrar uma lista de funcionarios identificados pelo nif
     * @return devove uma string com os funcionarios
     */
    public String mostrarFuncionario() {
        StringBuilder s = new StringBuilder("");
        for (int i = 0; i < funcionarios.size(); i++) {
            s.append(funcionarios.get(i).getNif()).append("\n");
        }
        return s.toString();
    }

    /**
     * Metodo para mostrar uma lista de funcionarios identificados pelo nif com a condicao de ser ou nao comercial
     * @return mostra uma lista de funcionarios que sao comerciais
     */
    public String mostrarFuncionario2() {
        StringBuilder s = new StringBuilder("");
        for (int i = 0; i < funcionarios.size(); i++) {
            if (funcionarios.get(i).getComercial() == 'S') {
                s.append(funcionarios.get(i).getNif()).append("\n");
            }
        }
        return s.toString();
    }

    /**
     * Metodo que procura o funcionario com mais vendas no sistema
     *
     * @return devolve os dados do(s) funcionario(s) com mais vendas
     */
    public String mostrarFuncionarioMaisVendas() {
        int vendamaior = Integer.MIN_VALUE;  //isto é para o caso de não souber a nota minima. mas como sei, entaão seria "vendamaior = 0"

        for (int i = 0; i < funcionarios.size(); i++) {
            if (funcionarios.get(i).getNumVendas() > vendamaior)
                vendamaior = funcionarios.get(i).getNumVendas();
        }
        //isto vai buscar todos os funcionarios que tem o numero de vendas iguias ao objeto "vendamaior"
        StringBuilder str = new StringBuilder("");
        for (int i = 0; i < funcionarios.size(); i++) {
            if (funcionarios.get(i).getNumVendas() == vendamaior) {
                str.append(funcionarios.get(i)).append("\n"); //se apenas quer que mostre os nomes dos funcionarios é fazer "funcionarios.get(i).nome"

            }
        }

        return str.toString();
    }

    /////////////////////////////////Compras//////////////////////////////////////
    /**
     * Arraylist que guarda todas as compras
     */
    ArrayList<Servico> compras = new ArrayList<>();

    /**
     * Metodo que permite adicionar uma compra
     *
     * @param c recebe uma compra do tipo servico
     */
    public void adicionarCompras(Servico c) {
        compras.add(c);
        c.setNumero(compras.size());
    }

    //não sei se estou a fazer bem

    /**
     * Metodo que permite adicionar uma compra realizada com sucesso
     *
     * @param c recebe uma compra do tipo servico
     */

    /**
     * Metodo para mostrar uma lista de Compras realizadas
     *
     * @return devolve uma string com as compras
     */
    public String mostrarCompras() {
        StringBuilder s = new StringBuilder("");
        for (int i = 0; i < compras.size(); i++) {
            s.append(compras.get(i).getNumero()).append("\n");
        }
        return s.toString();
    }

    /**
     * Metodo que permite procurar a compra desejada pelo numero
     *
     * @param numero recebe o numero da compra realizada do tipo inteiro
     * @return ou devolve a posicao onde se encontra os dados da compra ou devolve -1 ou seja nao foi encontrada a compra desejada
     */
    public int pesquisarCompra(int numero) {
        for (int i = 0; i < compras.size(); i++) {
            if (compras.get(i).getNumero() == numero) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Metodo para obter uma compra
     *
     * @param posicao recebe o endereco da compra do tipo inteiro
     * @return devolve a posicao onde a compra esta
     */
    public Servico obterCompra(int posicao) {
        return compras.get(posicao);
    }

    /**
     * Metodo que obtem o numero total de compras
     *
     * @return devolve o numero total de compras
     */
    public int getNumCompras() {
        return compras.size();
    }

    /**
     *Variavel que ajuda na contabilizacao de compras concluidas com sucesso
     */
    private int compraConcluidaComSucesso = 0;

    /**
     * Metodo que tem o numero de compras concluidas com sucesso
     * @return devolve o numero de compras concluidas com sucesso
     */
    public int getCompraConcluidaComSucesso() {
        return compraConcluidaComSucesso;
    }

    /**
     * Metodo que permite adicionar uma compra concluida com sucesso
     */
    public void setCompraConcluidaComSucesso() {
        this.compraConcluidaComSucesso++;
    }


    /////////////////////////////////Vendas///////////////////////////////////////

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
    public String mostrarVenda() {
        StringBuilder s = new StringBuilder("");
        for (int i = 0; i < vendas.size(); i++) {
            s.append(vendas.get(i).getNumero()).append("\n");
        }
        return s.toString();
    }

    /**
     * Metodo que permite buscar a venda que se pretende encontrar a venda desejada
     *
     * @param numero recebe o numero da venda realizada do tipo inteiro
     * @return ou devolve a posicao onde se encontra a venda ou devolve -1 ou seja nao foi encontrada a venda desejadda
     */
    public int pesquisarVenda(int numero) {
        for (int i = 0; i < vendas.size(); i++) {
            if (vendas.get(i).getNumero() == numero) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Metodo que obtem uma venda
     *
     * @param posicao recebe o endereco da venda do tipo inteiro
     * @return de volve a posicao onde a venda esta
     */
    public Servico obterVenda(int posicao) {
        return vendas.get(posicao);
    }

    /**
     * Metodo que obtem o numero total de vendas
     *
     * @return devolve o numero de vendas introduzidas no sistema
     */
    public int getNumVendas() {
        return vendas.size();
    }

    /**
     * Variavel que ajuda na contabilizacao de vendas concluidas com sucesso
     */
    private int vendaConcluidaComSucesso = 0;

    /**
     * Metodo que obtem o numero total de vendas concluidas com sucesso
     * @return devolve o numero de vendas concluidas com sucesso
     */
    public int getVendaConcluidaComSucesso() {
        return vendaConcluidaComSucesso;
    }

    /**
     * Metodo que permite adicionar uma venda concluida com sucesso
     */
    public void setVendaConcluidaComSucesso() {
        this.vendaConcluidaComSucesso++;
    }


    ////////////////////////////////Manutenção////////////////////////////////////
    /**
     * Arraylist que guarda todas as manutencoes
     */
    ArrayList<Manutencao> manutencoes = new ArrayList<>();

    /**
     * Metodo que permite adicionar uma manutencao
     *
     * @param m recebe uma manutencao do tipo manutencao
     */
    public void adicionarManutencao(Manutencao m) {
        manutencoes.add(m);
        m.setNumero(manutencoes.size());
    }

    /**
     * Metodo para mostrar uma lista de manutencoes
     *
     * @return devolve uma string com as manutencoes
     */
    public String mostrarManutencoes() {
        StringBuilder s = new StringBuilder("");
        for (int i = 0; i < manutencoes.size(); i++) {
            s.append(manutencoes.get(i).getNumero()).append("\n");
        }
        return s.toString();
    }

    /**
     * Metodo que permite encontrar a manutencao desejada pelo numero
     *
     * @param numero recebe o numero da manutencao do tipo inteiro
     * @return ou devolve a posicao onde se encontra os dados da manutencao ou devolve -1 ou seja nao foi encontrada a manutencao desejada
     */
    public int pesquisarManutencoes(int numero) {
        for (int i = 0; i < manutencoes.size(); i++) {
            if (manutencoes.get(i).getNumero() == numero) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Metodo para obter uma manutencao
     *
     * @param posicao recebe o endereco da manutencao do tipo inteiro
     * @return devolve a posicao onde o veiculo se encontra
     */
    public Manutencao obterManutencoes(int posicao) {
        return manutencoes.get(posicao);
    }

    /**
     * Metodo que obtem o numero total de manutencoes
     *
     * @return devolve o numero de manutencoes introduzidas no sistema
     */
    public int getNumManutencoes() {
        return manutencoes.size();
    }


    ////////////////////////////////Negociações////////////////////////////////////
    /**
     * Arraylist que guarda todas as negociacoes
     */
    ArrayList<Negociacao> negociacoes = new ArrayList<>();

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
     * Metodo para mostrar uma lista de negociacoes
     *
     * @return devolve uma string com as negociacoes
     */
    public String mostrarNegociacoes() {
        StringBuilder s = new StringBuilder("");
        for (int i = 0; i < negociacoes.size(); i++) {
            s.append(negociacoes.get(i).getNumero()).append("\n");
        }
        return s.toString();
    }

    /**
     * Metodo que permite a encontrar a negociacao desejada através do numero
     *
     * @param numero recebe o numero da negociacao do tipo inteiro
     * @return ou devolve a posicao onde se encontra os dados da negociacao ou devolve -1 ou seja nao foi encontrada negociacao desejada
     */
    public int pesquisarNegociacoes(int numero) {
        for (int i = 0; i < negociacoes.size(); i++) {
            if (negociacoes.get(i).getNumero() == numero) {
                return i;
            }
        }
        return -1;
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

    ////////////////////////////////////Estatística1/////////////////////////////////

    /// estatísticas relacionadas á funcao de Preço total em vendas/compras, por ano.
    /**
     * Arraylist que guarda uma lista dos precos totais em vendas/compras por ano
     */
    ArrayList<Estatistica1> estatisticas1 = new ArrayList<>();

    /**
     * Metodo que permite adicionar uma estatistica relacionada com a listagem dos precos totais em vendas/compras por ano
     *
     * @param e1 recebe uma estatistica relacionada com a listagem dos precos totais em vendas/compras por ano do tipo Estatistica1
     */
    public void adicionarEstatistica1(Estatistica1 e1) {
        estatisticas1.add(e1);
        e1.setNumero(estatisticas1.size());
    }

    /**
     * Metodo para mostrar uma lista dos precos totais em vendas/compras por ano
     *
     * @return devolve uma string com todos os precos totais em vendas/compra por ano
     */
    public String mostrarEstatisticas1() {
        StringBuilder s = new StringBuilder("");
        for (int i = 0; i < estatisticas1.size(); i++) {
            s.append(estatisticas1.get(i).getAno()).append("\n");
        }
        return s.toString();
    }

    /**
     * Metodo que permite encontrar a estatistica relacionada com a listagem dos precos totais em vendas/compras por ano  desejada através do ano
     *
     * @param ano recebe o ano da compra/venda do tipo inteiro
     * @return ou devolve a posicao onde se encontra os dados da estatistica ou devolve -1 ou seja nao foi encontrada a estatistica desejada
     *
     */
    public int pesquisarEstatisticas1(int ano) {
        for (int i = 0; i < estatisticas1.size(); i++) {
            if (estatisticas1.get(i).getAno() == ano) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Metodo para obter uma estatística relacionada com a listagem dos precos totais em vendas/compras por ano
     * @param posicao recebe o endereco da estatistica do tipo inteiro
     * @return devolve a posicao onde a estatistica esta
     *
     */
    public Estatistica1 obterEstatisticas1(int posicao) {
        return estatisticas1.get(posicao);
    }

    /**
     * Metodo que obtem o numero total de estatisticas relacionadas com a listagem dos precos totais em vendas/compras por ano
     *
     * @return devolve o numero de estatisticas relacionadas com a listagem dos precos totais em vendas/compras por ano introduzidas no sistema
     */
    public int getNumEstatisticas1() {
        return estatisticas1.size();
    }

    ////////////////////////////Estatística2//////////////////////////////////////
    /**
     *Arraylist que guarda uma lista do numero total de servicos registados por mes num determinado ano
     */
    ArrayList<Estatistica2> estatisticas2 = new ArrayList<>();

    /**
     * Metodo que permite adicionar uma estatistica relacionada com o numero total de servicos registados por mes num determinado ano
     * @param e2 recebe uma estatistica relacionada com numero total de servicos registados por mes num determinado ano do tipo Estatistica2
     */
    public void adicionarEstatistica2(Estatistica2 e2) {
        estatisticas2.add(e2);
        e2.setNumero(estatisticas2.size());
    }

    /**
     * Metodo para mostrar uma lista da estatistica relacionado com numero total de servicos registados por mes num determinado ano
     * @return devolve uma string com os numeros totais de servicos registados por mes num determinado ano
     */
    public String mostrarEstatisticas2() {
        StringBuilder s = new StringBuilder("");
        for (int i = 0; i < estatisticas2.size(); i++) {
            s.append(estatisticas2.get(i).getAno()).append("\t").append(estatisticas2.get(i).getMes()).append("\n");
        }
        return s.toString();
    }

    /**
     *
     * Metodo que permite encontrar a estatistica relacionada com numero total de servicos registados por mes num determinado ano
     *
     * @param ano recebe o ano em que esta ser registado o numero total de servicos registados por mes num determinado ano
     * @param mes recebe o mes em que esta ser registado onumero total de servicos registados por mes num determinado ano
     * @return ou devolve a posicao onde se encontra os dados da estatistica ou devolve -1 ou seja nao foi encontrada a estatistica desejada
     */
    public int pesquisarEstatisticas2(int ano, int mes) {
        for (int i = 0; i < estatisticas2.size(); i++) {
            if (estatisticas2.get(i).getAno() == ano && estatisticas2.get(i).getMes() == mes) {
                return i;
            }
        }
        return -1;
    }


    /**
     *Metodo para obter uma estatística relacionada com o numero total de servicos registados por mes num determinado ano
     * @param posicao recebe o endereco da estatistica do tipo inteiro
     * @return devolve a posicao onde a estatistica esta
     */
    public Estatistica2 obterEstatisticas2(int posicao) {
        return estatisticas2.get(posicao);
    }

    /**
     * Metodo que obtem o numero total de estatisticas relacionadas com numero total de servicos registados por mes num determinado ano
     *
     * @return devolve o numero de estatisticas relacionadas com numero total de servicos registados por mes num determinado ano introduzidas no sistema
     */
    public int getNumEstatisticas2() {
        return estatisticas2.size();
    }



    /**
     * Metodo que permite guardar todos os dados registados do sistema num ficheiro
     */
    public void gravarFicheiro() {
        try {
            ObjectOutputStream out = new ObjectOutputStream
                    (new FileOutputStream("judaimbo2192274.dat"));
            out.writeObject(funcionarios);
            out.writeObject(clientes);
            out.writeObject(veiculos);
            out.writeObject(compras);
            out.writeObject(vendas);
            out.writeObject(negociacoes);
            out.writeObject(manutencoes);

            out.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void lerFicheiro() {
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("judaimbo2192274.dat"));
            funcionarios = (ArrayList<Funcionario>) in.readObject();
            clientes = (ArrayList<Cliente>) in.readObject();
            veiculos = (ArrayList<Veiculo>) in.readObject();
            compras = (ArrayList<Servico>) in.readObject();
            vendas = (ArrayList<Servico>) in.readObject();
            negociacoes = (ArrayList<Negociacao>) in.readObject();
            manutencoes = (ArrayList<Manutencao>) in.readObject();
            in.close();
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
