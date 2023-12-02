class Solution {
    public int[][] largestLocal(int[][] grid) {
        int n = grid[0].length;
        int[][] res = new int[n-2][n-2];
        int max = 0;
        int ib = 0;
        int jb = 0;
        for(int i = 0 ; i < n-2 ; i++){
            for(int j = 0 ; j < n-2 ; j++){
                max = 0;
                ib = i + 3;
                jb = j + 3;

                for(int x = i ; x < ib ; x++){
                    for(int y = j ; y < jb ; y++){
                        max = Math.max(max , grid[x][y]);
                    }
                }
                res[i][j] = max;
            }
        }

        return res;
        
    }
}
