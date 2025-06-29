import java.util.Arrays;

public class SecondLargestElement{

    public static int getSecLarge(int l[]) {
        int n = l.length;
        Arrays.sort(l);
        for (int u = n - 2; u >= 0; u--) {
            if (l[u] != l[n - 1]) {
                return l[u];
            }
        }
        return -1; // Return -1 if no second largest element exists
    }

    public static void main(String args[]){

        int arr[]= {1,8,5,6,9,9};
        int f = getSecLarge(arr);
        System.out.println(f);
    }

}
