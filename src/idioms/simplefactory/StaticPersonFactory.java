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
public class StaticPersonFactory {
    
     public static Person createPerson(String personType,String jmbg, String name, String surname) {
        switch (personType) {
            case "Professor":
                return new Professor(jmbg, name, surname);
            case "Empolyee":
                return new Employee(jmbg, name, surname);
            case "Student":
                return new Student(jmbg, name, surname);
            default:
                throw new RuntimeException("Wrong person type");
        }
    }
}
