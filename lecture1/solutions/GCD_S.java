class Solution {
 public String gcdOfStrings(String str1, String str2) {
        int myGcd = gcd(str1.length(), str2.length());
        String myAns = str1.substring(0, myGcd);
        boolean good = true;

        int x = 0;
        while (x < str1.length()) {
            if (!str1.substring(x, x + myGcd).equals(myAns)) {
                good = false;
                break;
            }
            x += myGcd;
        }

        x = 0;
        while (x < str2.length()) {
            if (!str2.substring(x, x + myGcd).equals(myAns)) {
                good = false;
                break;
            }
            x += myGcd;
        }

        if (good) {
            return myAns;
        } else {
            return "";
        }
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}