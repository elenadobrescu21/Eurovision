
public class ContestEntry {
	
	private String country;
	//private String artistName;
	//private String songName;
	private int finalScore;
	private float intermediateScore;

	
	public ContestEntry(String country) {
	
		this.country = country;
		//this.artistName = artistName;
		//this.songName = songName;
		this.finalScore = 0;
		this.intermediateScore = 0;
		
	}
	
	public String getCountry() {
		return country;
	}


	/*public String getArtistName() {
		return artistName;
	}
	*/

	/*public String getSongName() {
		return songName;
	}*/

	public float getIntermediateScore() {
		return this.intermediateScore;
	}
	
	public void setIntermediateScore(float score) {
		this.intermediateScore = score;
		
	}
	
	public void addPointsToFinalScore(int points) {
		this.finalScore = this.finalScore + points;
	}
	
	public int getFinalScore(){
		return this.finalScore;
	}
	
	public void setIntermediateScoreToZero(){
		this.intermediateScore = 0;
	}

	

}
