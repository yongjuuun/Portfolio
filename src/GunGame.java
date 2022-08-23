public class GunGame {
    public static void main(String[] args) {
        Gun gun = new Gun("shotgun");
        gun.fire();

        Gun k1 = new K1("k1");
        k1.fire();

        System.out.println(gun.bulletCount);
        System.out.println(k1.bulletCount);
    }
}
