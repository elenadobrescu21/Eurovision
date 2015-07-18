import java.util.*;


public class Vote {
	
	private static final int[] points = new int[] {1,2,3,4,5,6,7,8,10,12};
	private static final Random rand = new Random();
	
	public void getPoints(List<ContestEntry> participants) {
		
		for(ContestEntry p : participants) {
			int sum = 0;
			int[] votes = new int[5];
			for(int i = 0; i < votes.length; i++) {
				votes[i] = points[rand.nextInt(10)];
				sum = sum + votes[i];
			}
			float media = sum/5;
			p.setIntermediateScore(media);
		}
		Collections.sort(participants,new Comparator<ContestEntry>() {
			@Override 
			public int compare(ContestEntry c1, ContestEntry c2) {
				// TODO Auto-generated method stub
				return (int)(c1.getIntermediateScore()-c2.getIntermediateScore());
				} 
			});
		for(int i = 0; i < points.length; i++) {
			
			participants.get(i).addPointsToFinalScore(points[i]);
		}
		
		for(ContestEntry p : participants) {
			p.setIntermediateScoreToZero();
		}
		
		
	}
	

}
