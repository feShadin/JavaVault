public class Q2_Dog {
    static class Dog {
        String name;
        String breed;

        Dog(String name, String breed) {
            this.name = name;
            this.breed = breed;
        }

        void setName(String name) {
            this.name = name;
        }

        void setBreed(String breed) {
            this.breed = breed;
        }

        void display() {
            System.out.println(name + " is a " + breed + ".");
        }
    }

    public static void main(String[] args) {
        Dog d1 = new Dog("Buddy", "Golden Retriever");
        Dog d2 = new Dog("Charlie", "Bulldog");

        d1.display();
        d2.display();

        System.out.println();
        System.out.println("Set the new Breed of dog1 and new name of dog2:");
        d1.setBreed("Labrador Retriever");
        d2.setName("Daisy");

        System.out.println(d1.name + " is now a " + d1.breed + ".");
        System.out.println(d2.name + " is now a " + d2.breed + ".");
    }
}