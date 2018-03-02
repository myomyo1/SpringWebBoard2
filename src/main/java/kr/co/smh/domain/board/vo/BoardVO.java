package kr.co.smh.domain.board.vo;

public class BoardVO {
	private String bidx;
	private String title;
	private String contents;
	private String userid;
	private String writedate;
	private String modifydate;
	private String hitcnt;
	public String getBidx() {
		return bidx;
	}
	public void setBidx(String bidx) {
		this.bidx = bidx;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getWritedate() {
		return writedate;
	}
	public void setWritedate(String writedate) {
		this.writedate = writedate;
	}
	public String getModifydate() {
		return modifydate;
	}
	public void setModifydate(String modifydate) {
		this.modifydate = modifydate;
	}
	public String getHitcnt() {
		return hitcnt;
	}
	public void setHitcnt(String hitcnt) {
		this.hitcnt = hitcnt;
	}
	
	
	
}
