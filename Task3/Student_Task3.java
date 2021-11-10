package Task3;

public class Student_Task3 {
    private int age;
    private String name;
    private String group;
    private String institute;
    private Rating_Task3 averageRating;
    private Subject_Task3 favouriteSubject;

    //Constructor
    public Student_Task3(final int age, final String name, final String group, final String institute,
                         final Rating_Task3 averageRating, final Subject_Task3 favouriteSubject ){
        this.age = age;
        this.name = name;
        this.group = group;
        this.institute = institute;
        this.averageRating = averageRating;
        this.favouriteSubject = favouriteSubject;
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

    public void setAverageRating(final Rating_Task3 averageRating) {
        this.averageRating = averageRating;
    }

    public Subject_Task3 getFavouriteSubject() {
        return favouriteSubject;
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

    public Rating_Task3 getAverageRating() {
        return averageRating;
    }

    public void setFavouriteSubject(final Subject_Task3 favouriteSubject) {
        this.favouriteSubject = favouriteSubject;
    }


    @Override
    public String toString() {
        return "Студент " + getName() + " віком "+ getAge() + " вчиться в групі " + getGroup() + " інституту " + getInstitute() +
                ".Його середній бал: " + getAverageRating() + ".Його улюблений предмет: " + getFavouriteSubject();
    }

}
