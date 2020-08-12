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
    }
}
