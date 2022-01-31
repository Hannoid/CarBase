package TestOOP;

public class Female extends Human {
    String sex="FeMale";



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
        System.out.println("female  voise");;
    }

}
