package domain;

public abstract class Pokemon {
    private String nick;
    private int hp;
    private int cp;

    public Pokemon(String nick ,int hp, int cp){

        if(nick==""){
            this.nick = this.getClass().getSimpleName();
        }

        else{
            this.nick = nick; 
        }
        this.hp = hp;
        this.cp = cp;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }
}
