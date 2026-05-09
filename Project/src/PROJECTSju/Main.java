package PROJECTSju;

import util.Consola;


import java.security.spec.RSAOtherPrimeInfo;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;


/**
 * Classe que disponibiliza um conjunto de metodos para realizar uma gestao de todos os dados que estejam envolvidos na gestao de uma empresa que compra e vende veiculos
 *
 * @author Juda Imbo
 */
public class Main {


    /**
     * Declara a gestao, classe que contem todas funcionalidades basicas
     */
    private static Gestao g = new Gestao();


    /**
     * Declara o formato para as datas que vao ser registadas por exemplo 11-05-2020
     */
    private static SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");

    /**
     * Funcao onde comeca a execucao do projeto
     *
     * @param args recebe um vetor de strings com os parametros passados a aplicacao
     */
    public static void main(String[] args) {


        /**
         *Variavel que auxilia na escolha de um menu ou de um metodo
         */
        int opcao;
        /**
         *Variavel que auxilia na escolha de um menu ou de um metodo
         */
        int opcao2;
        /**
         *Variavel que auxilia na escolha de sair do programa
         */
        char sair;

        g.lerFicheiro();
        do {
            opcao = menuPrincipal();
            switch (opcao) {
                case 1:
                    do {
                        opcao2 = menuVeiculos();
                        switch (opcao2) {
                            case 1:
                                registarVeiculo();
                                break;
                            case 2:
                                if (g.getNumVeiculos() > 0)
                                    consultarMatricula();
                                else
                                    System.out.println("Sem Veículos registados!");
                                break;
                            case 3:
                                if (g.getNumVeiculos() > 0)
                                    alterarDadosVeiculo();
                                else
                                    System.out.println("Sem Veiculos registados");
                                break;
                            case 0:
                        }
                    } while (opcao2 != 0);
                    break;
                case 2:
                    do {
                        opcao2 = menuFuncionarios();
                        switch (opcao2) {
                            case 1:
                                registarFuncionario();
                                break;
                            case 2:
                                if (g.getNumFuncionarios() > 0)
                                    consultarFuncionario();
                                else
                                    System.out.println("Sem Funcionários registados!");
                                break;
                            case 0:
                        }
                    } while (opcao2 != 0);
                    break;
                case 3:
                    do {
                        opcao2 = menuClientes();
                        switch (opcao2) {
                            case 1:
                                registarCliente();
                                break;
                            case 2:
                                if (g.getNumClientes() > 0)
                                    consultarCliente();
                                else
                                    System.out.println("Sem clientes registados!");
                                break;
                            case 0:
                        }
                    } while (opcao2 != 0);
                    break;
                case 4:
                    do {
                        opcao2 = menuCompras();
                        switch (opcao2) {
                            case 1:
                                if (g.getNumClientes() > 0 && g.getNumFuncionarios() > 0 && g.getNumVeiculos() > 0)
                                    registarCompra();
                                else
                                    System.out.println("Ainda não foram inseridos Clientes ou Funcionários ou veículos no sistema ! Insira pelo menos um de cada");
                                break;
                            case 2:
                                if (g.getNumClientes() > 0 && g.getNumFuncionarios() > 0 && g.getNumVeiculos() > 0)
                                    consultarCompra();
                                else
                                    System.out.println("Ainda não foram inseridos Clientes ou Funcionários ou veículos no sistema ! Insira pelo menos um de cada");
                                break;
                            case 3:
                                if (g.getNumClientes() > 0 && g.getNumFuncionarios() > 0 && g.getNumVeiculos() > 0)
                                    alterarEstadoCondicaoCompra();
                                else
                                    System.out.println("Ainda não foram inseridos Clientes ou Funcionários ou veículos no sistema ! Insira pelo menos um de cada");
                                break;
                            case 4:
                                if (g.getNumClientes() > 0 && g.getNumFuncionarios() > 0 && g.getNumVeiculos() > 0)
                                    registarNegociacaoCompra();
                                else
                                    System.out.println("Ainda não foram inseridos Clientes ou Funcionários ou veículos no sistema ! Insira pelo menos um de cada");
                                break;
                            case 0:
                        }
                    } while (opcao2 != 0);
                    break;
                case 5:
                    do {
                        opcao2 = menuVendas();
                        switch (opcao2) {
                            case 1:
                                if (g.getNumClientes() > 0 && g.getNumFuncionarios() > 0 && g.getNumVeiculos() > 0)
                                    registarVenda();
                                else
                                    System.out.println("Ainda não foram inseridos Clientes ou Funcionários ou veículos no sistema ! Insira pelo menos um de cada");
                                break;
                            case 2:
                                if (g.getNumClientes() > 0 && g.getNumFuncionarios() > 0 && g.getNumVeiculos() > 0)
                                    consultarVenda();
                                else
                                    System.out.println("Ainda não foram inseridos Clientes ou Funcionários ou veículos sistema ! Insira pelo menos um de cada");
                                break;
                            case 3:
                                if (g.getNumClientes() > 0 && g.getNumFuncionarios() > 0 && g.getNumVeiculos() > 0)
                                    alterarEstadoCondicaoVenda();
                                else
                                    System.out.println("Ainda não foram inseridos Clientes ou Funcionários ou veículos no sistema ! Insira pelo menos um de cada");
                                break;
                            case 4:
                                if (g.getNumClientes() > 0 && g.getNumFuncionarios() > 0 && g.getNumVeiculos() > 0)
                                    registarNegociacaoVenda();
                                else
                                    System.out.println("Ainda não foram inseridos Clientes ou Funcionários ou veículos no sistema ! Insira pelo menos um de cada");
                                break;
                            case 0:
                        }
                    } while (opcao2 != 0);
                    break;
                case 6:
                    do {
                        opcao2 = menuManutencoes();
                        switch (opcao2) {
                            case 1:
                                if (g.getNumClientes() > 0 && g.getNumFuncionarios() > 0 && g.getNumVeiculos() > 0)
                                    registarManutencao();
                                else
                                    System.out.println("Ainda não foram inseridos Clientes ou Funcionários ou veículos no sistema ! Insira pelo menos um de cada");
                                break;
                            case 2:
                                if (g.getNumManutencoes() > 0)
                                    consultarManutencao();
                                else
                                    System.out.println("Ainda não foram inseridos manutenções");
                                break;
                            case 3:
                                if (g.getNumManutencoes() > 0)
                                    alterarEstadoManutencoes();
                                else
                                    System.out.println("Ainda não foram inseridos manutenções");
                                break;
                            case 0:
                        }
                    } while (opcao2 != 0);
                    break;
                case 7:
                    do {
                        opcao2 = menuEstatisticas();
                        switch (opcao2) {
                            case 1:
                                if (g.getServicosNaoConclSucesso() > 0)
                                    percenServNaoConclComSucesso();
                                else
                                    System.out.println("Todos os serviços foram concluídos com sucesso --> Percentagem de serviços não concluídos com sucesso: 0%");
                                break;
                            case 2:
                                if (g.getNumFuncionarios() > 0 && g.getNumVendas() > 0)
                                    funcionarioMaisVendasAno();
                                else
                                    System.out.println("Não há vendas ou funcionários registados no sistema! ");
                                break;
                            case 3:
                                if (g.getNumCompras() > 0 || g.getNumVendas() > 0)
                                    precoTotalVendasComprasAno();
                                else
                                    System.out.println("Não há compras e vendas registados no sistema! ");
                                break;
                            case 4:
                                if (g.getNumCompras() > 0 || g.getNumVendas() > 0)
                                    numTotalServMesAnoDecescente();
                                else
                                    System.out.println("Não há compras e vendas registados no sistema! ");
                                break;
                            case 0:
                        }
                    } while (opcao2 != 0);
                    break;
                case 0:
                    do {
                        sair = Consola.lerChar("Deseja gravar todos os dados registados? (S ou N): ", "sSnN");
                        sair = Character.toUpperCase(sair);
                    } while (sair != 'S' && sair != 'N');
                    if (sair == 'S') {
                        g.gravarFicheiro();
                    } else
                        System.out.println("Programa a terminar... Pressione Enter");
            }
            Consola.sc.nextLine();
        } while (opcao != 0);
    }

