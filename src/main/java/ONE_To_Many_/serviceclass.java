package ONE_To_Many_;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.connetion123.ConnetionUtil;

public class serviceclass {
	
	public Boolean onetomany(Answer ans, Question qe, serviceclass service)
	{
		Configuration con= new Configuration();
		
		con.configure("ONE_To_Many_\\one_to_many-cfgxml.xml");
		
		SessionFactory buildSessionFactory = con.buildSessionFactory();
		
		System.out.println("first");
		
		Session openSession = buildSessionFactory.openSession();
		
		Transaction tx = openSession.beginTransaction();
		
		System.out.println("second");
		
		qe.setQvation_id(20);
		qe.setQvation("what is center");
		
		Answer ans1= new Answer();
		ans1.setAnswer_id(23);
		ans1.setAnser("center is every thing");
		ans1.setQvation(qe);
		
		System.out.println("third");
		
		ans.setAnswer_id(21);
		ans.setAnser("center can buy every thing");
		ans.setQvation(qe);
		System.out.println("four");
		
		Answer ans2= new Answer();
		ans2.setAnswer_id(22);
		ans2.setAnser("center is impotant for good thing");
		ans2.setQvation(qe);
		System.out.println("five");
		
		List<Answer> answer= new ArrayList<>();
		answer.add(ans2);
		answer.add(ans1);
		answer.add(ans);
		qe.setAnswer(answer);
		System.out.println("six");
		
		openSession.save(qe);
		
		System.out.println("seven");
		
		tx.commit();
	
		openSession.close();
		
		
		
		return true;
		
	}
	
	public List<Question> getdata()
	{
	Configuration con= new Configuration();
		
		con.configure("ONE_To_Many_\\one_to_many-cfgxml.xml");
		
		SessionFactory buildSessionFactory = con.buildSessionFactory();
		
		 Session openSession = buildSessionFactory .openSession();
		 
		 Criteria createCriteria = openSession.createCriteria(Question.class);
		
		 List<Question> list = createCriteria.list();
		 
		return list;
		
	}
	
	public Question getsingleobject()
	{
		Configuration con= new Configuration();
		
		con.configure("ONE_To_Many_\\one_to_many-cfgxml.xml");
		
		SessionFactory buildSessionFactory = con.buildSessionFactory();
		
		 Session openSession = buildSessionFactory .openSession();
		 
		 Transaction tx = openSession.beginTransaction();
		
		 Question question = openSession.get(Question.class,1);
		 
		 System.out.println(question);
		 
		 return question;
	}

}
