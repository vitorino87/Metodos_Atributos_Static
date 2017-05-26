/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodo_atributos_static;

import java.io.Console;

/**
 *
 * @author tiago.lucas
 */
public class Metodo_Atributos_Static {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
    Como main é estática, não é necessário criar uma instância da classe
    a fim de chamá-la. Por exemplo, se essa função main estivesse dentro
    da classe Hipotecar, para iniciar o interpretador java usa-se:
    java Hipotecar
    Então o interpretador simplesmente inicia o método main sem criar a 
    classe Hipotecar. Por isso, a função main só pode acessar dados estáticos
    da classe. Na verdade, não é raro que a função main crie um objeto
    de sua própria classe.
         */
        Metodo_Atributos_Static mas = new Metodo_Atributos_Static();
        teste();
        //teste2(); //dá erro: "non-static method teste2() cannot be referenced from a static context
        mas.teste2(); //funciona corretamente.
        
        /**
         * Métodos e Atributos static O modificador static é usado para criar
         * constantes de classe, mas também é usado para criar atributos e
         * métodos estáticos. Os atributos estáticos não mudam de uma instância
         * para outra, de modo que podem ser vistos como se pertencessem à
         * classe. Da mesma forma, os métodos estáticos pertencem à classe e não
         * operam nenhum dado de instância, objeto. Isso significa que se pode
         * usá-los sem criar nenhuma instância.
         */
        /*
        Por exemplo, todos os métodos da classe Console são métodos estáticos,
        assim como todos os métodos da classe Math, embutida na linguagem Java.
        Exemplo:
        double x = Console.readDouble();
        E a utilização de campos estáticos:
        Math.PI
        System.out
         */
        double x = Math.pow(3, 0.1);
        System.out.println(x);
        System.out.println(Math.PI);
        
        ClasseQualquer.T = 10;
        ClasseQualquer cq = new ClasseQualquer();
        

    }
    public static void teste(){
        System.out.println("teste");
    }
    
    public void teste2(){
        System.out.println("teste2");
    }

}
