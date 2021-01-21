package com.test.HQLhibernate;

import java.util.List;
import java.util.Random;

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
    	 Configuration con=new Configuration().configure().addAnnotatedClass(Student.class);
         ServiceRegistry reg=new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();

         SessionFactory sf=con.buildSessionFactory(reg);
         Session session1=sf.openSession();
         session1.beginTransaction();
         
         //hql query
         /*Query q=session1.createQuery("from Student where marks>50");
         List<Student>students=q.list();*/
        /* Random r=new Random();
         for(int i=1;i<=50;i++)
         {
             Student s=new Student();

        	 s.setRollno(i);
        	 s.setName("taju "+i);
        	 s.setMarks(r.nextInt(100));
        	 session1.save(s);
         }*/
         
        /* for (Student student : students) {
			System.out.println(student);
		}*/
         
         Query q=session1.createQuery("select rollno,name,marks from Student");
        // Object[] student=(Object[])q.uniqueResult();
         List<Object[]>student=(List<Object[]>)q.list();

        /* for (Object object : student) {
			System.out.println(object);
		}*/
         
         for (Object[] object : student) 
         System.out.println(object[0]+ ":"+object[1]+" : "+object[2]);
         
         session1.getTransaction().commit();
         
    }
}
