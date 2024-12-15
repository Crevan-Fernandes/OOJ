abstract class Animal{
String food;
int sleep;
Animal(String food, int sleep){
this.food=food;
this.sleep=sleep;
}
abstract void Eat();
abstract void Sleep();
}
class Lion extends Animal{
Lion(String meal, int rest){
super(meal, rest);
}
@Override 
void Eat(){
System.out.println("The lion eats " +food);
}
@Override
void Sleep(){
System.out.println("The lion sleeps for " +sleep+ " hours");
}
}
class Tiger extends Animal{
Tiger(String meal, int rest){
super(meal, rest);
}
@Override 
void Eat(){
System.out.println("The tiger eats " +food);
}
@Override
void Sleep(){
System.out.println("The tiger sleeps for " +sleep+ " hours");
}
}
class Deer extends Animal{
Deer(String meal, int rest){
super(meal, rest);
}
@Override 
void Eat(){
System.out.println("The deer eats " +food);
}
@Override
void Sleep(){
System.out.println("The deer sleeps for " +sleep+ " hours");
}
}
class AnimalTest{
public static void main(String[]args){
Animal lion= new Lion("Bull", 6);
Animal tiger= new Tiger("Zebra", 7);
Animal deer= new Deer("Grass", 4);
lion.Eat();
lion.Sleep();
tiger.Eat();
tiger.Sleep();
deer.Eat();
deer.Sleep();
  System.out.println("Name:Crevan Neil Fernandes");
  System.out.println("USN:1BM23CS082");
}
}
