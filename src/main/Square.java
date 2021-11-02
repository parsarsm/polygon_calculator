package main;

public class Square implements Shape {
    private final float len;

    public Square(float len) {
        this.len = len;
    }

    @Override
    public float getArea() {
        return len * len;
    }
}