    /**
     * Funcao que permite visualizar o preco total de vendas e compras de um determinado ano
     */
    private static void precoTotalVendasComprasAno() {
        int ano, posicao;


        do {
            System.out.println(g.mostrarEstatisticas1());
            ano = Consola.lerInt("Insira o ano pretendido: ", 0, Integer.MAX_VALUE);
            posicao = g.pesquisarEstatisticas1(ano);

            if (posicao == -1) {
                System.out.println("Não houve alguma compra ou venda registada nesse ano");
            }
        } while (posicao == -1);

        Estatistica1 e1 = g.obterEstatisticas1(posicao);

        System.out.println(e1);


    }

    /**
     * Funcao que permite visualizar os dados do funcionario com mais vendas
     */
    private static void funcionarioMaisVendasAno() {
        System.out.println("Funcionário com mais vendas: \n" + g.mostrarFuncionarioMaisVendas());
    }

    /**
     * Funcao permite ver a percentagem de servicos nao concluidos com sucesso
     */
    private static void percenServNaoConclComSucesso() {
        System.out.println("Percentagem de Serviços não conluidos com sucesso: " + (double) (g.getServicosNaoConclSucesso() / (g.getNumCompras() + g.getNumVendas())) * 100 + " %");
    }

    /**
     * Funcao que permite visualizar o numero total de servicos num mes de um determinado ano
     */
    private static void numTotalServMesAnoDecescente() {
        //relacionado á classe  estatísticas 2

    }

    /**
     * Funcao que permite ver os dados da manutencao desejada
     */
    private static void consultarManutencao() {

        int numero;
        int posicao;

        do {
            System.out.println(g.mostrarManutencoes());
            numero = Consola.lerInt("Indique o numero da manutenção: ", 0, Integer.MAX_VALUE);
            posicao = g.pesquisarManutencoes(numero);
            if (posicao == -1)
                System.out.println("Esse Veiculo não está registado no sistema!");
        } while (posicao == -1);
        Manutencao m = g.obterManutencoes(posicao);
        System.out.println(m);


    }

    /**
     * Funcao que altera o estado de manutencao do veiculo
     */
    private static void alterarEstadoManutencoes() {
        int numero, posicao;

        Manutencao manutencao;


        do {
            System.out.println(g.mostrarManutencoes());
            numero = Consola.lerInt("Insira o número da manutenção", 0, Integer.MAX_VALUE);
            posicao = g.pesquisarManutencoes(numero);

            if (posicao == -1)
                System.out.println("Esta manutenção não está registada no sistema! Insira um número de manutenção válido.");
        } while (posicao == -1);

        manutencao = g.obterManutencoes(posicao);

        if (manutencao.getEstado() == 1) {
            manutencao.setEstado(2);
        } else {
            double custo = Consola.lerDouble("Indique o custo da intervenção: ", 0, Double.MAX_VALUE);
            manutencao.setCusto(custo);
            manutencao.getVeiculo().setEmReparacao(Configuracoes.NAO);
            System.out.println("Alteração efetuada\n");
            System.out.println("Manutenção terminada com sucesso.");

        }
    }

