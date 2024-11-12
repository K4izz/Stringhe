
package stringhe;

import java.util.Scanner;

public class Stringhe {
    
    static final int TANTI = 30;
    
    public static void main(String[] args) {
        
        Scanner myScan = new Scanner(System.in);
        
        // inizio inizializzazione 2 stringhe un come oggetto e l'altra come array.
        
        String parola; // Oggetto
        char[] minuscolo = new char[TANTI]; //array
        
        // fine inizializzazione 2 stringhe un come oggetto e l'altra come array.
        
        parola = myScan.next();
        
        // inizio trasformazione la striga letta in un array di caratteri l'attributo i e' l'indice dell'array.
        
        for (int i = 0 ; i< parola.length(); i++){
            minuscolo[i] = parola.charAt(i);
        }
        
        // inizio trasformazione la striga letta in un array di caratteri l'attributo i e' l'indice dell'array.
        
        
        // inizio trasformazione della parola in minuscolo.
        
        for (int i = 0; i < parola.length(); i++ ){
            minuscolo[i]= Character.toLowerCase(minuscolo[i]); // trasformazione in minuscolo tramite una funzione predefinita. 
        }
        
        // fine trasformazione della parola in minuscolo.
        
        // inizio stampa dell'array in minuscolo
        System.out.print ("La parola in minuscolo (array) : ");
        for (int i = 0; i < minuscolo.length; i++ ){
            System.out.print(minuscolo[i]);
        }
        // fine stampa dell'array in minuscolo
        
        // inizio trasformazione da array di caratteri a una stringa e la stampa della stringa.
        
        String ParolaMinuscolo = new String(minuscolo);
        System.out.print("\nla parola in minuscolo (oggetto) : ");
        System.out.print(ParolaMinuscolo);
        
        // fine trasformazione da array di caratteri a una stringa e la stampa della stringa.
    }
    
}
