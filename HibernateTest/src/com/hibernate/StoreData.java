package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
  
public class StoreData {  
public static void main(String[] args) {  
      System.out.println("amit");
    //creating configuration object  
    Configuration cfg=new Configuration();  
    cfg.configure("hibernate.cfg.xml");//populates the data of the configuration file  
      
    //creating seession factory object  
    SessionFactory factory=cfg.buildSessionFactory();  
      
    //creating session object  
    Session session=factory.openSession();
    Transaction t=null;
    try{
    	
    	 t=session.beginTransaction();  
         
    	    Student e1=new Student();  
    	    e1.setsId(115);  
    	    e1.setsName("sagooniya");  
    	      
    	      
    	    session.persist(e1);//persisting the object  
    	      
    	    t.commit();//transaction is committed
    	    System.out.println("successfully saved");
    }catch(Exception e){
    	System.out.println("Rolling back");
    	t.rollback();
    	e.printStackTrace();
    }
    
    //creating transaction object  
     
    session.close();  
      
      
      
}  
}  