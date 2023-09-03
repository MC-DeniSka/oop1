public class Program {
    
    public static void main(String []args){
        Rectangle Rectangle1 = new Rectangle("ПРЯМОУГОЛЬНИК1",20,40);
        System.out.println(Rectangle1.displayInfo());
         Rectangle Rectangle2 = new Rectangle("ПРЯМОУГОЛЬНИК2",15,5);
        System.out.println(Rectangle2.displayInfo());
        Rectangle Rectangle3 = new Rectangle("ПРЯМОУГОЛЬНИК3",0,0);
        System.out.println(Rectangle3.displayInfo());

        Rectangle1.Area();
        Rectangle1.Perimeter();
        Rectangle2.Area();
        Rectangle2.Perimeter();
        Rectangle3.Area();
        Rectangle3.Perimeter();
    }
}
