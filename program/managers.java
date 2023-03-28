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
        System.out.println("number of people that manager responsible: " + personNum);
    }

    public void makeRaise(int amountRaise) {
        System.out.println(" raise " + amountRaise + " workers " + getName());
    }
}
