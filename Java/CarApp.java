class Car {
    String brand;
    String color;
    int price;
    
    void accelerate(){
        System.out.println(brand+" Car accelarates");
    }
}

class CarApp{
    public static void main(String[] args) {
        Car c = new Car();
        c.brand = "maruthi";
        c.color = "cyan";
        c.price = 120000;

        System.out.println("Brand : "+c.brand);;
        System.out.println("Color : "+c.color);
        System.out.println("Price : "+c.price);
        c.accelerate();
    }
} 