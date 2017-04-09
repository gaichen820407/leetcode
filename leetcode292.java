public class Solution {
    public boolean canWinNim(int n) {
        // under the premise that both of you are very clever and have optimal strategies for the game,
        // we can not except the opponent will take the stone with no thought,
        // so the turn of player who faces the multiple of 4 will become the key for the solution
		// 1,2,3->win 4->lose 5,6,7->win 8->lose
		// but the result will base on the clever and optimal strategies for the game,
		// if not, the situation will become more complex
        return (n % 4 != 0);
    }
}
