package com.mercerweissx.qdbs;


public class Launcher
{
  public static void main(String[] args)
  {
    UserInterface ui = new UserInterface();
    Application app = new Application(ui);
    app.mainloop();
  }
}
