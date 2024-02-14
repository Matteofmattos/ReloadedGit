package ClassesAninhadas.ClasseAnonima;

public class Anonima {
    public void imprimeTexto(){
        System.out.println("Texto externo...");
    }

    public static void main(String[] args) {
        Anonima anonima = new Anonima(){
            public void imprimeTexto(){System.out.println("Sobrescrevendo texto...");}
        };

        anonima.imprimeTexto();
    };
}
