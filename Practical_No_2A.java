class emp {
    void calculateSalary() {
        int esal = 2000;
        System.out.println("Employee salary: " + esal);
    }
}

class Man extends emp {
    @Override
    void calculateSalary() {
        int msal = 50000;
        System.out.println("Manager salary: " + msal);
    }
}

class Prog extends emp {
    @Override
    void calculateSalary() {
        int psal = 60000;
        System.out.println("Programmer salary: " + psal);
    }
}

public class pr2 {
    public static void main(String[] args) {

        emp e1;

        e1 = new emp();
        e1.calculateSalary();

        e1 = new Man();
        e1.calculateSalary();

        e1 = new Prog();
        e1.calculateSalary();
    }
}