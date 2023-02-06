import java.util.Scanner; 

public class Task5 {

    static int isDifferent(int a, int b) {
        
        return a-b;

    }

    static int isMultiple(int a, int b){
        return a*b; 

    }

    static int isMiddle(int a, int b){

        return (a+b)/2;
    }

    static int isMax(int a, int b){

        if(a>b){
            return a;
        }else{
            return b;
        }
    }

    static int isMin(int a,int b){

        if(a>b){
            return b;
        }else{
            return a; 
        }

    }

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        int a = myObj.nextInt();
        int b = myObj.nextInt(); 

        System.out.println("Difference: "+isDifferent(a,b));
        System.out.println("Multiplicity: "+isMultiple(a,b));
        System.out.println("Middle: "+isMiddle(a,b));
        System.out.println("Maximum: "+isMax(a,b));
        System.out.println("Minimum: "+isMin(a,b));

    }
}
