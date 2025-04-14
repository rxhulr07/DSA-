// Knuth–Morris–Pratt

class Solution {
    public int strStr(String haystack, String needle) {
        // Edge case: empty needle should return 0
        if (needle.isEmpty()) return 0;

        // Step 1: Build the LPS (Longest Prefix Suffix) array
        int[] lps = buildLPS(needle);

        int i = 0; // Pointer for haystack
        int j = 0; // Pointer for needle

        // Step 2: Start comparing characters
        while (i < haystack.length()) {
            if (haystack.charAt(i) == needle.charAt(j)) {
                // If characters match, move both pointers
                i++;
                j++;

                // If we’ve matched the whole needle, return the starting index
                if (j == needle.length()) {
                    return i - j;
                }
            } else {
                // If mismatch happens after some matches
                if (j != 0) {
                    // Use the LPS array to skip rechecking characters
                    j = lps[j - 1];
                } else {
                    // If no match yet, move haystack pointer forward
                    i++;
                }
            }
        }

        // If no match found
        return -1;
    }

    // Helper function to build LPS array for the needle
    private int[] buildLPS(String needle) {
        int[] lps = new int[needle.length()];
        int len = 0; // Length of the previous longest prefix-suffix
        int i = 1;   // We start from index 1 (first char always has LPS = 0)

        while (i < needle.length()) {
            if (needle.charAt(i) == needle.charAt(len)) {
                // Found a matching prefix and suffix
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    // Fallback: try the previous
