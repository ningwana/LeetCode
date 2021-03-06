//给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
//
// 示例 1:
//
// 输入: 123
//输出: 321
//
//
// 示例 2:
//
// 输入: -123
//输出: -321
//
//
// 示例 3:
//
// 输入: 120
//输出: 21
//
//
// 注意:
//
// 假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−231, 231 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。
// Related Topics 数学
// 👍 2093 👎 0

/**
 *  % 取余    /取商
 * //pop operation:       x = 3214
 * pop = x % 10;         pop = 4   1  2  3
 * x /= 10;             x = 321   21  3  0
 *
 * //push operation:
 * temp = rev * 10 + pop;       temp = 0*10+4 =4   4*10+1  41*10+2   412*10+3
 * rev = temp;                  rev = 4              41       412      4123
 *
 *
 */
public class NumRever07 {
    public int reverse(int x) {
        int rev  = 0;
        while (x != 0) {
            if ((rev  * 10) / 10 != rev ) { //  0   4*10/10=4   41*10/10=41  412
                rev  = 0;  //  0    4   41
                break;
            }
            rev  = rev  * 10 + x % 10;   // 0*10+3214%10 = 4    4*10+321%10= 41   412   4123
            x = x / 10;        //  321   32   3  0
        }
        return rev ;
    }
}
