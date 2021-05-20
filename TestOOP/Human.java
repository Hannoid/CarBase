package TestOOP;

public class Human {
int hand = 2;
int leg = 2;
int head = 1;
int torse =1;
int age =0;


    @Override
    public String toString() {
        return "Human{" +
                "hand=" + hand +
                ", leg=" + leg +
                ", head=" + head +
                ", torse=" + torse +
                '}';
    }


    void voisE (){
        System.out.println("голос");
    }
}
