package idman;

public class idman {
    private int burpee_number;
    private int pushup_number;
    private int situp_number;
    private int squat_number;

    public idman(int burpee_number, int pushup_number, int setup_number, int squat_number) {
        this.burpee_number = burpee_number;
        this.pushup_number = pushup_number;
        this.situp_number = setup_number;
        this.squat_number = squat_number;
    }

    public int getBurpee_number() {
        return burpee_number;
    }

    public void setBurpee_number(int burpee_number) {
        this.burpee_number = burpee_number;
    }

    public int getPushup_number() {
        return pushup_number;
    }

    public void setPushup_number(int pushup_number) {
        this.pushup_number = pushup_number;
    }

    public int getSetup_number() {
        return situp_number;
    }

    public void setSetup_number(int situp_number) {
        this.situp_number = situp_number;
    }

    public int getSquat_number() {
        return squat_number;
    }

    public void setSquat_number(int squat_number) {
        this.squat_number = squat_number;
    }

    public void makeMove(String kindOfMove, int number) {
        if (kindOfMove.equals("burpee")) {
            make_burpee(number);
        } else if (kindOfMove.equals("pushup")) {
            make_pushup(number);
        } else if (kindOfMove.equals("situp")) {
            make_situp(number);
        } else if (kindOfMove.equals("squat")) {
            make_squat(number);
        } else {
            System.out.println("invalid move..");
        }
    }

    public void make_burpee(int number) {
        if (burpee_number == 0) {
            System.out.println("congratulations! your burpee is completed..");
        }
        if (burpee_number - number < 0) {
            System.out.println("you have more burpee. congratulations!");
            burpee_number = 0;
            System.out.println("remaining number of burpee: " + burpee_number);
        } else {
            burpee_number -= number;
            System.out.println("remaining number of burpee: " + burpee_number);
        }
    }

    public void make_pushup(int number) {
        if (pushup_number == 0) {
            System.out.println("congratulations! your pushup is completed..");
        }
        if (pushup_number - number < 0) {
            System.out.println("you have more pushup. congratulations!");
            pushup_number = 0;
            System.out.println("remaining number of pushup: " + pushup_number);
        } else {
            pushup_number -= number;
            System.out.println("remaining number of pushup: " + pushup_number);
        }
    }

    public void make_situp(int number) {
        if (situp_number == 0) {
            System.out.println("congratulations! your situp is completed..");
        }
        if (situp_number - number < 0) {
            System.out.println("you have more situp. congratulations!");
            situp_number = 0;
            System.out.println("remaining number of situp: " + situp_number);
        } else {
            situp_number -= number;
            System.out.println("remaining number of situp: " + situp_number);
        }
    }

    public void make_squat(int number) {
        if (squat_number == 0) {
            System.out.println("congratulations! your squat is completed..");
        }
        if (squat_number - number < 0) {
            System.out.println("you have more squat. congratulations!");
            squat_number = 0;
            System.out.println("remaining number of squat: " + squat_number);
        } else {
            squat_number -= number;
            System.out.println("remaining number of squat: " + squat_number);
        }
    }

    public boolean finishingIdman() {
        return (burpee_number == 0) && (pushup_number == 0) && (situp_number == 0) && (squat_number == 0);
    }
}
