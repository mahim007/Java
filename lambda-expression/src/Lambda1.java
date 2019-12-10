import java.util.ArrayList;
import java.util.List;

public class Lambda1 {
    public static int calculateSquare(int n) {
        return n*n;
    }
    public static void main(String[] args) {
        List<Integer> items = new ArrayList<>();
        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
        items.add(5);

        items.forEach( item -> {
            int sqr = item * item;
            System.out.println(calculateSquare(item));
        });

        items.sort((p1, p2) -> {
            int ans;
            if (p1 == p2) ans = 0;
            else if (p1 < p2) ans = 1;
            else ans = -1;
            return ans;
        });

        System.out.println(items);
    }
}