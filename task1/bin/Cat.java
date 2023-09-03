public class Cat {
    public String name;
    public double age;

    public Cat(String name,double age){
        checkName(name);
        checkAge(age);
    }
    public Cat(){
        name = "noname";
    }
        
    public Cat(String name){
        this.name = name;
        age = 0;
    }

    public String getName(){
        return name;
    }
    
    public void setName(String name){
        checkName(name);
    }

    public void checkName(String name){
        if (name == null || name.length() < 3) {
            this.name = "noname";
        }
        else{
            this.name = name;
        }

    }

    public double getAge(){
        return age;
    }

    public void setAge(double age){
       checkAge(age);
    }

    public void checkAge(double age){
          if (age <= 0){
        this.age = 0;}
        else{
            this.age = age;
        }
    }
   
    public String displayInfo(){
        return String.format("%s -  %.2f",name,age);
    }    
        
         public void greet1(){
            System.out.println("Мяу! Меня зовут <" + name +">. Мне <"+ age + "> года(лет).");
         }
        
}