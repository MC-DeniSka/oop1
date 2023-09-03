public class Rectangle {

    public String name;
    public double width;
    public double height;

    public Rectangle(String name,double width,double height){
        this.name = name;
        checkwidth(width);
        checkheight(height);
    }
    public Rectangle(){
        width = 10;
    }
    public Rectangle(double width){
        this.width = width;
        height = 5;
    }

    public double getwidth(){
        return width;
    }
    
    public void setwidth(double width){
        checkwidth(width);
    }

    public void checkwidth(double width){
        if  (width <= 0) {
            this.width = 10;
        }
        else{
            this.width = width;
        }

    }

    public double getheight(){
        return height;
    }

    public void setheight(double height){
       checkheight(height);
    }

    public void checkheight(double height){
          if (height <= 0){
            this.height = 5;}
        else{
            this.height = height;
        }
    }
   
    public String displayInfo(){
        return String.format("%s - Ширина(%.2f) -  Высота(%.2f)",name,width,height);
    }    
    public void Area(){
        System.out.println(name + " Ширина ("+ width + ") * " + "Высота (" + height + ") = Площадь (" + width * height + ")");

    }    
    public void Perimeter(){
        System.out.println(name + " Ширина ("+ width + ") Высота (" + height + ") = Периметр (" + (width+height)*2 + ")");
    }
}