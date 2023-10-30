package abstractexample21;

class TestAbstraction {
    public static void main(String[] args) {
        Shape s =new Circle(); // In a real scenario, object is provided through method, e.g., getShape() method
        s.draw();
    }
}
