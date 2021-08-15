
import java.util.*;



public class borim_3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // N, M, K를 공백을 기준으로 구분하여 입력 받기
        int n = sc.nextInt(); //배열의 크기
        int m = sc.nextInt(); //숫자가 더해지는 횟수
        int k = sc.nextInt(); // 더해지는 숫자가 k이상이면 안됨

        // N개의 수를 공백을 기준으로 구분하여 입력 받기
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr); // 입력 받은 수들 정렬하기
        for (int j : arr) {
            System.out.print("[" + j + "]");
        }
        
        int first = arr[n - 1]; // 가장 큰 수
        int second = arr[n - 2]; // 두 번째로 큰 수
        int result = 0; // 두 번째로 큰 수

        while (true) {
            for (int i = 0; i < k; i++) {
                if (m == 0)
                    break;
                result += first;
                m -=1;
            }
            if(m==0)
                break;
            result += second;
            m  -=1;
        }

        System.out.println("result" + result+"/n");

 /*       // 가장 큰 수가 더해지는 횟수 계산
        int cnt = (m / (k + 1)) * k;
        cnt += m % (k + 1);

        int result = 0;
        result += cnt * first; // 가장 큰 수 더하기
        result += (m - cnt) * second; // 두 번째로 큰 수 더하기
*/
        System.out.println(result);
    }
}