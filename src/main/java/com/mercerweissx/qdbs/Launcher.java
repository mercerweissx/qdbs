package com.mercerweissx.qdbs;


public class Launcher
{

  public static void main(String[] args)
  {
    UserInterface ui = new UserInterface(120, 32);
    Application app = new Application(ui);
    app.mainloop();
  }

}
