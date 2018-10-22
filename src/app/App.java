package app;
public class App {
    
    public static void main(String[] args) {
       Employee E = new Employee();
       Boss B = new Boss();
       System.out.println(E.name);
       E.getNameDepartment();
       E.getSalary();
       System.out.println("***********");
       System.out.println(B.name);
       B.getNameDepartment();
       B.getSalary();
    }  
}
interface Printable{
 
   final int SEMP = 15_000;
   final int SBOSS = 50_000;
}
abstract class department {     // Отдел
    public void getNameDepartment() {}
}

class Employee extends department { // Сотрудник
    String name;
    public Employee(){
        name = "Сотрудник";
    }
    @Override
    public void getNameDepartment(){
        System.out.println("Отдел разработки.");
    }
    public void getSalary(){
        System.out.println(Printable.SEMP);
    }
    public String getName(){
        return name;
    }
}
class Boss extends department {
    String name;
    public Boss(){
        name = "Начальник";
    }
    @Override
    public void getNameDepartment(){
         System.out.println("Отдел управления.");
    }
    public void getSalary(){
         System.out.println(Printable.SBOSS);
    }
    public String getName(){
        return name;
    }
}