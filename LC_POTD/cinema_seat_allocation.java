package LC_POTD;
import java.util.*;
// Leetcode 1386
public class cinema_seat_allocation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n2 = sc.nextInt();
        int[][] rows = new int[n2][2];
        for(int i=0;i<n2;i++) {
            rows[i][0] = sc.nextInt();
            rows[i][1] = sc.nextInt();
        }
        int ans = maxNumberOfFamilies(n,rows);
        System.out.println(ans);
        sc.close();

    }
     public static int maxNumberOfFamilies(int k, int[][] reservedSeats) {
        Arrays.sort(reservedSeats, (a, b) -> Integer.compare(a[0], b[0]));
        int n = reservedSeats.length;
        int nrows = 0;
        int i = 0;
        int ans = 0;
        while(i<n) {
            int count = i;
            int temp = reservedSeats[i][0];
            while((count+1<n) && reservedSeats[count+1][0]==temp) {
                count++;
            }
            nrows++;
            int[] rows = new int[11];
            while(i<=count) {
                rows[reservedSeats[i][1]]++;
                i++;
            }
            boolean one = check(rows,2);
            boolean two = check(rows,4);
            boolean three = check(rows,6);
            if (one && three) {
            ans += 2;
            }
            else if (one || two || three) {
            ans += 1;
            }
            i = count+1;
        }
        ans+=(k-nrows)*2;
        return ans;
    }
     static boolean check(int[] row,int idx) {
        for(int i=idx;i<=idx+3;i++) {
            if(row[i]==1) return false;
        }
        return true;
    }
}
