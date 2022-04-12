
package ac1pokemons;

import java.util.Scanner;


public class Ac1Pokemons {

    public static void main(String[] args) {
         
        
         
          int escolha = 0;
         int opcao = 0;
         Scanner scan = new Scanner(System.in);
     
       pokemons MyPokemon = null;
     
     
    /*
         System.out.println("Escolha um pokemon: \n (1) Charmander\n (2) Bulbasaur \n (3) Squirtle");
         escolha = scan.nextInt();
         
         switch(escolha){
             case 1: pokemons MyPokemon1 = new pokemons("Charmander", "Fogo", 1);
             MyPokemon = MyPokemon1;
             
             break;
             case 2: pokemons MyPokemon2 = new pokemons("Bulbasaur", "Planta", 1);
             MyPokemon = MyPokemon2;
             break;
             case 3:  pokemons MyPokemon3 = new pokemons("Squirtle", "Agua", 1);
             MyPokemon = MyPokemon3;
             break;
             
         } */
         
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
    
    switch(opcao){
        case 1:
            
            System.out.println("Vamos para mais um round!!\n");
            MyPokemon.setLevel(2);
    
        System.out.println("Seu pokemon: ");
        MyPokemon.imprimaAtributos();
        System.out.println("Pokemon inimigo: ");
        InimigoPokemon2.imprimaAtributos();
        
    newbatalha.myPokemon(MyPokemon.getNome(), (int) MyPokemon.getHp(), (int)MyPokemon.getHit(),(int)MyPokemon.getDef());
    
    newbatalha.inimigoPokemon(InimigoPokemon.getNome(),(int)InimigoPokemon.getHp(), (int)InimigoPokemon.getHit(),(int)InimigoPokemon.getDef());
    
    newbatalha.batalhar();
    break;
        case 2: System.out.println("FIM de Jogo");
    }
    }
    
}
