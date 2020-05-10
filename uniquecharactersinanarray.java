public class uniquecharactersinanarray
{

    public static String removeduplicate(String str) {
        String[] strr = str.split("");
        int a = strr.length;
        String result = "";
        for (int i = 0; i < a; i++) {
            int count = 0;
            for (int j = 0; j < a; j++) {
                if (j > i && strr[i].equals(strr[j])) {
                    strr[j] = "";
                }
            }
        }
        //System.out.println(Arrays.toString(strr));
        for (int i = 0; i < a; i++) {
            result = result + strr[i];
        }
        //System.out.println(result);
        return result;
    }

    public static String unique(String str) {
        String[] strr = str.split("");
        int a = strr.length;
        String result = "";
        for (int i = 0; i < a; i++) {
            int count = 0;
            for (int j = 0; j < a; j++) {
                if (j > i && strr[i].equals(strr[j])) {
                    strr[j] = "";
                    count += 1;
                }
            }
            if (count == 0) {
                result += strr[i];
            }
        }

        return result;
    }


    public static void main(String[] args) {
        System.out.println(removeduplicate("kamilmahumuhuseyin"));
        System.out.println(unique("qwrrttqtttttttsssssttttttttt"));
    }
}