package com.neusoft.root.domain;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

//学生答题结果
public class ParsedResult 
{
	private String studentId; //学生ID
	private Integer paperId; //试卷ID
	private String teacherId;
	private Map<String, List<String>> singlechoiceResult; //单选题结果，格式：ID1，分数1###ID2，分数2###
	private Map<String, List<String>> multichoiceResult; //多选题结果，格式：ID1，分数1###ID2，分数2###
	private Map<String, List<String>> fillResult; //填空题结果，格式：ID1，分数1###ID2，分数2###
	private Map<String, List<String>> subjectiveResult; // 主观题结果，格式：ID1，分数1###ID2，分数2###
	private String submitDate; //答题日期
	private String checked;  //是否被批阅
	
	public ParsedResult(String studentId, Integer paperId, String teacherId,
			Map<String, List<String>> singlechoiceResult, Map<String, List<String>> multichoiceResult,
			Map<String, List<String>> fillResult, Map<String, List<String>> subjectiveResult, String submitDate,
			String checked) {
		super();
		this.studentId = studentId;
		this.paperId = paperId;
		this.teacherId = teacherId;
		this.singlechoiceResult = singlechoiceResult;
		this.multichoiceResult = multichoiceResult;
		this.fillResult = fillResult;
		this.subjectiveResult = subjectiveResult;
		this.submitDate = submitDate;
		this.checked = checked;
	}

	public ParsedResult() 
	{
		super();
		singlechoiceResult = new HashMap<>();
		multichoiceResult = new HashMap<>();
		fillResult = new HashMap<>();
		subjectiveResult = new HashMap<>();
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public Integer getPaperId() {
		return paperId;
	}

	public void setPaperId(Integer paperId) {
		this.paperId = paperId;
	}

	public String getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(String teacherId) {
		this.teacherId = teacherId;
	}

	public Map<String, List<String>> getSinglechoiceResult() {
		return singlechoiceResult;
	}

	public void setSinglechoiceResult(Map<String, List<String>> singlechoiceResult) {
		this.singlechoiceResult = singlechoiceResult;
	}

	public Map<String, List<String>> getMultichoiceResult() {
		return multichoiceResult;
	}

	public void setMultichoiceResult(Map<String, List<String>> multichoiceResult) {
		this.multichoiceResult = multichoiceResult;
	}

	public Map<String, List<String>> getFillResult() {
		return fillResult;
	}

	public void setFillResult(Map<String, List<String>> fillResult) {
		this.fillResult = fillResult;
	}

	public Map<String, List<String>> getSubjectiveResult() {
		return subjectiveResult;
	}

	public void setSubjectiveResult(Map<String, List<String>> subjectiveResult) {
		this.subjectiveResult = subjectiveResult;
	}

	public String getSubmitDate() {
		return submitDate;
	}

	public void setSubmitDate(String submitDate) {
		this.submitDate = submitDate;
	}

	public String getChecked() {
		return checked;
	}

	public void setChecked(String checked) {
		this.checked = checked;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((checked == null) ? 0 : checked.hashCode());
		result = prime * result + ((fillResult == null) ? 0 : fillResult.hashCode());
		result = prime * result + ((multichoiceResult == null) ? 0 : multichoiceResult.hashCode());
		result = prime * result + ((paperId == null) ? 0 : paperId.hashCode());
		result = prime * result + ((singlechoiceResult == null) ? 0 : singlechoiceResult.hashCode());
		result = prime * result + ((studentId == null) ? 0 : studentId.hashCode());
		result = prime * result + ((subjectiveResult == null) ? 0 : subjectiveResult.hashCode());
		result = prime * result + ((submitDate == null) ? 0 : submitDate.hashCode());
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
		ParsedResult other = (ParsedResult) obj;
		if (checked == null) {
			if (other.checked != null)
				return false;
		} else if (!checked.equals(other.checked))
			return false;
		if (fillResult == null) {
			if (other.fillResult != null)
				return false;
		} else if (!fillResult.equals(other.fillResult))
			return false;
		if (multichoiceResult == null) {
			if (other.multichoiceResult != null)
				return false;
		} else if (!multichoiceResult.equals(other.multichoiceResult))
			return false;
		if (paperId == null) {
			if (other.paperId != null)
				return false;
		} else if (!paperId.equals(other.paperId))
			return false;
		if (singlechoiceResult == null) {
			if (other.singlechoiceResult != null)
				return false;
		} else if (!singlechoiceResult.equals(other.singlechoiceResult))
			return false;
		if (studentId == null) {
			if (other.studentId != null)
				return false;
		} else if (!studentId.equals(other.studentId))
			return false;
		if (subjectiveResult == null) {
			if (other.subjectiveResult != null)
				return false;
		} else if (!subjectiveResult.equals(other.subjectiveResult))
			return false;
		if (submitDate == null) {
			if (other.submitDate != null)
				return false;
		} else if (!submitDate.equals(other.submitDate))
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
		return "ParsedResult [studentId=" + studentId + ", paperId=" + paperId + ", teacherId=" + teacherId
				+ ", singlechoiceResult=" + singlechoiceResult + ", multichoiceResult=" + multichoiceResult
				+ ", fillResult=" + fillResult + ", subjectiveResult=" + subjectiveResult + ", submitDate=" + submitDate
				+ ", checked=" + checked + "]";
	}
}
