import java.util.Scanner;

public class App {
    static Scanner sc = new Scanner(System.in);
    static String option = null;
    static CachorroDAO dogDao = new CachorroDAO();
    static GatoDao gatoDao = new GatoDao();

    public static void main(String[] args) {
        do {
            System.out.println("Informe um número de 1 a 5: \n");
            option = sc.next();
            if (validaOption()){
                switch(option){
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
        } while (validaResp());}

    private static void atualizacao() {

        System.out.println("Deseja alterar os dados de um dog ou gato? ");
        String resp = sc.next().trim().toUpperCase();
        if (resp.equals("DOG")){
            System.out.println("Informe o nome do dog: ");
            String nome = sc.next().trim();
            System.out.println("Informe a raça do dog: ");
            String raca = sc.next().trim();
            String alterar = dogDao.alterar(nome, raca);
            System.out.println(alterar);
        } else if (resp.equals("GATO")) {
            System.out.println("Informe o nome do gato: ");
            String nome = sc.next().trim();
            System.out.println("Informe a raça do gato: ");
            String raca = sc.next().trim();
            String alterar = gatoDao.alterar(nome, raca);
            System.out.println(alterar);
        } else {
            System.out.println("Digite apenas DOG ou Gato,ok ?");
        }
    }

    private static void exclusao() {
        System.out.println("Deseja excluir um dog ou gato? ");
        String resp = sc.next().trim().toUpperCase();
        if (resp.equals("DOG")){
            System.out.println("Informe o nome do dog: ");
            String nome = sc.next().trim();
            String exclusao = dogDao.remover(nome);
            System.out.println(exclusao);
        } else if (resp.equals("GATO")) {
            System.out.println("Informe o nome do gato: ");
            String nome = sc.next().trim();
            String exclusao = gatoDao.remover(nome);
            System.out.println(exclusao);
        } else {
            System.out.println("Digite apenas DOG ou Gato,ok ?");
        }
    }

    private static void consulta() {
        System.out.println("Deseja consultar um dog ou gato? ");
        String resp = sc.next().trim().toUpperCase();
        if (resp.equals("DOG")){
            System.out.println("Informe o nome do dog: ");
            String nome = sc.next();
            String consultar = dogDao.consultar(nome);
            System.out.println(consultar);
        } else if (resp.equals("GATO")) {
            System.out.println("Informe o nome do gato: ");
            String nome = sc.next();
            String consultar = gatoDao.consultar(nome);
            System.out.println(consultar);
        } else {
            System.out.println("Digite apenas DOG ou Gato,ok ?");
        }

    }

    private static void cadastramento() {
        System.out.println("Deseja cadastrar um dog ou gato? ");
        String resp = sc.next().trim().toUpperCase();
        if (resp.equals("DOG")){
            System.out.println("Informe o nome do dog: ");
            String nome = sc.next().trim();
            System.out.println("Informe a raça do dog: ");
            String raca = sc.next().trim();
            String cadastrar = dogDao.cadastrar(new Cachorro(nome, raca));
            System.out.println(cadastrar);
        } else if (resp.equals("GATO")) {
            System.out.println("Informe o nome do gato: ");
            String nome = sc.next().trim();
            System.out.println("Informe a raça do gato: ");
            String raca = sc.next().trim();
            String cadastrar = gatoDao.cadastrar(new Gato(nome, raca));
            System.out.println(cadastrar);
        } else {
            System.out.println("Digite apenas DOG ou Gato,ok ?");
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


