package com.Dao_Lyer;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Bean.Adress;
import com.Bean.Student_bolte;
import com.Bean.image_And_Date;
import com.connetion123.ConnetionUtil;

public class data_Access_layer {
	

	
	@SuppressWarnings("deprecation")
	public String datasave(Student_bolte student)
	{
		Configuration cfg= new Configuration();
		cfg.configure("hibernate-cfg.xml");
		
		SessionFactory sessionfactoury = cfg.buildSessionFactory();
			
		student.setName("shabbir");
		student.setCity("thane");
		student.setState("gujrat");
		
		Session openSession = sessionfactoury.openSession();
		
		Transaction tx = openSession.beginTransaction();
		
		openSession.save(student);
		
		tx.commit();
		
		
		
		openSession.close();
		
		return "Succes full ran";
	}
	
	
	public String saveimage(image_And_Date di) throws IOException
	{
		SessionFactory sessionFactory = ConnetionUtil.connectionprovider();
		
		Session openSession = sessionFactory.openSession();
		
		Transaction tx = openSession.beginTransaction();
		
		di.setDate(new Date());
		
		
		/*
		 * FileInputStream fis = new FileInputStream("src/main/java/image.jpg"); Byte[]
		 * data = new Byte[fis.available()]; fis.read();
		 */
		
		byte[] imageData = readImageFileIntoByteArray("src/main/java/image.jpg");
		di.setImage(imageData);
		 
		openSession.save(di);
		
		tx.commit();
		openSession.close();
		
		
		return "image save success full";
	
	}
	
	
	public String deletedata(Student_bolte student)
	{
		SessionFactory sessionFactory = ConnetionUtil.connectionprovider();
		
		Session openSession = sessionFactory.openSession();
		
		Transaction tx = openSession.beginTransaction();
		
		Student_bolte load = openSession.load(Student_bolte.class, 2);
		
		openSession.delete(load);
			
		tx.commit();
		
		openSession.close();	
		
		return "data delete";		
		
	}
	
	
	
	public String updateuser(Student_bolte student)
	{
		
		SessionFactory sessionFactory = ConnetionUtil.connectionprovider();
		
		Session openSession = sessionFactory.openSession();
		
		Transaction tx = openSession.beginTransaction();
		
		Student_bolte load = openSession.load(Student_bolte.class, 1);
		
		System.out.println(load.getCity());
		load.setCity("surat");
		
		openSession.update(load);
		
		tx.commit();
		
		openSession.close();
		
		return "Update User";
	}
	
	
	private static byte[] readImageFileIntoByteArray(String imagePath) throws IOException {
	    File file = new File(imagePath);
	    
	    byte[] imageData = new byte[(int) file.length()];

	    try (FileInputStream fis = new FileInputStream(file)) {
	        int bytesRead = fis.read(imageData);
	        if (bytesRead != imageData.length) {
	            throw new IOException("Failed to read complete image data");
	        }
	    } catch (IOException e) {
	        e.printStackTrace();
	        throw e; // Rethrow the exception to the caller
	    }

	    return imageData;
	}
	
	public String adress_and_student_save(Adress adress, Student_bolte student)
	{

		SessionFactory sessionFactory = ConnetionUtil.connectionprovider();
		
		Session openSession = sessionFactory.openSession();
		
		Transaction tx = openSession.beginTransaction();
		
		
		adress.setRoadname("link road");
		adress.setRoomno("4");
		
		student.setName("khan abid");
		student.setCity("bhopal");
		student.setState("punjab");
		student.setAdress(adress);
		
		openSession.save(student);
		
		openSession.close();
		
		return "save success full";
	}
	
	
	

}
