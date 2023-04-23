package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        LapTop lapTop = new LapTop();
        lapTop.setBrand("LENOVO");
        lapTop.setLaptopId(201L);

        Student student = new Student();
        student.setStudentId(101L);
        student.setName("Amir Fathi");
        student.setLaptops(student.getLaptops());




        Configuration configuration = new Configuration().configure("/hibernate.cfg.xml")
               // .addAnnotatedClass(Alien.class)
                .addAnnotatedClass(Student.class)
                .addAnnotatedClass(LapTop.class);
        ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
        SessionFactory sessionFactory = configuration.buildSessionFactory(reg);
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(student);
        session.save(lapTop);
        transaction.commit();

    }


//    private void saveAlien(Alien alien) {
//        Configuration configuration = new Configuration().configure("/hibernate.cfg.xml").addAnnotatedClass(Alien.class);
//        ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
//        SessionFactory sessionFactory = configuration.buildSessionFactory(reg);
//        Session session = sessionFactory.openSession();
//        Transaction transaction = session.beginTransaction();
//        session.save(alien);
//        transaction.commit();
//
//    }
//
//    private void getAlien(Long id) {
//        Configuration configuration = new Configuration().configure("/hibernate.cfg.xml").addAnnotatedClass(Alien.class);
//        ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
//        SessionFactory sessionFactory = configuration.buildSessionFactory(reg);
//        Session session = sessionFactory.openSession();
//        Alien alien = (Alien) session.get(Alien.class, id);
//        System.out.println(alien.toString());
//    }
}
