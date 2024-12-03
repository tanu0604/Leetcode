package String;

public class AddSpaces
{
    public static void main(String[] args) {
        String s="icodeinpython";
        int[] spaces={1,5,7,9};
//        System.out.println(s.substring(0,8)+" "+s.substring(8,13));
        String ansString=addSpaces(s,spaces);
        System.out.println(ansString);
    }
    public static String addSpaces(String s,int[] spaces)
    {
        StringBuilder ansString=new StringBuilder();
        int prev=0;
        for (int i = 0; i < spaces.length; i++) {
            ansString.append(s.substring(prev,spaces[i]));
            ansString.append(" ");
            prev=spaces[i];
        }
         ansString.append(s.substring(prev));
        return ansString.toString();
    }
}
