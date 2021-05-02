package my.gradle.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		System.out.println("Start");
		
		try {
			Configuration config = new Configuration();
			SessionFactory factory = config.configure("hibernate.cfg.xml").buildSessionFactory();
			Session session = factory.openSession();
			Transaction transaction = session.beginTransaction();
//			//INSERTION
//			Employee emp1 = new Employee(101, "Madara Uchiha", 11000.50);  
//			session.save(emp1);
//			Employee emp2 = new Employee(102, "Hasirama Senju", 10000.92);  
//			session.save(emp2);
//			Employee emp3 = new Employee(103, "Minato Namikaze", 9000.26);  
//			session.save(emp3);
//			Employee emp4 = new Employee(104, "Kakashi Hatake", 10200.75);  
//			session.save(emp4);
//			//SAVING
//			transaction.commit();  
			
//			// VIEW(select)
//			Employee e1; 
//			for(int i =101; i<105; i++) 
//			{
//				
//				e1 = session.get(Employee.class, i); 
//				System.out.println(e1.toString());
//				session.evict(e1);
//			}
			
			// UPDATE
//			Employee e1 = session.get(Employee.class, 102); 
//			e1.setName("Tobirama Senju");
//			session.update(e1);
//			e1 = session.get(Employee.class, 102);
//			System.out.println(e1.toString());
//			transaction.commit();
			//Adding an emp to delete
			Employee del = new Employee(105, "Tsunade Senju", 11200.83);  
			session.save(del);
			
			Employee e2; 
			for(int i =101; i<106; i++) 
			{
				
				e2 = session.get(Employee.class, i); 
				System.out.println(e2.toString());
				session.evict(e2);
			}
			System.out.println("\n");
			
			// DELETION
			
			Employee dis; 
			for(int i =101; i<106; i++) 
			{
				
				dis = session.get(Employee.class, i); 
				System.out.println(dis.toString());
				session.evict(dis);
			}
			
			Employee e3 = session.get(Employee.class, del.getId());
			session.delete(e3); 
			e3 = session.get(Employee.class, e3.getId());
			System.out.println(e3.toString());
			
			Employee dis2; 
			for(int i =101; i<105; i++) 
			{
				
				dis2 = session.get(Employee.class, i); 
				System.out.println(dis2.toString());
				session.evict(dis2);
			}
			//Closing collection
			session.close();
			factory.close();
			
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
		System.out.println("End");
	}
}