    /**
     * Funcao que permite registar a manutencao do veiculo
     */
    private static void registarManutencao() {
        Veiculo veiculo;
        int posicao;
        String localIntervencao;
        String matricula;

        do {
            do {
                do {
                    System.out.println(g.mostrarVeiculo3());
                    matricula = Consola.lerString("Insira a matrícula do veículo: ");

                    posicao = g.pesquisarVeiculo(matricula);

                    if (posicao == -1) {
                        System.out.println("Esse veículo já existe no sistema ou a matrícula é inválida. Insira novamente");
                    }
                } while (posicao == -1);

                veiculo = g.obterVeiculo(posicao);


                if (veiculo.getEstado() == 1) {
                    System.out.println("Não pode ser realizada a manutenção deste veículo. Insira outro em que NÃO esteja em aquisição. ");
                }
            } while (veiculo.getEstado() == 1);

            if (veiculo.isEmReparacao() == Configuracoes.SIM) {
                System.out.println("Não pode ser realizado uma nova manutenção cujo veículo ainda está em reparação. Insira outro veículo. ");
            }
        } while (veiculo.isEmReparacao() == Configuracoes.SIM);

        localIntervencao = Consola.lerString("Indique o local da Intervenção: ");

        Manutencao m = new Manutencao(veiculo, localIntervencao);

        veiculo.setEmReparacao(Configuracoes.SIM);

        g.adicionarManutencao(m);
        System.out.println("Manutenção iniciada com sucesso.");
        veiculo.setNumManutencoes();
    }

    /**
     * Funcao que permite registar a negociacao da venda desejada
     */
    private static void registarNegociacaoVenda() {
        Servico venda;
        int numero, posicao;
        String descricao;
        double precoVeiculo;
        Calendar dataNegociacao = new GregorianCalendar();

        do {
            System.out.println(g.mostrarVenda());
            numero = Consola.lerInt("Insira o número de venda: ", 0, Integer.MAX_VALUE);
            posicao = g.pesquisarVenda(numero);

            if (posicao == -1)
                System.out.println("Esta venda não está registada no sistema! Insira um número de venda válido.");
        } while (posicao == -1);

        venda = g.obterCompra(posicao);

        descricao = Consola.lerString("Insira a descrição da negociação da venda do veículo: ");

        boolean erroD;
        do {
            erroD = false;
            try {
                String sData = Consola.lerString("Indique a data de negociação (dd-MM-aaaa): ");
                dataNegociacao.setTime(formato.parse(sData));
            } catch (ParseException e) {
                erroD = true;
                System.out.println("O formato da data é inválido! (dd-MM-aaaa) ");
            }
        } while (erroD);

        precoVeiculo = Consola.lerDouble("Insira o preço do Veículo: ", 0, Double.MAX_VALUE);

        Negociacao v = new Negociacao(descricao, dataNegociacao, precoVeiculo, venda);
        g.adicionarNegociacao(v);
        venda.setEstado('N');
        System.out.println("Negociacao registada com sucesso\nNOTA IMPORTANTE: ALTERE O ESTADO DA VENDA PARA QUE O VEICULO TENHA O ESTADO DE VENDIDO SE AINDA NAO O FEZ");
    }


    /**
     * Funcao que permite alterar o estado do veiculo e da venda(inclusive a condicao)
     */
    private static void alterarEstadoCondicaoVenda() {
        int numero, posicao;
        Servico venda;
        double precoFinal;
        char condicao;

        Calendar dataFim = new GregorianCalendar();

        do {
            do {
                System.out.println(g.mostrarVenda());
                numero = Consola.lerInt("Insira o número da venda", 0, Integer.MAX_VALUE);//veificar se o numeros contam a partir de 1 ou de 0 e alterar
                posicao = g.pesquisarVenda(numero);

                if (posicao == -1)
                    System.out.println("Esta venda não está registada no sistema! Insira um número de venda válido.");
            } while (posicao == -1);

            venda = g.obterVenda(posicao);

            if (venda.getEstado() == 'C') {
                System.out.println("Esta venda já foi concluída");
            }
        } while (venda.getEstado() == 'C');

        venda.setEstado('C');




            System.out.println("Data de inicio de venda: " + venda.getDataIni());
            boolean erroD;
            do {
                erroD = false;
                try {
                    String sData = Consola.lerString("Indique a data fim de venda (dd-MM-aaaa): ");
                    dataFim.setTime(formato.parse(sData));
                } catch (ParseException e) {
                    erroD = true;
                    System.out.println("O formato da data é inválido! (dd-MM-aaaa) ");
                }
            } while (erroD);





        venda.setDataFim(dataFim);
        Estatistica1 e1;

        do {
            condicao = Consola.lerChar("Com sucesso?(s) (N)", "sSnN");
            condicao = Character.toUpperCase(condicao);
        } while (condicao != 'S' && condicao != 'N');
        if (condicao == 'S') {


            int ano = venda.getDataFim().get(Calendar.YEAR);
            posicao = g.pesquisarEstatisticas1(ano);

            if (posicao == -1) {
                precoFinal = Consola.lerDouble("Indique o preco final da venda: ", 0, Double.MAX_VALUE);
                venda.setPrecoFinal(precoFinal);
                venda.getVeiculo().setPrecoVenda(precoFinal);
                e1 = new Estatistica1(ano, precoFinal, 0);
                g.adicionarEstatistica1(e1);
            } else {
                precoFinal = Consola.lerDouble("Indique o preco final da venda: ", 0, Double.MAX_VALUE);
                venda.setPrecoFinal(precoFinal);
                venda.getVeiculo().setPrecoVenda(precoFinal);
                e1 = g.obterEstatisticas1(posicao);
                e1.setPrecoTotalVendas(e1.getPrecoTotalVendas() + precoFinal);// faz a soma do preco total de vendas num ano
            }

            venda.setCondicao("S");
            venda.getVeiculo().setEstado(4);
            g.setVendaConcluidaComSucesso();
        } else {
            venda.setCondicao("I");
            venda.getVeiculo().setEstado(2);
            g.setServicosNaoConclSucesso();
        }


    }


