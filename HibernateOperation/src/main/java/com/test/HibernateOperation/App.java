package com.test.HibernateOperation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//insert record database
    	AllienName an=new AllienName();
    	an.setFname("sk");
    	an.setMnane("tajel");
    	an.setLname("haque");
    	Allien a=new Allien();
    	a.setAid(103);
    	a.setAn(an);
    	a.setColor("Cyan");
    	
    	Configuration con=new Configuration().configure().addAnnotatedClass(Allien.class);
    	ServiceRegistry reg= new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
    	SessionFactory sf=con.buildSessionFactory(reg);
    	Session session=sf.openSession();
    	Transaction tx=session.beginTransaction();
    			session.save(a)	;
    			tx.commit();
    	
    	//fetch record
    	/*Allien a=new Allien();
    	
    	Configuration con=new Configuration().configure().addAnnotatedClass(Allien.class);
    	ServiceRegistry reg= new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
    	SessionFactory sf=con.buildSessionFactory(reg);
    	Session session=sf.openSession();
    	Transaction tx=session.beginTransaction();
    			a=(Allien) session.get(Allien.class, 101);
    			System.out.println(a);
    			tx.commit();*/
    	
    }
}
