
/**
 * Frase 1: Testando igualdade!
 * Frase 2: Testando igualdade!
 * Frase 1 e frase 2 sçao iguals: R: false
 * 
 * Embora as duas Strings tenham o mesmo valor ("Testando igualdade!"), elas são instâncias diferentes e, portanto, suas referências são diferentes.
 * 
 */
public class TesteIgualdade
{
    public static void main(String args[]){
        String frase1; 
        String frase2;
        frase1 = new String("Testando igualdade!");
        frase2 = new String("Testando igualdade!");
        System.out.println("Frase 1: " +frase1);
        System.out.println("Frase 2: " +frase2);
        System.out.println("Frase 1 e frase 2 sçao iguals: R: " +(frase1==frase2));
    }
}
