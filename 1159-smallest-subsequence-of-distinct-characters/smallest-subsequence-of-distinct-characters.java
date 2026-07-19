class Solution {
    public String smallestSubsequence(String s) {
        
         int[] lastIndex = new int[26];
 boolean[] taken = new boolean[26];
        StringBuilder result = new StringBuilder();
for (int i = 0; i < s.length(); i++) {
        lastIndex[s.charAt(i) - 'a'] = i;
        }
for (int i = 0; i < s.length(); i++) {
  char ch = s.charAt(i);
     if (taken[ch - 'a']) {
 continue;
     }
 while (result.length() > 0) {
 char lastChar = result.charAt(result.length() - 1);

if (lastChar > ch && lastIndex[lastChar - 'a'] > i) {
taken[lastChar - 'a'] = false;
    result.deleteCharAt(result.length() - 1);
    } else {
    break;
    }
    }

        result.append(ch);
        taken[ch - 'a'] = true;
        }

    return result.toString();
    }
}