package com.mercerweissx.qdbs;

import java.util.Scanner;
import java.io.PrintStream;


public class UserInterface
{
  private static final Scanner INP = new Scanner(System.in);
  private static final PrintStream OUT = System.out;
  
  private final int width;
  private final int height;
  
  public UserInterface(int w, int h)
  {
    width = w;
    height = h;
  }
  
  public String promptUser()
  {
    return INP.nextLine();
  }
  
  public void printBalanceSheet(String cmd)
  {
    OUT.println(getCursorPosition());
  }
  
  private void setCursorPosition(int x, int y)
  {
    OUT.printf("%c[%d;%dH", 0x1B, x, y);
  }
  
  private Position getCursorPosition()
  {
    setCursorPosition(1000, 1000);
    OUT.printf("%c[6n", 0x1B);
    return new Position(0, 0);
  }
}
