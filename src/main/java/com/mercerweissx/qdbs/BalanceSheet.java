package com.mercerweissx.qdbs;

import java.util.LinkedList;
import java.util.List;



public class BalanceSheet
{
  private String title;
  
  private final LinkedList<Transaction> assets = new LinkedList<>();
  private final LinkedList<Transaction> liabilities = new LinkedList<>();
  
  public BalanceSheet(String title)
  {
    this.title = title;
  }
  
  public String getTitle()
  {
    return title;
  }
  
  public void addAsset(String name, long value)
  {
    assets.add(new Transaction(name, value));
  }
  
  public void addLiability(String name, long value)
  {
    liabilities.add(new Transaction(name, value));
  }
  
  public List<Transaction> getAssets()
  {
    return List.copyOf(assets);
  }
  
  public List<Transaction> getLiabilities()
  {
    return List.copyOf(liabilities);
  }
}
