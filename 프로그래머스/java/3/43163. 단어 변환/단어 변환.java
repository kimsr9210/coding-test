import java.util.*;
class Solution {
    public int solution(String begin, String target, String[] words) {
        List<String> wordList = Arrays.asList(words);
        return bfs(begin, target, wordList);
    }
    
    public static boolean isOneLetterDiff(String word1, String word2) {
        if (word1.length() != word2.length()) return false;

        int diffCount = 0;
        for (int i = 0; i < word1.length(); i++) {
            if (word1.charAt(i) != word2.charAt(i)) {
                diffCount++;
            }
        }
        return diffCount == 1;
    }
    
    public static int bfs(String begin, String target, List<String> words) {
        Queue<String> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();

        queue.offer(begin);
        visited.add(begin);
        int transformationCount = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                String currentWord = queue.poll();

                // 목표 단어에 도달한 경우
                if (currentWord.equals(target)) {
                    return transformationCount;
                }

                for (String word : words) {
                    if (!visited.contains(word) && isOneLetterDiff(currentWord, word)) {
                        visited.add(word);
                        queue.offer(word);
                    }
                }
            }
            transformationCount++;
        }

        return 0; // 변환할 수 없는 경우
    }
}