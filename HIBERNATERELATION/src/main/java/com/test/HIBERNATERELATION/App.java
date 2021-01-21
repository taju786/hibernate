package com.test.HIBERNATERELATION;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class App 
{
    public static void main( String[] args )
    {
       Laptop laptop=new Laptop();
       laptop.setLid(101);
       laptop.setLname("Acer");
       Student s=new Student();
       s.setRollno(1);
       s.setName("Tajel");
       s.setMarks(90);
       s.getLaptop().add(laptop);
       Configuration con=new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
       ServiceRegistry reg=new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();   
       SessionFactory sf=con.buildSessionFactory(reg);
       Session session=sf.openSession();
       session.beginTransaction();
       session.save(s);
       session.save(laptop);
       session.getTransaction().commit();
    }
}
