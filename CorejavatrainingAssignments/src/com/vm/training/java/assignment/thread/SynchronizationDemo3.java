package com.vm.training.java.assignment.thread;
class Account
{
  public void balance(int time)
  {
    synchronized(this) {

    }
    for(int i=1;i<=time;i++)
    {
      System.out.println(Thread.currentThread().getName() +" is updating ");
    }
    for(int i=0;i<=time;i++)
    {
      System.out.println(Thread.currentThread().getName() +" Can apply for loan");
    }
  }
}
class Transaction implements Runnable
{
  Account account=new Account();
  public void run() {
    account.balance(4);
  }
}

public class SynchronizationDemo3 {

  public static void main(String [] args) {
    Transaction transaction =new Transaction();

    Thread deposit=new Thread(transaction);
    Thread withdraw=new Thread(transaction);

    deposit.setName("deposit");
    withdraw.setName("withdrawing");

    deposit.start();
    withdraw.start();
  }
}
