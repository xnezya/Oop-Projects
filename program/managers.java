package program;

public class managers extends worker {
    private int personNum;

    public managers(String name, String surname, int id, int personNum) {
        super(name, surname, id);
        this.personNum = personNum;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("person number that managers responsibility: " + personNum);
    }

    public void makeRaise(int amountRaise) {
        System.out.println(getName() + " workers " + amountRaise + " raise ");
    }
}
