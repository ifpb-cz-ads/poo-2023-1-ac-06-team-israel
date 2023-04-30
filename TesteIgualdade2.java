
/**
 * Como frase3 e frase4 apontam para o mesmo objeto String na memória, a comparação retorna true, 
 * e o programa imprime "Frase 3 e frase 4 possuem a mesma referencia? R: true".
 */
public class TesteIgualdade2
{
    public static void main(String args[]){
        String frase3; 
        String frase4;
        frase3 = new String("Testando igualdade!");
        frase4 = frase3;
        System.out.println("Frase 3: " +frase3);
        System.out.println("Frase 4: " +frase4);
        System.out.println("Frase 3 e frase 4 possuem a mesma referencia? R: " +(frase3==frase4));
    }
}
