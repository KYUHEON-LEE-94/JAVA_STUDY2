package dto;

public class Dto {
	
	private String title, date, mon, aud, thet;
	private int rank;
	
	
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getMon() {
		return mon;
	}
	public void setMon(String mon) {
		this.mon = mon;
	}
	public String getAud() {
		return aud;
	}
	public void setAud(String aud) {
		this.aud = aud;
	}
	public String getThet() {
		return thet;
	}
	public void setThet(String thet) {
		this.thet = thet;
	}
	
	
	public Dto(int rank, String title, String date, String mon, String aud, String thet) {
	
		this.rank = rank;
		this.title = title;
		this.date = date;
		this.mon = mon;
		this.aud = aud;
		this.thet = thet;
	}
	public Dto() {
		
	}
	
	
	
	
	
}
	
	
	
	
	
	
	
	
