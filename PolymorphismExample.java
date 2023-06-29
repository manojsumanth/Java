// Shape class (parent class)
class Shape {
    public void draw() {
        System.out.println("Drawing a shape");
    }
}

// Circle class (subclass of Shape)
class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

// Square class (subclass of Shape)
class Square extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a square");
    }
}

// Triangle class (subclass of Shape)
class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a triangle");
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        // Creating objects of different shapes
        Shape shape1 = new Circle();
        Shape shape2 = new Square();
        Shape shape3 = new Triangle();
        
        // Calling the draw method on each shape
        shape1.draw();
        shape2.draw();
        shape3.draw();
    }
}
