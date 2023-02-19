package com.example.source_dsa.Patterns.String.easy;

/**
 * @Author : ArbindSharma
 * @Date : 02-11-2022
 **/
public class Number_of_Strings_That_Appear_as_Substrings_in_Word {
    public static void main(String[] args) {

        String[] pattern = {"a", "a", "a"};
        String subString = "ab";

        /*int count=0;
        for (String patternWord : pattern) {
            if(subString.contains(patternWord)){
                count++;
            }
        }
        System.out.println(count);*/


        int count = 0;

     /*   for (String p : pattern) {
            if (findsubstring(subString, p)) {
                count++;
            }
        }*/
      //  System.out.println(count);

        System.out.println(findsubstring("aaaba         aaaba  aab a      aaabaa aaba     aaaba      aaaba","aaaba"));
    }

    private static int findsubstring(String mainString, String subString) {
        int n = mainString.length(), m = subString.length();
        int max = 0;
        for(int i = 0;i < n;i++) {
            int cnt = 0, k = 0;
            for(int j = i;j < n;j++) {
                if(mainString.charAt(j) == subString.charAt(k)) k++;
                else break;
                if(k == m) {
                    k = 0;
                    cnt++;
                }
            }
            //for covering cover cases
            max = Math.max(max, cnt);
        }
        return max;
    }
}
