package Internal2;

public class TableRunner {
    public static void main(String[] args) {
        Table table1 = new Table("Brown", 3000, "Ikea", 30);
        Table table2 = new Table("Grey", 3000, "Urban", 30);
        Table table3 = new Table("Brown", 3000, "Ikea", 30);

        System.out.println(table1);
        System.out.println(table2);
        System.out.println(table3);

        System.out.println("Table match: " + table1.equals(table3));
        System.out.println("Table not match: " + table1.equals(table2));
    }
}
