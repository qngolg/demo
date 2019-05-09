package com.example.demo.javakeyword;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TransientDemo {


    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student student = new Student("name",11);
        readObjectToFile(student);
        readObjectFromFile();
    }

    private static void readObjectFromFile() throws IOException, ClassNotFoundException {
        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("f.txt"));
        Student student = (Student) inputStream.readObject();
        System.out.println(student.name + " " + student.age);
        System.out.println("read object from file success ");
    }

    private static void readObjectToFile(Student student) throws IOException {
        System.out.println(student.name + " " + student.age);
        FileOutputStream f = new FileOutputStream("f.txt");
        ObjectOutputStream out = new ObjectOutputStream(f);
        out.writeObject(student);
        out.flush();
        out.close();
        System.out.println("read object to file success");
    }

}
