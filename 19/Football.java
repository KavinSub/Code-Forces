import java.util.*;

public class Football{
	public static void main(String[] args){
		// Read input
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		// Read in teams
		Hashtable table = new Hashtable();
		for(int i = 0; i < n; i++){
			String t = scan.next();
			table.put(t, new Team(t, 0, 0, 0));
		}

		// Now read in the scores
		int games = (n * (n - 1))/2;
		for(int i = 0; i < games; i++){
			String[] t = scan.next().split("-");
			Team t1 = (Team) table.get(t[0]);
			Team t2 = (Team) table.get(t[1]);

			String[] s = scan.next().split(":");
			int s1 = Integer.parseInt(s[0]);
			int s2 = Integer.parseInt(s[1]);
			
			t1.goals += s1;
			t2.goals += s2;
			t1.missedGoals += s2;
			t2.missedGoals += s1;

			if(s1 == s2){
				t1.score += 1;
				t2.score += 1;
			}else{
				if(s1 > s2){
					t1.score += 3;
				}else{
					t2.score += 3;
				}
			}

			table.put(t[0], t1);
			table.put(t[1], t2);
		}

		// Now sort the teams array
		Collection<Team> c = table.values();
		Team[] teams = c.toArray(new Team[0]);
		Arrays.sort(teams);
		String[] winners = new String[n/2];
		for(int i = 0; i < winners.length; i++) winners[i] = teams[i].name;
		Arrays.sort(winners);
		for(int i = 0; i < winners.length; i++) System.out.println(winners[i]);
	}
}

class Team implements Comparable<Team>{
	String name;
	int score;
	int goals;
	int missedGoals;

	Team(String name, int score, int goals, int missedGoals){
		this.name = name;
		this.score = score;
		this.goals = goals;
		this.missedGoals = missedGoals;
	}

	public String toString(){
		return String.format("Team %s. Score: %d, goals - missed: %d - %d", this.name, this.score, this.goals, this.missedGoals);
	}

	public int compareTo(Team o){
		if(this.score == o.score){
			if(this.goals - this.missedGoals == o.goals - o.missedGoals){
				return o.goals - this.goals;
			}else{
				return (o.goals - o.missedGoals) - (this.goals - this.missedGoals);
			}
		}else{
			return o.score - this.score;
		}
	}
}