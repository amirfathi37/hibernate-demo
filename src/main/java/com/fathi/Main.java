package com.fathi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import javax.persistence.EntityManager;

public class Main {
    public static void main(String[] args) {


        Citizen cz = new Citizen();
        cz.setCitizenName("amir fathi");
//        cz.getCars().add(cr);

        Car cr = new Car();
        cr.setBrand("Quik");
        cr.setOwner(cz);


        Configuration configuration = new Configuration().configure("/hibernate.cfg.xml")
                .addAnnotatedClass(Citizen.class)
                .addAnnotatedClass(Car.class);
        ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
        SessionFactory sessionFactory = configuration.buildSessionFactory(reg);
        Session session = sessionFactory.openSession();
//        Transaction transaction = session.beginTransaction();
//        session.save(cz);
//        session.save(cr);
//        transaction.commit();


        

        Citizen citizen = (Citizen) session.get(Citizen.class, 1L);
        System.out.println(citizen.getCitizenName());

        Citizen citizen1 = (Citizen) session.get(Citizen.class, 1L);
        System.out.println(citizen1.getCitizenName());



    }

}
