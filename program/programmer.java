package program;

public class programmer extends worker {
    private String languages;

    public programmer(String name, String surname, int id, String languages) {
        super(name, surname, id);
        this.languages = languages;
    }

    public void format(String operating_system) {
        System.out.println(getName() + " " + operating_system + "'s download..");
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("languages that programmers kknow: " + languages);
    }

}
