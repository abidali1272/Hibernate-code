package One_To_One;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Answer {
	
	@Id
	private int answer_id;
	
	private String answer;
	
	@OneToOne
	private Qvation qvation;

	public int getAnswer_id() {
		return answer_id;
	}

	public void setAnswer_id(int answer_id) {
		this.answer_id = answer_id;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public Qvation getQvation() {
		return qvation;
	}

	public void setQvation(Qvation qvation) {
		this.qvation = qvation;
	}

	@Override
	public String toString() {
		return "Answer [answer_id=" + answer_id + ", answer=" + answer + ", qvation=" + qvation + "]";
	}

	public Answer(int answer_id, String answer, Qvation qvation) {
		super();
		this.answer_id = answer_id;
		this.answer = answer;
		this.qvation = qvation;
	}

	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
