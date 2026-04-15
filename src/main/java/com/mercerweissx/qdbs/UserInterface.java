package com.mercerweissx.qdbs;


public class UserInterface
{ 
  private final int width;
  private final int height;
  
  public UserInterface()
  {
    Pair dimensions = Renderer.getScreenDimensions();
    System.out.println(dimensions);
    width = dimensions.a();
    height = dimensions.b();
  }
    
  public String promptUser()
  {
    return Renderer.scanLine();
  }
  
  public void printBalanceSheet(String cmd)
  {
    Renderer.clearScreen();
    Renderer.printLine(cmd);
    for (int i = 0; i < height - 2; i++)
      Renderer.printLine("");
  }
}
