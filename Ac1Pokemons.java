
package ac1pokemons;

import java.util.Scanner;


public class Ac1Pokemons {

    public static void main(String[] args) {
         
        
         
          int escolha = 0;
         int opcao = 0;
         Scanner scan = new Scanner(System.in);
     
       pokemons MyPokemon = null;
     
    
         
    pokemons InimigoPokemon = new pokemons("Pikachu", "Eletricidade", 1);
    pokemons InimigoPokemon2 = new pokemons("Magmar", "Fogo", 1);
        
       
    
    batalha newbatalha = new batalha();
        System.out.println("Seu pokemon: ");
        MyPokemon.imprimaAtributos();
        System.out.println("Pokemon inimigo: ");
        InimigoPokemon.imprimaAtributos();
        
    newbatalha.myPokemon(MyPokemon.getNome(), (int) MyPokemon.getHp(), (int)MyPokemon.getHit(),(int)MyPokemon.getDef());
    
    newbatalha.inimigoPokemon(InimigoPokemon.getNome(),(int)InimigoPokemon.getHp(), (int)InimigoPokemon.getHit(),(int)InimigoPokemon.getDef());
    
    newbatalha.batalhar();
    
        System.out.println("Jogar mais um round? 1-Sim    2-Não\n");
        opcao = scan.nextInt();
    
    
    
}
}