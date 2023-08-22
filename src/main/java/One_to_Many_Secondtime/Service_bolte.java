package One_to_Many_Secondtime;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Service_bolte {
	
	public void save_nibbas_girlfreind(Nibba nibba, Girl_Freind nibbi, Service_bolte service)
	{
		
		Configuration con= new  Configuration();
		con.configure("One_to_Many_Secondtime\\one_tomany_With_Nibba_cfg.xml");
		
		SessionFactory buildSessionFactory = con.buildSessionFactory();
		
		Session openSession = buildSessionFactory.openSession();
		
		Transaction tx = openSession.beginTransaction();
		
		
		nibbi.setGirl_Freind(2);
		nibbi.setGirlfreindname("aliya");
		nibbi.setNibba(nibba);
		
		Girl_Freind nibbi1= new  Girl_Freind();
		nibbi1.setGirl_Freind(3);
		nibbi1.setGirlfreindname("haseena");
		nibbi1.setNibba(nibba);
		
		List<Girl_Freind> girl= new  ArrayList<>();
		girl.add(nibbi);
		girl.add(nibbi1);
		
		
		
		
		nibba.setId(1);
		nibba.setNibba_Name("Ammar");
		nibba.setGirlfreind(girl);
		

		openSession.save(nibba);
		
		tx.commit();
		
		openSession.close();
		
		
	}

}
