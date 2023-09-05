package ey.com.MovieRecords;

public class Records {
	private String actor;
	private String genre;
	private String title;

	public Records(String actor, String genre, String title) {
		super();
		this.actor = actor;
		this.genre = genre;
		this.title = title;
	}

	public Records() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Records [actor=" + actor + ", genre=" + genre + ", title=" + title + "]";
	}

	public String getActor() {
		return actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}