package com.caprusit.client;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.caprusit.bean.Employee;
import com.caprusit.util.HibernateUtil;

public class InsertEmployee {
	
	public static void main(String[] args) {
		
		Session session = HibernateUtil.getFactory().openSession();
		
		Transaction t1=session.beginTransaction();
		
		Employee e1=new Employee();
		
		e1.setEmpId(1009);
		e1.setEmpName("Ponam Patel");
		e1.setEmpDept("management");
		e1.setEmpSal(100000);
		session.save(e1);
		t1.commit();
		session.close();
		System.out.println("saved");
	}

}
