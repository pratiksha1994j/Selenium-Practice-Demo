public class Demothis {

    int x=10;
    int y=20;

    Demothis(int x, int y){
        System.out.println("In Contsructor");
        this.x=x;
        this.y=y;
    }

    void fun(){
        System.out.println("In methos"+x+y);
    }
}
class ConstDemo{
    public static void main(String[] args){
        Demothis dt=new Demothis(30,40);
        dt.fun();
    }
}