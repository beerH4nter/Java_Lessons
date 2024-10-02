//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static boolean contains(String str,String ourStr){

        boolean flag = false;
        for (int i = 0; i < str.length() - ourStr.length(); i++) {
            int j = 0;
            for (; j < ourStr.length(); j++) {

                if(str.charAt(i + j) != ourStr.charAt(j)){
                    break;
                }

            }
            if(j == ourStr.length()){
                flag = true;
            }
        }
        return flag;
    }

    public static char charAt(char[] arr, int index){
        return arr[index];
    }

    public static int indexOf(String str,String ourStr){

        int index = -1;
        for (int i = 0; i < str.length() - ourStr.length(); i++) {
            int j = 0;
            for (; j < ourStr.length(); j++) {

                if(str.charAt(i + j) != ourStr.charAt(j)){
                    break;
                }

            }
            if(j == ourStr.length()){
                index = i;
            }
        }
        return index;
    }
    public static int lastIndexOf(String str, String ourStr){
        int index = -1;
        for (int i = str.length() - 1; i >= 0; i--) {
            if(str.charAt(i) == ourStr.charAt(ourStr.length() - 1)){
                int j = ourStr.length() - 2;
                int k = i - 1;

                while(k >= 0 && j >= 0 && str.charAt(k) == ourStr.charAt(j)){
                    j--;
                    k--;
                }
                if(j == 0)


            }

        }
        return index;
    }

    public static void main(String[] args) {


    }
}

//public class Main {
//
//
//    public static boolean Equals(char one[], char[] two) {
//        if (one.length != two.length) {
//            return false;
//        }
//        for (int i = 0; i < one.length; i++) {
//            if (one[i] != two[i]) {
//                return false;
//            }
//        }
//        return true;
//    }
//
//    public static boolean EqualsIgnoreCase(char one[], char[] two) {
//        if (one.length != two.length) {
//            return false;
//        }
//        for (int i = 0; i < one.length; i++) {
//            if (toLowerCase(one[i]) != toLowerCase(two[i])) {
//                return false;
//            }
//        }
//        return true;
//    }
//
//    public static char toLowerCase(char c) {
//
//        if ('A' <= c && c <= 'Z') {
//            int num = c;
//            num += 32;
//            return (char) num;
//        }
//        return c;
//    }
//
//
//    public static String[] split(char[] arr, char delimiter) {
//        int count = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == delimiter) {
//                count++;
//            }
//        }
//        count++;
//        String[] str = new String[count];
//        int index = 0;
//
//        for (int i = 0, strIndex = 0; i < arr.length; i++) {
//            if (arr[i] == delimiter) {
//                str[strIndex] = substring(arr, index, i);
//                strIndex++;
//                index = i + 1;
//
//                if (strIndex == count - 1) {
//                    str[strIndex] = substring(arr, index, arr.length);
//                    break;
//                }
//            }
//        }
//
//        return str;
//    }
//
//
//    public static String substring(char[] arr, int start, int end) {
//        String str = "";
//        for (int i = start; i < end; i++) {
//            str += arr[i];
//        }
//        return str;
//    }


    //Farid Kak Fadela? // arr => i < 17
    //Farzik // search  => j <  2

//    public static boolean contains(char[] arr, char[] search) {
//        for (int i = 0; i < arr.length; i++) {
//            int count = 0;// setcik kotoriy proveryayet kolicestvo pravilnix sovpadeniy
//            for (int j = 0; j < search.length; j++) {
////                System.out.println("arr["+i+"]="+arr[i] + " == " +"search["+j+"]="+search[j] + " => " + (arr[i]==search[j]));
//                if (arr[i]==search[j]){
//                    count++;//3
//                }else{
//                    break;
//                }
//                i++;
//            }
//
//            if (count == search.length){
//                return true;
//            }else{
//                System.out.println("Kolicestvo sovpadeniy bilo " + count + " , no nujno bilo " + search.length);
//            }
//        }
//        return false;
//    }

    //Farid Kak Fadela? // arr => i < 17
    //Farzik // search  => j <  2
//    public static boolean contains(char[] arr, char[] search) {
//        for (int i = 0; i <= arr.length - search.length; i++) {
//            int j = 0;
//            for (; j < search.length; j++)
//                if (arr[i + j] != search[j])
//                    break;
//
//            if (j == search.length)
//                return true;
//        }
//        return false;
//    }


