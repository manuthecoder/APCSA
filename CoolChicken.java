public class CoolChicken {
    private double speed;
    private int wingCount;
    private String name;

    public CoolChicken(double _speed, int _wingCount, String _name) {
        this.speed = _speed;
        this.wingCount = _wingCount;
        this.name = _name;
    }

    public double maxSpeed() {
        return wingCount * speed;
    }

    public boolean isCool() {
        return maxSpeed() > 1000 && name.indexOf("cool") != -1;
    }

    public String toString() {
        return "Name: " + name + " Wing Count:" + wingCount + " Speed:" + speed;
    }

    public static void main(String[] args) {
        CoolChicken a = new CoolChicken(5.9, 7, "coolio");
        System.out.println(a.isCool());
        CoolChicken b = new CoolChicken(150.5, 5, "foghorn");
        System.out.println(b.isCool());
        CoolChicken c = new CoolChicken(314.1, 5, "notcool");
        System.out.println(c.isCool());
        CoolChicken d = new CoolChicken(212, 56, "ralph");
        System.out.println(d.isCool());
    }
}
