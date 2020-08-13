public class Player {
    private String handleName;
    private int lives;
    private int level;
    private int score;
    private Weapon weapon;


    public Player() {
        this("Unknown player");
    }

    public Player(String name){
        this(name, 1);
    }

    public Player(String name, int startingLevel){
        setHandleName(name);
        this.lives = 3;
        this.level = startingLevel;
        this.score = 0;
    }



    public String getHandleName() {
        return handleName;
    }

    public void setHandleName(String newName){
        if(newName.length() < 4){
            return;
        }
        this.handleName = newName;
        setDefaultWeapon();
    }

    private void setDefaultWeapon() {
        this.weapon = new Weapon("Sword", 10, 20);
    }

    public int getLives(){
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public int getLevel(){
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getScore(){
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}
