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
public abstract class Person {
    
    String name;
    String surname;
    String jmbg;

    public Person(String jmbg, String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.jmbg = jmbg;
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getJmbg() {
        return jmbg;
    }

    public void setJmbg(String jmbg) {
        this.jmbg = jmbg;
    }
}
