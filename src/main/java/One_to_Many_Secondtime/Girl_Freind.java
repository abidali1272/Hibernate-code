package One_to_Many_Secondtime;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Girl_Freind {
	
	@Id
	private int Girl_Freind_id;
	
	private String girlfreindname;
	
	@ManyToOne
	private Nibba nibba;

	public int getGirl_Freind() {
		return Girl_Freind_id;
	}

	public void setGirl_Freind(int girl_Freind) {
		Girl_Freind_id = girl_Freind;
	}

	public String getGirlfreindname() {
		return girlfreindname;
	}

	public void setGirlfreindname(String girlfreindname) {
		this.girlfreindname = girlfreindname;
	}

	public Nibba getNibba() {
		return nibba;
	}

	public void setNibba(Nibba nibba) {
		this.nibba = nibba;
	}

	@Override
	public String toString() {
		return "Girl_Freind [Girl_Freind=" + Girl_Freind_id + ", girlfreindname=" + girlfreindname + ", nibba=" + nibba
				+ "]";
	}
	
	
	
	

}
