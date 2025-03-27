
public class RunnerT {
 public static void main(String[] args) {
       
        Calculator calc = new Calculator();
        DataHandler handler = new DataHandler();
        Printer printer = new Printer();
        
        
        calc.compute();
        calc.compute(5);
        calc.compute(3.14);
        calc.compute("Hello");
        calc.compute(10, 20);
        calc.compute(1.5, 2.5);
        calc.compute(new int[] {1, 2, 3});
        calc.compute(new double[] {1.1, 2.2, 3.3});
        calc.compute(new String[] {"A", "B", "C"});
        calc.compute(100, 50.5);
        System.out.println("");

       
        handler.process(15);
        handler.process(2.71);
        handler.process("Data");
        handler.process(40, 50);
        handler.process(1.2, 3.4);
        handler.process(new int[] {4, 5, 6});
        handler.process(new double[] {7.7, 8.8});
        handler.process(new String[] {"X", "Y"});
        handler.process("Key", "Value");
        handler.process('Z');
        System.out.println("");

        
        printer.print();
        printer.print(42);
        printer.print(9.81);
        printer.print("World");
        printer.print(11, 22);
        printer.print(3.3, 4.4);
        printer.print(new int[] {7, 8, 9});
        printer.print(new double[] {1.4, 2.8, 3.6});
        printer.print(new String[] {"One", "Two"});
        printer.print('P');
        System.out.println("");
    }
}
