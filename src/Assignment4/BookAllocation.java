package Assignment4;

import java.util.Scanner;

public class BookAllocation {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        int t = input.nextInt();
        while(t-->0){
            int n = input.nextInt();
            int nos = input.nextInt();
            int[] pages = new int[n];
            for (int i = 0; i < n; i++) {
                pages[i] = input.nextInt();
            }
            System.out.println(MinPages(pages, nos));
        }
    }
    public static int MinPages(int[] pages, int nos){
        int start = 0;
        int end = 0;
        int ans = 0;
        for (int i = 0; i < pages.length; i++) {
            end+=pages[i];
        }
        while(end>=start){
            int mid = start+(end-start)/2;
            if(isitpossible(pages, nos, mid)){
                ans = mid;
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return ans;
    }

    public static boolean isitpossible(int[] pages, int nos, int mid) {
        int students = 1;
        int books = 0;
        for (int i = 0; i < pages.length;) {
            if(books+pages[i]<=mid){
                books+=pages[i];
                i++;
            }else{
                books = 0;
                students++;
            }
            if(students>nos){
                return false;
            }
        }
        return true;
    }
}
