public class Mammal {
    private int energyLevel;

    public Mammal() {
        energyLevel = 100;
    }

    public class Gorilla extends Mammal {
        public void throwSomething() {
            energyLevel = energyLevel - 5;
            System.out.println("Curious George has thrown a rock across the enclosure! Energy has been decreased by 5. His energy level is now at " + energyLevel + ".");
        }

        public void eatBananas() {
            energyLevel = energyLevel + 10;
            System.out.println("Curious George got hungry and decided to eat a banana. Energy has been increased by 10. His energy level is now at " + energyLevel + ".");
        }

        public void climb() {
            energyLevel = energyLevel - 10;
            System.out.println("Curious George has provoked Harambe and climbed a tree in an attempt to escape. Energy has been decreased by 10. His energy level is now at " + energyLevel);
        }
    }

    public class Bat extends Mammal {
        private int energyLevel;

        public Bat() {
            energyLevel = 300;
        }
        public void fly() {
            energyLevel = energyLevel - 50;
            System.out.println("*flap flap flap* Energy has been decreased by 50. The bat's energy is now at " + energyLevel + ".");
        }

        public void eatHumans() {
            energyLevel = energyLevel + 25;
            System.out.println("Energy has been increased by 25. The bat's energy is now at " + energyLevel + ".");
        }

        public void attackTown() {
            energyLevel = energyLevel - 100;
            System.out.println("*flames sounds* The sounds of screams fill the air as the town burns. Energy has been decreased by 100. The bat's energy is now at " + energyLevel + ".");
        }
    }
}