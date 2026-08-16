class Solution {
    public String addBinary(String a, String b) {
        int n1 = a.length() - 1;
        int n2 = b.length() - 1;
        int carry = 0;
        StringBuilder ans = new StringBuilder();

        if (n1 > n2) {
            b = addzeroes(b, (n1 - n2));
            n2 = b.length() - 1;
        } else if (n1 < n2) {
            a = addzeroes(a, (n2 - n1));
            n1 = a.length() - 1;
        }

        while (n1 >= 0 && n2 >= 0) {
            int bitA = a.charAt(n1) - '0';
            int bitB = b.charAt(n2) - '0';
            int sum = bitA + bitB + carry;

            char digit = (sum % 2 == 0) ? '0' : '1';
            carry = sum / 2;

            ans.append(digit);

            n1--;
            n2--;
        }

        if (carry == 1) {
            ans.append('1');
        }

        return ans.reverse().toString();
    }
    public String addzeroes(String smaller, int numofzero){
    String zeros = "0".repeat(numofzero);
    return zeros + smaller;
}
}