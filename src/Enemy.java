public class Enemy {
    private String name;
    private int hitPoints;
    private int lives;

    public Enemy(String name, int hitPoints, int lives) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.lives = lives;
    }

    public void takeDamage(int damage){
        int remainingHitPoints = this.hitPoints - damage;
        if(remainingHitPoints > 0){
            setHitPoints(remainingHitPoints);
            System.out.println(name + " took " + damage + " damage, and have " + remainingHitPoints + " left.");
        } else {
            if (lives > 0){
                this.lives--;
                System.out.println(name + " lost a life.");
            }
            else {
                System.out.println(name + " is dead.");
            }
        }
    }

    public void showInfo(){
        System.out.println("Name: " + name);
        System.out.println("Hitpoints: " + hitPoints);
        System.out.println("Lives: " + lives);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

}
