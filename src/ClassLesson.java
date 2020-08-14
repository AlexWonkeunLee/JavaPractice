import java.util.ArrayList;

public class ClassLesson {
    public static void main(String[] args) {
//        Player bob = new Player();
//        bob.setHandleName("bob");
//        System.out.println(bob.getHandleName());
//        bob.setHandleName("john");
//        System.out.println(bob.getHandleName());
//
//        Player hank = new Player("Hank");
//        System.out.println(hank.getHandleName());
//        System.out.println(hank.getLevel());
//        System.out.println(hank.getLives());
//
//        Player greg = new Player("greg", 4);
//        System.out.println(greg.getHandleName());
//        System.out.println(greg.getLevel());
//        System.out.println(greg.getScore());
//        greg.setLevel(5);
//        greg.setScore(4000);
//        System.out.println(greg.getLevel());
//        System.out.println(greg.getScore());
//
//        Player blue = new Player("blue");
//        Weapon blueWeapon = blue.getWeapon();
//        System.out.println(blueWeapon.getName());
//        System.out.println(blue.getWeapon().getName());
//        Weapon blueNewWeapon = new Weapon("Spear", 20, 10);
//        blue.setWeapon(blueNewWeapon);
//        System.out.println(blue.getWeapon().getName());
//        System.out.println(blue.getWeapon().getDamage());
//
//        Player orange = new Player("orange");
//        Loot redPotion = new Loot("Red Potion", LootType.POTION, 7);
//        orange.pickUpLoot(redPotion);
//        orange.pickUpLoot(new Loot("+3 Chest Armor", LootType.ARMOR, 80));
//        orange.pickUpLoot(new Loot("Ring of Protection +2", LootType.RING, 40));
//        orange.pickUpLoot(new Loot("Blue Potion", LootType.POTION, 10));
//        orange.showInventory();
//        boolean wasDeleted = orange.dropLoot(redPotion);
//        System.out.println(wasDeleted);
//        orange.showInventory();


//        Enemy enemy = new Enemy("test", 10, 3);
//        enemy.showInfo();
//        enemy.takeDamage(3);
//        enemy.takeDamage(7);
//        Troll uglyTroll = new Troll("Ugly Troll");
//        uglyTroll.showInfo();
//        Vampire vlad = new Vampire("vlad");
//        vlad.showInfo();
//        vlad.takeDamage(6);
        VampireKing dracula = new VampireKing(("Dracula"));
        dracula.showInfo();
        dracula.takeDamage(20);


        do {
            if(dracula.dodge()){
                dracula.setLives(dracula.getLives() + 1);
                continue;
            }
            if(dracula.runAway()){
                System.out.println("Dracula ran away...");
                break;
            }
            else{
                dracula.takeDamage(20);
                dracula.showInfo();
            }

        } while (dracula.getLives() > 0);

        Player blue = new Player("Blue");
        blue.pickUpLoot(new Loot("Invisibility", LootType.POTION, 5));
        blue.pickUpLoot(new Loot("Fire Armor", LootType.ARMOR, 400));
        blue.pickUpLoot(new Loot("Health", LootType.POTION, 3));
        blue.pickUpLoot(new Loot("Ring of Strength", LootType.RING, 200));
        blue.pickUpLoot(new Loot("Ring of Speed", LootType.RING, 200));

        System.out.println(blue.score());

    }
}
