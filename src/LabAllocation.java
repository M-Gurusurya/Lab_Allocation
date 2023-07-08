import java.util.*;
public class LabAllocation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int lab1=sc.nextInt();
        int lab2=sc.nextInt();
        int lab3=sc.nextInt();
        int students=sc.nextInt();
        int array[]={lab1,lab2,lab3};
        Arrays.sort(array);
        for(int iterator = 0;iterator < array.length;iterator++)
        {
            if(array[iterator] > students)
            {
                if(array[iterator] == lab1)
                    System.out.println("L1");
                else if(array[iterator] == lab2)
                    System.out.println("L2");
                else
                    System.out.println("L3");
                break;
            }
        }
    }
}
