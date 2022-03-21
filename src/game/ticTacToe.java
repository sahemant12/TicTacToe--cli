package game;

import java.util.Scanner;

public class ticTacToe {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int count =1;

        int a[] = {10,20,30,40,50,60,70,80,90};

        //  run until the isOver is false. when it return true execute the function, and return the winner name
        while(count <=9 && isOver(a) == false){


            System.out.println("enter the square number of first player");
            int p1= sc.nextInt();
            a[--p1] = 1;
            square(a);

            if(count <9 && isOver(a)==false){
                System.out.println("enter the square number of second player");
                int p2=sc.nextInt();
                a[--p2] = -1;
                square(a);
                count++;
            }

            count ++;

        }


        System.out.println("\n");
        winner(a);
    }

    private static void winner(int[] a) {
        if(a[0] ==  a[1] && a[1] == a[2] ){
            if(a[0]==1)
                System.out.println("player 2 is LOSER BehanKaLora madarchod.");
            else if(a[0]==-1)
                System.out.println("player 1 is LOSER BehanKaLora madarchod");
        }
        else if(a[3] ==  a[4] && a[4] == a[5] ){
            if(a[3]==1)
                System.out.println("player 2 is LOSER BehanKaLora madarchod");
            else if(a[3]==-1)
                System.out.println("player 1 is LOSER BehanKaLora madarchod");
        }
        else if(a[6] ==  a[7] && a[7] == a[8] ){
            if(a[6]==1)
                System.out.println("player 2 is LOSER BehanKaLora madarchod");
            else if(a[6]==-1)
                System.out.println("player 1 is LOSER BehanKaLora madarchod");
        }
        else if(a[0] ==  a[3] && a[3] == a[6] ){
            if(a[0]==1)
                System.out.println("player 2 is LOSER madarchod");
            else if(a[0]==-1)
                System.out.println("player 1 is LOSER BehanKaLora");
        }
        else if(a[1] ==  a[4] && a[4] == a[7] ){
            if(a[1]==1)
                System.out.println("player 2 is LOSER madarchod");
            else if(a[0]==-1)
                System.out.println("player 1 is LOSER madarchod");
        }
        else if(a[2] ==  a[5] && a[5] == a[8] ){
            if(a[2]==1)
                System.out.println("player 2 is LOSER madarchod");
            else if(a[0]==-1)
                System.out.println("player 1 is LOSER madarchod");
        }
        else if(a[0] ==  a[4] && a[4] == a[8] ){
            if(a[0]==1)
                System.out.println("player 2 is LOSER BehanKaLora");
            else if(a[0]==-1)
                System.out.println("player 1 is LOSER madarchod");
        }
        else if(a[2] ==  a[4] && a[4] == a[6] ){
            if(a[2]==1)
                System.out.println("player 2 is LOSER madarchod");
            else if(a[0]==-1)
                System.out.println("player 1 is LOSER madarchod");
        }
    }

    private static void square(int[] a) {

        int count =0;
        for(int i=1;i<=5;i++){
            if(i%2==0){
                System.out.print("========");
            }else{
                for(int j=1;j<=5;j++){
                    if(j%2==0){
                        System.out.print("|");
                    }else{

                        if(a[count]==1){
                            System.out.print("X");
                        }else if(a[count] == -1){
                            System.out.print("O");
                        }else {
                            System.out.print(" ");
                        }

                        count++;

                    }
                }
            }
            System.out.println();
        }
    }

    private static boolean isOver(int a[]){
        boolean result ;
        if(a[0] ==  a[1] && a[1] == a[2] )
            return true;
        else if(a[3] ==  a[4] && a[4] == a[5] )
            return true;
        else if(a[6] ==  a[7] && a[7] == a[8] )
            return true;
        else if(a[0] ==  a[3] && a[3] == a[6] )
            return true;
        else if(a[1] ==  a[4] && a[4] == a[7] )
            return true;
        else if(a[2] ==  a[5] && a[5] == a[8] )
            return true;
        else if(a[0] ==  a[4] && a[4] == a[8] )
            return true;
        else if(a[2] ==  a[4] && a[4] == a[6] )
            return true;
        else
            return false;


    }

}
