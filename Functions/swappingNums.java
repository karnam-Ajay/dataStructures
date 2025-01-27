public class swappingNums {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // here 10 20 will print

        swap(a,b);
        System.out.println(a + " " + b);

        // so in below method it  will print Ajay not rahul 
        // because in java there is nothing called as 
        // pass by ref, but there is only pass by value, 
        // means only the copy of the value of ref variable is passed.

        String name = "Ajay";
        changeName(name);
        System.out.println(name);
    }

    static void swap(int a,int b){
        int temp = a;
         a = b;
         b = temp; 
    }

    static void changeName(String naam){
          naam = "rahul";
    }
}