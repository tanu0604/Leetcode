//https://leetcode.com/problems/counting-words-with-a-given-prefix/description/

package String;

public class CountingWord
{
    public static void main(String[] args) {
        String[] words={"leetcode","win","loops","success"};
        String pref="code";
        System.out.println(prefixCount(words,pref));
    }
    public static int prefixCount(String[] words,String pref)
    {
       int count=0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].startsWith(pref))
                count++;
        }
        return count;
    }
}
