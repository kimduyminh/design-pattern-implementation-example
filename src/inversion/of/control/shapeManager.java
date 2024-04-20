package inversion.of.control;

public class shapeManager {
    private shape shape;
    public void setShape(shape shape){
        this.shape=shape;
    }
    public float getPeri(){
        return this.shape.getPeri();
    }
    public float getArea(){
        return this.shape.getArea();
    }
}
/*
This is an example of Inversion of Control design pattern, which is allowing class not being depended on another class
and communicate via Interface
For example, this design pattern allow shapeManager to create a new shape without depending on the type (circle or square) by
interacting with the "shape" interface
 */