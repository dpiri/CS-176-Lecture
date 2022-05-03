import java.util.Scanner;

class Class2
{
    int[] array;
    int count;
    
    Class2(int n){
        array = new int[n];
        count=0;
    }
    
    void load(){
        System.out.println ("Enter in any numbers or press q to end: ");
        Scanner sc = new Scanner(System.in);
        
        while(sc.hasNextInt()) {
        	
        	array[count] = sc.nextInt(); 
        	count++;
        	
        } this.print();
    }
    
    void print(){
        System.out.println("Values within the array: ");
        double sum = 0;
        for(int i = 0;i < count; ++i){
            System.out.println(array[i]);
            sum += array[i];
        }
        System.out.println("Sum : " + sum);
        System.out.println("Average: " + sum/(double)count);
    }
}
