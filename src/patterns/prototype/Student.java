/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.prototype;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Veljko
 */
public class Student implements Person {

    private String name;
    private String surname;
    private Index index;
    private Date dateBirth;

    public Student() {
    }

    public Student(String name, String surname, Index index, Date dateBirth) {
        this.name = name;
        this.surname = surname;
        this.index = index;
        this.dateBirth = dateBirth;
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

    public Index getIndex() {
        return index;
    }

    public void setIndex(Index index) {
        this.index = index;
    }

    public Date getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(Date dateBirth) {
        this.dateBirth = dateBirth;
    }

    @Override
    public Person shallowClone() {
         return new Student(this.name, this.surname, this.index, this.dateBirth);
    }
    
    @Override
    public Person deepClone(){
        return new Student(this.name,this.surname,new Index(this.getIndex().getYear(),this.getIndex().getNumber()),
         new Date(this.getDateBirth().getYear(),this.getDateBirth().getMonth(),this.getDateBirth().getDay()));
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", surname=" + surname + ", index=" + index + ", dateBirth=" + dateBirth + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.name);
        hash = 37 * hash + Objects.hashCode(this.surname);
        hash = 37 * hash + Objects.hashCode(this.index);
        hash = 37 * hash + Objects.hashCode(this.dateBirth);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Student other = (Student) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.surname, other.surname)) {
            return false;
        }
        if (!Objects.equals(this.index, other.index)) {
            return false;
        }
        return true;
    }

  
    
    
    

    
    

}
