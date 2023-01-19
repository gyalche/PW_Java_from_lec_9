package recursion.ReturnSSQ;


import java.util.ArrayList;

//Q: Given a String, WAM(Write A Method) to return all its subsequences in an arraylist.
//A string is a subsequences of a given string without changing its order
//eg: input abc
// output: abc, ab, ac, a, bc, b, c, ''
public class returnSubsequences {

    static ArrayList<String> getSQQ(String s){
        ArrayList<String> ans = new ArrayList<>();
        //base case;
        if(s.length()==0){
            ans.add(" ");
            return ans;
        }

        char curr=s.charAt(0);

        //recursive work;
        ArrayList<String> smallAns=getSQQ(s.substring(1));

        for(String ss:smallAns){
            ans.add(ss);
            ans.add(curr + ss);
        }
        return ans;

    }
    public static void main(String[] args) {
        System.out.println(getSQQ("abc"));
    }
}
