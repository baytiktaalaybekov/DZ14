public class Main {
    public static void main(String[] args) {
       Programmer programmer=new Programmer("Baytik","Java","peaksoft");
        System.out.println(programmer);
        programmer.coding();
        programmer.learn();
        programmer.walk();
        programmer.eat();
        System.out.println("===========================");
        Dancer dancer=new Dancer("Baytik","Python","Apple");
        System.out.println(dancer);
        dancer.dancing();
        dancer.learn();
        dancer.walk();
        dancer.eat();
        System.out.println("================================");
        Singer singer=new Singer("Baytik","JS","Meta");
     System.out.println(singer);
     singer.singing();
     singer.playGitar();
     singer.learn();
     singer.walk();
     singer.eat();
    }
}