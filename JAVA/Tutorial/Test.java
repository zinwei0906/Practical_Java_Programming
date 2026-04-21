public class Test {
    public static void main(String[] args) {
        Object object = new Fruit();
        //Object object1 = (Apple)object;children=parent(x)

        //only can grandparent = parent and parent = parent
        //Correct
        //Object object1 = (Object)object;
        //Object object1 = (Fruit)object;


    }
}

class Apple extends Fruit {
}
class Fruit {
}
