package ONE_To_Many_;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import antlr.collections.List;

@Entity
public class Question {
	
	@Id
	private int qvation_id;
	
	private String qvation;
	
	@OneToMany(cascade = CascadeType.ALL)
	private java.util.List<Answer> answer;

	public int getQvation_id() {
		return qvation_id;
	}

	public void setQvation_id(int qvation_id) {
		this.qvation_id = qvation_id;
	}

	public String getQvation() {
		return qvation;
	}

	public void setQvation(String qvation) {
		this.qvation = qvation;
	}

	public java.util.List<Answer> getAnswer() {
		return answer;
	}

	public void setAnswer(java.util.List<Answer> answer) {
		this.answer = answer;
	}

	@Override
	public String toString() {
		return "Question [qvation_id=" + qvation_id + ", qvation=" + qvation + ", answer=" + answer + "]";
	}

	public Question(int qvation_id, String qvation, java.util.List<Answer> answer) {
		super();
		this.qvation_id = qvation_id;
		this.qvation = qvation;
		this.answer = answer;
	}

	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
