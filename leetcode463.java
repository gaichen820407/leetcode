public class Solution {
    public int islandPerimeter(int[][] grid) {
		// if the grid is an island and the next grid is an island too, the side between them will minus twice,
		// similarly the grid is an island and the bottom grid is an island too, the side between them will aiso minus twice,
		// but the limit is that index should greater 0, or the array bound will error.
		
        int result=0;
        int length=grid[0].length;
        int height=grid.length;

        for(int i=0;i<height;i++){
            for(int j=0;j<length;j++){
                if(grid[i][j]==1){
                    result+=4;		// is an island, add 4 to result at first
                    if(j>0 && grid[i][j-1]==1) result-=2;	// length index greater 0 then check the grid left to it
                    if(i>0 && grid[i-1][j]==1) result-=2;	// height index greater 0 then check the grid above to it
					//minus twice can avoid too many check on a grid
                }
            }
        }
        return result;
		
		// naive way is check every grid is an island or not, then check the grid around it to change the result,
		// but will get more time complexity
	}
} 
