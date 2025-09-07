import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str =  br.readLine().split(" ");
        int num = Integer.parseInt(str[0]);
        int length = Integer.parseInt(str[1]);

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < num; i++) {
            String word = br.readLine();

            if (word.length() < length) continue;

            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }

        List<String> list = new ArrayList<>(map.keySet());

        Collections.sort(list, (a, b) -> {
            if (!map.get(a).equals(map.get(b))) {
                return Integer.compare(map.get(b), map.get(a));
            }

            if (a.length() != b.length()) {
                return Integer.compare(b.length(), a.length());
            }

            return a.compareTo(b);
        });

        StringBuilder sb = new StringBuilder();
        for (String s : list) {
            sb.append(s).append("\n");
        }
        System.out.println(sb.toString());
    }
}