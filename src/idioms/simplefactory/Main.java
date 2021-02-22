/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idioms.simplefactory;

/**
 *
 * @author Veljko
 */
public class Main {

    public static void main(String[] args) {
        callingNonStaticPersonFactory();
        callingStaticPersonFactory();
    }
    
    private static void callingNonStaticPersonFactory() {
        PersonFactory personFactory = new PersonFactory();

        Person employee = personFactory.createPerson("Empolyee", "1234567891011", "Employee_name", "Employee_surname");
        System.out.println(employee);

        Person student = personFactory.createPerson("Student", "1110987654321", "Student_name", "surname");
        System.out.println(student);

        Person professor = personFactory.createPerson("Professor", "11111111111", "Professor_name", "Professor_surname");
        System.out.println(professor);

        try {
            Person error = personFactory.createPerson("error", "01010101010101", "Error_name", "Error_surname");
        } catch (RuntimeException ex) {
            System.out.println(ex.getMessage());
        }
    } 
    
     private static void callingStaticPersonFactory() {

        Person employee = StaticPersonFactory.createPerson("Empolyee", "1234567891011", "Employee_name", "Employee_surname");
        System.out.println(employee);

        Person student = StaticPersonFactory.createPerson("Student", "1110987654321", "Student_name", "surname");
        System.out.println(student);

        Person professor = StaticPersonFactory.createPerson("Professor", "111111111111", "Professor_name", "Professor_surname");
        System.out.println(professor);

        try {
            Person error = StaticPersonFactory.createPerson("error", "01010101010101", "Error_name", "Error_surname");
        } catch (RuntimeException ex) {
            System.out.println(ex.getMessage());
        }
    } 
}
