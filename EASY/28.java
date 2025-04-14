class Solution {
    public int strStr(String haystack, String needle) {
    if (needle.length() == 0) return 0;

    for (int i = 0; i <= haystack.length() - needle.length(); i++) {
        int j = 0;
        int temp = i;

        while (j < needle.length() && haystack.charAt(temp) == needle.charAt(j)) {
            temp++;
            j++;
        }

        if (j == needle.length()) {
            return i; 
        }
    }

    return -1; 
}

}