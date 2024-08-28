package leetcode.Graph;

public class leetcode200 {
    public static void main(String[] args){
        char[][] grid = {{'1','1','1','1','0'},
        {'1','1','0','1','0'},
        {'1','1','0','0','0'},
        {'0','0','0','0','0'}};
        System.out.println(numIslands(grid));
    }

    public static int numIslands(char[][] grid) {
        int res =0;
        int m  =grid.length;
        int n = grid[0].length;
        for (int y = 0; y< m;y++){
            for (int x = 0; x< n;x++){
                if (grid[y][x] == '1'){
                    res++;
                    infect(grid, x , y);
                }
            }
        }
        return res;
    }
    public static void infect(char[][] grid, int x , int y){
        int m = grid.length , n = grid[0].length;
        if (x < 0 || x>=n){
            return ;
        }
        if (y < 0 || y >= m ){
            return ;
        }
        if (grid[y][x] == '1'){
            grid[y][x] ='.';
        } else {
            return ;
        }
        infect(grid,x + 1,y);
        infect(grid,x - 1,y);
        infect(grid,x,y + 1);
        infect(grid,x,y - 1);
    }
}
