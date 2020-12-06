package infrastructura.utils;

import java. util. Random;
public class StringUtils {
    public String alphabet = "abcdefghijklmnopqrstuvwxyz";
    public String nums = "0123456789";

    public String strinGeneretor(MyEnum mode, int length) {
        String tempString = "";
        if (mode.equals(MyEnum.ALPHA)) {
           tempString = alphabet;
         } else if (mode.equals(MyEnum.ALPHANUMERIC)) {
           tempString = alphabet + nums;
         } else if (mode.equals(MyEnum.NUMERIC)) {
             tempString = nums;
          }
         StringBuilder result = new StringBuilder();
         Random rand = new Random();
        for (int i = 0; i < length; i++) {
           result.append(tempString.charAt(rand.nextInt(tempString.length())));
         }
         return result.toString();
        }
    public enum MyEnum{
        ALPHA,
        ALPHANUMERIC,
        NUMERIC;
    }



}


