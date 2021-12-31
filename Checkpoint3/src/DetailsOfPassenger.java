public abstract class DetailsOfPassenger {
    String name;
    int age;

    public DetailsOfPassenger(int a, String n) {
        name = n;
        age = a;

    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    abstract public double applyDiscount(double p);
}