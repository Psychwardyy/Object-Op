package edu.tr.maltepe.oop;

public class Lab1Main {
    public static void main(String[] args){
        Student student1 = new Student("Barış", "Yazıcı", 21, 58403);
        Student student2 = new Student("Mehmet", "Elçi", 23, 58740);

        Professor professor1 = new Professor("ensar", "gul", 37,"oop");
        Professor professor2 = new Professor("kayhan", "erciyes", 27, "digital system design");

        System.out.println("Student " + student1.getName()+ " with id "+ student1.getId() + " is " + student1.getAge() + " years old.");
        System.out.println("Student " + student2.getName()+ " with id "+ student2.getId() + " is " + student2.getAge() + " years old.");

        System.out.println("Professor " + professor1.getName()+ " who teaches "+ professor1.getLecture()+ " is "+ professor1.getAge() + " years old.");
        System.out.println("Professor " + professor2.getName()+ " who teaches "+ professor2.getLecture()+ " is "+ professor2.getAge() + " years old.");

        System.out.println("\n");

        professor1.setLecture("Object Oriented Programming");
        System.out.println("Professor " + professor1.getName()+ " who teaches "+ professor1.getLecture()+ " is "+ professor1.getAge() + " years old.");

    }
}