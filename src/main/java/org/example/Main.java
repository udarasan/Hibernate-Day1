package org.example;

import org.example.config.FactoryConfiguration;
import org.example.embed.FullName;
import org.example.entity.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {

        //FullName name=new FullName("udara","san");
        Student student=new Student();
        student.setId(3);
        student.setName("oshan");
        student.setAddress("kadawatha");

        Session session=FactoryConfiguration.getInstance().getSession();
        Transaction transaction=session.beginTransaction();

        //session.save(student);
        //session.update(student);
        //session.delete(student);
        //Student s=session.get(Student.class,1);
        //Student s=session.load(Student.class,1);
        //System.out.println(s);
        //session.persist(student);
        //session.remove(student);


        transaction.commit();
        session.close();
    }
}