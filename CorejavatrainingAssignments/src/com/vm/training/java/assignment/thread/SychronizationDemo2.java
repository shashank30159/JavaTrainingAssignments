package com.vm.training.java.assignment.thread;
class Talking
{
 synchronized public void talking(int time)
 {
  for(int i=1;i<=time;i++)
   System.out.println(Thread.currentThread().getName()+" is on call");
 }
}
class STD implements Runnable
{
 Talking talk = new Talking();
 public void run() {
  talk.talking(6);
 }
}
public class SychronizationDemo2 {
 public static void main(String[] args) {
  STD std= new STD();
  Thread shashank = new Thread(std);
  Thread sasi = new Thread(std);
  shashank.setName("Shashank");
  sasi.setName("Sasi");
  shashank.start();
  sasi.start();
 }
}

