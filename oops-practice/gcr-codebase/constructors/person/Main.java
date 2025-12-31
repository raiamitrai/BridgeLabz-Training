package OOPs.constructors.person;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("mahan" , 20, "single");

        // cloning p1 into p2
        Person p2 = new Person(p1);

        p1.display();
        p2.display();
    }
}
