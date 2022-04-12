
package ac1pokemons;

import java.util.Scanner;


public class pokemons {
    
    private String nome;
    private String tipo;
    private int hp = 100;
    private int def;
    private int hit;
    private int level;
    
    public pokemons(String nome, String tipo, int level) {
        this.nome = nome;
        this.tipo = tipo;
        this.level = level;
        
        
        calculaAtributos();
        calculaLevel();
       // imprimaAtributos();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public int getHit() {
        return hit;
    }

    public void setHit(int hit) {
        this.hit = hit;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
    public int getHp(){
     return hp;
    }
    public void setHp(int hp){
     this.hp = hp;
    }
    
     void imprimaAtributos(){
        System.out.println("Nome: " + this.nome +"\n" + "Tipo: " + this.tipo + "\n" + "HP: " + this.hp + "\n"
        + "Level: " + this.level + "\n" + "Defesa: " + this.def + "\n" + "Ataque: " + this.hit + "\n" 
        );
    
    }
    
     private void calculaLevel(){
         
         hp = hp + (level / 2);
         hit = hit + (level / 3);
         def = def + (level / 4);
     }
    
    
     void calculaAtributos(){
    
        switch(this.tipo){
            case "Fogo":
                this.hit = 50;
                this.def = 20;
                this.hp = this.hp + 20;
                break;
            case "Agua":
                this.hit = 30;
                this.def = 40;
                this.hp = this.hp + 50;
                break;
            case "Terra":
                this.hit =  30;
                this.def = 60;
                this.hp = this.hp + 20;
                break;
            case "Planta":
                this.hit =  25;
                this.def =  40;
                this.hp = this.hp + 60;
                break;
            case "Eletricidade":
                this.hit = 40;
                this.def =  20;
                this.hp = this.hp + 30;
                break;
                
            
        }
    }
     
    
 
    
}