    /**
     * Funcao que permite ver os dados da venda desejada
     */
    private static void consultarVenda() {
        int numero, posicao;

        do {
            System.out.println(g.mostrarVenda());
            numero = Consola.lerInt("Insira o número da venda: ", 0, Integer.MAX_VALUE);
            posicao = g.pesquisarVenda(numero);

            if (posicao == -1) {
                System.out.println("Esta venda não está registada no sistema! Insira um numero válido");
            }
        } while (posicao == -1);
        Servico v = g.obterVenda(posicao);
        System.out.println(v);
        v.obterNegociacoes(posicao);
        System.out.println(v.mostrarNegociacoes());
    }


    /**
     * Funcao que permite registar uma venda
     */
    private static void registarVenda() {
        int posicao, nif, mes, ano, numtotalservicosmes;
        String matricula;
        Veiculo veiculo;
        Cliente cliente;
        Funcionario funcionario;
        Calendar dataIniVenda = new GregorianCalendar();

        do {
            do {
                do {
                    do {
                        System.out.println(g.mostrarVeiculo3());
                        matricula = Consola.lerString("Indique o veiculo que está envolvido na venda: ");

                        posicao = g.pesquisarVeiculo(matricula);

                        if (posicao == -1) {
                            System.out.println("Este veículo não está registado no sistema! Insira um número válido");
                        }
                    } while (posicao == -1);


                    veiculo = g.obterVeiculo(posicao);

                    if (veiculo.getEstado() == 4) {
                        System.out.println("Este veículo já foi vendido. Insira outro veículo do sistema que esteja para venda");
                    }
                } while (veiculo.getEstado() == 4);

                if (veiculo.getEstado() == 1) {
                    System.out.println("Este veiculo se encontra em aquisição. Insira outro veículo.");
                }
            } while (veiculo.getEstado() == 1);

            veiculo.setEstado(3);

            if (veiculo.isEmReparacao() == Configuracoes.SIM) {
                System.out.println("Este veículo se encontra em reparação. Insira outro veículo");
            }
        } while (veiculo.isEmReparacao() == Configuracoes.SIM);


        boolean erroD;
        do {
            erroD = false;
            try {
                String sData = Consola.lerString("Indique a data de início de venda (dd-MM-aaaa): ");
                dataIniVenda.setTime(formato.parse(sData));
            } catch (ParseException e) {
                erroD = true;
                System.out.println("O formato da data é inválido!(dd-MM-aaaa)");
            }
        } while (erroD);


        do {
            System.out.println(g.mostrarFuncionario());
            nif = Consola.lerInt("Insira o NIF do funcionário envolvido na venda: ", 1, Configuracoes.MAXNIF);
            posicao = g.pesquisarFuncionario(nif);

            if (posicao == -1) {
                System.out.println("Este Funcionário não está registado no sistema!");
            }
        } while (posicao == -1);

        funcionario = g.obterFuncionario(posicao);

        do {
            System.out.println(g.mostrarClientes());
            nif = Consola.lerInt("Insira o NIF do Cliente envolvido na venda: ", 1, Configuracoes.MAXNIF);
            posicao = g.pesquisarCliente(nif);

            if (posicao == -1) {
                System.out.println("Este Cliente não está registado no sistema!");
            }
        } while (posicao == -1);

        cliente = g.obterCliente(posicao);

        Servico v = new Servico(veiculo, dataIniVenda, funcionario, cliente);

        funcionario.setNumVendas();
        funcionario.setNumServicos();

        g.adicionarVenda(v);
        cliente.adicionarVenda(v);

        System.out.println("Serviço registado com Sucesso");
        System.out.println("NOTA IMPORTANTE: REGISTE A NEGOCIACAO E ALTERE O ESTADO DA VENDA PARA QUE O VEICULO TENHA O ESTADO DE VENDIDO");
    }

    /**
     * Funcao que permite registar a negociacao da compra desejada
     */
    private static void registarNegociacaoCompra() {
        Servico compra;
        int numero, posicao;
        String descricao;
        double precoVeiculo;
        Calendar dataNegociacao = new GregorianCalendar();


        do {
            System.out.println(g.mostrarCompras());
            numero = Consola.lerInt("Insira o número de compra: ", 0, Integer.MAX_VALUE);
            posicao = g.pesquisarCompra(numero);

            if (posicao == -1) {
                System.out.println("Esta compra não está registada no sistema! Insira um número de compra válido.");
            }
        } while (posicao == -1);

        compra = g.obterCompra(posicao);


        descricao = Consola.lerString("Insira a descrição da negociação da compra do veículo: ");

        boolean erroD;
        do {
            erroD = false;
            try {
                String sData = Consola.lerString("Indique a data de negociação(dd-MM-aaaa): ");
                dataNegociacao.setTime(formato.parse(sData));
            } catch (ParseException e) {
                erroD = true;
                System.out.println("O formato da data é inválido! (dd-MM-aaaa) ");
            }
        } while (erroD);

        precoVeiculo = Consola.lerDouble("Insira o preço do Veículo: ", 0, Double.MAX_VALUE);

        Negociacao c = new Negociacao(descricao, dataNegociacao, precoVeiculo, compra);
        g.adicionarNegociacao(c);
        compra.adicionarNegociacao(c);
        compra.setEstado('N');
        System.out.println("Negociação registada com sucesso\nNOTA IMPORTANTE: ALTERE O ESTADO DA COMPRA PARA QUE O VEICULO TENHA O ESTADO DE ADQUIRIDO SE AINDA NAO O FEZ");
    }


