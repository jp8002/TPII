package domain;

public class Pikachu extends Pokemon{
    public Pikachu(String nick, int hp, int cp){
        super(nick,hp,cp);
    }

    @Override
    public void attack(){
        System.out.println(this.getClass().getSimpleName() + " usou tackle");
    }
}
