package One_To_One;

public class Test {
	
	public static void main(String[] args) {
		
		
		
		Qvation q= new Qvation();
		Data_Access_Layer dt= new Data_Access_Layer();
		Answer ans= new Answer();
		
		String join_and_save = dt.join_and_save(q, ans);
		
		System.out.println(join_and_save);
		
		
	}

}