    /**
     * Funcao que permite alterar o estado do veiculo e da compra(inclusive a condicao)
     */
    private static void alterarEstadoCondicaoCompra() {
        int numero, posicao;
        Servico compra;
        double precoFinal;
        char condicao;


        Calendar dataFim = new GregorianCalendar();

        do {
            do {
                System.out.println(g.mostrarCompras());
                numero = Consola.lerInt("Insira o número da compra: ", 0, Integer.MAX_VALUE);
                posicao = g.pesquisarCompra(numero);

                if (posicao == -1) {
                    System.out.println("Esta compra não está registada no sistema! Insira um número de compra válido.");
                }
            } while (posicao == -1);

            compra = g.obterCompra(posicao);


            if (compra.getEstado() == 'C') {
                System.out.println("Esta compra já foi concluída");
            }
        } while (compra.getEstado() == 'C');

        compra.setEstado('C');

        boolean erroD;


            System.out.println("Data de inicio de compra: " + compra.getDataIni().get(Calendar.DATE)+"-"+compra.getDataIni().get(Calendar.MONTH)+"-"+compra.getDataIni().get(Calendar.YEAR));
            do {
                erroD = false;
                try {
                    String sData = Consola.lerString("Indique a data fim de compra (dd-MM-aaaa): ");
                    dataFim.setTime(formato.parse(sData));
                } catch (ParseException e) {
                    erroD = true;
                    System.out.println("O formato da data é inválido! (dd-MM-aaaa) ");
                }
            } while (erroD);


            if (compra.getDataIni().compareTo(dataFim) == -1) {
                System.out.println("A data de fim de compra é anterior à data inicial de compra. Insira uma data válida");
            }



        compra.setDataFim(dataFim);

        do {
            condicao = Consola.lerChar("Com sucesso?(S) (N): ", "sSnN");
            condicao = Character.toUpperCase(condicao);
        } while (condicao != 'S' && condicao != 'N');   //tentar ver se posso fazer to upper

        if (condicao == 'S') {

            Estatistica1 e1;

            int ano = compra.getDataFim().get(Calendar.YEAR);
            posicao = g.pesquisarEstatisticas1(ano);

            if (posicao == -1) { //se o ano não estiver registado na estatística....
                precoFinal = Consola.lerDouble("Indique o preco final da compra: ", 0, Double.MAX_VALUE);
                compra.setPrecoFinal(precoFinal);
                e1 = new Estatistica1(ano, 0, precoFinal);
                g.adicionarEstatistica1(e1);
            } else {
                g.obterEstatisticas1(posicao);
                precoFinal = Consola.lerDouble("Indique o preco final da compra: ", 0, Double.MAX_VALUE);
                compra.setPrecoFinal(precoFinal);
                e1 = g.obterEstatisticas1(posicao);
                e1.setPrecoTotalCompras(e1.getPrecoTotalCompras() + precoFinal);// faz a soma do preco total de compras num ano
            }

            compra.setCondicao("S");
            g.setCompraConcluidaComSucesso();
            compra.getVeiculo().setEstado(2); //isto vai dizer que o estado do veiculo é adquirido
        } else {
            compra.setCondicao("I");
            g.setServicosNaoConclSucesso();
        }

    }


    /**
     * Funcao que permite registar uma compra
     */
    private static void registarCompra() {
        int posicao, nif;
        String matricula;
        Veiculo veiculo;
        Cliente cliente;
        Funcionario funcionario;
        Calendar dataIniCompra = new GregorianCalendar();


        do {

            do {
                System.out.println(g.mostrarVeiculo2());

                matricula = Consola.lerString("Indique o veiculo que está envolvido na compra: ");
                posicao = g.pesquisarVeiculo(matricula);

                if (posicao == -1) {
                    System.out.println("Este veículo não está registado o sistema!");
                }
            } while (posicao == -1);

            veiculo = g.obterVeiculo(posicao);


            if (veiculo.getEstado() != 1) { // condicão  a ser confirmada
                System.out.println("Este veículo já não está em aquisição. Insira outro veiculo do sistema que esteja em aquisição ");
            }

        } while (veiculo.getEstado() != 1);

        boolean erroD;
        do {
            erroD = false;
            try {
                String sData = Consola.lerString("Indique a data de início de compra (dd-MM-aaaa): ");
                dataIniCompra.setTime(formato.parse(sData));
            } catch (ParseException e) {
                erroD = true;
                System.out.println("O formato da data é inválido! (dd-MM-aaaa)");
            }
        } while (erroD);

        do {
            System.out.println(g.mostrarFuncionario2());
            nif = Consola.lerInt("Insira o NIF do funcionário envolvido na compra: ", 1, Configuracoes.MAXNIF);
            posicao = g.pesquisarFuncionario(nif);

            if (posicao == -1)
                System.out.println("Este Funcionário não está registado no sistema!");

            funcionario = g.obterFuncionario(posicao);

            if (funcionario.getComercial() == 'N')
                System.out.println("Este funcionário não lhe é permitido comprar veiculos");
        } while (posicao == -1 || funcionario.getComercial() == 'N');


        do {
            System.out.println(g.mostrarClientes());
            nif = Consola.lerInt("Insira o NIF do Cliente envolvido na compra: ", 1, Configuracoes.MAXNIF);
            posicao = g.pesquisarCliente(nif);

            if (posicao == -1) {
                System.out.println("Este Cliente não está registado no sistema!");
            }
        } while (posicao == -1);

        cliente = g.obterCliente(posicao);

        Servico c = new Servico(veiculo, dataIniCompra, funcionario, cliente);

        g.adicionarCompras(c);
        cliente.adicionarCompra(c);
        funcionario.setNumServicos(); //regista o numero total de serviços
        System.out.println("Serviço registado com Sucesso\n");
        System.out.println("NOTA IMPORTANTE: REGISTE A NEGOCIACAO E ALTERE O ESTADO DA COMPRA PARA QUE O VEICULO TENHA O ESTADO DE ADQUIRIDO");
    }

