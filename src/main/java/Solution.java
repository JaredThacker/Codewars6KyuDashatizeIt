import java.util.Objects;

public class Solution {

    public static String dashatize(int num) {
        int absolute = Math.abs(num);
        //should probably remove this
        if (num == Integer.MIN_VALUE){
            absolute = Integer.MAX_VALUE;
        }
        String stringNum = String.valueOf(absolute);
        String[] splitNum = stringNum.split("");
        StringBuilder sb = new StringBuilder();

        //def refactor this somehow! since random tests arent passing i mustve hardcoded somewhere
        for (int i = 0; i < splitNum.length; i++){
            boolean isOdd = splitNum[i].equals("1") || splitNum[i].equals("3") || splitNum[i].equals("5") || splitNum[i].equals("7") || splitNum[i].equals("9");
            if (i != 0 && isOdd){
                if (i < splitNum.length - 1 && splitNum[i].equals(splitNum[i - 1]) && !splitNum[i].equals(splitNum[i + 1])){
                    sb.append("-");
                    sb.append(splitNum[i]);
                    sb.append("-");
                    continue;
                }
                if (splitNum[i].equals(splitNum[i - 1])){
                    sb.append("-");
                    sb.append(splitNum[i]);
                    continue;
                }

                if (num == Integer.MIN_VALUE && i == splitNum.length - 1) {
                    splitNum[splitNum.length - 1] = "8";
                    sb.append(splitNum[i]);
                    break;
                }
                if (i == splitNum.length - 1){
                    sb.append("-");
                    sb.append(splitNum[i]);
                    break;
                }
                if (splitNum[i].equals(splitNum[i + 1])){
                sb.append(splitNum[i]);
                continue;
                }
                sb.append("-");
                sb.append(splitNum[i]);
                sb.append("-");
            } else {
                sb.append(splitNum[i]);
            }
        }
        return sb.toString();
    }

}
