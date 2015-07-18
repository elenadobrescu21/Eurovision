import java.util.*;

public class VotingCountry {
	private String countryName;
	private Vote v = new Vote();
	private boolean permissionToVote;
	
	public VotingCountry(String name) {
		this.countryName = name;	
	}
	
	public Vote getVote() {
		return v;
	}
	
	public String getVotingCountryName() {
		return this.countryName;
	}
	
	public void setPermissionToVote(ContestEntry contestant) {
		if(contestant.getCountry().equals(this.countryName)) {
			this.permissionToVote = false;
		}
		else {
			this.permissionToVote = true;
		}
	}
	public void vote(List<ContestEntry> participants) {
		for(ContestEntry p : participants) {
			this.setPermissionToVote(p);
		}
		if(permissionToVote == true) {
			v.getPoints(participants);
		}
	}

}
