package com.mercerweissx.qdbs;

import java.util.LinkedHashMap;
import java.util.List;

import static java.util.Map.Entry;



public class BalanceSheet
{
  private String title;
  
  private final LinkedHashMap<String,Long> income = new LinkedHashMap<>();
  private final LinkedHashMap<String,Long> expenses = new LinkedHashMap<>();
  
  public BalanceSheet(String title)
  {
    this.title = title;
  }
  
  public String getTitle()
  {
    return title;
  }
  
  public void addIncome(String name, long value)
  {
    income.put(name, value);
  }
  
  public void addExpense(String name, long value)
  {
    expenses.put(name, value);
  }
  
  public List<Entry<String,Long>> getIncome()
  {
    return List.copyOf(income.sequencedEntrySet());
  }
  
  public List<Entry<String,Long>> getExpenses()
  {
    return List.copyOf(expenses.sequencedEntrySet());
  }
}
