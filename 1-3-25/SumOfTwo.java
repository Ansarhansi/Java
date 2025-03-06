public class SumOfTwo{

public static void main(String[] args) {

int[] array = {2,4,10,90,4,6};
int target = 8;

System.out.println("given pair: "); 

for (int i = 0; i < array.length;i++) {
for (int j=i+1;j< array.length;j++) {
if (array[i] + array[j] == target) {
System.out.println("[" + array[i] + "," + array[j]+"]");

}

}
}
}
}