package com.mercerweissx.qdbs;

public class Application
{
  private final UserInterface appUI;
  
  private boolean isRunning = false;
  
  public Application(UserInterface ui)
  {
    appUI = ui;
  }
  
  public int mainloop()
  {
    isRunning = true;
    String cmd = "First!";
    while (isRunning)
    {
      appUI.printBalanceSheet(cmd);
      cmd = appUI.promptUser();
    }
    return 0;
  }
}
