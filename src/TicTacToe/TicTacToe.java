/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TicTacToe;

/**
 *
 * @author MalshaL
 */
public class TicTacToe {
    GameLauncher gameLauncher = new GameLauncher();
    
    int[][] currentState = gameLauncher.getState();

    public int checkWin(int x, int y) {
        for (int i = x - 1; i <= x + 1; i++) {
            System.out.println(i);
            if (i >= 0 && i <= 2) {
                for (int j = y - 1; j <= y + 1; j++) {
                    if (j >= 0 && j <= 2) {
                        if (!(i == x && j == y)) {
                            if (currentState[x][y] == currentState[i][j]) {

                                if ((2 * i - x >= 0 && 2 * i - x <= 2) && (2 * j - y >= 0 && 2 * j - y <= 2)) {
                                    if (currentState[i][j] == currentState[2 * i - x][2 * j - y]) {
                                        System.out.println("Print you win" + i + " " + j);
                                        return currentState[i][j];
                                        
                                    }

                                } else {
                                    if ((2 * x - i >= 0 && 2 * x - i <= 2) && (2 * y - j >= 0 && 2 * y - j <= 2)) {
                                        if (currentState[i][j] == currentState[2 * x - i][2 * y - j]) {
                                            System.out.println("Print you win" + i + " " + j);
                                           return currentState[i][j] ;
                                        }
                                    }
                                }
                            }
                        }

                    }
                }
            }
        }
      return 0;
    }
}
