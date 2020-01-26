public class MyTokenizer {
    public static void main(String[] args){

        Student cristiana = new Student("25","Cristiana", "Bote","Cluj-Napoca", "Romana", 10);
        cristiana.setCity("Floresti");
        System.out.println(cristiana.toString());

        String tokenString = "33.Andrei.Mladin.Cluj-Napoca.Romana.10";
        String[] tokens = tokenString.split ("\\.");
        System.out.println("Afisare atribute:");
        System.out.println("id: " + tokens[0]);
        System.out.println("first name : "+ tokens[1]);
        System.out.println("last name: " + tokens[2]);
        System.out.println("city: "+ tokens[3]);
        System.out.println("language: "+ tokens[4]);
        System.out.println("grade: "+tokens[5]);

        Student andrei = new Student(tokens[0], tokens[1],tokens[2],tokens[3],tokens[4],Integer.parseInt(tokens[5]));
        System.out.println("noul student creat este " + andrei);

    }
    /*
    Let's consider the class Student with the following fields: id, firstName, lastName, city, nativeLanguage, grade.
    Please write this class in Java and define a string representation for it (e.g.: 1,Andrei,Mladin,Cluj-Napoca,Romana,10).
     Define a delimiter (any of: ,;:.).
    Override toString() method to return this representation.
    Do tokenize a such string and create the Student object with the data found there.
    */
}

