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
public class ClasseQualquer {
    /*
    “a palavra reservada static é usada para declarar uma variável 
    que é associada com a classe, não com instâncias individuais 
    daquela classe. Variáveis static são usadas para armazenar 
    informações globais sobre uma classe. Existem mesmo se nenhuma 
    instância de sua classe foi criada.”
    */
    public static final int L = 10;
    public static int T = 30;
    
    /*
    A inicialização estática ocorre quando a classe é inicialmente
    carregada. Primeiro todas as variáveis estáticas são inicializadas
    na ordem que aparecem na declaração da classe.
    */
    public static Double[] buffer = new Double[T];
    static
       {
            int i;
            for(i=0; i<buffer.length; i++){
                buffer[i] = java.lang.Math.random();
                System.out.println(buffer[i]);
            }
                
        }
    /**
     * Pode-se ter campos e métodos tanto estático quanto não estático
     * na mesma classe.
     */
    protected static void metodoEstatico()
    {
        
    }
    protected void metodoNaoEstatico()
    {
        String[] a = {"Olá","ola"};
        Metodo_Atributos_Static.main(a);
        
    }
    
}