//    public static char charAt(char[] arr, int index) {
//        return arr[index];
//    }


    //    "Farid kak dela kak ?";
    //    "id";
//    public static int indexOf(char[] arr, char[] search) {
//        for (int i = 0; i < arr.length; i++) {
//            int count = 0;
//            for (int j = 0; j < search.length; j++) {
//                if (arr[i] == search[j]) {
//                    count++;
//                } else {
//                    break;
//                }
//                i++;
//            }
//
//            if (count == search.length) {
//                return i-search.length;
//            }
//        }
//        return -1;
//    }


    //    "Farid kak dela kak ?";
    //    "id";
//    public static int indexOf(char[] arr, char[] search) {
//        for (int i = 0; i <= arr.length - search.length; i++) {
//            int j = 0;
//            for (; j < search.length; j++)
//                if (arr[i + j] != search[j])
//                    break;
//            if (j == search.length)
//                return i;
//        }
//        return -1;
//    }
    // 13 14 15
    //  k  "Farid kak dela kak farid";  19
    //         0 1 2
    //  j  "kak"; 3 - 1 = 2
//    public static int lastIndexOf(char[] arr, char[] search) {
//        for (int i = arr.length-1; i >= 0; i--) {
//            if (arr[i]==search[search.length-1]){ // k == k
//                    int j = search.length-2;//search predposledniy index
//                    int k = i-1; // predposledniy index arr
//                                             //  ' ' == -1
//                    while (j>=0 && k>=0 && arr[k] == search[j]){
//                        //1 k < 0
//                        //2 j < 0
//                        //3 symbl not equals
//                        j--;
//                        k--;
//                    }
//
//                    if (j==-1){
//                        return k+1;
//                    }
//
//            }
//        }
//        return -1;
//    }


//    public static int lastIndexOf(char[] arr, char[] search) {
//        for (int j=0,i = arr.length - search.length; i >= 0; i--,j=0) {
//            while (j < search.length && arr[i + j] == search[j++]) {}
//            if (j == search.length)
//                return i;
//        }
//        return -1;
//    }

    //   public static void main(String[] args) {

//        //name.lastIndexOf("Farid"))
//        String str = "Farid kak dela kak ?";
//        String search = "kak";
//        System.out.println(str.lastIndexOf(search));
//
//
//        char[] arr = str.toCharArray();
//        char[] searchArr = search.toCharArray();
//        System.out.println(lastIndexOf(arr, searchArr));


//        String str = "Farid";
//        int index = 4;
//        System.out.println(str.charAt(index));
//        System.out.println(charAt(str.toCharArray(),index));


//        String str = "Farid Kak delaF?";
//        String search = "F? ";
//        System.out.println(str.contains(search));//rodnoy
//
//
////        System.out.println("Arr    => " + str);
////        System.out.println("search => " + search);
////        System.out.println();
//        char[] arr = str.toCharArray();
//        char[] searchArr = search.toCharArray();
//        System.out.println(contains(arr, searchArr));// naw method


//    +   System.out.println("CharAt           : " + name.charAt(0));
//        System.out.println("IsEmpty          : " + name.isEmpty());
//        System.out.println("LastIndexOf      : " + name.lastIndexOf('d'));// s prava na levo
//        System.out.println("IndexOf          : " + name.indexOf('a'));// sleva na pravo
//    +   System.out.println("ToLowerCase      : " + name.toLowerCase());
//    +   System.out.println("ToUpperCase      : " + name.toUpperCase());

        ////////////////////////////////////////////////////////////////////////////

//    +   System.out.println("Equals           : " + name.equals("FaRid"));
//    +   System.out.println("EqualsIgnoreCase : " + name.equalsIgnoreCase(name2));
//        System.out.println("Replace          : " + name.replace('F','O'));
//        System.out.println("StartsWith       : " + name.startsWith("Hello my"));
//        System.out.println("EndsWith         : " + name.endsWith("Far"));
//        System.out.println("Trim             : " + name.trim());
//    +   System.out.println("Substring        : " + name.substring(6,14));
//    +   System.out.println("Contains         : " + name.contains("name  "));
//    +   System.out.println("Split            : " + name.split(","));

//     ***********************************************************************************
//    +   System.out.println("IndexOf          : " + name.indexOf("Farid"));// sleva na pravo
//    +   System.out.println("LastIndexOf      : " + name.lastIndexOf("Farid"));// s prava na levo
//        System.out.println("Replace          : " + name.replace("Farid","Oleq"));


    }
}