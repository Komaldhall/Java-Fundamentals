public class StringManipulator {
    public static String trimAndConcat(String str1, String str2){
       String string1=str1.trim();
       String string2=str2.trim();
       String concated=string1.concat(string2);
       return concated;
    }
    public static Integer getIndexOrNull(String str1, char char1){
        Integer index=str1.indexOf(char1);
        return index;
    }
    public static Integer getIndexOrNull(String str1, String str2){
        Integer index=str1.indexOf(str2);
        return index;
    }
    public static String concatSubstring(String str1, Integer int1, Integer int2, String str2){
        String strg1=str1.substring(int1, int2);
        String strgfinal=strg1.concat(str2);
        return strgfinal;
    }
   
}