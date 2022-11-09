public class Singer extends Person{
    private String bandName;


    public Singer(String name, String designation,String bandName) {
        super(name, designation);
        this.bandName=bandName;
    }
    public void singing(){
        System.out.println("singing");
    }


    public void playGitar() {
        System.out.println("playGitar");
    }

    @Override
    public void learn() {
        super.learn();
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void walk() {
        super.walk();
    }

    @Override
    public String toString() {
        return super.toString()+"\nname:"+bandName;
    }
}