    /**
     * Funcao que permite ver os dados da compra desejada
     */
    private static void consultarCompra() {
        int numero, posicao;


        do {
            System.out.println(g.mostrarCompras());
            numero = Consola.lerInt("Insira o número da compra: ", 0, Integer.MAX_VALUE);
            posicao = g.pesquisarCompra(numero);

            if (posicao == -1) {
                System.out.println("Esta compra não está registada no sistema! Insira um numero válido");
            }
        } while (posicao == -1);
        Servico c = g.obterCompra(posicao);
        System.out.println(c);
        c.obterNegociacoes(posicao);
        System.out.println(c.mostrarNegociacoes());

    }

    /**
     * Funcao que permite alterar os dados do veiculo desejado
     */
    private static void alterarDadosVeiculo() {
        int posicao, numQuilometros;
        String matricula, marca, modelo, tipoCombustivel, caracteristicas;
        char resposta;

        do {
            System.out.println(g.mostrarVeiculo());
            matricula = Consola.lerString("Indique a matrícula do veículo: ");
            posicao = g.pesquisarVeiculo(matricula);

            if (posicao == -1) {
                System.out.println("Este veículo não está registado no sistema!");
            }
        } while (posicao == -1);
        Veiculo v = g.obterVeiculo(posicao);

        System.out.println(v);

        do {
            resposta = Consola.lerChar("Pretende alterar a marca (S) ou (N)? ", "sSnN");
            resposta = Character.toUpperCase(resposta);

            if (resposta == 'S') {
                marca = Consola.lerString("Indique a nova marca: ");
                v.setMarca(marca);
            }
        } while ((resposta != 'S' && resposta != 'N'));


        do {
            resposta = Consola.lerChar("Pretende alterar o modelo (S) ou (N)? ", "sSnN");
            resposta = Character.toUpperCase(resposta);

            if (resposta == 'S') {
                modelo = Consola.lerString("Indique o novo modelo: ");
                v.setModelo(modelo);
            }
        } while ((resposta != 'S' && resposta != 'N'));

        do {
            resposta = Consola.lerChar("Pretende alterar o tipo de combustível (S) ou (N)? ", "sSnN");
            resposta = Character.toUpperCase(resposta);

            if (resposta == 'S') {
                tipoCombustivel = Consola.lerString("Indique o novo tipo de combustível: ");
                v.setTipoCombustivel(tipoCombustivel);
            }
        } while ((resposta != 'S' && resposta != 'N'));

        do {
            resposta = Consola.lerChar("Pretende alterar o numero de quilómetros (S) ou (N)? ", "sSnN");
            resposta = Character.toUpperCase(resposta);

            if (resposta == 'S') {
                numQuilometros = Consola.lerInt("Indique o numero de quilometros do carro: ", 0, Integer.MAX_VALUE);
                v.setNumQuilometros(numQuilometros);
            }
        } while ((resposta != 'S' && resposta != 'N'));

        do {
            resposta = Consola.lerChar("Pretende alterar as características do veículo (S) ou (N)? ", "sSnN");
            resposta = Character.toUpperCase(resposta);

            if (resposta == 'S') {
                caracteristicas = Consola.lerString("Indique as novas características do veículo: ");
                v.setCaracteristicas(caracteristicas);
            }
        } while ((resposta != 'S' && resposta != 'N'));
        System.out.println("Alterações efetuadas com sucesso");

    }

    /**
     * Funcao que permite consultar o veiculo desejado pela matricula
     */
    private static void consultarMatricula() {
        String matricula;
        int posicao;

        do {
            System.out.println(g.mostrarVeiculo());
            matricula = Consola.lerString("Indique a matricula do Veículo: ");
            posicao = g.pesquisarVeiculo(matricula);
            if (posicao == -1)
                System.out.println("Esse Veiculo não está registado no sistema!");
        } while (posicao == -1);
        Veiculo v = g.obterVeiculo(posicao);
        System.out.println(v);
    }

    /**
     * Funcao que permite registar um veiculo
     */
    private static void registarVeiculo() {
        int numQuilometros;
        String matricula, marca, modelo, tipoCombustivel, caracteristicas;

        int s;
        do {
            matricula = Consola.lerString("Insira a matrícula do veículo: ");
            s = g.pesquisarVeiculo(matricula);

            if (s != -1) {
                System.out.println("Esse veículo já existe no sistema ou a matrícula é inválida. Insira novamente");
            }
        } while (s != -1);

        marca = Consola.lerString("Insira a marca do veículo: ");

        modelo = Consola.lerString("Insira o modelo do veículo: ");

        numQuilometros = Consola.lerInt("Insira o número de quliómetros do veículo: ", 0, Integer.MAX_VALUE);

        tipoCombustivel = Consola.lerString("Insira o tipo de combustível do veículo: ");

        caracteristicas = Consola.lerString("Insira as características do veículo: ");

        Veiculo v = new Veiculo(matricula, marca, modelo, tipoCombustivel, numQuilometros, caracteristicas);
        g.adicionarVeiculo(v);


    }

