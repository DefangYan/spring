package com.example.ibeitys; /**
 * @author defang.yan
 * @date 19-10-18 上午11:10
 */

import java.util.Arrays;
import java.util.Scanner;

/**
 * 输入描述
 * 第一行包括一个数字N，表示本次用例包括多少个待校验的字符串。
 *
 * 后面跟随N行，每行为一个待校验的字符串。
 * 输出描述
 * N行，每行包括一个被修复后的字符串。
 * 规则:
 * 1. 三个同样的字母连在一起，一定是拼写错误，去掉一个的就好啦：比如 helllo -> hello
 * 2. 两对一样的字母（AABB型）连在一起，一定是拼写错误，去掉第二对的一个字母就好啦：比如 helloo -> hello
 * 3. 上面的规则优先“从左到右”匹配，即如果是AABBCC，虽然AABB和BBCC都是错误拼写，应该优先考虑修复AABB，结果为AABCC
 *
 2
 helloo
 wooooooow 输出 hello
                woow
 */
public class SpellCheckTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        scanner.nextLine();

        String[] strArr = new String[m];//规定 此数组个数
        // 从第二行开始读取
        for(int i = 0; i < m; i++) {
            strArr[i] = scanner.nextLine();
        }
        String[] strArr1 = new String[m];

        for(int d = 0;d < m; d++){
            for(int CharLen = 0 ; CharLen < strArr1[d].toCharArray().length; CharLen++){
                if(strArr1[CharLen].toCharArray().equals(strArr1[CharLen+1].toCharArray())){

                }
            }

        }
        System.out.println("输出：");
        System.out.println(Arrays.toString(strArr));

    }
}
