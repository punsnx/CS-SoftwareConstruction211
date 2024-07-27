public class Car {
    private boolean hasSunRoof;
    public Car(){
        hasSunRoof = false;
    }

    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car.hasSunRoof);
    }
}
