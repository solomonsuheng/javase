package LeetCode;

import java.util.HashMap;

/**
 * Created by Suheng on 6/27/15.
 */
public class IsomorphicStrings {
    public static void main(String[] args) {
        System.out.println(isIsomorphic("egg", "add"));
    }

    public static boolean isIsomorphic(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        boolean flag = true;
        StringBuffer sb1 = new StringBuffer();
        StringBuffer sb2 = new StringBuffer();
        HashMap<String, Integer> hm1 = new HashMap<String, Integer>();
        HashMap<String, Integer> hm2 = new HashMap<String, Integer>();
        int count1 = 1;
        int count2 = 1;

        for (int i = 0; i < str1.length(); i++) {
            if (hm1.containsKey(str1.charAt(i) + "")) {
                int cc = hm1.get(str1.charAt(i) + "");
                sb1.append(cc);
            } else {
                sb1.append(count1);
                hm1.put(str1.charAt(i) + "", count1++);

            }
        }

        for (int i = 0; i < str2.length(); i++) {
            if (hm2.containsKey(str2.charAt(i) + "")) {
                int cc = hm2.get(str2.charAt(i) + "");
                sb2.append(cc);
            } else {
                sb2.append(count2);
                hm2.put(str2.charAt(i) + "", count2++);
            }
        }

        System.out.println(sb1.toString());
        System.out.println(sb2.toString());
        return sb1.toString().equals(sb2.toString());
    }
}
