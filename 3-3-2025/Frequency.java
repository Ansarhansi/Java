public class Frequency{
    public static void main(String[] args) {
        int[] array = {2, 2, 3, 4, 5, 6, 6, 3};
        int n = array.length;
        boolean[] visited = new boolean[n]; 

        System.out.println("Frequencies of elements:");
        for (int i = 0; i < n; i++) {
            
            if (visited[i]) {
                continue;
            }

            int count = 1; 
            for (int j = i + 1; j < n; j++) {
                if (array[i] == array[j]) {
                    count++;
                    visited[j] = true; 
                }
            }

            System.out.println(array[i] + "-" + count);
        }
    }
}
