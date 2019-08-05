public class CoulombsLaw {

    private double force; // Coulomb force between two charges
    private double q1;   //  Point charge 1 magnitude
    private double q2;   //  Point charge 2 magnitude
    private double r;    //  Distance between two point charges

    private final double k = 8987551787.3681764;//Coulomb force constant

    private int choice;

    public CoulombsLaw() {
        this.q1 = 0.0;
        this.q2 = 0.0;
        this.r = 0.0;
        this.force = 0.0;
    }

    public String showMenu() {
        final String submenu = "\n================\n" +
                "   Sub Menu      \n" +
                "================\n" +
                " 1. Compute for Coulomb Force?   \n" +
                " 2. Compute for Q1?   \n" +
                " 3. Compute for Q2?    \n" +
                " 4. Compute for distance (r)?   \n" +
                " 5. Exit to Main Menu     \n" +
                "================\n\n";
        return submenu;
    }

    public String showPrompt() {
        String prompt;
        switch (choice) {
            case 1:
                prompt = "Input Q1, Q2, and distance: ";
                break;
            case 2:
                prompt = "Input Coulomb Force, Q2, and distance: ";
                break;
            case 3:
                prompt = "Input Coulomb Force, Q1, and distance: ";
                break;
            case 4:
                prompt = "Input Coulomb Force, Q1, and Q2: ";
                break;
            default:
                prompt = "Invalid or Uninitialized choice variable";
        }
        return prompt;
    }

    public String showResult() {
        String result;
        switch (choice) {
            case 1:
                result = "The Coulomb Force is : " + computeForce();
                break;
            case 2:
                result = "The Q1 is : " + computeQ1();
                break;
            case 3:
                result = "The Q2 is : " + computeQ2();
                break;
            case 4:
                result = "The distance is : " + computeDistance();
                break;
            default:
                result = "Invalid or Uninitialized choice variable";
        }
        return result;
    }


    private double computeForce() {
        return ((k * q1 * q2) / (r * r));
    }

    private double computeQ1() {
        return (force * (r * r) / (k * q2));
    }

    private double computeQ2() {
        return (force * (r * r) / (k * q1));
    }

    private double computeDistance() {
        return (Math.sqrt(k * q1 * q2 / force));
    }


    public void readInput(double input1, double input2, double input3) {
        switch (choice) {
            case 1:
                setQ1(input1);
                setQ2(input2);
                setR(input3);
                break;
            case 2:
                setForce(input1);
                setQ2(input2);
                setR(input3);
                break;
            case 3:
                setForce(input1);
                setQ1(input2);
                setR(input3);
                break;
            case 4:
                setForce(input1);
                setQ1(input2);
                setQ2(input3);
                break;
            default:
                setQ1(input1);
                setQ2(input2);
                setR(input3);
        }
    }

    public int getChoice() {
        return choice;
    }

    public void setChoice(int choice) {
        this.choice = choice;
    }

    public double getQ1() {
        return q1;
    }

    public void setQ1(double q1) {
        this.q1 = q1;
    }

    public double getQ2() {
        return q2;
    }

    public void setQ2(double q2) {
        this.q2 = q2;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getForce() {
        return force;
    }

    public void setForce(double force) {
        this.force = force;
    }

    public double getK() {
        return k;
    }


}
