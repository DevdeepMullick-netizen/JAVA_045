class Outer {
    int x = 20;   

    class Inner {
        void show() {
            System.out.println("Inside Inner Class");
        }
    }
}

class Child extends Outer.Inner {

    Child(Outer obj) {
        obj.super();   
    }

    void display() {
        System.out.println("Using Inheritance with Inner Class");
    }
    
    public static void main(String args[]) {
        Outer obj1 = new Outer();       
        Child obj2 = new Child(obj1);   

        obj2.show();      
        obj2.display();   
    }
}

