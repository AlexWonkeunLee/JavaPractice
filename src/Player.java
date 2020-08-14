import java.util.ArrayList;

public class Player {
    private String handleName;
    private int lives;
    private int level;
    private int score;
    private Weapon weapon;
    private ArrayList<Loot> inventory;

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
        inventory = new ArrayList<>();
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

    public ArrayList<Loot> getInventory() {
        return inventory;
    }

    public void pickUpLoot(Loot newLoot){
        inventory.add(newLoot);
    }

    public boolean dropLoot(Loot loot){
        if (this.inventory.contains(loot)) {
            inventory.remove(loot);
            return true;
        }
        return false;
    }

    public boolean dropLoot(String name){
        for (Loot loot : inventory){
            if(loot.getName().equals(name)){
                inventory.remove(loot);
                return true;
            }
        }
        return false;
    }

    public void showInventory(){
        for(Loot item : inventory){
            System.out.println(item.getName());
        }
    }

    public int score(){
        int total = 0;
        for (Loot currentLoot : inventory) {
            System.out.println(currentLoot.getName() + " is worth " + currentLoot.getValue());
            total = total + currentLoot.getValue();
        }
        return total;
    }
}
