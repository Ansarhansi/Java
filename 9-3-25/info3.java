class Info3 {
    // Overloaded methods
    public int sum(int a, int b) { return a + b; }
    public float sum(float a, float b) { return a + b; }
    public double sum(double a, double b) { return a + b; }
    public long sum(long a, long b) { return a + b; }
    public short sum(short a, short b) { return (short) (a + b); }
    public byte sum(byte a, byte b) { return (byte) (a + b); }
    public int sum(int... nums) { 
        int total = 0;
        for (int n : nums) total += n;
        return total; 
    }
    public double sum(double a, int b) { return a + b; }
    public double sum(int a, double b) { return a + b; }
    public void sumAndPrint(int a, int b) { 
        System.out.println("Sum is: " + (a + b)); 
    }
}