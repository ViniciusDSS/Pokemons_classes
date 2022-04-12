
package ac1pokemons;


public class batalha {
    
    private int myPokemonHp;
    private int myPokemonHit;
    private int myPokemonDef;
    private String myPokemonNome;
    
    private String inimigoPokemonNome;
    private int inimigoPokemonHp;
    private int inimigoPokemonHit;
    private int inimigoPokemonDef;
    
    
    public void myPokemon (String nome, int hp, int def, int hit){
        this.myPokemonHp = hp;
        this.myPokemonNome = nome;
        this.myPokemonHit = hit;
        this.myPokemonDef = def;
    
    }
    public void inimigoPokemon(String nome, int hp, int def, int hit){
        this.inimigoPokemonHp = hp;
        this.inimigoPokemonNome = nome;
        this.inimigoPokemonHit = hit;
        this.inimigoPokemonDef = def;
    }
    
    public void batalhar(){
    
           System.out.println("Se prepare para batalhar!");
           System.out.println("\n");
           System.out.println("\n");
          int ataque = myPokemonHit - inimigoPokemonDef;
          int ataqueInimigo = inimigoPokemonHit - myPokemonDef;
           
           for (int i = 0; i < 4; i++) {
              
               
               if(ataque > inimigoPokemonDef){
                   inimigoPokemonHp -=myPokemonHit;
                   System.out.println("Seu pokemon atacou. \n Inimigo HP: "+ inimigoPokemonHp);
                   System.out.println("\n");
               }else{
                inimigoPokemonHp -=(myPokemonHit / 2);
                 System.out.println("Seu pokemon atacou. \n Inimigo HP: "+ inimigoPokemonHp);
                 System.out.println("\n");
               }
               
               if(ataqueInimigo> myPokemonDef){
                   myPokemonHp -=inimigoPokemonHit;
                    System.out.println("Seu pokemon recebeu um ataque\n Pokemon HP: "+ myPokemonHp);
                    System.out.println("\n");
               }else{
                myPokemonHp -=(inimigoPokemonHit / 2);
                 System.out.println("Seu pokemon recebeu um ataque\n Pokemon HP: "+ myPokemonHp);
                 System.out.println("\n");
               }
                   
        }
           
           System.out.println("------RESULTADO------\n Meu pokemon: HP("+ myPokemonHp+")\n" + " Pokemon Adversario: HP("+ inimigoPokemonHp+")");
           if(myPokemonHp > inimigoPokemonHp){
               System.out.println("VITORIA!!\n");
           } else{
               System.out.println("DERROTA!!\n"); 
        }
    }
}
