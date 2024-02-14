package ClassesAninhadas.ExternaInterna;

public class ClasseExterna {
    private final String textoExterno = "texto externo";
    public class ClasseInterna {
        private String textoInterno = "texto interno";
        public void imprimeTextos(){
            System.out.println(textoInterno);
            System.out.println(ClasseExterna.this.textoExterno);
        }
    }
}
