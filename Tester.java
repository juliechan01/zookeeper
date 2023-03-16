public class Tester {
    public static void main(String[] args) {

        System.out.println("----Gorilla portion of assignment----");
        Mammal m = new Mammal(); // INSTANTIATE A MAMMAL FIRST
        Mammal.Gorilla g = m.new Gorilla(); // INSTANTIATE A GORILLA

        // HAVE GORILLA THROW 3 THINGS
        g.throwSomething();
        g.throwSomething();
        g.throwSomething();

        // HAVE GORILLA EAT BANANAS 2X
        g.eatBananas();
        g.eatBananas();

        // HAVE GORILLA CLIMB ONCE
        g.climb();

        System.out.println("----Bat portion of assignment----");
        Mammal.Bat b = m.new Bat(); // INSTANTIATE A BAT

        // HAVE THE BAT ATTACK 3 TOWNS
        b.attackTown();
        b.attackTown();
        b.attackTown();

        // HAVE THE BAT EAT 2 PEOPLE
        b.eatHumans();
        b.eatHumans();

        // HAVE THE BAT FLY 2X
        b.fly();
        b.fly();
    }
}