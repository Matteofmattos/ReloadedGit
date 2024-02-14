package HerancaSimples;

import static java.lang.System.*;

public class TesteHerancaSimples {
    public static void main(String[] args) {

        Animal cachorro = new Cachorro("Austrália","Grande",true,true);
        out.println(cachorro.getMamifero()); // Atributo vazio...retorna nulo

        cachorro.beber(); // Método imprime bebendo... ( não é nulo. )
        cachorro.movimentar(); // Método vazio não imprime nada.

        cachorro.setMamifero(true);  // True foi passado para a classe abstrata acima por meio do método de setagem ( sem um construtor existente )
        out.println(cachorro.getMamifero());

        out.println(cachorro.toString()); // Somente o atributo mamífero foi setado.Não requer construtor.

        //O java te obriga a fazer um super para setar todos os atributos da classe abstrata acima, caso haja um construtor não vazio na classe abaixo


    }
}