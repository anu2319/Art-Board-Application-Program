class Shape
{
    int[] coordinates = new int[2];
    String fill_color;
    String stroke_color;

    public Shape(int x, int y, String fill_color, String stroke_color)
    {
        coordinates[0] = x;
        coordinates[1] = y;
        this.fill_color = fill_color;
        this.stroke_color = stroke_color;
    }

    public  void fillColor(String color)
    {
        System.out.println(color + " is filled in it");
    }

    public  void strokeColor(String color)
    {
        System.out.println(color + "stroke is filled in it");
    }
}
