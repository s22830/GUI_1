package test;

import people.Person;
import people.TenantLetter;

public class TestMain1 {
    public static void main(String[] args) {
        Person p1 = new Person("Oleg","Krasavin","ertyu");
        Person p2 = new Person("ewrg","wecf","werf");
        Person p3 = new Person("ewrg","wecf","werf");


        System.out.println(p1.getId());
        System.out.println(p2.getId());
        System.out.println(p3.getId());


    }
}
