
public class Film extends Object {
	
	private String filmName;
	private String directorName;
	private int releaseYear; 
	
	public Film() {
		super();
		filmName = "";
		directorName = "";
		releaseYear = 0; 
	}
	
	public Film(String filmName) {
		super();
		this.filmName = filmName; 
		directorName = "";
		releaseYear = 0;
	}
	
	public Film(String filmName, String directorName) {
		super(); 
		this.filmName = filmName;
		this.directorName = directorName;
		releaseYear = 0; 
	}
	
	public void setFilmName(String filmName) {
		this.filmName = filmName; 
	}
	
	public String getFilmName() {
		return filmName; 
	}
	
	public void setDirector(String directorName) {
		this.directorName = directorName; 
	}
	
	public String getDirectorName() {
		return directorName; 
	}
	
	public void setReleaseDate(int releaseYear) {
		int currentYear = 2024; 
		if (releaseYear > 1890 && releaseYear < currentYear) {
			this.releaseYear = releaseYear; 
		}
		
	}
	
	public int getReleaseYear() {
		return releaseYear; 
	}
	
	@Override
	public String toString() {
		return "Film name: " + filmName + " Director Name: " + directorName + " Release Year: " + releaseYear; 
	}
	
	@Override
	public boolean equals(Object otherObject) {
		boolean areTheyEqual = false; 
		if(otherObject != null && otherObject instanceof Film) {
			Film secondFilm = (Film) otherObject; 
			if (this.filmName.equals(secondFilm.getFilmName()) && this.directorName.equals(secondFilm.getDirectorName()) && this.releaseYear == secondFilm.releaseYear ){
				areTheyEqual = true; 
			} 
		} return areTheyEqual; 
	} 
}
