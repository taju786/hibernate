package com.test.FirstLevelCache;



import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
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
    	Alien a1=null;
        Configuration con=new Configuration().configure().addAnnotatedClass(Alien.class);
        ServiceRegistry reg=new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();

        SessionFactory sf=con.buildSessionFactory(reg);
        Session session1=sf.openSession();
        session1.beginTransaction();
        Query q1=session1.createQuery("from IT_table where aid=101");
        q1.setCacheable(true);
        a1=(Alien) q1.uniqueResult();
    
       /*  a1=(Alien) session1.get(Alien.class,101);*/
        System.out.println(a1);
        session1.getTransaction().commit();
        session1.close();
        
        Session session2=sf.openSession();
        session2 .beginTransaction();
        Query q2=session2.createQuery("from IT_table where aid=101");
        q2.setCacheable(true);
        a1=(Alien) q2.uniqueResult();
       /* a1=(Alien) session2.get(Alien.class,101);*/
        System.out.println(a1);
        session2.getTransaction().commit();
        session2.close();
        
    }
}
