package servico;

import java.util.Scanner;

import Dao.ClientesDao;
import Dao.ProdutosDao;
import dominio.*;

public class App {
    static Scanner sc = new Scanner(System.in);
    static String option;
    static ClientesDao clientesDao = new ClientesDao();
    static ProdutosDao produtosDao = new ProdutosDao();

    public static void main(String[] args) {
        do {
            System.out.println("Informe um número de 1 a 5: \n");
            option = sc.next();
            if (validaOption()) {
                switch (option) {
                    case ("1"):
                        System.out.println("cadastramento.");
                        cadastramento();
                        break;
                    case ("2"):
                        System.out.println("Consultas.");
                        consulta();
                        break;
                    case ("3"):
                        System.out.println("Exclusão.");
                        exclusao();
                        break;
                    case ("4"):
                        System.out.println("Atualizar.");
                        atualizacao();
                        break;
                    case ("5"):
                        System.out.println("Sair.");
                        break;
                }
            }
        } while (validaResp());
    }
    private static void atualizacao() {
        System.out.println("Deseja atualizar os dados de um cliente ou produto? ");
        String resp = sc.next().trim().toUpperCase();
        if (resp.equals("CLIENTE")){
            System.out.println("Informe o nome do cliente: ");
            String nome = sc.next().trim();
            System.out.println("Informe o cpf do cliente: ");
            String cpf = sc.next().trim();
            clientesDao.atualizar(new Cliente(nome,cpf));
        } else if (resp.equals("PRODUTO")) {
            System.out.println("Informe o nome do produto: ");
            String nome = sc.next().trim();
            System.out.println("Informe o codigo do produto: ");
            String codigo = sc.next().trim();
            produtosDao.atualizar(new Produto(nome,codigo));
        } else {
            System.out.println("Digite apenas cliente ou produto, ok ?");
        }
    }

    private static void exclusao() {
        System.out.println("Deseja excluir um cliente ou produto? ");
        String resp = sc.next().trim().toUpperCase();
        if (resp.equals("CLIENTE")){
            System.out.println("Informe o cpf do cliente: ");
            String cpf = sc.next().trim();
            clientesDao.excluir(cpf);
        } else if (resp.equals("PRODUTO")) {
            System.out.println("Informe o codigo do produto: ");
            String codigo = sc.next().trim();
            produtosDao.excluir(codigo);
        } else {
            System.out.println("Digite apenas cliente ou produto, ok ?");
        }
    }
    private static void consulta() {
        System.out.println("Deseja consultar um cliente ou produto? ");
        String resp = sc.next().trim().toUpperCase();
        if (resp.equals("CLIENTE")){
            System.out.println("Informe o cpf do cliente: ");
            String cpf = sc.next().trim();
            clientesDao.consultar(cpf);
        } else if (resp.equals("PRODUTO")) {
            System.out.println("Informe o codigo do produto: ");
            String codigo = sc.next().trim();
            produtosDao.consultar(codigo);
        } else {
            System.out.println("Digite apenas cliente ou produto, ok ?");
        }
    }
    private static void cadastramento() {
        System.out.println("Deseja cadastrar um cliente ou produto? ");
        String resp = sc.next().trim().toUpperCase();
        if (resp.equals("CLIENTE")){
            System.out.println("Informe o nome do cliente: ");
            String nome = sc.next().trim();
            System.out.println("Informe o cpf do cliente: ");
            String cpf = sc.next().trim();
            clientesDao.cadastrar(new Cliente(nome,cpf));
        } else if (resp.equals("PRODUTO")) {
            System.out.println("Informe o nome do produto: ");
            String nome = sc.next().trim();
            System.out.println("Informe o codigo do produto: ");
            String codigo = sc.next().trim();
           produtosDao.cadastrar(new Produto(nome,codigo));
        } else {
            System.out.println("Digite apenas cliente ou produto, ok ?");
        }
    }

    private static boolean validaOption() {
        if (!option.equals("1") && !option.equals("2") &&!option.equals("3") &&
                !option.equals("4") &&!option.equals("5")){
            do {
                System.out.println("Ops.. opção inválida!\n");
                System.out.println("Digite um número de 1 a 5.");
                option = sc.next();
            } while (!option.equals("1") && !option.equals("2") &&!option.equals("3") &&
                    !option.equals("4") &&!option.equals("5"));
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


