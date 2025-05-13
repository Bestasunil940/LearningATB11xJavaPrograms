public class InstanceOfExample {
    public static void main(String[] args) {
        ParentClass obj1 = new ParentClass();
        ChildClass obj2 = new ChildClass();

        System.out.println("obj1 is instance of ParentClass = " + (obj1 instanceof ParentClass));
        System.out.println("obj1 is instance of ChildClass = " + (obj1 instanceof ChildClass));
        System.out.println("obj2 is instance of ChildClass = " + (obj2 instanceof ChildClass));
    }
}

class ParentClass {}
interface MyInterface {}
class ChildClass extends ParentClass implements MyInterface {}
