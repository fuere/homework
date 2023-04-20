public class Main {
    public static void main(String[] args) {
        System.out.println("1、B 2、C 3、D 4、B 5、D") ;
        showTriangle(4);
        reverseString("ABCD");
        isPalindrome(12321);
        ShuiXianHua();
        arraysDemo();
    }
    public static void showTriangle(int n){
        for(int i = 0; i < n;i++){
            for(int j = 0; j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int j = 0; j<2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void reverseString(String s) {
        char[] chars = new char[s.length()];
        for (int i = s.length() - 1; i >= 0; i--) {
            chars[s.length() - 1 - i] = s.charAt(i);
        }
        System.out.println(chars);
    }
    public static void isPalindrome(int num) {
        boolean flag = false;
        String str = String.valueOf(num);
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) == str.charAt(str.length() - 1 - i)) {
                flag = true;
            }
        }
        if (flag) {
            System.out.println("是的");
        } else {
            System.out.println("不是");
        }
    }
    public static void ShuiXianHua(){
        int a,b,c;
        System.out.println("三位数中所有的水仙花数为: ");
        for(int n=100;n<=999;n++){
            a=n/100;
            b=n%100/10;
            c=n%10;
            if(a*a*a+b*b*b+c*c*c==n){
                System.out.println(n);
            }
        }
    }
    public static void arraysDemo() { //操作
        int [] ary = {1,2,3,4,5,6,7,8,9,10};    //[]表示数组   int ary[]
        int max = 	ary[0];   //将数组第一个元素给max，表示最大值
        int min = 	ary[0];
        for(int i = 1;i < 10;i++) {
            if (ary[i] > max) {
                max = ary[i];
            }
            if (ary[i] < min) {
                min = ary[i];
            }

        }
        System.out.println("数组中最大值为："+max);
        System.out.println("数组中最小值为："+min);
    }

}
