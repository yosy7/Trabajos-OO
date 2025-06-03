import Model.Circle;
import Model.FigureAbs;
import Model.Square;
import Model.Triangle;
import Model.Triangle2;
import Model.Triangle3;
public class App {
    public static void main(String[] args) throws Exception {

        FigureAbs sq = new Square(10);
        FigureAbs cir = new Circle(10);
        FigureAbs triangle = new Triangle(20, 25, 20);
        FigureAbs triangle2 = new Triangle2(20);
        FigureAbs triangle3= new  Triangle3(6, 8, 10);



        FigureAbs[] figures = { sq, cir, triangle, triangle2, triangle3 };

        for (FigureAbs figureAbs : figures) {
            System.out.println("La clase es: " + figureAbs.getClass().getSimpleName());
            System.out.println("El area es: " + figureAbs.getArea());
            System.out.println("El perimetro es: " + figureAbs.getPerimeter());
            System.out.println("----------------------------------------------------");
        }

    }
}

