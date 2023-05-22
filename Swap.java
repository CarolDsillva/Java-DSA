public class Swap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter numbers to be swapped");
        int a = in.nextInt();
        int b = in.nextInt(); 
        System.out.println("Before swapping "+a+" "+b);
        swap(a, b);
        
    }
    static void swap(int a, int b){
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println("After Swapping "+a+" "+b);
    }
    
}