    /**
     * Funcao que permite registar um funcionario.
     * <p>
     * Nota: esta funcao tem duas funcoes "g.pesquisarFuncionario(nif)" e "g.pesquisarCliente(nif)" de maneira que o nif seja unico tanto para o funcionario e para o cliente
     */
    private static void registarFuncionario() {
        int posicao;
        int nif, telefone;
        String nome, morada, funcao;
        char comercial;

        do {
            do {
                nif = Consola.lerInt("Insira o NIF do funcionário: ", 1, Configuracoes.MAXNIF);

                posicao = g.pesquisarCliente(nif);
                if (posicao != -1) {//se o cliente existir....
                    System.out.println("Este nif pertence a um cliente. Insira um nif válido de 9 algarismos");
                }
            } while (posicao != -1);

            posicao = g.pesquisarFuncionario(nif);

            if (posicao != -1) { //se o funcionario existir....
                System.out.println("Esse funcionário já existe no sistema ou o nif é inválido. Insira um nif válido de 9 algarismos");
            }
        } while (posicao != -1);

        nome = Consola.lerString("Indique o nome do funcionário: ");

        do {
            telefone = Consola.lerInt("Insira o numero de telefone do funcionário: ", 1, Configuracoes.MAXNUMTELEFONE);
            posicao = g.pesquisarFuncionario(telefone);
            if (posicao != -1) {
                System.out.println("Esse funcionáro já existe no sistema ou o numero de telefone é inválido. Insira um número de telefone válido de 9 algarismos");
            }
        } while (posicao != -1);

        morada = Consola.lerString("Insira a morada do Funcionário: ");

        funcao = Consola.lerString("Insira a função do funcionário a desempenhar: ");

        do {

            comercial = Consola.lerChar("Este funcionário é comercial?(S ou N) ", "sSnN");
            comercial = Character.toUpperCase(comercial);

            if (comercial == 'S') {
                System.out.println("Este funcionário é lhe permitido fazer compra de veículos.");
            }
        } while ((comercial != 'S' && comercial != 'N'));// se houver repetição no ecra é só mudar de "||" para "&&"

        Funcionario f = new Funcionario(nif, nome, morada, telefone, funcao, comercial);

        g.adicionarFuncionario(f);
        System.out.println("Funcionário registado com sucesso!");
    }


    /**
     * Funcao que permite ver os dados do funcionário desejado
     * <p>
     * Nota: esta funcao tem duas funcoes "g.pesquisarFuncionario(nif)" e "g.pesquisarCliente(nif)" de maneira que o nif seja unico tanto para o funcionario e para o cliente
     */
    private static void consultarFuncionario() {
        int nif;
        int posicao;

///ver esta condicao
        do {
            do {
                System.out.println(g.mostrarFuncionario());
                nif = Consola.lerInt("Insira o NIF do funcionário: ", 1, Configuracoes.MAXNIF);

                posicao = g.pesquisarCliente(nif);
                if (posicao != -1) {//se o cliente existir...
                    System.out.println("Este nif pertence a um cliente. Insira um nif válido de 9 algarismos");
                }
            } while (posicao != -1);

            posicao = g.pesquisarFuncionario(nif);

            if (posicao == -1) {  //se o funcionario nao existir
                System.out.println("Este nif é inválido. Insira um nif válido de 9 algarismos");
            }
        } while (posicao == -1);
        Funcionario f = g.obterFuncionario(posicao);
        System.out.println(f);

    }

    /**
     * Funcao que permite registar os dados do cliente
     */
    private static void registarCliente() {
        int posicao;
        int nif, telefone;
        String nome, morada;
        Calendar dataEntrada = new GregorianCalendar();

        do {
            do {
                nif = Consola.lerInt("Insira o NIF do Cliente: ", 1, Configuracoes.MAXNIF);

                posicao = g.pesquisarFuncionario(nif);

                if (posicao != -1) {
                    System.out.println("Este nif pertence a um funcionário. Insira um nif válido de 9 algarismos ÚNICO");
                }
            } while (posicao != -1);

            posicao = g.pesquisarCliente(nif);
            if (posicao != -1) {
                System.out.println("Esse Cliente já existe no sistema ou o nif é inválido. Insira um nif válido de 9 algarismos");
            }
        } while (posicao != -1);

        nome = Consola.lerString("Indique o nome do cliente: ");

        do {
            telefone = Consola.lerInt("Insira o numero de telefone do cliente: ", 1, Configuracoes.MAXNUMTELEFONE);
            posicao = g.pesquisarFuncionarioTelefone(telefone);

            if (posicao != -1) {
                System.out.println("Esse funcionário já existe no sistema ou o numero de telefone é inválido. Insira um número de telefone válido de 9 algarismos");
            }
        } while (posicao != -1);

        morada = Consola.lerString("Insira a morada do cliente: ");

        boolean erroD;
        do {
            erroD = false;
            try {
                String sData = Consola.lerString("Indique a data de entrada no sistema (dd-MM-aaaa): ");
                dataEntrada.setTime(formato.parse(sData));
            } catch (ParseException e) {
                erroD = true;
                System.out.println("O formato da data é inválido! (dd-MM-aaaa) ");
            }
        } while (erroD);

        Cliente c = new Cliente(nif, nome, morada, telefone, dataEntrada);

        g.adicionarCliente(c);
        System.out.println("Cliente registado com sucesso!");
    }

