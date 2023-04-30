![image](https://user-images.githubusercontent.com/35226183/234733014-2dd7054d-9530-4e68-be15-f86602432fc8.png)

![image](https://user-images.githubusercontent.com/35226183/234733282-d8b20f98-fa35-4cf8-a823-0abe0f64d895.png)



7. Identifique e explique o(s) erro(s) na classe abaixo:
1 class Registro De Eleitor
2 {
3 /**
4 * Declaração dos campos desta classe
5 */
6 int tituloDeEleitor; // número do título do eleitor
7 String nome; // nome do eleitor
8 short zonaEleitoral; // número da zona eleitoral
9 } // fim da classe

O nome da classe está com espaços em branco, o que não é permitido em Java. O correto seria "RegistroDeEleitor" sem espaços.

8. Identifique e explique o(s) erro(s) na classe abaixo:
1 class Teste2
2 {
3 /**
4 * Declaração dos campos desta classe
5 */
6 int num1,num2;
7 /**
8 * Declaração dos métodos desta classe
9 */
10 int maior()
11 {
12 if (num1 > num2)
13 return true;
14 else return false;
15 }
16 void menor()
17 {
18 if (num1 < num2)
19 return num1;
20 else return num2;
21 }
22 } // fim da classe

O método "maior()" deveria retornar um valor booleano (true ou false), mas está declarado como retornando um valor do tipo int. Portanto, a linha 13 deveria ser alterada para "return 1;" e a linha 14 para "return 0;", ou a declaração do método deveria ser alterada para "boolean maior()".

O método "menor()" está declarado como não retornando valor (void), mas está tentando retornar um valor na linha 19 (num1). Para corrigir esse erro, o método deveria ser declarado como retornando um valor do tipo int, e a linha 19 deveria ser modificada para "return num1;".


9. Identifique e explique o(s) erro(s) na classe abaixo.
1 class TesteImpressao
2 {
3 main(String[] args)
4 {
5 System.out.println(“7+2=”+(7+2));
6 System.out.println(“7-2=”+(7-2));
7 System.out.println(“7*2=”+(7*2));
8 System.out.println(“7/2=”+(7/2));
9 return true;
10 }
11 } // fim da classe

Falta especificar o modificador de acesso para o método main, que deve ser public e está faltando na declaração na linha 3.
Os valores dentro das aspas nos métodos println devem estar em aspas duplas (" "), mas na classe tem aspas simples (' ').
Na linha 9, o método main não pode retornar um valor booleano.
