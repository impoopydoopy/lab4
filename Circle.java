import java.lang.Math;

public class Circle {
    private double xTransform;
    private double yTransform;
    private double radius;

    Circle(double x, double y, double r)
    {
        xTransform = x;
        yTransform = y;
        if(r >= 0)
            radius = r;
        else radius = 0;
    }

    Circle(double x, double y) //нулевая окружность
    {
        xTransform = x;
        yTransform = y;
        radius = 0;
    }

    public void setxTransform(double x){ xTransform = x; }
    public double getxTransform() { return xTransform; }

    public void setyTransform(double y){ yTransform = y; }
    public double getyTransform() { return yTransform; }

    public void setRadius(double r)
    {
        if(r >= 0)
        radius = r;
        else radius = 0;
    }
    public double getRadius() { return radius; }

    public double getLength()
    {
        return 2*Math.PI*radius;
    }

    public double getArea()
    {
        return Math.PI*Math.pow(radius, 2);
    }
}

