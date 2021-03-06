package day43;

import java.util.Scanner;

//AcWing1208  递推
//小明正在玩一个“翻硬币”的游戏。
//
//        桌上放着排成一排的若干硬币。我们用 * 表示正面，用 o 表示反面（是小写字母，不是零）。
//
//        比如，可能情形是：**oo***oooo
//
//        如果同时翻转左边的两个硬币，则变为：oooo***oooo
//
//        现在小明的问题是：如果已知了初始状态和要达到的目标状态，每次只能同时翻转相邻的两个硬币,那么对特定的局面，最少要翻动多少次呢？
//
//        我们约定：把翻动相邻的两个硬币叫做一步操作。
//
//        输入格式
//        两行等长的字符串，分别表示初始状态和要达到的目标状态。
//
//        输出格式
//        一个整数，表示最小操作步数
//
//        数据范围
//        输入字符串的长度均不超过100。
//        数据保证答案一定有解。
public class day43exercise_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        char c1[]=s1.toCharArray();
        char c2[]=s2.toCharArray();
        int res=0;
        for(int i=0;i<c1.length-1;i++){
            if(c1[i] != c2[i]){
                turn(c1,i);
                turn(c1,i + 1);
                res++;
            }
        }
        System.out.println(res);
    }
    public static void turn(char[] ch,int i){
        if(ch[i] == '*'){
            ch[i] = 'o';
        }
        else
        {
            ch[i] = '*';
        }
    }
}
