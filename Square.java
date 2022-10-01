class Square extends Shape
{
    int side;

    public Square(int x, int y,String fill_color, String stroke_color, int side)
    {
        super(x,y,fill_color,stroke_color);
        this.side = side;
    }

    public int getSide()
    {
        return side;
    }

}
