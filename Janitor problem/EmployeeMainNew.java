/* Program:  Ex9.2 Janitor Class
   Programmer: Hyunki Lee
   Date: October 8, 2018
// A class to represent Janitor.
   A Janitor works 80 hrs, makes $30.000, has 5 Vaca Days, clean()
*/

public class EmployeeMainNew {
    public static void main(String[] args) {
        System.out.println("Employee:");
        Employee employee1 = new Employee();
        employee1.applyForVacation();
        employee1.showHours();
        employee1.showSalary();
        employee1.showVacation();
        System.out.println();
        
        System.out.println("Secretary:");
        Secretary employee2 = new Secretary();
        employee2.applyForVacation();
        employee2.showHours();
        employee2.showSalary();
        employee2.showVacation();
        employee2.takeDictation();
        System.out.println();
        
        System.out.println("Lawyer:");
        Lawyer employee3 = new Lawyer();
        employee3.applyForVacation();
        employee3.showHours();
        employee3.showSalary();
        employee3.showVacation();
        employee3.sue();
        System.out.println();

        System.out.println("Marketer:");
        Marketer employee4 = new Marketer();
        employee4.applyForVacation();
        employee4.showHours();
        employee4.showSalary();
        employee4.showVacation();
        employee4.advertise();
        System.out.println();
        
        System.out.println("LegalSecretary:");
        LegalSecretary employee5 = new LegalSecretary();
        employee5.applyForVacation();
        employee5.showHours();
        employee5.showSalary();
        employee5.showVacation();
        employee5.fileLegalBriefs();
        System.out.println();
        
        System.out.println("JANITOR - Exercise 9.2");
        Janitor employee6 = new Janitor();
        employee6.applyForVacation();
        employee6.showHours();
        employee6.showSalary();
        employee6.showVacation();
        employee6.clean();


    }
}
