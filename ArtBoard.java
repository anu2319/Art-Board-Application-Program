import java.util.ArrayList;

public class ArtBoard
{
    static ArrayList<Circle> circles = new ArrayList<>();
    static ArrayList<Square> squares = new ArrayList<>();
    static ArrayList<Polygon> polygons = new ArrayList<>();

    static ArrayList<Object> artBoard = new ArrayList<>();

    public static void draw_circle(int x, int y,String fill_color, String stroke_color,int radius)
    {
        Circle circle = new Circle(x,y,fill_color,stroke_color,radius);
        circle.fillColor(fill_color);
        circle.strokeColor(stroke_color);
        circles.add(circle);
        artBoard.add(circle);
        System.out.println("circle is created");

    }

    public static void draw_square(int x, int y,String fill_color, String stroke_color, int side)
    {
        Square square = new Square(x,y,fill_color,stroke_color,side);
        square.fillColor(fill_color);
        square.strokeColor(stroke_color);
        squares.add(square);
        artBoard.add(square);
        System.out.println("Square is created");
    }

    public static void draw_polygon(int x, int y,String fill_color, String stroke_color, int sides,int numberOfSides)
    {
        Polygon polygon = new Polygon(x,y,fill_color,stroke_color,sides,numberOfSides);
        polygon.fillColor(fill_color);
        polygon.strokeColor(stroke_color);
        polygons.add(polygon);
        artBoard.add(polygon);
        System.out.println("polygon is created");
    }
}
