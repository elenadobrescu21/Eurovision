import java.util.*;


public class EurovisionContest {

	public static void main(String[] args) {
		
		List<ContestEntry> participants = new ArrayList<ContestEntry>();
		
		participants.add(new ContestEntry("Romania"));
		participants.add(new ContestEntry("Germania"));
		participants.add(new ContestEntry("Anglia"));
		participants.add(new ContestEntry("Italia"));
		participants.add(new ContestEntry("Spania"));
		participants.add(new ContestEntry("Franta"));
		participants.add(new ContestEntry("Serbia"));
		participants.add(new ContestEntry("Austria"));
		participants.add(new ContestEntry("Irlanda"));
		participants.add(new ContestEntry("Moldova"));
		participants.add(new ContestEntry("Bulgaria"));
		participants.add(new ContestEntry("Grecia"));
		participants.add(new ContestEntry("Finlanda"));
		participants.add(new ContestEntry("Norvegia"));
		participants.add(new ContestEntry("Lituania"));
		participants.add(new ContestEntry("Albania"));
		
	
		List<VotingCountry> voters = new ArrayList<VotingCountry>();
		voters.add(new VotingCountry("Finlanda"));
		voters.add(new VotingCountry("Estonia"));
		voters.add(new VotingCountry("Israel"));
		voters.add(new VotingCountry("Grecia"));
		voters.add(new VotingCountry("Romania"));
		voters.add(new VotingCountry("Austria"));
		voters.add(new VotingCountry("Serbia"));
		voters.add(new VotingCountry("Lituania"));
		voters.add(new VotingCountry("Norvegia"));
		voters.add(new VotingCountry("Spania"));
		voters.add(new VotingCountry("Moldova"));
		voters.add(new VotingCountry("Italia"));
		voters.add(new VotingCountry("Irlanda"));
		voters.add(new VotingCountry("Slovenia"));
		
		for(VotingCountry v: voters) {
			v.getVote().getPoints(participants);
		}
		
		
		
		Collections.sort(participants,new Comparator<ContestEntry>() {
			@Override 
			public int compare(ContestEntry c1, ContestEntry c2) {
				// TODO Auto-generated method stub
				return (int)(c2.getFinalScore()-c1.getFinalScore());
				} 
			});
		
		System.out.println("Clasamentul final:");
		for(ContestEntry c: participants) {
			System.out.println("Tara: " + c.getCountry() + ", punctaj: " + c.getFinalScore());
		}
		

	}

}