    /**
     * Funcao que permite ver os dados do cliente desejado
     */
    private static void consultarCliente() {
        int nif, posicao;


        do {
            do {
                System.out.println(g.mostrarClientes());
                nif = Consola.lerInt("Insira o NIF do Cliente: ", 1, Configuracoes.MAXNIF);

                posicao = g.pesquisarFuncionario(nif);
                if (posicao != -1) {
                    System.out.println("Este nif pertence a um funcionário. Insira um nif válido de 9 algarismos");
                }
            } while (posicao != -1);

            posicao = g.pesquisarCliente(nif);
            if (posicao == -1) {
                System.out.println("Este nif é inválido. Insira um nif válido de 9 algarismos");
            }
        } while (posicao == -1);

        Cliente c = g.obterCliente(posicao);

        System.out.println(c);

        System.out.println(c.mostrarCompras());

        System.out.println(c.mostrarVendas());
    }

    /**
     * Funcao que mostra o menu relativamente as estatiscticas da gestao geral de veiculos
     *
     * @return devolve a opcao escolhida
     */
    private static int menuEstatisticas() {
        int opcao;

        System.out.println();
        System.out.println("1 - Percentagem de Serviços não concluídos com sucesso");
        System.out.println("2 - Funcionário(s) com mais vendas realizadas");
        System.out.println("3 - Preço Total em vendas/compras, por ano");
        System.out.println("4 - Número total de serviços registados por mês num determinado ano");
        System.out.println("0 - Voltar ao menu anterior\n");
        opcao = Consola.lerInt("Opcao: ", 0, 4);

        return opcao;
    }

    /**
     * Funcao que mostra o menu relativamente a gestao de manutencoes de veiculos
     *
     * @return devolve a opcao escolhida
     */
    private static int menuManutencoes() {
        int opcao;

        System.out.println();
        System.out.println("1 - Registar");
        System.out.println("2 - Consultar por matricula");
        System.out.println("3 - Alterar estado");
        System.out.println("0 - Voltar ao menu anterior\n");
        opcao = Consola.lerInt("Opcao: ", 0, 3);

        return opcao;
    }

    /**
     * Funcao que mostra o menu relativamente a gestao de vendas de veiculos
     *
     * @return devolve a opcao escolhida
     */
    private static int menuVendas() {

        int opcao;

        System.out.println();
        System.out.println("1 - Registar");
        System.out.println("2 - Consultar por número");
        System.out.println("3 - Alterar estado");
        System.out.println("4 - Registar negociação");
        System.out.println("0 - Voltar ao menu anterior\n");
        opcao = Consola.lerInt("Opção: ", 0, 4);

        return opcao;
    }

    /**
     * Funcao que mostra o menu relativamente a gestao de compras de veiculos
     *
     * @return devolve a opcao escolhida
     */
    private static int menuCompras() {


        int opcao;

        System.out.println();
        System.out.println("1 - Registar");
        System.out.println("2 - Consultar por número");
        System.out.println("3 - Alterar estado");
        System.out.println("4-  Registar negociação");
        System.out.println("0 - Voltar ao menu anterior\n");
        opcao = Consola.lerInt("Opção: ", 0, 4);

        return opcao;
    }

    /**
     * Funcao que mostra o menu relativamente a gestao de funcionarios
     *
     * @return devolve a opcao escolhida
     */
    private static int menuFuncionarios() {


        int opcao;

        System.out.println();
        System.out.println("1 - Registar");
        System.out.println("2 - Consultar por NIF");
        System.out.println("0 - Voltar ao menu anterior\n");
        opcao = Consola.lerInt("Opção: ", 0, 2);

        return opcao;
    }

    /**
     * funcao que mostra o menu relativamente a gestao de clientes
     *
     * @return devolve a opcao escolhida
     */
    private static int menuClientes() {

        int opcao;

        System.out.println();
        System.out.println("1 - Registar");
        System.out.println("2 - Consultar por NIF");
        System.out.println("0 - Voltar ao menu anterior\n");
        opcao = Consola.lerInt("Opção: ", 0, 2);

        return opcao;
    }

    /**
     * Funcao que mostra o menu relativamente a gestao de veiculos
     *
     * @return devolve a opcao escolhida
     */
    private static int menuVeiculos() {

        int opcao;

        System.out.println();
        System.out.println("1 - Registar");
        System.out.println("2 - Consultar por Matrícula");
        System.out.println("3 - Alterar dados");
        System.out.println("0 - Voltar ao menu anterior\n");
        opcao = Consola.lerInt("Opção: ", 0, 3);

        return opcao;
    }

    /**
     * Funcao que mostra o Menu principal do programa
     *
     * @return devolve a opcao escolhida
     */
    private static int menuPrincipal() {


        int opcao;

        System.out.println("\t\t\t\tGestão de Veículos\n");
        System.out.println("Número de serviços de compra concluídos com sucesso: " + g.getCompraConcluidaComSucesso() + "\tNúmero de serviços de venda concluidos com sucesso: " + g.getVendaConcluidaComSucesso() + "\n\n");
        System.out.println("1 - Gerir Veículos");
        System.out.println("2 - Gerir Funcionários");
        System.out.println("3 - Gerir Clientes");
        System.out.println("4 - Gerir Compras");
        System.out.println("5 - Gerir Vendas");
        System.out.println("6 - Gerir Manutenções");
        System.out.println("7 - Estatísticas");
        System.out.println("0 - Sair\n");
        opcao = Consola.lerInt("Opção: ", 0, 7);

        return opcao;
    }
}
