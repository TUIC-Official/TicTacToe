import java.util.*;
public class TicTacToeJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int conn,pa=0,pb=0,d=0;
        while (true) {
            char Ac=' ', Bc=' ', Cc=' ', Dc=' ', Ec=' ', Fc=' ', Gc=' ', Hc=' ', Ic=' ';
            int A=0, B=0, C=0, D=0, E=0, F=0, G=0, H=0, I=0;
            System.out.println("Tic Tac Toe Game (By Ujan Modak and Contributors)");
            System.out.println("1 | 2 | 3");
            System.out.println("4 | 5 | 6");
            System.out.println("7 | 8 | 9");
            int count=1, choice; char countx;
            for (int i=1; i<=9;) {
                if (count==1) {countx='X';} else {countx='O';}
                System.out.print("Player "+countx+": ");
                choice = sc.nextInt();

                if (choice==1) { if (A==0) {System.out.println("Updated!"); A=count; Ac=countx;} else {System.out.println("Already Occupied!"); continue;} }
                else if (choice==2) { if (B==0) {System.out.println("Updated!"); B=count; Bc=countx;} else {System.out.println("Already Occupied!"); continue;} }
                else if (choice==3) { if (C==0) {System.out.println("Updated!"); C=count; Cc=countx;} else {System.out.println("Already Occupied!"); continue;} }
                else if (choice==4) { if (D==0) {System.out.println("Updated!"); D=count; Dc=countx;} else {System.out.println("Already Occupied!"); continue;} }
                else if (choice==5) { if (E==0) {System.out.println("Updated!"); E=count; Ec=countx;} else {System.out.println("Already Occupied!"); continue;} }
                else if (choice==6) { if (F==0) {System.out.println("Updated!"); F=count; Fc=countx;} else {System.out.println("Already Occupied!"); continue;} }
                else if (choice==7) { if (G==0) {System.out.println("Updated!"); G=count; Gc=countx;} else {System.out.println("Already Occupied!"); continue;} }
                else if (choice==8) { if (H==0) {System.out.println("Updated!"); H=count; Hc=countx;} else {System.out.println("Already Occupied!"); continue;} }
                else if (choice==9) { if (I==0) {System.out.println("Updated!"); I=count; Ic=countx;} else {System.out.println("Already Occupied!"); continue;} }
                else {System.out.println("Wrong Input!"); continue;}
                
                System.out.println(Ac+" | "+Bc+" | "+Cc);
                System.out.println(Dc+" | "+Ec+" | "+Fc);
                System.out.println(Gc+" | "+Hc+" | "+Ic);

                if (A==1&&B==1&&C==1) {
                    System.out.println("Player X Wins!"); pa++; break;
                } else if (D==1&&E==1&&F==1) {
                    System.out.println("Player X Wins!"); pa++; break;
                } else if (G==1&&H==1&&I==1) {
                    System.out.println("Player X Wins!"); pa++; break;
                } else if (A==1&&E==1&&I==1) {
                    System.out.println("Player X Wins!"); pa++; break;
                } else if (C==1&&E==1&&G==1) {
                    System.out.println("Player X Wins!"); pa++; break;
                } else if (A==1&&D==1&&G==1) {
                    System.out.println("Player X Wins!"); pa++; break;
                } else if (B==1&&E==1&&H==1) {
                    System.out.println("Player X Wins!"); pa++; break;
                } else if (C==1&&F==1&&I==1) {
                    System.out.println("Player X Wins!"); pa++; break;
                } else if (A==2&&B==2&&C==2) {
                    System.out.println("Player O Wins!"); pb++; break;
                } else if (D==2&&E==2&&F==2) {
                    System.out.println("Player O Wins!"); pb++; break;
                } else if (G==2&&H==2&&I==2) {
                    System.out.println("Player O Wins!"); pb++; break;
                } else if (A==2&&E==2&&I==2) {
                    System.out.println("Player O Wins!"); pb++; break;
                } else if (C==2&&E==2&&G==2) {
                    System.out.println("Player O Wins!"); pb++; break;
                } else if (A==2&&D==2&&G==2) {
                    System.out.println("Player O Wins!"); pb++; break;
                } else if (B==2&&E==2&&H==2) {
                    System.out.println("Player O Wins!"); pb++; break;
                } else if (C==2&&F==2&&I==2) {
                    System.out.println("Player O Wins!"); pb++; break;
                } else {
                    if (i==9) {
                        System.out.println("Draw!"); d++; break;
                    }
                }

                if (i%2==0) {
                    count--;
                } else {
                    count++;
                }
                i++;
            }
            System.out.print("If you want to rematch, enter 1, else, enter any other number: ");
            conn = sc.nextInt();
            if (conn!=1) break;
        }
        System.out.println("Thank you for playing my game!");
        System.out.println("RESUTS:");
        System.out.println("TOTAL GAMES PLAYED: "+(pa+pb+d));
        System.out.println("PLAYER X WINS: "+pa);
        System.out.println("PLAYER O WINS: "+pb);
        System.out.println("DRAWS: "+d);
        System.exit(0);
    }
}