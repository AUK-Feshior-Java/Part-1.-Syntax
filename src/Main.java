public class Main {
    public static void main(String[] args) {
            //Demonstrate while loop.
        int i =0;
        while(i!=100){
            i++;
            System.out.print(i + " ");
        }
        System.out.println();


        i=1;
        //Demonstrate do while loop.
        do{
            System.out.print(i + " ");
            i++;
        }while (i!=1 && i!=15);
        System.out.println();


        //Demonstrate for loop.
        //Print through loop, using increment (i++): 1 2 3 4 5 6 7 8 9 10
        for(int x=1;x<=10;x++){
            System.out.print(x + " ");
        }
        System.out.println();

        //Print through loop, using decrement (i--): 10 9 8 7 5 4 3 2 1
        for(int x=10;x>0;x--){
            System.out.print(x + " ");
        }
        System.out.println();

        //Iterate through String. Print each character of the String in every new line.
        String myName = "Vladislav";
        for(char c : myName.toCharArray()){
            System.out.println(c);
        }

        //Demonstrate loop inside the loop (nested loop). For example, create for loop inside the outer for loop,
        // make some output inside these loops. Understand the essence of such algorithm.

        for(int a = 0;a<10;a++){
            for(int x =10;x>0;x--){
                if(a>x)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}