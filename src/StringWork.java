public class StringWork {
    public static void main(String[] args) {
        String s1 = "abcd#gh&l{";
        var8(s1);
    }

    public static void var8(String str) {
        String str2 = null;
        StringBuilder sb = new StringBuilder();
        System.out.println("Unmodified:" + str);
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetterOrDigit(str.charAt(i))) {
                sb.append(str.charAt(i));
                str2 = sb.toString();
                str2 = str2.replace("", " ").trim();

            }

        }
        System.out.println("Modified:" + str2);

    }
}
