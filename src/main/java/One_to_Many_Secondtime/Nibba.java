package One_to_Many_Secondtime;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Nibba {
	
	@Id
	private int id;
	
	private String Nibba_Name;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Girl_Freind> girlfreind;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNibba_Name() {
		return Nibba_Name;
	}

	public void setNibba_Name(String nibba_Name) {
		Nibba_Name = nibba_Name;
	}

	public List<Girl_Freind> getGirlfreind() {
		return girlfreind;
	}

	public void setGirlfreind(List<Girl_Freind> girlfreind) {
		this.girlfreind = girlfreind;
	}

	@Override
	public String toString() {
		return "Nibba [id=" + id + ", Nibba_Name=" + Nibba_Name + ", girlfreind=" + girlfreind + "]";
	}
	
	
	
	

}
