class Mythread extends Thread{
String message;
int interval;
public Mythread(String message,int interval){
this.message=message;
this.interval=interval;
}
public void run(){
try{
while(true){
System.out.println(message);
Thread.sleep(interval);
}
}
catch(InterruptedException e){
System.out.println(e);
}
}
}
class Demo{
public static void main(String args[]){ 
Thread t1=new Mythread("BMS College of Engineering",10000);
Thread t2=new Mythread("CSE", 2000);
t1.start();
t2.start();
System.out.println("Name:Crevan Neil Fernandes");
System.out.println("USN:1BM23CS082");
}
}
