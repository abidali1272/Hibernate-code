package ONE_To_Many_;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Answer {
	
	@Id
	private int answer_id;
	
	private String anser;
	
	@ManyToOne
	private Question qvation;

	public int getAnswer_id() {
		return answer_id;
	}

	public void setAnswer_id(int answer_id) {
		this.answer_id = answer_id;
	}

	public String getAnser() {
		return anser;
	}

	public void setAnser(String anser) {
		this.anser = anser;
	}

	public Question getQvation() {
		return qvation;
	}

	public void setQvation(Question qvation) {
		this.qvation = qvation;
	}

	@Override
	public String toString() {
		return "Answer [answer_id=" + answer_id + ", anser=" + anser +  "]";
	}

	
	
	
	

}
