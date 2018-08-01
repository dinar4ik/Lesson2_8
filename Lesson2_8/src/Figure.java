
public class Figure {
    public double pi = 3.14;
    void squareCircle(int radius){
        
        System.out.println("Area of Circle: "+radius*radius*pi);
    }
    void squareRectangle(int a, int b){
       System.out.println("Area of Rectangle: "+a*b);
    }
    void squareCilindre(int rad, int h){
        
        System.out.println("Area of Cilindre: "+rad*h*pi);
    }
}
class Circle extends Figure{
    
}
class Rectangle extends Figure{
    
}
class Cilindre extends Figure{
    
}

class square{
    public static void main(String[] args) {
        Circle c = new Circle();
        c.squareCircle(5);
        
        Rectangle r = new Rectangle();
        r.squareRectangle(3, 5);
        
        Cilindre cil = new Cilindre();
        cil.squareCilindre(6, 2);
    }
}