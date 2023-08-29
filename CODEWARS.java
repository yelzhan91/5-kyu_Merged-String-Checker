public class CODEWARS {
    public static void main(String[] args) {
        String part1 = "code";
        String part2 = "wars";
        String s = "codewars";
        boolean result = false;
        result = isMerge(s, part1, part2);//true
        System.out.println(result);
        part1 = "cdwr";
        part2 = "oeas";
        s = "codewars";
        result = false;
        result = isMerge(s, part1, part2);//true
        System.out.println(result);
        part1 = "cod";
        part2 = "wars";
        s = "codewars";
        result = isMerge(s, part1, part2);//false
        System.out.println(result);
    }
    public static boolean isMerge(String s, String part1, String part2) {
        if (part1.isEmpty()) {
            return s.equals(part2);
        }
        if (part2.isEmpty()) {
            return s.equals(part1);
        }
        if (s.isEmpty()) {
            return (part1 + part2).isEmpty();
        }
        if (s.charAt(0) == part1.charAt(0) && isMerge(s.substring(1), part1.substring(1), part2)) {
            return true;
        }
        if (s.charAt(0) == part2.charAt(0) && isMerge(s.substring(1), part1, part2.substring(1))) {
            return true;
        }
        return false;
    }
}