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
public class Professor extends Person {


    public Professor(String jmbg, String name, String surname) {
        super(jmbg, name, surname);
    }


    @Override
    public String toString() {
        return "Ja sam profesor{" +"jbmg="+jmbg+ ", name=" + name + ", surname=" + surname  + '}';
    }

}
