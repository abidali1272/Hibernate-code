package ONE_To_Many_;

import java.util.List;

public class Test {
	
	
	public static void main(String[] args) {
		
		
		Answer ans= new Answer();
		
		Question qe= new Question();
		
		serviceclass service= new serviceclass();
		
		service.onetomany(ans,qe,service);
		
		//List<Question> getdata = service.getdata();
		
		//getdata.forEach(a->System.err.println(a));
		
	}

}
