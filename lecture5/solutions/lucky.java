import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        List<Long> arr = new ArrayList<>(Arrays.asList(4L, 7L));
        List<Integer> cnt = new ArrayList<>(Arrays.asList(1, -1));
        
        int idx = 0;
        while (true) {
            long x = arr.get(idx);
            int y = cnt.get(idx);

            if (x == 4444444444L) {
                break;
            }

            arr.add(x * 10 + 4);
            cnt.add(y + 1);

            arr.add(x * 10 + 7);
            cnt.add(y - 1);

            idx++;
        }

        for (int i = 0; i < arr.size(); i++) {
            if (cnt.get(i) == 0 && arr.get(i) >= n) {
                System.out.println(arr.get(i));
                break;
            }
        }
    }
}
