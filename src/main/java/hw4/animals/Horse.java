package hw4.animals;

public class Horse extends Animal{
        private String noise = "neighs";

        public Horse(String name, String location, String food) {
                super(name, location, food);
        }

        @Override
        public void makeNoise() {
                System.out.println(getName() + " " + getNoise() + " in the " + getLocation() + " drinking " + getFood());
        }

        @Override
        public void eat() {
                System.out.println(getName() + " is having" + getFood());
        }

        public String getNoise() {
                return noise;
        }
}
