package com.neusoft.root.domain;
//老师批卷最后的表
public class Check 
{
	private String studentId;
	private String paperId;
	private String teacherId;
	private String singlechoiceScore;
	private String multichoiceScore;
	private String fillScore;
	private String subjectiveScore;
	private double sumScore;
	
	public Check(String studentId, String paperId, String teacherId, String singlechoiceScore, String multichoiceScore,
			String fillScore, String subjectiveScore, double sumScore) {
		super();
		this.studentId = studentId;
		this.paperId = paperId;
		this.teacherId = teacherId;
		this.singlechoiceScore = singlechoiceScore;
		this.multichoiceScore = multichoiceScore;
		this.fillScore = fillScore;
		this.subjectiveScore = subjectiveScore;
		this.sumScore = sumScore;
	}

	public Check() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getPaperId() {
		return paperId;
	}

	public void setPaperId(String paperId) {
		this.paperId = paperId;
	}

	public String getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(String teacherId) {
		this.teacherId = teacherId;
	}

	public String getSinglechoiceScore() {
		return singlechoiceScore;
	}

	public void setSinglechoiceScore(String singlechoiceScore) {
		this.singlechoiceScore = singlechoiceScore;
	}

	public String getMultichoiceScore() {
		return multichoiceScore;
	}

	public void setMultichoiceScore(String multichoiceScore) {
		this.multichoiceScore = multichoiceScore;
	}

	public String getFillScore() {
		return fillScore;
	}

	public void setFillScore(String fillScore) {
		this.fillScore = fillScore;
	}

	public String getSubjectiveScore() {
		return subjectiveScore;
	}

	public void setSubjectiveScore(String subjectiveScore) {
		this.subjectiveScore = subjectiveScore;
	}

	public double getSumScore() {
		return sumScore;
	}

	public void setSumScore(double sumScore) {
		this.sumScore = sumScore;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fillScore == null) ? 0 : fillScore.hashCode());
		result = prime * result + ((multichoiceScore == null) ? 0 : multichoiceScore.hashCode());
		result = prime * result + ((paperId == null) ? 0 : paperId.hashCode());
		result = prime * result + ((singlechoiceScore == null) ? 0 : singlechoiceScore.hashCode());
		result = prime * result + ((studentId == null) ? 0 : studentId.hashCode());
		result = prime * result + ((subjectiveScore == null) ? 0 : subjectiveScore.hashCode());
		long temp;
		temp = Double.doubleToLongBits(sumScore);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((teacherId == null) ? 0 : teacherId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Check other = (Check) obj;
		if (fillScore == null) {
			if (other.fillScore != null)
				return false;
		} else if (!fillScore.equals(other.fillScore))
			return false;
		if (multichoiceScore == null) {
			if (other.multichoiceScore != null)
				return false;
		} else if (!multichoiceScore.equals(other.multichoiceScore))
			return false;
		if (paperId == null) {
			if (other.paperId != null)
				return false;
		} else if (!paperId.equals(other.paperId))
			return false;
		if (singlechoiceScore == null) {
			if (other.singlechoiceScore != null)
				return false;
		} else if (!singlechoiceScore.equals(other.singlechoiceScore))
			return false;
		if (studentId == null) {
			if (other.studentId != null)
				return false;
		} else if (!studentId.equals(other.studentId))
			return false;
		if (subjectiveScore == null) {
			if (other.subjectiveScore != null)
				return false;
		} else if (!subjectiveScore.equals(other.subjectiveScore))
			return false;
		if (Double.doubleToLongBits(sumScore) != Double.doubleToLongBits(other.sumScore))
			return false;
		if (teacherId == null) {
			if (other.teacherId != null)
				return false;
		} else if (!teacherId.equals(other.teacherId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Check [studentId=" + studentId + ", paperId=" + paperId + ", teacherId=" + teacherId
				+ ", singlechoiceScore=" + singlechoiceScore + ", multichoiceScore=" + multichoiceScore + ", fillScore="
				+ fillScore + ", subjectiveScore=" + subjectiveScore + ", sumScore=" + sumScore + "]";
	}
	
}
