package ustbatchno3.Mavennew;


//Aysha's code

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


public class Person implements Serializable {
    private String name;
    private int age;
    private String city;

    public Person(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public static void main(String[] args) {
        // Create a Person object to serialize
        Person person = new Person("John", 30, "New York");

        // Serialize the object to a file
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\Readme"))) {
            oos.writeObject(person);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialize the object from the file
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\Readme"))) {
            Person loadedPerson = (Person) ois.readObject();
            System.out.println(loadedPerson);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                '}';
    }
}


// Aishu's code
//import java.io.*;
//
//public class Person {
//    public static void main(String[] args) {
//        // create an object to be serialized
//        Student student = new Student("John Doe", 25, "Computer Science");
//        
//        // serialize the object to a file
//        try {
//            FileOutputStream fileOut = new FileOutputStream("student.ser");
//            ObjectOutputStream out = new ObjectOutputStream(fileOut);
//            out.writeObject(student);
//            out.close();
//            fileOut.close();
//            System.out.println("Object has been serialized");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        
//        // deserialize the object from the file
//        try {
//            FileInputStream fileIn = new FileInputStream("student.ser");
//            ObjectInputStream in = new ObjectInputStream(fileIn);
//            Student deserializedStudent = (Student) in.readObject();
//            in.close();
//            fileIn.close();
//            System.out.println("Object has been deserialized");
//            System.out.println(deserializedStudent.toString());
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//    }
//}
//
//class Student implements Serializable {
//    private String name;
//    private int age;
//    private String major;
//    
//    public Student(String name, int age, String major) {
//        this.name = name;
//        this.age = age;
//        this.major = major;
//    }
//    
//    public String toString() {
//        return "Name: " + name + ", Age: " + age + ", Major: " + major;
//    }
//}
////
