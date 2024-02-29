class Dog{
  String name;
  String breed;
  void bark(){
    System.out.println("bow bow!!");
  }
}

class DogApp{
  public static void main(String[] args) {
    Dog dog1 = new Dog();
    dog1.name = "Rocky";
    dog1.breed = "Lab";
    Dog dog2 = new Dog();
    dog2.name = "Pluto" ;
    dog2.breed = "Pamerian";
    System.out.println("Dog name : "+dog1.name);
    System.out.println("Dog breed : "+dog1.breed);
    System.out.print("barking : ");
    dog1.bark();
    System.out.println("Dog name : "+dog2.name);
    System.out.println("Dog breed : "+dog2.breed);
    System.out.print("barking : ");
    dog2.bark();
  }
}