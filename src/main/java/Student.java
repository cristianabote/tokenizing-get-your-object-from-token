public class Student {
    private String id;
    private String firstName;
    private String lastName;
    private String city;
    private String nativeLanguage;
    private int grade;

    public Student(String id, String firstName, String lastName, String city, String nativeLanguage, int grade) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.nativeLanguage = nativeLanguage;
        this.grade = grade;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getNativeLanguage() {
        return nativeLanguage;
    }

    public void setNativeLanguage(String nativeLanguage) {
        this.nativeLanguage = nativeLanguage;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
    public String toString(){
        return id+"."+firstName+"."+lastName+"."+city+"."+nativeLanguage+"."+grade;
 }
}

/*
    Let's consider the class Student with the following fields: id, firstName, lastName, city, nativeLanguage, grade.
    Please write this class in Java and define a string representation for it (e.g.: 1,Andrei,Mladin,Cluj-Napoca,Romana,10).
     Define a delimiter (any of: ,;:.).
    Override toString() method to return this representation.
    Do tokenize a such string and create the Student object with the data found there.
    */

