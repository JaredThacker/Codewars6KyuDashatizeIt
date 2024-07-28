import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Solution {

    public static String dashatize(int num) {

         return Integer.toString(num).replaceAll("([13579])","-$1-")
                 .replaceAll("--","-")
                 .replaceAll("^-","")
                 .replaceAll("-$","");

//        String strNum = String.valueOf(num).replaceAll("-", "");
//        ArrayList<String> elems = new ArrayList<>();
//
//        HashSet<String> odds = new HashSet<>(List.of("1", "3", "5", "7", "9"));
//
//        for (String eachNum : strNum.split("")) {
//            if (odds.contains(eachNum)) {
//                elems.add(String.format("-%s-", eachNum));
//            } else {
//                elems.add(eachNum);
//            }
//        }
//
//        return String.join("", elems).replaceAll("--", "-")
//                .replaceAll("^-", "")
//                .replaceAll("-$", "");

    }

//    public static String dashatize(int num) {
//
//        String stringNum = String.valueOf(num).replaceAll("-", "");
//        String[] splitNum = stringNum.split("");
//        StringBuilder sb = new StringBuilder();
//
//        //def refactor this somehow! since random tests arent passing i mustve hardcoded somewhere
//        for (int i = 0; i < splitNum.length; i++){
//            boolean isOdd = "13579".contains(splitNum[i]);
//            if (isOdd){
//                if (i == splitNum.length - 1 && stringNum.length() > 1){
//                    sb.append("-");
//                    sb.append(splitNum[i]);
//                    break;
//                }
//
//                if (i != 0) {
//                    sb.append("-");
//                }
//
//                sb.append(splitNum[i]);
//
//                if (stringNum.length() > 1) {
//                    sb.append("-");
//                }
//            } else {
//                sb.append(splitNum[i]);
//            }
//        }
//
//        return sb.toString().replaceAll("--", "-");
//    }
}
