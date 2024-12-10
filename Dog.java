public class Dog {
    private String name;
    private int age;

    public Dog(String n) {
        name = n;
        age = 1;
    }

    public Dog(String n, int a) {
        name = n;
        age = a;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getPeopleAge(int yr) {
        return age * yr;
    }

    public void increaseAgeByOne() {
        age += 1;
    }

    public String toString() {
        return "Dog - " + name + " " + age;
    }

    public static void main(String[] args) {
        Dog d = new Dog("rover");
        System.out.println(d.getPeopleAge(7));
        d.increaseAgeByOne();
        d.increaseAgeByOne();
        System.out.println(d.getPeopleAge(11));
        System.out.println(d.getName());
        d.increaseAgeByOne();
        d.increaseAgeByOne();
        d.increaseAgeByOne();
        d.increaseAgeByOne();
        System.out.println(d.getPeopleAge(8));
        Dog g = new Dog("bob", 3);
        System.out.println(g.getName());
        System.out.println(g.getPeopleAge(5));
    }
}