package Task4;

import Task3.Rating_Task3;
import Task3.Subject_Task3;

import java.util.Map;

public class Student {
    private int age;
    private String name;
    private String group;
    private String institute;
    private Map<Subject, Rating> ratingMap;
    private long UID;

    //Constructor
    public Student(final int age, final String name, final String group, final String institute, final long UID,
                   final Map<Subject, Rating> hashMap ){
        this.age = age;
        this.name = name;
        this.group = group;
        this.institute = institute;
        this.UID = UID;
        this.ratingMap = hashMap;
    }

    //Setters

    public void setAge(final int age) {
        this.age = age;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setGroup(final String group) {
        this.group = group;
    }

    public void setInstitute(final String institute) {
        this.institute = institute;
    }


    public void setUID(final long UID) {
        this.UID = UID;
    }

    public void setRatingMap(final Map<Subject, Rating> ratingMap) {
        this.ratingMap = ratingMap;
    }


    //Getters

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public String getInstitute() {
        return institute;
    }

    public long getUID() {
        return UID;
    }

    public Map<Subject, Rating> getRatingMap() {
        return ratingMap;
    }

    @Override
    public String toString() {
        return "Студент " + getName() + " віком "+ getAge() + " вчиться в групі " + getGroup() + " інституту "
                + getInstitute() + ".Його унікальний ID: "
                + getUID() + ".Його оцінка з предмету: " + getRatingMap();
    }

}
