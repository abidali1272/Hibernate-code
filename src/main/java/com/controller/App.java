package com.controller;

import java.io.IOException;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.Bean.Adress;
import com.Bean.Student_bolte;
import com.Bean.image_And_Date;
import com.Dao_Lyer.data_Access_layer;

/**
 * Hello world!
 *
 */
public class App {



    public static void main( String[] args ) throws IOException
    {
        System.out.println( "Hello World!" );
        
    	Student_bolte student= new Student_bolte();	
        
        data_Access_layer sc= new data_Access_layer();
        
        image_And_Date di= new image_And_Date();
        
        Adress adress= new Adress();
        
        
        //String datasave = sc.datasave(student);
       // String deletedata = sc.deletedata(student);
        //String C = sc.saveimage(di);
       // String updateuser = sc.updateuser(student);
        String adress_and_student_save = sc.adress_and_student_save(adress,student);
        
        
       // System.out.println(datasave);
       // System.out.println(deletedata);
       // System.out.println(C);
        //System.out.println(updateuser);
        System.out.println(adress_and_student_save);
    }
}
