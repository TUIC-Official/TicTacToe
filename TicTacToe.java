import java.util.*;
public class TicTacToe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A=0, B=0, C=0, D=0, E=0, F=0, G=0, H=0, I=0;
        System.out.println("Tic Tac Toe Game (By Ujan Modak and Contributors)");
        System.out.println("1 | 2 | 3");
        System.out.println("4 | 5 | 6");
        System.out.println("7 | 8 | 9");
        int count=1, choice;
        for (int i=1; i<=9;) {
            System.out.print("Player "+count+": ");
            choice = sc.nextInt();

            if (choice==1) { if (A==0) {System.out.println("Updated!"); A=count;} else {System.out.println("Already Occupied!"); continue;} }
            else if (choice==2) { if (B==0) {System.out.println("Updated!"); B=count;} else {System.out.println("Already Occupied!"); continue;} }
            else if (choice==3) { if (C==0) {System.out.println("Updated!"); C=count;} else {System.out.println("Already Occupied!"); continue;} }
            else if (choice==4) { if (D==0) {System.out.println("Updated!"); D=count;} else {System.out.println("Already Occupied!"); continue;} }
            else if (choice==5) { if (E==0) {System.out.println("Updated!"); E=count;} else {System.out.println("Already Occupied!"); continue;} }
            else if (choice==6) { if (F==0) {System.out.println("Updated!"); F=count;} else {System.out.println("Already Occupied!"); continue;} }
            else if (choice==7) { if (G==0) {System.out.println("Updated!"); G=count;} else {System.out.println("Already Occupied!"); continue;} }
            else if (choice==8) { if (H==0) {System.out.println("Updated!"); H=count;} else {System.out.println("Already Occupied!"); continue;} }
            else if (choice==9) { if (I==0) {System.out.println("Updated!"); I=count;} else {System.out.println("Already Occupied!"); continue;} }
            
            System.out.println(A+" | "+B+" | "+C);
            System.out.println(D+" | "+E+" | "+F);
            System.out.println(G+" | "+H+" | "+I);

            if (A==1&&B==1&&C==1) {
                System.out.println("Player 1 Wins!"); System.exit(0);
            } else if (D==1&&E==1&&F==1) {
                System.out.println("Player 1 Wins!"); System.exit(0);
            } else if (G==1&&H==1&&I==1) {
                System.out.println("Player 1 Wins!"); System.exit(0);
            } else if (A==1&&E==1&&I==1) {
                System.out.println("Player 1 Wins!"); System.exit(0);
            } else if (C==1&&E==1&&G==1) {
                System.out.println("Player 1 Wins!"); System.exit(0);
            } else if (A==1&&D==1&&G==1) {
                System.out.println("Player 1 Wins!"); System.exit(0);
            } else if (B==1&&E==1&&H==1) {
                System.out.println("Player 1 Wins!"); System.exit(0);
            } else if (C==1&&F==1&&I==1) {
                System.out.println("Player 1 Wins!"); System.exit(0);
            } else if (A==2&&B==2&&C==2) {
                System.out.println("Player 2 Wins!"); System.exit(0);
            } else if (D==2&&E==2&&F==2) {
                System.out.println("Player 2 Wins!"); System.exit(0);
            } else if (G==2&&H==2&&I==2) {
                System.out.println("Player 2 Wins!"); System.exit(0);
            } else if (A==2&&E==2&&I==2) {
                System.out.println("Player 2 Wins!"); System.exit(0);
            } else if (C==2&&E==2&&G==2) {
                System.out.println("Player 2 Wins!"); System.exit(0);
            } else if (A==2&&D==2&&G==2) {
                System.out.println("Player 2 Wins!"); System.exit(0);
            } else if (B==2&&E==2&&H==2) {
                System.out.println("Player 2 Wins!"); System.exit(0);
            } else if (C==2&&F==2&&I==2) {
                System.out.println("Player 2 Wins!"); System.exit(0);
            } else {
                if (i==9) {
                    System.out.println("Draw!"); System.exit(0);
                }
            }

            if (i%2==0) {
                count--;
            } else {
                count++;
            }
            i++;
        }
    }
}