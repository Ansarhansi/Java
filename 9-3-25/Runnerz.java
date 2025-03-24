public class Runnerz {
    public static void main(String[] args) {
       
        Asn m1 = new Assn(); 
        Asn1 m2 = new Asn1();
        Assi m3 = new Assi(); 

       System.out.println("Assn");
        m2.show();
        m2.show(10);
        m2.show(5.5);
        m2.show("Hello");
        m2.show(2, 3);
        m2.show(2.5, 3.5);
        m2.show(new int[]{1, 2, 3});
        m2.show(new double[]{1.1, 2.2, 3.3});
        m2.show(new String[]{"X", "Y", "Z"});
        m2.show(10, 5.5);
        m2.show(5.5, 10);
        System.out.println("Asn1");
        m6.evaluate();
        m6.evaluate(75);
        m6.evaluate(9.3);
        m6.evaluate("Data Science");
        m6.evaluate(3, 9);
        m6.evaluate(7.8, 1.2);
        m6.evaluate(new int[]{5, 10, 15});
        m6.evaluate(new double[]{5.5, 6.6, 7.7});
        m6.evaluate(new String[]{"P", "Q", "R"});
        m6.evaluate(22, 4.5);
        m6.evaluate(6.5, 22);
        System.out.println("Assi");
        m8.process();
        m8.process(19);
        m8.process(4.4);
        m8.process("Artificial Intelligence");
        m8.process(5, 10);
        m8.process(6.6, 2.3);
        m8.process(new int[]{2, 4, 6});
        m8.process(new double[]{1.5, 3.5, 5.5});
        m8.process(new String[]{"U", "V", "W"});
        m8.process(11, 2.8);
        m8.process(5.5, 16);
        m8.process('G');
    }
}