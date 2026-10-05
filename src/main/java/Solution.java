public class Solution {
    
    public double average(double t1, double t2, double t3, double t4) {
        return (t1 + t2 + t3 + t4) / 4.0;
    }

    public int roundAverage(double average) {
        return (int) Math.round(average);
    }

    public boolean isPassing(int roundedAverage) {   
         if (roundedAverage >= 65) {
             return true;
        } else {
             return false;
         }
    }

    public double totalStock(int shares, double price) {
        return (shares * price);
    }

    public int roundValueChange(double totalStock) {
        return (int) Math.round(totalStock);
    }

    public double adjustDigits(double userDouble) {
        if (userDouble == 999.99) {
            return 0.0;
        }

        int cents = (int) Math.round(userDouble * 100.0);

        int d5 = cents % 10;
        int d4 = (cents / 10) % 10;
        int d3 = (cents / 100) % 10;
        int d2 = (cents / 1000) % 10;
        int d1 = cents / 10000;

        d1 = (d1 + 1) % 10;
        d2 = (d2 + 1) % 10;
        d3 = (d3 + 1) % 10;
        d4 = (d4 + 1) % 10;
        d5 = (d5 + 1) % 10;

        int newCents = (d1 * 10000) + (d2 * 1000) + (d3 * 100) + (d4 * 10) + d5;

        return newCents / 100.0;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.adjustDigits(120.90));
    }
}
