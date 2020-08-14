import java.util.ArrayList;

public class ClassLesson {
    public static void main(String[] args) {
        Player bob = new Player();
        bob.setHandleName("bob");
        System.out.println(bob.getHandleName());
        bob.setHandleName("john");
        System.out.println(bob.getHandleName());

        Player hank = new Player("Hank");
        System.out.println(hank.getHandleName());
        System.out.println(hank.getLevel());
        System.out.println(hank.getLives());

        Player greg = new Player("greg", 4);
        System.out.println(greg.getHandleName());
        System.out.println(greg.getLevel());
        System.out.println(greg.getScore());
        greg.setLevel(5);
        greg.setScore(4000);
        System.out.println(greg.getLevel());
        System.out.println(greg.getScore());

        Player blue = new Player("blue");
        Weapon blueWeapon = blue.getWeapon();
        System.out.println(blueWeapon.getName());
        System.out.println(blue.getWeapon().getName());
        Weapon blueNewWeapon = new Weapon("Spear", 20, 10);
        blue.setWeapon(blueNewWeapon);
        System.out.println(blue.getWeapon().getName());
        System.out.println(blue.getWeapon().getDamage());

        Player orange = new Player("orange");
        Loot redPotion = new Loot("Red Potion", LootType.POTION, 7);
        orange.pickUpLoot(redPotion);
        orange.pickUpLoot(new Loot("+3 Chest Armor", LootType.ARMOR, 80));
        orange.pickUpLoot(new Loot("Ring of Protection +2", LootType.RING, 40));
        orange.pickUpLoot(new Loot("Blue Potion", LootType.POTION, 10));
        orange.showInventory();
        boolean wasDeleted = orange.dropLoot(redPotion);
        System.out.println(wasDeleted);
        orange.showInventory();




    }
}
