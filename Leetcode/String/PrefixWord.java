package String;

import java.util.Arrays;

public class PrefixWord
{
    public static void main(String[] args) {
        String str,searchWord;
        str = "";
        searchWord = "test";
        System.out.println(isPrefixOfWord(str,searchWord));
    }
    public static int isPrefixOfWord(String str,String searchWord)
    {
        int ans=-1;
        String[] arr=str.split(" ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].startsWith(searchWord))
            {
                ans=i+1;
                break;
            }
            else
                ans=-1;
        }
        return ans;
    }
}
