/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.prototype;

import java.util.Date;

/**
 *
 * @author Veljko
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("=========SHALLOW COPY===================");
        shallowCopy();
        System.out.println("=========DEEP COPY===================");
        deepCopy();
    }

    private static void shallowCopy() {
        Index index = new Index("2020", "0244");
        Student student = new Student("Ime", "Prezime", index, new Date());

        Student student2 = (Student) student.shallowClone();
        System.out.println("Studenti su jednaki na osnovu metode equals():" + student.equals(student2));
        System.out.println("Reference na indekse oba studenta pokazuju na isti objekat u memoriji:" + (student.getIndex() == student2.getIndex()));

        System.out.println("Dolazi do promene indeksa jednog studenta");
        student2.getIndex().setNumber("3333");
        student2.getIndex().setYear("2016");
        System.out.println("Studenti su i dalje jednaki osnovu metode equals():" + student.equals(student2));
        System.out.println("Reference na indekse oba studenta pokazuju na isti objekat u memoriji:" + (student.getIndex() == student2.getIndex()));
    }

    private static void deepCopy() {
        Index index = new Index("2020", "0244");
        Student student = new Student("Ime", "Prezime", index, new Date());

        Student student2 = (Student) student.deepClone();
        System.out.println("Studenti su jednaki na osnovu metode equals():" + student.equals(student2));
        System.out.println("Reference na indekse oba studenta pokazuju na isti objekat u memoriji:" + (student.getIndex() == student2.getIndex()));

        System.out.println("Dolazi do promene indeksa jednog studenta");
        student2.getIndex().setNumber("3333");
        student2.getIndex().setYear("2016");
        System.out.println("Studenti su i dalje jednaki osnovu metode equals():" + student.equals(student2));
        System.out.println("Reference na indekse oba studenta pokazuju na isti objekat u memoriji:" + (student.getIndex() == student2.getIndex()));
    }
}
