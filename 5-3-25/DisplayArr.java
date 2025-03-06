public class DisplayArr {
    public static void main(String[] args) {
        display(); 
    }

    public static void display() {
        
        int a[] = {3, 6, 9};
        int b[] = {4, 4, 6};
        String name[] = {"MSD", "ABD", "SKY"};
        float salary[] = {9.6f, 8.2f, 4.7f}; 
        
        char grade[] = {'A', 'B', 'C'};
        boolean isActive[] = {true, false, true};
        double averages[] = {8.9, 7.5, 6.2};

        
        System.out.println("Array a: ");
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println("\nArray b: ");
        for (int i : b) {
            System.out.print(i + " ");
        }
        System.out.println("\nArray name: ");
        for (String n : name) {
            System.out.print(n + " ");
        }
        System.out.println("\nArray salary: ");
        for (float s : salary) {
            System.out.print(s + " ");
        }
        System.out.println("\nArray grade: ");
        for (char g : grade) {
            System.out.print(g + " ");
        }
        System.out.println("\nArray isActive: ");
        for (boolean active : isActive) {
            System.out.print(active + " ");
        }
        System.out.println("\nArray averages: ");
        for (double avg : averages) {
            System.out.print(avg + " ");
        }
    }
}
