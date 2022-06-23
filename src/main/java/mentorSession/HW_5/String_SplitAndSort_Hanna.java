package mentorSession.HW_5;

import java.util.Arrays;

public class String_SplitAndSort_Hanna {

    public static class Task47_StringSplitAndSortHanna {

        public static void main(String[] args) {

            System.out.println(sortLettersAndNumbers("DC501GCCCA098911G998KK"));
        }


        public static String sortLettersAndNumbers(String str) {

            String digits = "";
            String letters="";
            String allSorted = "";

            for (int i = 0; i < str.length(); i++) {

                if (Character.isDigit(str.charAt(i))) {
                    digits += str.charAt(i);
                    char []arr=letters.toCharArray();
                    Arrays.sort(arr);
                    allSorted+=Arrays.toString(arr);
                    letters="";

                } else {

                    letters+=str.charAt(i);
                    char [] arr=digits.toCharArray();
                    Arrays.sort(arr);
                    allSorted+=Arrays.toString(arr);
                    digits="";
                }
            }

            char [] letter=letters.toCharArray();
            Arrays.sort(letter);
            char [] number=digits.toCharArray();
            Arrays.sort(number);
            return (allSorted+Arrays.toString(letter)+Arrays.toString(number)).replace("[","").replace("]","").replace(", ",""); //CD015ACCCG011899
        }
    }
}

/*
6. String - Sort Letters and Numbers from alphanumeric String
Given alphanumeric String, we need to split the string into substrings of consecutive letters or numbers, sort the individual string and append them back together.
Ex:
Input:  "DC501GCCCA098911"
OutPut: "CD015ACCCG011899"
 */

