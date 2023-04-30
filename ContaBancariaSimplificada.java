/**
 * 3. Modifique a operação mostraDados do modelo ContaBancariaSimplificada ( ) para que, caso o saldo esteja negativo, uma mensagem de 
alerta seja impressa. Dica: O saldo só poderá ser negativo se a conta for 
especial.
 * 
 */

public class ContaBancariaSimplificada{
    String nomeDoCorrentista;
    float saldo;
    boolean contaEEspecial;

    void abreContaSimples(String nome, float valorMin){
        if (valorMin >= 100) {
            nomeDoCorrentista = nome;
            saldo = 0.00f;
            contaEEspecial = false;    
        }else{
            System.out.print("A conta só podera ser criada com um valor inicial minimo de R$100");
        }
    }

    void deposita(float valor){
        saldo = saldo + valor;
    }

    boolean retira(float valor){
        boolean a = false;
        if (contaEEspecial == false) { 
            if (valor <= saldo) { 
                saldo = saldo - valor;
                a = true;
            }
        }else{
            saldo = saldo - valor;
            a = true;
        }
        return a;
    }
    void mostraDados(){
        System.out.print("O nome do correntista é ");
        System.out.print(nomeDoCorrentista);
        System.out.print("O saldo é ");
        System.out.print(saldo);
        if (saldo < 0 && contaEEspecial == false) { System.out.print("O Saldo está negativo !!!"); }
        
        if (contaEEspecial) {
            System.out.print("A conta é especial.");
        }else{
            System.out.print("A conta é comum.");
        }
    }
}
