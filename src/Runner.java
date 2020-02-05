public class Runner {
    public static void main(String[] args) {
        System.out.println(makes10(2, 3));
        System.out.println(makes10(2, 3));

        System.out.println(stringSplosion("redxx"));
        System.out.println(stringSplosion("redxx"));

        System.out.println(extraEnd("hello"));
        System.out.println(extraEnd("hello"));

        System.out.print(endOther("pieces", "beep"));
        System.out.print(endOther("pieces", "beep"));

        System.out.println(sumNumbers("1ghjfld45jkng9"));
        System.out.println(sumNumbers("1ghjfld45jkng9"));

        System.out.println(sum3([1, 2, 3]);
        System.out.println(sum3([1, 2, 3]);

        System.out.println(only14());
        System.out.println(only14());

        System.out.println(fix45([2, 5, 4]));
        System.out.println(fix45([3, 7, 10, 5, 5, 6,4, 9, 4, 2]);

        System.out.println(specialEleven(34));
        System.out.println(specialEleven(40));

        System.out.println(luckySum(23, 45, 13));
        System.out.println(luckySum(23, 45, 13));

    }
    //Warm up 1
    public static boolean makes10(int a, int b) {
        int sum = (a + b);
        return (sum == 10 || a == 10 || b == 10);
    }
    //Warm up 2
    public static String stringSplosion(String str) {
        boolean isEmpty = (str.length() == 0);
        String result = "";
        if (!isEmpty) {
            for (int i = 0; i < str.length() + 1; i++) {
                result += str.substring(0, i);
            }
        }
        return result;
    }
    //String 1
    public static String extraEnd(String str) {
        String root = str.substring(str.length() - 2, str.length());
        String result = root + root + root;
        return result;
    }
    //String 2
    public static Boolean endOther(String a, String b) {
        String longerString;
        String shorterString;

        if (a.length() >= b.length()) {
            longerString = a.toLowerCase();
            shorterString = b.toLowerCase();
        } else {
            longerString = b.toLowerCase();
            shorterString = a.toLowerCase();
        }

        String newString = "";

        for (int i = 0; i < shorterString.length(); i++) {
            int longPlace = longerString.length() - shorterString.length() + i;
            newString += longerString.substring(longPlace, longPlace + 1);
        }
        return (newString.equals(shorterString));
    }
    //String 3
    public static int sumNumbers(String str) {
        int sum = 0;
        String currentNum = "";
        for (int i = 0; i < str.length(); i++) {
            char nextSpot;
            if (i == str.length() - 1) {
                nextSpot = ' ';
            } else {
                nextSpot = (str.charAt(i + 1));
            }
            char spot = str.charAt(i);
            if (Character.isDigit(spot)) {
                currentNum += spot;
                if (!Character.isDigit(nextSpot)) {
                    int num = Integer.parseInt(currentNum);
                    sum += num;
                    currentNum = "";
                }
            }
        }
        return sum;
    }
    //Array 1
    public static int sum3(int[] nums) {
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += nums[i];
        }
        return sum;
    }

    //Array 2
    public static boolean only14(int[] nums) {
        boolean confirmation = true;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 1 && nums[i] != 4) {
                confirmation = false;
            }
        }
        return confirmation;
    }
    //Array 3
    public static int[] fix45(int[] nums) {
        boolean done = false;
        int [] fixed;
        fixed = new int[nums.length];
        int otherNums = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 4) {
                fixed[i] = 4;
                fixed[i + 1] = 5;
            } else {
                otherNums++;
            }
        }

        int [] replacers;
        replacers = new int [otherNums];
        int now = 0;

        for (int i = 0; i < nums.length; i ++) {
            if (nums[i] != 4 && nums[i] != 5) {
                replacers[now] = nums[i];
                now++;
            }
        }

        now = 0;

        for (int i = 0; i < nums.length; i ++) {
            if (fixed[i] == 0) {
                fixed[i] = replacers[now];
                now++;
            }
        }

        return fixed;
    }
    //Logic 1
    public static boolean specialEleven(int n) {
        return (n % 11 == 0 || n % 11 == 1);
    }
    //Logic 2
    public static int luckySum(int a, int b, int c) {
        int sum = 0;
        if (a == 13) {
            return sum;
        } else if (b == 13) {
            sum = a;
            return sum;
        } else if (c == 13) {
            sum = a + b;
            return sum;
        } else {
            sum = a + b + c;
        }
        return sum;
    }
}