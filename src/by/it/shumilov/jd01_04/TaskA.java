package by.it.shumilov.jd01_04;


import java.util.Scanner;

public class TaskA {
    static void printMulTable(){
        int n = 10;
        for (int i = 2; i < 10; i++) {
            for (int j = 2; j < 10; j++) {
                System.out.printf("%1d*%1d=%-2d ",i,j,i*j);
            }
            System.out.println();
        }
    }


    static void buildOneDimArray(String line){
        double[] mas = InOut.getArray(line);
        InOut.printArray(mas, "V", 5);

        double first  = mas [0];
        double last  = mas [mas.length-1];
        Helper.sort(mas);
        InOut.printArray(mas, "V", 4);
        for (int i = 0; i < mas.length; i++) {
            if(mas[i] == first){
                System.out.println("Index of first element=" + i);
                break;
            }

        }
        for (int i = 0; i < mas.length; i++) {
            if(mas[i] == last){
                System.out.println("Index of last element=" + i);
                break;
            }

        }
    }
    public static void main(String[] args) {
        printMulTable();
        Scanner sc=new Scanner(System.in);

        buildOneDimArray(sc.nextLine());
    }


}
