package Task4;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(final String[] args) {
        final List<Student> studentList = new ArrayList<>();
        final Map<Subject, Rating> hashMap1 = new HashMap<>();
        final Map<Subject, Rating> hashMap2 = new HashMap<>();
        final Map<Subject, Rating> hashMap3 = new HashMap<>();

        final Subject english = new Subject("Англійська мова");
        final Subject math = new Subject("Математика ");
        final Subject physics = new Subject("Фізика ");

        final Rating rating1 = new Rating(60);
        final Rating rating2 = new Rating(80);
        final Rating rating3 = new Rating(70);

        hashMap1.put(english, rating1);
        hashMap1.put(math, rating2);
        hashMap1.put(physics, rating3);

        hashMap2.put(english, rating3);
        hashMap2.put(math, rating2);
        hashMap2.put(physics, rating1);

        hashMap3.put(english, rating2);
        hashMap3.put(math, rating1);
        hashMap3.put(physics, rating3);

        final Student student1 = new Student(19,"Артем", "IT-21", "ІКНІ",1,hashMap1);
        final Student student2 = new Student(20,"Олег", "БД-41", "ІБІС",2,hashMap2);
        final Student student3 = new Student(18,"Ян", "КБ-21", "ІКТА",3,hashMap3);

        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);


        final Subject circuitry = new Subject("Схемотехніка");

        display(studentList);
        addSubject(studentList, circuitry);
        display(studentList);

        System.out.println();
        System.out.println("Середній бал студента: " + average(student1));

        System.out.println("Оцінки студентів за ключем \" Анлійська мова \" :");
        System.out.println(displayByKey(studentList,english));



    }

    public static List<Student> addSubject(final List<Student> list, final Subject subject) {
        for (final Student student : list) {
            student.getRatingMap().put(subject,new Rating());
        }

        return list;
    }

    public static void display(final List<Student> list) {
        for (final Student student : list) {
            System.out.println();
            System.out.println(student);
        }
    }

    public static double average(final Student student) {
        return student.getRatingMap().values().stream()
                .mapToInt(value -> value.getRating())
                .average()
                .getAsDouble();
    }

    public static Map<Long, Rating> displayByKey(final List<Student> list, final Subject subject){
        return list.stream()
                .distinct()
                .collect(Collectors.toMap(student -> student.getUID(),student -> student.getRatingMap().get(subject)));
    }

}



