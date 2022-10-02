
public class Main {
    public static void main(String[] args) {

        int masterExercise = 12;
        String masterInput = "aaaabbbccccc";
        String masterFilter = "";
        switch(masterExercise){
            case 1 -> System.out.println(exercise1(masterInput));
            case 2 -> System.out.println(exercise2(masterInput));
            case 3 -> System.out.println(exercise3(masterInput));
            case 4 -> System.out.println(exercise4(masterInput));
            case 5 -> System.out.println(exercise5(masterInput));
            case 6 -> System.out.println(exercise6(masterInput));
            case 7 -> System.out.println(exercise7(masterInput));
            case 8 -> System.out.println(exercise8(masterInput));
            case 9 -> System.out.println(exercise9(masterInput));
            case 10 -> System.out.println(exercise10(masterInput, masterFilter));
            case 11 -> System.out.println(exercise11(masterInput));
            case 12 -> System.out.println(exercise12(masterInput));
            case 13 -> System.out.println(exercise13(masterInput));
            case 14 -> System.out.println(exercise14(masterInput));

        }




    }

    static String exercise1(String input){
        return("<" + input + ">");
    }

    static int exercise2(String input){
        return(input.length());
    }

    static String exercise3(String input){

        StringBuilder bufferString = new StringBuilder();

        for (char ch: input.toCharArray()) {
            bufferString.append(ch).append("@");
        }
        bufferString.setLength(bufferString.length() - 1);

        return(bufferString.toString());
    }

    static String exercise4(String input){

        String bufferString1;
        StringBuilder bufferString2 = new StringBuilder();

        for (int i=0; i<input.length(); i++)
        {
            bufferString1= String.valueOf(input.charAt(i));
            bufferString2.insert(0, bufferString1);
        }

        return(bufferString2.toString());
    }

    static String exercise5(String input) {

        char[] letter = { 'a', 'b', 'c', 'd', 'e', 'f',
                'g', 'h', 'i', 'j', 'k', 'l',
                'm', 'n', 'o', 'p', 'q', 'r',
                's', 't', 'u', 'v', 'w', 'x',
                'y', 'z', '1', '2', '3', '4',
                '5', '6', '7', '8', '9', '0' };

        String[] code
                = { ".-",   "-...", "-.-.", "-..",  ".",
                "..-.", "--.",  "....", "..",   ".---",
                "-.-",  ".-..", "--",   "-.",   "---",
                ".--.", "--.-", ".-.",  "...",  "-",
                "..-",  "...-", ".--",  "-..-", "-.--",
                "--..", "|" };

        StringBuilder bufferString = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            for (int j = 0; j < letter.length; j++) {
                if (input.charAt(i) == letter[j]) {
                    bufferString.append(code[j]).append(" ");
                    break;
                }
            }
        }
        return(bufferString.toString());
    }

    static String exercise6(String input){

        String bufferString = input;

        bufferString = bufferString.toLowerCase().replace("horse", "*****");
        bufferString = bufferString.toLowerCase().replace("saddle", "******");
        bufferString = bufferString.toLowerCase().replace("spores", "******");


        return(bufferString);
    }

    static String exercise7(String input){

        String bufferString1;
        StringBuilder bufferString2 = new StringBuilder();

        for (int i=0; i<input.length(); i++)
        {
            bufferString1= String.valueOf(input.charAt(i));
            bufferString2.insert(0, bufferString1);
        }

        return(input + bufferString2);
    }

    static String exercise8(String input){

        StringBuilder bufferString = new StringBuilder();
        int spaceCount = 0;

        for (int i=0; i<input.length(); i++)
        {
            if (input.charAt(i) == ' ') {
                spaceCount += 1;
                bufferString.append(" ");
            }

            else if ((i - spaceCount) % 2 == 0) {
                bufferString.append(input.toUpperCase().charAt(i));
            } else{
                bufferString.append(input.toLowerCase().charAt(i));
        }
            }

        return(bufferString.toString());

    }

    static String exercise9(String input){

        char[] letter = {
                'a', 'b', 'c', 'd', 'e', 'f',
                'g', 'h', 'i', 'j', 'k', 'l',
                'm', 'n', 'o', 'p', 'q', 'r',
                's', 't', 'u', 'v', 'w', 'x',
                'y', 'z', '1', '2', '3', '4',
                '5', '6', '7', '8', '9', '0' };

        String[] code = {
                "4",   "|3",  "(",   "|)", "3",    "|=",
                "6",   "|-|", "|",   "9",  "|<",   "1",
                "|V|", "|/|", "0",   "|*", "0,",   "|2",
                "5",   "7",   "|_|", "|/", "|/|/", "><",
                "`/",  "2",   "1",   "2",  "3",    "4",
                "5",   "6",   "7",   "8",   "9",   "0" };

        StringBuilder bufferString = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' ') {
                bufferString.append(" ");
            } else{
                for (int j = 0; j < letter.length; j++) {
                    if (input.charAt(i) == letter[j]) {
                        bufferString.append(code[j]);
                        break;
                    }
                }
            }
        }
        return(bufferString.toString());
    }

    public static String exercise10(String input, String filter) {
        StringBuilder bufferString = new StringBuilder(input);

        for (int i = 0; i < bufferString.length(); i += filter.length()) {
            int j = bufferString.indexOf(filter, i);
            if (j < 0) {
                j = bufferString.length();
            }

            while (i < j) {
                bufferString.setCharAt(i++, 'x');
            }
        }
        return bufferString.toString();
    }

    static String exercise11(String input){
        String bufferString;
        int multiplier;
        bufferString = input.substring(0, input.length() - 2);
        multiplier = Integer.parseInt(input.substring(input.length() - 1));
        return(bufferString.repeat(multiplier));
    }

    static String exercise12(String input){


        char[] s =input.toCharArray();
        int k=0,max=0;
        String[] a =new String[s.length];
        for(int i=0;i<s.length;i++){
            String r="";
            if(s[i]!=' '){
                r+=s[i];
                for(int j=i+1;j<s.length;j++){
                    char e=s[j];
                    if(Character.toLowerCase(s[i])==Character.toLowerCase(s[j])){
                        r+=e;
                        s[j]=' ';
                    }else{
                        break;
                    }
                }
                a[k++]=r;
            }
        }
        for(int i=0;i<k;i++){
            if(a[i].length()>max){
                max=a[i].length();
            }
        }
        int p=0;
        for(int i=0;i<k;i++){
            if(a[i].length()==max && a[i].length()>1){
                System.out.print(a[i]+" ");
                p=1;
            }
        }
        if(p==0) System.out.print("-1");
        return input;
    }

    static String exercise13(String input){

        String bufferString = input;

        bufferString = bufferString.toLowerCase().replace("do", "don't");
        bufferString = bufferString.toLowerCase().replace("do not", "do");
        bufferString = bufferString.toLowerCase().replace("can", "can't");
        bufferString = bufferString.toLowerCase().replace("can not", "can");

        return(bufferString);

    }

    static String exercise14(String input){


        return("I don' care");
    }



}