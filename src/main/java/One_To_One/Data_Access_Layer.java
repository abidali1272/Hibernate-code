package One_To_One;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.connetion123.ConnetionUtil;

public class Data_Access_Layer {
	
	public String join_and_save(Qvation q, Answer ans)
	{
		SessionFactory connectionprovider = ConnetionUtil.connectionprovider();
		
		Session openSession = connectionprovider.openSession();
		
		Transaction tx = openSession.beginTransaction();
//			
//		ans.setAnswer_id(2);
//		ans.setAnswer("java is a coffe");
//		ans.setQvation(q);
//		
//		q.setQ_id(1);
//		q.setQvation("what is java?");
//		q.setAnswer(ans);
//		
		//openSession.save(q);
		//openSession.save(ans);
		
		tx.commit();
		
		Qvation qvation = (Qvation)openSession.get(Qvation.class, 4);
		
		//  System.out.println(qvation.getQvation());
	//	 System.out.println(qvation.getAnswer()); 
		System.out.println(qvation);
		
		openSession.close();
		
		return "save succcess full qvation";
		
		
	}

}
