/* Program:  Ex9.2 Janitor Class
   Programmer: Hyunki Lee
   Date: October 8, 2018
// A class to represent Janitor.
   A Janitor works 80 hrs, makes $30.000, has 5 Vaca Days, clean()
*/

//define Janitor class. SubClass: Janitor, SuperClass: Employee.
public class Janitor extends Employee {

    /* define each method. no return and no receive.
       General information methods are overrided SuperClass.
    */
    public void showVacation() {
        System.out.println("I receive 1 week vacation.");
    }

    public void showSalary() {
        System.out.println("I make $30.000 a year");
    }
    
    public void clean() {
      System.out.println("working for the man");
    }
    
    public void showHours(){
      System.out.println("I work 80 hours a week");
    }
}
