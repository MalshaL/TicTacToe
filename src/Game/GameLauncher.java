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
public class GameLauncher {
    private static int [][] gridState = {{0,0,0},{0,0,0},{0,0,0}};
    
    public int[][] getState(){
        return gridState;
    }
    
    public void setState(int x, int y, String p){
        switch (p) {
            case "p1":
                gridState[x][y] = 1;
                break;
            case "p2":
                gridState[x][y] = 2;
                break;
        }
    }
}
