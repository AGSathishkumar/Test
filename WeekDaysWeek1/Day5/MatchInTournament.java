package w1Assignmets;

import org.junit.Test;

public class MatchInTournament {
	@Test
	public void posMatches() {
		int N = 9;
		int out;
		out = noOfMatches(N);
		System.out.println(out);
		}
	@Test
	public void negMatches() {
		int N = 1;
		int out;
		out = noOfMatches(N);
		System.out.println(out);
		}
	@Test
	public void edgeMatches() {
		int N = -8;
		int out;
		out = noOfMatches(N);
		System.out.println(out);
		}


	private int noOfMatches(int n) {
		int matches = 0;
		if (n == 1) {
			return 0;
		} else {
			while (n > 1) {
				if (n % 2 == 0) {
					matches = matches + n / 2;
					n = n / 2;
				} else {
					matches = matches + ((n - 1) / 2);
					n = (n - 1) / 2 + 1;
				}				
			}
			return matches;
		}
	}
}