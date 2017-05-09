package CorrectingMathSolutions.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity(name="math_table")
public class MathModel implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String problemText;
	private String source;
	private String equationsText;
	private String ansText;
	
	public MathModel(){
		
	}

	public MathModel(String problemText, String source, String equationsText, String ansText) {
		super();
		this.problemText = problemText;
		this.source = source;
		this.equationsText = equationsText;
		this.ansText = ansText;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProblemText() {
		return problemText;
	}

	public void setProblemText(String problemText) {
		this.problemText = problemText;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getEquationsText() {
		return equationsText;
	}

	public void setEquationsText(String equationsText) {
		this.equationsText = equationsText;
	}

	public String getAnsText() {
		return ansText;
	}

	public void setAnsText(String ansText) {
		this.ansText = ansText;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "MathModel [id=" + id + ", problemText=" + problemText + ", source=" + source + ", equationsText="
				+ equationsText + ", ansText=" + ansText + "]";
	}
	
	
	
}
