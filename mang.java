import java.util.Scanner;
public class mang {
    public static void main(String[] args) {
        int[]mang;
        int size;
        Scanner scanner=new Scanner(System.in);
        do {
            System.out.println("Enter a size mang:");
            size=scanner.nextInt();
            if (size>20){
                System.out.println("Size does not exceed 20");
            }
        }while (size>20);
        mang=new int[size];
        int i=0;
        while (i<mang.length){
            System.out.println("Enter element"+(i+1)+":");
            mang[i]= scanner.nextInt();
            i++;
        }
        System.out.printf("%-20s%s" , "Elements mang: ","");
        for (int j=0;j<mang.length;j++) {
            System.out.print(mang[j]+ "\t");
        }
        for (int j=0 ; j<mang.length/2 ; j++){
            int cout =mang[j];
            mang[j]=mang[size - 1 -j];
            mang[size - 1 -j]=cout;

        }
        System.out.printf("%-20s%s" , "Elements mang sau khi dao nguoc: ","");
        for (int j=0;j<mang.length;j++) {
            System.out.print(mang[j]+ "\t");
        }
    }
}
