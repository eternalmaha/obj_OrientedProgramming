public class ForeignFilm extends Film {

	//instance variables 
	private String language; 
	private String englishTranslation; 
	private String[] subtitleList; 
	private int numOfSubtitles; 
	
	//static variables
	private static int maxNumOfSubtitles = 10; 
	
	//default constructor 
	public ForeignFilm() {
		super(); 
		language = "";
		englishTranslation = "";
		subtitleList = new String[10];
		numOfSubtitles = 0; 
	}
	
	//overloaded constructors?
	
	//static methods
	public static void setMaxNumOfSubtitles(int newMaxNumOfSubtitles) {
		ForeignFilm.maxNumOfSubtitles = newMaxNumOfSubtitles; 
	}
	
	public static int getMaxNumOfSubtitles() {
		return maxNumOfSubtitles; 
	}
	
	//non-static methods
	public void setLanguage(String language) {
		this.language = language; 
	}
	
	public String getLanguage() {
		return language; 
	}
	
	public void setEnglishTranslation(String englishTranslation) {
		this.englishTranslation = englishTranslation; 
	}
	
	public String getEnglishTranslation() {
		return englishTranslation; 
	}
	
	public void addSubtitle(String subtitle) {
		if (numOfSubtitles < maxNumOfSubtitles && numOfSubtitles < subtitleList.length) {
			subtitleList[numOfSubtitles] = subtitle; 
			numOfSubtitles++; 
			
		}
	}
	
	public String getSubtitles() {
		String subtitles = "";
		for(int i = 0; i < numOfSubtitles; i++) {
			subtitles+= "\n" + subtitleList[i] ; 
		}
		return subtitles; 
	}
	
	@Override
	public String toString() {
		return super.toString() + " Language: " + getLanguage() + " English Translation: " + getEnglishTranslation() + getSubtitles();  
	}
	
	/*@Override
	public boolean equals(Object otherObject) {
		boolean areTheyEqual = false;
		if (otherObject != null && otherObject instanceof ForeignFilm) {
			ForeignFilm secondForeignFilm = (ForeignFilm) otherObject; 
			if (super.equals(secondForeignFilm)) {
				areTheyEqual = true;
			}
		} return areTheyEqual; 
	}
	*/
}

