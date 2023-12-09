#include <iostream>
using namespace std;

int main() {
    char Ac=' ', Bc=' ', Cc=' ', Dc=' ', Ec=' ', Fc=' ', Gc=' ', Hc=' ', Ic=' ';
    int A=0, B=0, C=0, D=0, E=0, F=0, G=0, H=0, I=0;
    cout << "Tic Tac Toe Game (By Ujan Modak and Contributors)" << endl;
    cout << "Remember the positions of the blocks: "<<endl;
    cout << "1 | 2 | 3" << endl;
    cout << "4 | 5 | 6" << endl;
    cout << "7 | 8 | 9" << endl;
    int count=1, choice; char countx;
    for (int i=1; i<=9;) {
        if (count==1) {countx='X';} else {countx='O';}
        cout << "Choose Position for Player " << countx << ": ";
        cin >> choice;

        if (choice==1) { if (A==0) {cout << "Updated!" << endl; A=count; Ac=countx;} else {cout << "Already Occupied!" << endl; continue;} }
        else if (choice==2) { if (B==0) {cout << "Updated!" << endl; B=count; Bc=countx;} else {cout << "Already Occupied!" << endl; continue;} }
        else if (choice==3) { if (C==0) {cout << "Updated!" << endl; C=count; Cc=countx;} else {cout << "Already Occupied!" << endl; continue;} }
        else if (choice==4) { if (D==0) {cout << "Updated!" << endl; D=count; Dc=countx;} else {cout << "Already Occupied!" << endl; continue;} }
        else if (choice==5) { if (E==0) {cout << "Updated!" << endl; E=count; Ec=countx;} else {cout << "Already Occupied!" << endl; continue;} }
        else if (choice==6) { if (F==0) {cout << "Updated!" << endl; F=count; Fc=countx;} else {cout << "Already Occupied!" << endl; continue;} }
        else if (choice==7) { if (G==0) {cout << "Updated!" << endl; G=count; Gc=countx;} else {cout << "Already Occupied!" << endl; continue;} }
        else if (choice==8) { if (H==0) {cout << "Updated!" << endl; H=count; Hc=countx;} else {cout << "Already Occupied!" << endl; continue;} }
        else if (choice==9) { if (I==0) {cout << "Updated!" << endl; I=count; Ic=countx;} else {cout << "Already Occupied!" << endl; continue;} }
        else {cout << "Wrong Input!" << endl; continue;}
        
        cout << Ac << " | " << Bc << " | " << Cc << endl;;
        cout << Dc << " | " << Ec << " | " << Fc << endl;;
        cout << Gc << " | " << Hc << " | " << Ic << endl;;

        if (A==1&&B==1&&C==1) {
            cout << "Player X Wins!" << endl; system("pause"); return 0;
        } else if (D==1&&E==1&&F==1) {
            cout << "Player X Wins!" << endl; system("pause"); return 0;
        } else if (G==1&&H==1&&I==1) {
            cout << "Player X Wins!" << endl; system("pause"); return 0;
        } else if (A==1&&E==1&&I==1) {
            cout << "Player X Wins!" << endl; system("pause"); return 0;
        } else if (C==1&&E==1&&G==1) {
            cout << "Player X Wins!" << endl; system("pause"); return 0;
        } else if (A==1&&D==1&&G==1) {
            cout << "Player X Wins!" << endl; system("pause"); return 0;
        } else if (B==1&&E==1&&H==1) {
            cout << "Player X Wins!" << endl; system("pause"); return 0;
        } else if (C==1&&F==1&&I==1) {
            cout << "Player X Wins!" << endl; system("pause"); return 0;
        } else if (A==2&&B==2&&C==2) {
            cout << "Player O Wins!" << endl; system("pause"); return 0;
        } else if (D==2&&E==2&&F==2) {
            cout << "Player O Wins!" << endl; system("pause"); return 0;
        } else if (G==2&&H==2&&I==2) {
            cout << "Player O Wins!" << endl; system("pause"); return 0;
        } else if (A==2&&E==2&&I==2) {
            cout << "Player O Wins!" << endl; system("pause"); return 0;
        } else if (C==2&&E==2&&G==2) {
            cout << "Player O Wins!" << endl; system("pause"); return 0;
        } else if (A==2&&D==2&&G==2) {
            cout << "Player O Wins!" << endl; system("pause"); return 0;
        } else if (B==2&&E==2&&H==2) {
            cout << "Player O Wins!" << endl; system("pause"); return 0;
        } else if (C==2&&F==2&&I==2) {
            cout << "Player O Wins!" << endl; system("pause"); return 0;
        } else {
            if (i==9) {
                cout << "Draw!" << endl; system("pause"); return 0;
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