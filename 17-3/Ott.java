public class Ott{
    static String[] platforms = {null, null, null, null};
    static int index = 0;



    public static void addplatforms(String netflix) {
        if ( netflix!= null) {
            if (index < platforms.length) {
                platforms[index] = netflix;
                index++;
                System.out.println(" netflix added successfully");
            }
            else{
                System.out.println("cant add any platform");
            }

        } 
        else {
            System.out.println("platform is null");
        }
}
          public static void fetch(){
    for(int i=0;i<platforms.length;i++){
            System.out.println(platforms[i]);
}
        }
    }