public class StringManipulator{
    public static String trimAndConcat(String string1, String string2){
        String string3 = string1.concat(string2);
        string3.trim();
        System.out.println(string3);
        return string3;
    }

    public static Integer getIndexorNull(String string1, char char1){
        Integer a = string1.indexOf(char1);
        if (a>=0){
            return a;
        }
        else {
            return null;
        }
    }

    public static Integer getIndexorNull(String string1, String substring){
        Integer a = string1.indexOf(substring);
        if (a>=0){
            return a;
        }
        else {
            return null;
        }
    }

    public static String concatSubstring(String string1, int indexStart, int indexEnd, String string2){
        String a = string1.substring(indexStart, indexEnd);
        String b = a.concat(string2);
        return b;
    }

}