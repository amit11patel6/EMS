package com.caprusit.client;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.caprusit.bean.Employee;
import com.caprusit.util.HibernateUtil;

public class UpdateEmployee {

	
	public static void main(String[] args) {
		
		
		Session session =HibernateUtil.getFactory().openSession();
		Transaction t=session.beginTransaction();
		Employee e1=(Employee)session.load(com.caprusit.bean.Employee.class, 1007);
        e1.setEmpName("PatelSab");
        session.update(e1);
        t.commit();
        session.close();
	}
}
