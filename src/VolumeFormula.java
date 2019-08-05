public class VolumeFormula {

    private double volume;
    private double length;
    private double width;
    private double height;
    private int choice;


    public VolumeFormula() {  // default Constructor
        this.volume = 0.0;    // default init (optional)
        this.length = 0.0;    // Note: you don’t have to initialize class variables or instance variables
        this.width  = 0.0;    // since they are given default values, e.g. 0.0 and 0
        this.height = 0.0;
        this.choice = 0;
    }

    public String showMenu() {
        final String submenu = "\n================\n" +
                "   Sub Menu      \n" +
                "================\n" +
                " 1. Compute for Volume?   \n" +
                " 2. Compute for length?   \n" +
                " 3. Compute for width?    \n" +
                " 4. Compute for height?   \n" +
                " 5. Exit to Main Menu     \n" +
                "================\n\n";
        return submenu;
    }

    public String showPrompt() {
        String prompt;
        switch (choice) {
            case 1:
                prompt = "Input length, width, and height: ";
                break;
            case 2:
                prompt = "Input volume, width, and height: ";
                break;
            case 3:
                prompt = "Input volume, length, and height: ";
                break;
            case 4:
                prompt = "Input volume, length, and width: ";
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
                result= "The volume is : " + computeVolume();
                break;
            case 2:
                result = "The length is : " + computeLength();
                break;
            case 3:
                result = "The width is : " + computeWidth();
                break;
            case 4:
                result = "The height is : " + computeHeight();
                break;
            default:
                result = "Invalid or Uninitialized choice variable";
        }
        return result;
    }

    public void readInput(double input1, double input2, double input3) {
        switch (choice) {
            case 1:
                setLength(input1);
                setWidth(input2);
                setHeight(input3);
                break;
            case 2:
                setVolume(input1);
                setWidth(input2);
                setHeight(input3);
                break;
            case 3:
                setVolume(input1);
                setLength(input2);
                setHeight(input3);
                break;
            case 4:
                setVolume(input1);
                setLength(input2);
                setWidth(input3);
                break;
            default:
                setLength(input1);
                setWidth(input2);
                setHeight(input3);
        }
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getChoice() {
        return choice;
    }

    public void setChoice(int choice) {
        this.choice = choice;
    }


    private double computeVolume() {
        return (length * width * height);
    }

    private double computeLength() {
        return (volume / (width * height));
    }

    private double computeWidth() {
        return (volume / (length * height));
    }

    private double computeHeight() {
        return (volume / (length * width));
    }
}
