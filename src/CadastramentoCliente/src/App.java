import Dao.ClientesDao;
import Dao.ProdutosDao;
import Factory.Factory;
import dominio.Cliente;
import dominio.Produto;
import generics.IGenericDao;

import java.util.Scanner;
import Factory.*;
import generics.Persistence;

public class App {
    static Scanner sc = new Scanner(System.in);
    static String option;
    static String optionMenuGeral;
    static ClientesDao clientesDao = new ClientesDao();
    static ProdutosDao produtosDao = new ProdutosDao();
    static Factory factory = new Factory();

    public static void main(String[] args) {
        do {
            System.out.println("Digite 1 para clientes e 2 para produtos.\n");
            optionMenuGeral = sc.next();
            while (!optionMenuGeral.equals("1") && !optionMenuGeral.equals("2")){
                System.out.println("Opção inválida...Tente novamente.");
                System.out.println("Digite 1 para clientes e 2 para produtos.\n");
                optionMenuGeral = sc.next();
            }

            System.out.println("Informe um número de 1 a 5: \n");
            option = sc.next();
            if (validaOption()) {
                switch (option) {
                    case ("1"):
                        System.out.println("cadastramento.");
                        cadastramento(optionMenuGeral);
                        break;
                    case ("2"):
                        System.out.println("Consultas.");
                        consulta(optionMenuGeral);
                        break;
                    case ("3"):
                        System.out.println("Exclusão.");
                        exclusao(optionMenuGeral);
                        break;
                    case ("4"):
                        System.out.println("Atualizar.");
                        atualizacao(optionMenuGeral);
                        break;
                    case ("5"):
                        System.out.println("Sair.");
                        break;
                }
            }
        } while (validaResp());
    }
    private static void atualizacao(String optionMenuGeral) {

        IGenericDao mapDao = getMapDao(optionMenuGeral);

        if (optionMenuGeral.equals("1")){
            System.out.println("Informe o nome do cliente: ");
            String nome = sc.next().trim();
            System.out.println("Informe o cpf do cliente: ");
            String cpf = sc.next( ).trim();
            mapDao.atualizar(new Cliente(nome,cpf));

        } else if (optionMenuGeral.equals("2")) {

            System.out.println("Informe o nome do produto: ");
            String nome = sc.next().trim();
            System.out.println("Informe o codigo do produto: ");
            String codigo = sc.next( ).trim();
            mapDao.atualizar(new Produto(nome,codigo));
        } else  System.out.println("Digite apenas as informações solicitadas, ok? ");
    }

    private static Persistence criarObjecto(String nome, String codigo, String optionMenuGeral) {
        PersistenteFactory factory1 = factory.createFactory(optionMenuGeral);
        return factory1.criaObjeto(nome,codigo);
    }

    private static void exclusao(String optionMenuGeral) {
        String mensagem = optionMenuGeral.equals("1") ? "Informe o Cpf do cliente.": "Informe o código do produto:";
        IGenericDao mapDao = getMapDao(optionMenuGeral);
        System.out.println(mensagem);
        String entrance = sc.next().trim();
        mapDao.excluir(entrance);
    }
    private static void consulta(String optionMenuGeral) {
        String mensagem = optionMenuGeral.equals("1") ? "Informe o Cpf do cliente.": "Informe o código do produto:";
        IGenericDao mapDao = getMapDao(optionMenuGeral);
        System.out.println(mensagem);
        String entrance = sc.next().trim();
        mapDao.consultar(entrance);
    }
    private static void cadastramento(String optionMenuGeral) {

        IGenericDao mapDao = getMapDao(optionMenuGeral);

        if (optionMenuGeral.equals("1")){
            System.out.println("Informe o nome do cliente: ");
            String nome = sc.next().trim();
            System.out.println("Informe o cpf do cliente: ");
            String cpf = sc.next( ).trim();
            Persistence persistence = criarObjecto(nome, cpf, optionMenuGeral);
            mapDao.cadastrar(persistence);

        } else if (optionMenuGeral.equals("2")) {

            System.out.println("Informe o nome do produto: ");
            String nome = sc.next().trim();
            System.out.println("Informe o codigo do produto: ");
            String codigo = sc.next( ).trim();
            Persistence persistence = criarObjecto(nome, codigo, optionMenuGeral);
            mapDao.cadastrar(persistence);

        } else  System.out.println("Digite apenas as informações solicitadas, ok? ");
    }
    private static IGenericDao getMapDao(String optionMenuGeral) {
        return switch (optionMenuGeral) {
            case ("1") -> clientesDao;
            case ("2") -> produtosDao;
            default -> null;
        };
    }
    private static boolean validaOption() {
        if (!option.equals("1") && !option.equals("2") &&!option.equals("3") &&
                !option.equals("4") &&!option.equals("5")){
            do {
                System.out.println("Ops.. opção inválida!\n");
                System.out.println("Digite um número de 1 a 5.");
                option = sc.next();
            } while (!option.equals("1") && !option.equals("2") &&!option.equals("3") &&
                    !option.equals("4") && !option.equals("5"));
        }
        return true;
    }
    private static Boolean validaResp() {
        String resp = null;
        if (option.equals("5")){
            System.out.println("Até mais!");
            return false;
        } else {
            System.out.println("Deseja continuar? S/N");
            resp = sc.next().trim().toUpperCase();
            while (!resp.equals("S") && !resp.equals("N")) {
                System.out.println("Digite apenas S ou N, ok?");
                System.out.println("Deseja continuar? S/N");
                resp = sc.next().trim().toUpperCase();
                if (resp.equals("N")) System.out.println("Até a próxima!");
            }}
        return resp.equals("S");
    }
}


