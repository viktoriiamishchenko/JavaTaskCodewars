package mentorSession.HW_5;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class String_SortLettersAndNumbers {

    public static void main(String[] args) {
        String str = "DC501GCCCA098911N3";
        System.out.println(splitAndSort(str));
    }

    public static String sort(String str) {

        String[] arr = str.split("");
        Arrays.sort(arr);
        String res = "";

        for (String each : arr) {
            res += each;
        }

        return res;
    }
    public static String splitAndSort(String str) {

        String temp = "";
        List<String> list = new LinkedList<>();
        String res = "";

        for (int i = 0; i < str.length() - 1; i++) {

            char ch = str.charAt(i);
            char nextCh = str.charAt(i + 1);

            if (Character.isLetter(ch) && Character.isLetter(nextCh) || (Character.isDigit(ch) && Character.isDigit(nextCh))) {
                temp += ch;

            } else if ((Character.isLetter(ch) && Character.isDigit(nextCh)) || (Character.isDigit(ch) && Character.isLetter(nextCh))) {
                temp += ch;
                list.add(temp);
                temp = "";
            } else if (!Character.isDigit(ch) && !Character.isLetter(ch)) {
                return "String should contains only Numbers and Letters";
            }
        }

        if (!temp.isEmpty()) {
            list.add(temp);
        }

        if (list.size() < str.length()) {
            list.add(str.charAt(str.length() - 1) + "");
        }

        for (String each : list) {
            res += sort(each);
        }

        return res;
    }
}

/*
6. String - Sort Letters and Numbers from alphanumeric String
Given alphanumeric String, we need to split the string into substrings of consecutive letters or numbers, sort the individual string and append them back together.
Ex:
Input:  "DC501GCCCA098911"
OutPut: "CD015ACCCG011899"
 */
