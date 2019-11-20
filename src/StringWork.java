public class StringWork {
    public static void main(String[] args) {
        String s1 = "abcd#gh&l{";
        var8(s1);
    }

    public static String var8(String str) {
        String str2 = null;
        StringBuilder sb = new StringBuilder();
        System.out.println("Unmodified:" + str);
       // sb.append(str.charAt(0));
        for (int i = 0; i < str.length(); i++) {

            if (Character.isLetter(str.charAt(i))) {
                sb.append(str.charAt(i));
            }
               else if(Character.isWhitespace(str.charAt(i))&&
                    (i==0||Character.isWhitespace(str.charAt(i-1))){
                sb.append(str.charAt(i));
            }
            return sb.toString();


        }
       

    }
}
