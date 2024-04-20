package inversion.of.control;

public class circle implements shape{
    private static final float PI=3.1415f;
    private int rads;
    public circle(int rads){
        this.rads=rads;
    }

    @Override
    public float getPeri() {
        return (float) Math.pow(rads,2)*PI;
    }

    @Override
    public float getArea() {
        return (float) rads*2*PI;
    }
}
