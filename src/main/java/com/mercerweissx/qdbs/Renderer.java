package com.mercerweissx.qdbs;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.util.Scanner;


public class Renderer
{
  private static final char ESC = 0x1B;
  
  private static final Scanner INP = new Scanner(System.in);
  private static final PrintStream OUT = System.out;
  
  public static Pair getScreenDimensions()
  {
    int w = 0;
    int h = 0;
    try
    {
      String response = Runtime.getRuntime()
      .exec(new String[]{"stty", "size"})
      .inputReader()
      .readLine();
      Scanner intScanner = new Scanner(response);
      h = intScanner.nextInt();
      w = intScanner.nextInt();
      intScanner.close();
    }
    catch (IOException | NullPointerException e)
    {
      e.printStackTrace(System.err);
    }
    return new Pair(w, h);
  }
  
  public static void setCursorPosition(Pair position)
  {
    setCursorPosition(position.a(), position.b());
  }
  
  public static void setCursorPosition(int x, int y)
  {
    OUT.printf("%c[%d;%dH", ESC, x, y);
  }
  
  public static Pair getCursorPosition()
  {income
    return new Pair(0, 0);
  }
  
  public static String scanLine()
  {
    return INP.nextLine();
  }
  
  public static void printLine(String str)
  {
    OUT.println(str);
  }
  
  public static void clearScreen()
  {
    setCursorPosition(0, 0);
    OUT.printf("%c[J", ESC);  }
}
