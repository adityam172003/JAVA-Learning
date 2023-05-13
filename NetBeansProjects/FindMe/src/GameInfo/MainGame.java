/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GameInfo;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class MainGame
{
  public  int chance;
    int  findNum;
   public int userNum;
    String result;
    
    public MainGame()
    {
        chance = 10;
        Scanner sc = new Scanner(System.in);
        
        Random num= new Random();
        
        findNum = num.nextInt(100);
        
    }
    
  public   int getDiff(int x)
  {
        return  x-findNum;
   }
    
  public String getres()
  {
      return result;
  }
  
  public int getFindNum()
  {
      return findNum;   
  }
       
}
