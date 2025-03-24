class Info1 {
   
    public void process(String s) { System.out.println("Original Text: " + s); }
    public void process(String s, int n) { System.out.println("Repeated: " + s.repeat(n)); }
    public void process(String s, char c) { System.out.println("Appended: " + s + c); }
    public void process(char c) { System.out.println("Single Character: " + c); }
    public void process(char c, int n) { System.out.println("Repeated Char: " + String.valueOf(c).repeat(n)); }
    public void process(String s, String t) { System.out.println("Combined: " + s + t); }
    public void process(String... strings) { System.out.println("Joined: " + String.join(", ", strings)); }
    public void process(String s, boolean upper) { 
        System.out.println("Changed Case: " + (upper ? s.toUpperCase() : s.toLowerCase())); 
    }
    public void process(char[] chars) { System.out.println("Characters: " + new String(chars)); }
    public void process(byte[] bytes) { System.out.println("Bytes: " + new String(bytes)); }
}