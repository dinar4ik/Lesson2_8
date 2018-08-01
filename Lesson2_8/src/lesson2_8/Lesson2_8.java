//import java.util.Arrays;
//
//public class Lesson2_8 {
//    void sort1 (){
//        int [] arr = {5,7,2,3,4};
//        int tmp;
//        for (int i = 0; i < arr.length; i++){
//            for (int j = i+1; j < arr.length; j++){
//            if (arr[j] < arr[i]){
//            tmp = arr[i];
//            arr[i] = arr[j];
//            arr[j] = tmp;
//        }
//    }
//}
//                        System.out.println(Arrays.toString(arr));
//    }
//    void sort2 (){
//        int [] arr = {5,7,8,9,0};
//        int tmp;
//        for (int i = 0; i < arr.length; i++){
//                    for (int j = i+1; j < arr.length; j++){
//                    if (arr[j] < arr[i]){
//                        tmp = arr[i];
//                        arr[i] = arr[j];
//                        arr[j] = tmp;                        
//                    }
//                }
//                }
//        System.out.println(Arrays.toString(arr));
//        this.sort1();
//        }
//        
//        public static void main(String[] args) {
//        Lesson2_8 t = new Lesson2_8();
//        t.sort2();
//    }
//
//}

public class Lesson2_8 {
    int id;
    String name;
    Lesson2_8(String name, int id){
        this.name = name;
        this.id = id;       
    }
    Lesson2_8(Lesson2_8 l){
        this.name = l.name;
        this.id = l.id;       
    }
    void display(){
        System.out.println(name+" "+id); 
    }

}
class B {
    public static void main(String[] args) {
    Lesson2_8 l1 = new Lesson2_8("dinara",95);
    Lesson2_8 l2 = new Lesson2_8(l1);
    l2.display();
}
    
}
