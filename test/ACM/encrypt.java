package ACM;

import java.util.Scanner;

public class encrypt {
    public static void main(String[] args) {
        Scanner in_ = new Scanner(System.in);
        String s = in_.nextLine();
        manage(s);

    }

    public static void manage(String s) {
        char[] s1;
        s1 = s.toCharArray();
        // 0 表示 .
        // 1 表示 —

        String E = "0";
        String F = "0010";
        String G = "110";
        String H = "0000";
        String I = "00";
        String J = "0111";
        String K = "101";
        String L = "0100";
        String M = "11";
        String N = "10";
        String O = "111";
        String P = "0110";
        String Q = "1101";
        String R = "010";
        String S = "000";
        String T = "1";
        String U = "001";
        String V = "0001";
        String W = "011";
        String X = "1001";
        String Y = "1011";
        String Z = "1100";

        for (int i = 0; i < s1.length; i++) {
            switch (s1[i]) {
                case 'A':
                    System.out.print("01");
                    continue;
                case 'B':
                    System.out.print("1000");
                    continue;
                case 'C':
                    System.out.print("1010");
                    continue;
                case 'D':
                    System.out.print("100");
                    continue;
                case 'E':
                    System.out.print(E);
                    continue;
                case 'F':
                    System.out.print(F);
                    continue;
                case 'G':
                    System.out.print(G);
                    continue;
                case 'H':
                    System.out.print(H);
                    continue;
                case 'I':
                    System.out.print(I);
                    continue;
                case 'J':
                    System.out.print(J);
                    continue;
                case 'K':
                    System.out.print(K);
                    continue;
                case 'L':
                    System.out.print(L);
                    continue;
                case 'M':
                    System.out.print(M);
                    continue;
                case 'N':
                    System.out.print(N);
                    continue;
                case 'O':
                    System.out.print(O);
                    continue;
                case 'P':
                    System.out.print(P);
                    continue;
                case 'Q':
                    System.out.print(Q);
                    continue;
                case 'R':
                    System.out.print(R);
                    continue;
                case 'S':
                    System.out.print(S);
                    continue;
                case 'T':
                    System.out.print(T);
                    continue;
                case 'U':
                    System.out.print(U);
                    continue;
                case 'V':
                    System.out.print(V);
                    continue;
                case 'W':
                    System.out.print(W);
                    continue;
                case 'X':
                    System.out.print(X);
                    continue;
                case 'Y':
                    System.out.print(Y);
                    continue;
                case 'Z':
                    System.out.print(Z);
                    continue;
                default:
                    System.out.print(' ');

            }
        }
        System.out.print('\n');
    }
}
