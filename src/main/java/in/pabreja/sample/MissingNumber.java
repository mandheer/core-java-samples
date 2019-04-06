package in.pabreja.sample;

// Java program to find missing Number
public class MissingNumber {

        // Function to ind missing number
        static int getMissingNo (int a[], int n,int d)
        {
            int i, total;
            total = (n+1)*(2*a[0]+n*d)/2;
            for ( i = 0; i< n; i++)
                total -= a[i];
            return total;
        }

        /* program to test above function */
        public static void main(String args[])
        {
//            int a[] = {1,2,4,5,6}; //Arithmetic progression
            int a[] = {2,4,6,10,12}; //Arithmetic progression
            System.out.println(getMissingNo(a,a.length,a[1]-a[0]));
            System.out.println(getMissingNoXOR(a,a.length,2));

            // A binary search based program
            // to find the only missing number
            // in a sorted array of distinct
            // elements within limited range.
            int ar[] = { 1, 2, 3, 4, 5, 6, 8 };
            System.out.println("Missing number: " +
                    search(ar, ar.length));
        }

    // A binary search based program
    // to find the only missing number
    // in a sorted array of distinct
    // elements within limited range.
    static int search(int ar[],
                      int size)
    {
        int a = 0, b = size - 1;
        int mid = 0;
        while ((b - a) > 1)
        {
            mid = (a + b) / 2;
            if ((ar[a] - a) != (ar[mid] - mid))
                b = mid;
            else if ((ar[b] - b) != (ar[mid] - mid))
                a = mid;
        }
        return (ar[mid] + 1);
    }

    // Function to find missing number using XOR
    static int getMissingNoXOR (int a[], int n, int d)
    {
        int x1 = a[0];
        int x2 = a[0];

        /* For xor of all the elements
           in array */
        for (int i = 1; i < n; i++)
            x1 = x1 ^ a[i];

        /* For xor of all the elements
           from 1 to n+1 */
        for (int i = 1; i <= n; i++)//n+1 elements so N+1th element would be a+nd as
            x2 = x2 ^ (a[0] + i*d);

        return (x1 ^ x2);
    }

}
