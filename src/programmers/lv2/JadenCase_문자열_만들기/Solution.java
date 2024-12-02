package programmers.lv2.JadenCase_문자열_만들기;


public class Solution {
//    public String solution(String s) {
//        String[] split = s.split(" ");
//        for(int i = 0; i < split.length; i++) {
//            split[i] = split[i].toLowerCase();
//            split[i] = split[i].substring(0, 1).toUpperCase() + split[i].substring(1);
//        }
//        return String.join(" ", split);
//    }

//    public String solution(String s) {
//        String[] split = s.split(" ");
//        StringBuilder sb = new StringBuilder();
//        for(String a : split) {
//            if (a.length() > 1) {
//                sb.append(a.substring(0, 1).toUpperCase());
//                sb.append(a.substring(1).toLowerCase());
//            } else {
//                sb.append(a.toUpperCase());
//            }
//            sb.append(" ");
//        }
//        sb.delete(sb.length() - 1, sb.length());
//        return sb.toString();
//    }

    public String solution(String s) {
        String lowerCase = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        sb.append(Character.toUpperCase((lowerCase.charAt(0))));
        for(int i = 1; i < lowerCase.length(); i++) {
            if (lowerCase.charAt(i - 1) == ' ') {
                sb.append(Character.toUpperCase((lowerCase.charAt(i))));
                continue;
            }
            sb.append(lowerCase.charAt(i));
        }
        return sb.toString();
    }

    public String solution2(String s) {
        char[] charArray = s.toLowerCase().toCharArray();
        charArray[0] = Character.toUpperCase(charArray[0]);
        for (int i = 0; i < charArray.length; i++) {
            if (i > 0 && charArray[i - 1] == ' ') {
                charArray[i] = Character.toUpperCase(charArray[i]);
            }
        }
        return new String(charArray);
//        return String.valueOf(charArray);
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution2("3people unFollowed me"));
    }
}
