package ClassesAninhadas.ClasseLocal;

public class ClasseExterna {
    public void metodoClasseExterna(){
        class ClasseLocal {
            private final String texto = "texto da classe local.";
            public void metodoClasseLocal(){
                System.out.println(texto);
            }
        }

        ClasseLocal classeLocal = new ClasseLocal();
        classeLocal.metodoClasseLocal();
    }
}
