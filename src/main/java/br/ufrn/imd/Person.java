package br.ufrn.imd;

public class Person {

    public String name;
    public String hometown;

    public Person(String name, String hometown){
        this.name = name;
        this.hometown = hometown;
    }

    public String hometown(){
        return this.hometown;
    }
    public String name(){
        return this.name;
    }

}
