class Circle extends Shape
{
    int radius;

    public int getRadius()
    {
        return radius;
    }

    public Circle(int x, int y,String fill_color, String stroke_color, int radius)
    {
        super(x,y,fill_color,stroke_color);
        this.radius = radius;
    }

}

