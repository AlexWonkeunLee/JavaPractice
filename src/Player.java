public class Player {
    private String handleName;
    private int lives;
    private int level;
    private int score;

    public Player() {
        this("Unknown player");
    }

    public Player(String name){
        this(name, 1);
    }

    public Player(String name, int startingLevel){
        handleName = name;
        lives = 3;
        level = startingLevel;
        score = 0;
    }



    public String getHandleName() {
        return handleName;
    }

    public void setHandleName(String newName){
        if(newName.length() < 4){
            return;
        }
        handleName = newName;
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
}
