
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;

/**
 *
 * @author MalshaL
 */
public class TicTacToe {
    GameLauncher gameLauncher = new GameLauncher();
    
    public void checkWin(int x, int y){
        for(int i=x-1; i<=x+1; i++){
            if (x>=0 || x<=2){
                for(int j=y-1; j<=y+1; j++){
                    if (y>=0 || y<=2){
                        //check win
                    }
                }
            }
        }
    }
}
