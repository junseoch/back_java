package arrayTest;

import java.util.Scanner;

public class ArrayPractice {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // ======================
	        // 🟤 브론즈 (2차원 배열 버전)
	        // ======================

	        // 1) 10~1까지 중 짝수만 2차원 배열에 담고 출력 (1x5)
	        int[][] ar2D1 = new int[1][5];
	        for (int j = 0; j < ar2D1[0].length; j++) {
	            ar2D1[0][j] = 10 - j * 2; // 10, 8, 6, 4, 2
	        }
	        System.out.println("[브론즈-1] 10~1 짝수만 (2D 1x5):");
	        for (int j = 0; j < ar2D1[0].length; j++) {
	            System.out.print(ar2D1[0][j] + (j < ar2D1[0].length - 1 ? " " : ""));
	        }
	        System.out.println("\n");

	        // 2) 1~10까지 2차원 배열(2x5)에 담고 출력
	        int[][] ar2D2 = new int[2][5];
	        int v = 1;
	        for (int r = 0; r < ar2D2.length; r++) {
	            for (int c = 0; c < ar2D2[r].length; c++) {
	                ar2D2[r][c] = v++;
	            }
	        }
	        System.out.println("[브론즈-2] 1~10 (2D 2x5):");
	        for (int r = 0; r < ar2D2.length; r++) {
	            for (int c = 0; c < ar2D2[r].length; c++) {
	                System.out.print(ar2D2[r][c] + (c < ar2D2[r].length - 1 ? " " : ""));
	            }
	            System.out.println();
	        }
	        System.out.println();

	        // 3) 1~100까지 2차원 배열(10x10)에 담은 후 홀수만 출력
	        int[][] ar2D3 = new int[10][10];
	        int num = 1;
	        for (int r = 0; r < 10; r++) {
	            for (int c = 0; c < 10; c++) {
	                ar2D3[r][c] = num++;
	            }
	        }
	        System.out.println("[브론즈-3] 1~100 중 홀수만 (2D 10x10):");
	        for (int r = 0; r < 10; r++) {
	            for (int c = 0; c < 10; c++) {
	                if (ar2D3[r][c] % 2 == 1) {
	                    System.out.print(ar2D3[r][c] + " ");
	                }
	            }
	        }
	        System.out.println("\n");

	        // ======================
	        // 🟢 실버 (2차원 배열 버전)
	        // ======================

	        // 4) 1~100까지 2차원 배열(10x10)에 담은 후 짝수의 합 출력
	        int[][] ar2D4 = new int[10][10];
	        num = 1;
	        for (int r = 0; r < 10; r++) {
	            for (int c = 0; c < 10; c++) {
	                ar2D4[r][c] = num++;
	            }
	        }
	        int totalEven = 0;
	        for (int r = 0; r < 10; r++) {
	            for (int c = 0; c < 10; c++) {
	                if (ar2D4[r][c] % 2 == 0) totalEven += ar2D4[r][c];
	            }
	        }
	        System.out.println("[실버] 1~100 짝수의 합 (2D 10x10): " + totalEven + "\n");

	        // ======================
	        // 🔵 문자 문제 (2차원 배열 버전)
	        // ======================

	        // 5) A~F까지 2차원 배열(2x3)에 담고 출력
	        char[][] ar2D5 = new char[2][3];
	        char ch = 'A';
	        for (int r = 0; r < ar2D5.length; r++) {
	            for (int c = 0; c < ar2D5[r].length; c++) {
	                ar2D5[r][c] = ch++;
	            }
	        }
	        System.out.println("[문자-1] A~F (2D 2x3):");
	        for (int r = 0; r < ar2D5.length; r++) {
	            for (int c = 0; c < ar2D5[r].length; c++) {
	                System.out.print(ar2D5[r][c] + (c < ar2D5[r].length - 1 ? " " : ""));
	            }
	            System.out.println();
	        }
	        System.out.println();

	        // 6) A~F 중 C 제외하고 2차원 배열(1x5)에 담은 후 출력 (A B D E F)
	        char[][] ar2D6 = new char[1][5];
	        for (int c2 = 0; c2 < ar2D6[0].length; c2++) {
	            int offset = (c2 > 1 ? c2 + 1 : c2); // 인덱스 2부터 한 칸 밀기 → C 건너뜀
	            ar2D6[0][c2] = (char) ('A' + offset);
	        }
	        System.out.println("[문자-2] A~F 중 C 제외 (2D 1x5):");
	        for (int c2 = 0; c2 < ar2D6[0].length; c2++) {
	            System.out.print(ar2D6[0][c2] + (c2 < ar2D6[0].length - 1 ? " " : ""));
	        }
	        System.out.println("\n");

	        // ======================
	        // 🟡 골드 (2차원 배열 버전)
	        // ======================

	        // 7) 5개의 정수를 2차원 배열(1x5)에 입력받고 최대/최소 출력
	        int[][] ar2D7 = new int[1][5];
	        System.out.println("[골드] 5개 정수 입력 (2D 1x5) → 최대/최소");
	        for (int c3 = 0; c3 < 5; c3++) {
	            ar2D7[0][c3] = sc.nextInt();
	        }
	        int min = ar2D7[0][0];
	        int max = ar2D7[0][0];
	        for (int c3 = 1; c3 < 5; c3++) {
	            if (ar2D7[0][c3] > max) max = ar2D7[0][c3];
	            if (ar2D7[0][c3] < min) min = ar2D7[0][c3];
	        }
	        System.out.println("최대값: " + max);
	        System.out.println("최소값: " + min + "\n");

	        // ======================
	        // 💎 다이아 (2차원 배열 버전)
	        // ======================

	        // 8) 사용자가 입력할 정수의 개수만큼 2차원 배열(1 x length)을 만들고 평균 구하기
	        System.out.println("[다이아] 정수의 개수 입력:");
	        int length = sc.nextInt();
	        int[][] ar2D8 = new int[1][length];

	        int total = 0;
	        for (int c4 = 0; c4 < length; c4++) {
	            System.out.println((c4 + 1) + "번째 정수 입력");
	            ar2D8[0][c4] = sc.nextInt();
	            total += ar2D8[0][c4];
	        }
	        double average = (double) total / length;

	        System.out.print("입력값(2D 1x" + length + "): [");
	        for (int c4 = 0; c4 < length; c4++) {
	            System.out.print(ar2D8[0][c4]);
	            if (c4 != length - 1) System.out.print(" ");
	        }
	        System.out.println("]");
	        System.out.println("평균: " + average);

	        sc.close();
	    }
}
