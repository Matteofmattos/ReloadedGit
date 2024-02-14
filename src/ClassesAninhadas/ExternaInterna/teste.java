package ClassesAninhadas.ExternaInterna;

public class teste {

    public static void main(String[] args) {
        ClasseExterna classeExterna = new ClasseExterna();

        ClasseExterna.ClasseInterna classeInterna = classeExterna.new ClasseInterna();

        classeInterna.imprimeTextos();

    }
}
