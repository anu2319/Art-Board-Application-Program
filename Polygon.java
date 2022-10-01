class Polygon extends Shape
{

    int sides;
    int numberOfSides;

    public int getNumberOfSides()
    {
        return numberOfSides;
    }

    public int getSides()
    {
        return sides;
    }

    public Polygon(int x, int y,String fill_color, String stroke_color, int sides, int numberOfSides)
    {
        super(x,y,fill_color,stroke_color);
        this.sides = sides;
        this.numberOfSides = numberOfSides;
    }


}
