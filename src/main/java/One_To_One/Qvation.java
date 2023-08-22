package One_To_One;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Qvation {
	
	@Id
	private  int Q_id;
	
	private String qvation;
	
	@OneToOne
	private Answer answer;

	public int getQ_id() {
		return Q_id;
	}

	public void setQ_id(int q_id) {
		Q_id = q_id;
	}

	public String getQvation() {
		return qvation;
	}

	public void setQvation(String qvation) {
		this.qvation = qvation;
	}

	public Answer getAnswer() {
		System.out.println("sgfjg");
		return answer;
	}

	public void setAnswer(Answer answer) {
		this.answer = answer;
	}
	

	@Override
	public String toString() {
		return "Qvation [Q_id=" + Q_id + ", qvation=" + qvation + ", answer=" + answer + "]";
	}

	public Qvation(int q_id, String qvation, Answer answer) {
		super();
		Q_id = q_id;
		this.qvation = qvation;
		this.answer = answer;
	}

	public Qvation() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
