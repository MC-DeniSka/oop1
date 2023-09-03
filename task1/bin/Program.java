public class Program {
    public static void main(String []args){
        Cat Cat1 = new Cat("",-1);
        System.out.println(Cat1.displayInfo());
         Cat Cat2 = new Cat("barsik",5);
        System.out.println(Cat2.displayInfo());
        Cat Cat3 = new Cat("murzik",8);
        System.out.println(Cat3.displayInfo());

        Cat1.setName("kotonaft");
        Cat1.setAge(2);
        System.out.println(Cat1.displayInfo());
        Cat1.greet1();
        Cat2.greet1();
        Cat3.greet1();
    }
}
