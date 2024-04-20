package inversion.of.control;

public class square implements shape {
    private int x;
    public square(int x) {
        this.x = x;
    }
    @Override
    public float getPeri() {
        return x * 4;
    }
    @Override
    public float getArea() {
        return (float) Math.pow(x, 2);
    }
}