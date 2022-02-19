package Strings;

public class Repeated_String_Matching {
    public int repeatedStringMatch(String a, String b) {
        int maxcount = (int)Math.ceil(b.length() / a.length()) + 2;
        int count = 0;
        String str = "";
        for(int i = 0 ; i <= maxcount ; i++){
            if(str.contains(b))
                break;
            else{
                count++;
                str = str + a;
            }
        }
        if(str.contains(b))
            return count;
        else
            return -1;
    }
}
