class Overload {

    void show(int a) {
        System.out.println("Integer: " + a);
    }

    void show(double a) {
        System.out.println("Double: " + a);
    }
}

class Override {

    void display() {
        System.out.println("Parent class method");
    }
}

class Child extends Override {

    void display() {
        System.out.println("Child class method");
    }
}

public class Main {
    public static void main(String[] args) {

        Overload obj = new Overload();
        obj.show(10);
        obj.show(5.5);

        Override obj2 = new Child();
        obj2.display();
    }
}