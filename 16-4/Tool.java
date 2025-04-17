package internal;

public class Tool {
    private String toolName;
    private double weight;

    public void setToolName(String toolName) { this.toolName = toolName; }
    public void setWeight(double weight) { this.weight = weight; }

    public void useTool() {
        System.out.println("Tool is being used");
    }

    public String toString() {
        return "Tool{name='" + toolName + "', weight=" + weight + "kg}";
    }
}
