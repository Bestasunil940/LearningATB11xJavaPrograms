package ex_03_literals;

public class string_separator {
    public static void main(String[] args) {
        String str = "12wdeABDSf87^-_+=";
        String SmallLetters = "";
        String CapitalLetters = "";
        String Number = "";
        String SpecialChar = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            //Check if character is SmallLetter
            if ((ch >= 'a' && ch <= 'z')) {
                SmallLetters = SmallLetters + ch;
            }
            //Check if character is SmallLetter
            else if ((ch >= 'A' && ch <= 'Z')) {
                CapitalLetters = CapitalLetters + ch;
            }
            // Check if character is number
            else if (ch >= '0' && ch <= '9') {
                Number = Number + ch;
            }
            // If not letter or number, it's special character
            else {
                SpecialChar = SpecialChar + ch;
            }
        }

        System.out.println("SmallLetters: " + SmallLetters);
        System.out.println("CapitalLetters: " + CapitalLetters);
        System.out.println("Numbers: " + Number);
        System.out.println("Special: " + SpecialChar);
    }
}

