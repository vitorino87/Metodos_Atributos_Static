/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodo_atributos_static;

/**
 *
 * @author tiago.lucas
 */

/*
static

    É usado para a criação de uma variável que poderá ser acessada por 
todas as instâncias de objetos desta classe como uma variável comum, 
ou seja, a variável criada será a mesma em todas as instâncias e 
quando seu conteúdo é modificado numa das instâncias, a modificação 
ocorre em todas as demais. E nas declarações de métodos ajudam no 
acesso direto à classe, portanto não é necessário instanciar um 
objeto para acessar o método.
    No exemplo da Listagem 2, é gerada a saída da contagem de 4 valores 
(1,2,3,4), se comentarmos a linha que tem a variável static e 
descomentar da qual não tem, veremos que a sua saída será de 4 
saídas com o mesmo valor (1,1,1,1).
    Nas variáveis estáticas isso acontece porque todas as instâncias da 
mesma classe compartilham a mesma cópia das variáveis estáticas, sendo 
inicializadas quando a classe é carregada (instanciada).
*/
public class Conta_Instancias {
	//private int tamanho;
	private static int conta = 0; //IMPRIME A CONTAGEM DE 4 VALORES
	//private int conta = 0; //IMPRIME A CONTAGEM DE 1 VALOR
	
	public Conta_Instancias(){
		conta++;
		System.out.println("Valor = "+conta);
	}	
	
	public static void main(String[] args) {
		Conta_Instancias c = new Conta_Instancias();
		
		Conta_Instancias dois = new Conta_Instancias();
		Conta_Instancias tres = new Conta_Instancias();
		Conta_Instancias quatro = new Conta_Instancias();
	}
}
