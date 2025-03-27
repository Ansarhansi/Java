public class Mcurd {
   
        String  name[][] = {{null, null, null}, {null, null, null}};
        
       public static void displayName() {
    
    for (int i = 0; i < name.length; i++) {
       
        for (int j = 0; j < name[i].length; j++) {
            
            System.out.print((name[i][j] == null ? "Empty" : name[i][j]) );
        }
        
    }
}

       
//        public static void addname(String Mame) {
//         if (name != null) {
//             if (index < name.length[i]) {
//                 name[index] = Mame;
//                 index++;
//                 System.out.println("name added successfully");
//             } else {
//                 System.out.println("List is full, cannot add");
//             }
//         } else {
//             System.out.println("name is null");
//         }
//     }

// public class search()
//    }



