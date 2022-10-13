import java.lang.Math;

public class RightTriangle {
    private double height;
    private double base;

    RightTriangle(double h, double b)
    {
        if(h > 0) height = h;
        else height = 0;

        if(b > 0) base = b;
        else base = 0;
    }

    public void setHeight(double h)
    {
        if(h > 0) height = h;
        else height = 0;
    }

    public double getHeight()
    {
        return height;
    }

    public void setBase(double b)
    {
        if(b > 0) base = b;
        else base = 0;
    }

    public double getBase()
    {
        return base;
    }

    public double getArea()
    {
        return base*height*0.5;
    }

    public double getHypotenuse()
    {
        return Math.sqrt(Math.pow(base, 2)+Math.pow(height, 2));
    }

    public double getPerimeter()
    {
        return height+base+getHypotenuse();
    }
}
