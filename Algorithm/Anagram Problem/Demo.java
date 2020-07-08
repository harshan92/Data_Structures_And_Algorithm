public class Demo {
    public static void main(String[] args) {
        AnagramProblem anagramProblem=new AnagramProblem();
        String str1="restful";
        String str2="fluster";
        char[] s1=str1.trim().toCharArray();
        char[] s2=str2.trim().toCharArray();

        System.out.println("Are \""+str1+"\" and \""+str2+"\" anagram words?  "+anagramProblem.solve(s1, s2));
    }
}