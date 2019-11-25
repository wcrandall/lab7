import java.util.Arrays;

public class LongestCommonSubstringFunctions {

    // the brute force algorithm for finding the longest common substring
    public static LongestCommonSubstringReturnHold longestCommonSubstringBrute(String stringOne, String stringTwo)
    {
        int lengthStringOne = stringOne.length() - 1;
        int lengthStringTwo = stringTwo.length() - 1;
        int longestCommonSubstring = 0;
        int longestCommonSubstringStartStringOne = 0;
        int longestCommonSubstringStartStringTwo = 0;
        for(int i = 0; i <= lengthStringOne; i++)
        {
            for (int j = 0; j <= lengthStringTwo; j++)
            {
                int smallOne = Math.min(lengthStringOne-i,lengthStringTwo-j);
                for (int k = 0; k <= smallOne; k++)
                {
                    if (stringOne.charAt(i + k)!= stringTwo.charAt(j+k))
                    {
                        break;
                    }

                    if (k >= longestCommonSubstring)
                    {
                        longestCommonSubstring = k + 1;
                        longestCommonSubstringStartStringOne = i;
                        longestCommonSubstringStartStringTwo = j;
                    }
                }
            }
        }
        System.out.println(stringOne.substring(longestCommonSubstringStartStringOne, longestCommonSubstringStartStringOne + longestCommonSubstring));

        return new LongestCommonSubstringReturnHold(longestCommonSubstring, longestCommonSubstringStartStringOne, longestCommonSubstringStartStringTwo);
    }

    // finds the longest common substring but quicker
    // pseudocode https://en.wikipedia.org/wiki/Longest_common_substring_problem
    public static LongestCommonSubstringReturnHold longestCommonSubstring(String stringOne, String stringTwo)
    {

        int maxLength = 0;
        // by default the ending index is the end of stringOne because this is the string we
        // pull the substring out of at the end
        int endingIndex  = stringOne.length();

        int[][] lookUp = new int[stringOne.length() + 1][stringTwo.length() +1];

        // searching for longest common substring by comparing character by character
        for(int i = 1; i <= stringOne.length(); i++)
        {
            for(int j = 1; j <= stringTwo.length(); j++)
            {
                if(stringOne.charAt(i-1) == stringTwo.charAt(j-1))
                {
                    lookUp[i][j] = lookUp[i-1][j-1] +  1;

                    if(lookUp[i-1][j-1] >= maxLength)
                    {
                        maxLength = lookUp[i][j];
                        endingIndex = i;
                    }
                }

            }
        }

        //String longestCommonSubstring = stringOne.substring(endingIndex-maxLength, endingIndex);


        return new LongestCommonSubstringReturnHold(maxLength, endingIndex - maxLength, 0);
    }
}
