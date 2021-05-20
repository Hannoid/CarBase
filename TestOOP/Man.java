package TestOOP;

public class Man extends Human {
    String sex="Male";



    @Override
    public String toString() {
        return "Human{" +
                "hand=" + hand +
                ", leg=" + leg +
                ", head=" + head +
                ", torse=" + torse + " Sex=" + sex+
                '}';
    }


    @Override
    void voisE() {
        System.out.println("ve");;
    }
}
