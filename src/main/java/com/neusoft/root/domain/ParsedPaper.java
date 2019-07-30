package com.neusoft.root.domain;

import java.util.List;

//解析后的试卷
public class ParsedPaper 
{
	private Integer paperId; //试卷ID，唯一
	private String paperName; //试卷名称，唯一
	private String createrId; //创造者ID
	private String createDate; //创造日期
	private String paperType; //试卷科目类型，例如JAVA, C++
	private Double paperIndex; //试卷难度,由题目平均难度决定
	private List<ParsedItem> singlechoiceQuestion;  // 选择题,格式为:ID1,分数1# ID2,分数2#
	private List<ParsedItem> multichoiceQuestion;  // 选择题,格式为:ID1,分数1# ID2,分数2#
	private List<ParsedItem> fillQuestion; //填空题,格式为ID1,分数1# ID2,分数2#
	private List<ParsedItem> subjectiveQuestion; //主观题格式为ID1,分数1# ID2,分数2#
	private Double paperScore; //试卷总分 
	private String paperSecrecy; //试卷保密级别，二值性：保密，公开
	private String paperRemark; // 试卷备注
	public ParsedPaper(Integer paperId, String paperName, String createrId, String createDate, String paperType,
			Double paperIndex, List<ParsedItem> singlechoiceQuestion, List<ParsedItem> multichoiceQuestion,
			List<ParsedItem> fillQuestion, List<ParsedItem> subjectiveQuestion, Double paperScore, String paperSecrecy,
			String paperRemark) {
		super();
		this.paperId = paperId;
		this.paperName = paperName;
		this.createrId = createrId;
		this.createDate = createDate;
		this.paperType = paperType;
		this.paperIndex = paperIndex;
		this.singlechoiceQuestion = singlechoiceQuestion;
		this.multichoiceQuestion = multichoiceQuestion;
		this.fillQuestion = fillQuestion;
		this.subjectiveQuestion = subjectiveQuestion;
		this.paperScore = paperScore;
		this.paperSecrecy = paperSecrecy;
		this.paperRemark = paperRemark;
	}
	public ParsedPaper() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getPaperId() {
		return paperId;
	}
	public void setPaperId(Integer paperId) {
		this.paperId = paperId;
	}
	public String getPaperName() {
		return paperName;
	}
	public void setPaperName(String paperName) {
		this.paperName = paperName;
	}
	public String getCreaterId() {
		return createrId;
	}
	public void setCreaterId(String createrId) {
		this.createrId = createrId;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	public String getPaperType() {
		return paperType;
	}
	public void setPaperType(String paperType) {
		this.paperType = paperType;
	}
	public Double getPaperIndex() {
		return paperIndex;
	}
	public void setPaperIndex(Double paperIndex) {
		this.paperIndex = paperIndex;
	}
	public List<ParsedItem> getSinglechoiceQuestion() {
		return singlechoiceQuestion;
	}
	public void setSinglechoiceQuestion(List<ParsedItem> singlechoiceQuestion) {
		this.singlechoiceQuestion = singlechoiceQuestion;
	}
	public List<ParsedItem> getMultichoiceQuestion() {
		return multichoiceQuestion;
	}
	public void setMultichoiceQuestion(List<ParsedItem> multichoiceQuestion) {
		this.multichoiceQuestion = multichoiceQuestion;
	}
	public List<ParsedItem> getFillQuestion() {
		return fillQuestion;
	}
	public void setFillQuestion(List<ParsedItem> fillQuestion) {
		this.fillQuestion = fillQuestion;
	}
	public List<ParsedItem> getSubjectiveQuestion() {
		return subjectiveQuestion;
	}
	public void setSubjectiveQuestion(List<ParsedItem> subjectiveQuestion) {
		this.subjectiveQuestion = subjectiveQuestion;
	}
	public Double getPaperScore() {
		return paperScore;
	}
	public void setPaperScore(Double paperScore) {
		this.paperScore = paperScore;
	}
	public String getPaperSecrecy() {
		return paperSecrecy;
	}
	public void setPaperSecrecy(String paperSecrecy) {
		this.paperSecrecy = paperSecrecy;
	}
	public String getPaperRemark() {
		return paperRemark;
	}
	public void setPaperRemark(String paperRemark) {
		this.paperRemark = paperRemark;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((createDate == null) ? 0 : createDate.hashCode());
		result = prime * result + ((createrId == null) ? 0 : createrId.hashCode());
		result = prime * result + ((fillQuestion == null) ? 0 : fillQuestion.hashCode());
		result = prime * result + ((multichoiceQuestion == null) ? 0 : multichoiceQuestion.hashCode());
		result = prime * result + ((paperId == null) ? 0 : paperId.hashCode());
		result = prime * result + ((paperIndex == null) ? 0 : paperIndex.hashCode());
		result = prime * result + ((paperName == null) ? 0 : paperName.hashCode());
		result = prime * result + ((paperRemark == null) ? 0 : paperRemark.hashCode());
		result = prime * result + ((paperScore == null) ? 0 : paperScore.hashCode());
		result = prime * result + ((paperSecrecy == null) ? 0 : paperSecrecy.hashCode());
		result = prime * result + ((paperType == null) ? 0 : paperType.hashCode());
		result = prime * result + ((singlechoiceQuestion == null) ? 0 : singlechoiceQuestion.hashCode());
		result = prime * result + ((subjectiveQuestion == null) ? 0 : subjectiveQuestion.hashCode());
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
		ParsedPaper other = (ParsedPaper) obj;
		if (createDate == null) {
			if (other.createDate != null)
				return false;
		} else if (!createDate.equals(other.createDate))
			return false;
		if (createrId == null) {
			if (other.createrId != null)
				return false;
		} else if (!createrId.equals(other.createrId))
			return false;
		if (fillQuestion == null) {
			if (other.fillQuestion != null)
				return false;
		} else if (!fillQuestion.equals(other.fillQuestion))
			return false;
		if (multichoiceQuestion == null) {
			if (other.multichoiceQuestion != null)
				return false;
		} else if (!multichoiceQuestion.equals(other.multichoiceQuestion))
			return false;
		if (paperId == null) {
			if (other.paperId != null)
				return false;
		} else if (!paperId.equals(other.paperId))
			return false;
		if (paperIndex == null) {
			if (other.paperIndex != null)
				return false;
		} else if (!paperIndex.equals(other.paperIndex))
			return false;
		if (paperName == null) {
			if (other.paperName != null)
				return false;
		} else if (!paperName.equals(other.paperName))
			return false;
		if (paperRemark == null) {
			if (other.paperRemark != null)
				return false;
		} else if (!paperRemark.equals(other.paperRemark))
			return false;
		if (paperScore == null) {
			if (other.paperScore != null)
				return false;
		} else if (!paperScore.equals(other.paperScore))
			return false;
		if (paperSecrecy == null) {
			if (other.paperSecrecy != null)
				return false;
		} else if (!paperSecrecy.equals(other.paperSecrecy))
			return false;
		if (paperType == null) {
			if (other.paperType != null)
				return false;
		} else if (!paperType.equals(other.paperType))
			return false;
		if (singlechoiceQuestion == null) {
			if (other.singlechoiceQuestion != null)
				return false;
		} else if (!singlechoiceQuestion.equals(other.singlechoiceQuestion))
			return false;
		if (subjectiveQuestion == null) {
			if (other.subjectiveQuestion != null)
				return false;
		} else if (!subjectiveQuestion.equals(other.subjectiveQuestion))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "ParsedPaper [paperId=" + paperId + ", paperName=" + paperName + ", createrId=" + createrId
				+ ", createDate=" + createDate + ", paperType=" + paperType + ", paperIndex=" + paperIndex
				+ ", singlechoiceQuestion=" + singlechoiceQuestion + ", multichoiceQuestion=" + multichoiceQuestion
				+ ", fillQuestion=" + fillQuestion + ", subjectiveQuestion=" + subjectiveQuestion + ", paperScore="
				+ paperScore + ", paperSecrecy=" + paperSecrecy + ", paperRemark=" + paperRemark + "]";
	}
}
