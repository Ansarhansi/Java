package Internal2;

public class NotebookRunner {
    public static void main(String[] args) {
        Notebook n1 = new Notebook("Green", 80, 200, 2.5);
        Notebook n2 = new Notebook("Green", 80, 150, 2.0);
        Notebook n3 = new Notebook("Blue", 90, 200, 2.5);

        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);

        System.out.println("Notebook match: " + n1.equals(n2));
        System.out.println("Notebook not match: " + n1.equals(n3));
    }
}
