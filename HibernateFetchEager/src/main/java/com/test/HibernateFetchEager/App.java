package com.test.HibernateFetchEager;

import java.util.Collection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
public class App 
{
    public static void main( String[] args )
    {
       /* Laptop l=new Laptop();
        l.setLid(2);
        l.setLbrand("Hp");
        l.setPrice(71000);
        Alien a=new Alien();
         a.setAid(102);
        a.setAname("tajel");
        a.getLaps().add(l);*/
       Configuration con=new Configuration().configure().addAnnotatedClass(Alien.class).addAnnotatedClass(Laptop.class);   
       ServiceRegistry reg=new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();  
       System.out.println("hi hibernate"+reg);
       SessionFactory sf=con.buildSessionFactory(reg);
       System.out.println("test"+reg);
       Session session=sf.openSession();
       session.beginTransaction();
       Alien a=(Alien) session.get(Alien.class,101);
       System.out.println(a.getAname());
       Collection<Laptop>laps=a.getLaps();
       /*
    	   for (Laptop laptop : laps) {
			System.out.println(laptop);
		}*/
       
       /*session.save(a);
       session.save(l);*/
       session.getTransaction().commit();
    }
}
