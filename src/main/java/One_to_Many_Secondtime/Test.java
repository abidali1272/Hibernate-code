package One_to_Many_Secondtime;

public class Test {
	
	public static void main(String[] args) {
		
		Nibba nibba= new Nibba();
		
		Girl_Freind nibbi= new Girl_Freind();
		
		Service_bolte service= new Service_bolte();
		
		service.save_nibbas_girlfreind(nibba,nibbi,service);
		
	}

}
