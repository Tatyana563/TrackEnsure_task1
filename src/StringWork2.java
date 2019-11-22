public class StringWork2 {
    //Варіант 3. Ввести текст, що складається з декількох слів. В тексті
    // після літери Р (або р),
    //якщо вона не остання в слові, може зустрічатися літера А (або а). У такому
    // випадку замінити її на літеру О (або о). Вивести початковий та
    // змінений рядок.

        public static void main(String[] args) {
            String str1="palkih PAlemon cherry";
            String str2 = "paa5#fff&8PAf";
//modify(str2);
replaceElem(modify(str2));

        }
        //слова відокремлюються не тільки пропусками, а й іншими
        // символами, що не є літерами і цифрами (наприклад,
        // знаки пунктуації).
        public static String[] modify(String str) {
            System.out.println("Unmodified string:"+str);
            System.out.println("Text divided by symbols:");
            String[] strings = str.split("[^a-zA-Z^\\d]");
            for(String s: strings){

                System.out.println(s);
            }
            return strings;
        }
        public static void replaceElem(String[] strings){
            StringBuilder sb = new StringBuilder();
            for(String item:strings){
                sb = sb.append(item);
            }

            String str = sb.toString();


            for(int i=0;i<str.length();i++){
                if(str.charAt(i)=='p'&&str.charAt(i+1)=='a')

                {
                    sb.setCharAt(i + 1, 'o');
                }
                if(((str.charAt(i)=='P'&&str.charAt(i+1)=='A')))
                {
                    sb.setCharAt(i + 1, 'O');
                }
            }
            System.out.println("Modified string"+" "+sb.toString());}



    }




