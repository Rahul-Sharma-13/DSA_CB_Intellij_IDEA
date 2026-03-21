package Lecture19;

import java.util.Scanner;

//https://codeskiller.codingblocks.com/problems/535
public class RatChasesItsCheeze {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        char[][] maze = new char[n][m];
        for (int i = 0; i < maze.length; i++) {
            String s = input.next();
            for (int j = 0; j < maze[0].length; j++) {
                maze[i][j] = s.charAt(j);
            }
        }
        int[][] ans = new int[n][m];
        print(maze, 0, 0, ans);
        if (ans[ans.length - 1][ans[0].length - 1] == 0) {
            System.out.println("NO PATH FOUND");
        }
    }

    public static void print(char[][] maze, int cr, int cc, int[][] ans) {
        if (cr < 0 || cc < 0 || cr >= maze.length || cc >= maze[0].length || maze[cr][cc] == 'X') {
            return;
        }
        if (cr == maze.length - 1 && cc == maze[0].length - 1) {
            ans[cr][cc] = 1;
            Display(ans);
            return;
        }
        maze[cr][cc] = 'X';
        ans[cr][cc] = 1;
        int[] row = {-1, 0, 1, 0};
        int[] col = {0, -1, 0, 1};
        for (int i = 0; i < col.length; i++) {
            print(maze, cr + row[i], cc + col[i], ans);
        }
//        print(maze, cr-1, cc, ans);//up
//        print(maze, cr, cc-1, ans);//left
//        print(maze, cr+1, cc, ans);//down
//        print(maze, cr, cc+1, ans);//right
        maze[cr][cc] = 'O';
        ans[cr][cc] = 0;
    }

    public static void Display(int[][] ans) {
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
}
