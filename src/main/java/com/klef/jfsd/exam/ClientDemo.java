package com.klef.jfsd.exam;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.MutationQuery;

public class ClientDemo 
{
public static void main(String[] args)
{
ClientDemo cd=new ClientDemo();	
cd.insertdepartment();
//cd.delete();
}
public void insertdepartment()
{
	Configuration cfg=new Configuration();
	cfg.configure("hibcfg.xml");
	SessionFactory sf=cfg.buildSessionFactory();
	Session session=sf.openSession();
	Transaction t=session.beginTransaction();
	Department d=new Department();
	d.setName("ECE");
	d.setLocation("Vijag");
	d.setHoDName("Anuop");
	session.persist(d);
	t.commit();
	System.out.println("Department Added");
	session.close();
	sf.close();
}
public void delete()
{
	Configuration cfg=new Configuration();
	cfg.configure("hibcfg.xml");
	SessionFactory sf=cfg.buildSessionFactory();
	Session session=sf.openSession();
	Transaction t=session.beginTransaction();
	Scanner  sc=new Scanner(System.in);
	System.out.println("Enter Department Id:");
	int did=sc.nextInt();
	MutationQuery qry=session.createMutationQuery("delete from Department where DepartmentId=?1");
	qry.setParameter(1, did);
	int n=qry.executeUpdate();
	if(n>0)
	{
		System.out.println(n+"Record Deleted");
	}
	else
	{
		System.out.println("ID not Found");
	}
	t.commit();
	sc.close();
	session.close();
	sf.close();
	
}
}
