package mock02.model;

import java.sql.Blob;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Score generated by hbm2java
 */
@Entity
@Table(name = "score", catalog = "hoctructuyen")
public class Score implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Integer idScore;
	private Assignment assignment;
	private Member member;
	private int score;
	private String answer;
	private String attachFileName; 
	private Blob attachFile;
	private String comment;
	private Date timeStore;
	private int countUpdate;

	public Score() {
	}

	public Score(Assignment assignment, Member member, int score, Date timeStore) {
		this.assignment = assignment;
		this.member = member;
		this.score = score;
		this.timeStore = timeStore;
	}

	public Score(Assignment assignment, Member member, int score, String answer, String comment,
			Date timeStore) {
		this.assignment = assignment;
		this.member = member;
		this.score = score;
		this.answer = answer;
		this.comment = comment;
		this.timeStore = timeStore;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "idscore", unique = true, nullable = false)
	public Integer getIdScore() {
		return this.idScore;
	}

	public void setIdScore(Integer idScore) {
		this.idScore = idScore;
	}

	@ManyToOne
	@JoinColumn(name = "idassignment")
	public Assignment getAssignment() {
		return this.assignment;
	}

	public void setAssignment(Assignment assignment) {
		this.assignment = assignment;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idmember", nullable = false)
	public Member getMember() {
		return this.member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

	@Column(name = "score", nullable = false)
	public int getScore() {
		return this.score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Column(name = "answer", length = 7000)
	public String getAnswer() {
		return this.answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	@Column(name = "comment", length = 1000)
	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "timestore", nullable = false, length = 0)
	public Date getTimeStore() {
		return this.timeStore;
	}

	public void setTimeStore(Date timeStore) {
		this.timeStore = timeStore;
	}

	@Column(name = "attachfilename")
	public String getAttachFileName() {
		return attachFileName;
	}

	public void setAttachFileName(String attachFileName) {
		this.attachFileName = attachFileName;
	}

	@Column(name = "attachfile")
	public Blob getAttachFile() {
		return attachFile;
	}

	public void setAttachFile(Blob attachFile) {
		this.attachFile = attachFile;
	}

	@Column(name = "countupdate")
	public int getCountUpdate() {
		return countUpdate;
	}

	public void setCountUpdate(int countUpdate) {
		this.countUpdate = countUpdate;
	}

}
