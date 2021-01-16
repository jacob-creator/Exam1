public class VeryNice {
    static String[] names = new String[5];
    static double[] grade = new double[5];

    public static void main(String[] args) {

        //Lollero's info
        names[0] = "Lollero";
        grade[0] = 27.6;

        //Jake's info
        names[1] = "Jake";
        grade[1] = 21.5;

        //Susie's info
        names[2] = "Susie";
        grade[2] = 72.5;

        //Jamie's info
        names[3] = "Jamie";
        grade[3] = 96.5;

        //Nathan's info
        names[4] = "Nathan";
        grade[4] = 85.9;

        int i = 0;

        for (String element : names) {
            if (grade[i] < 0) {
                System.out.println("This is not an accurate grade! therefore, ERROR!");
            } else if (grade[i] >= 0 && grade[i] < 60) {
                System.out.println(names[i] + ", Your grade average is " + grade[i] + "%!" + " Your grade is a F!\n");
            } else if (grade[i] >= 60 && grade[i] < 70) {
                System.out.println(names[i] + ", Your grade average is " + grade[i] + "%!" + "Your grade is a D!\n");
            } else if (grade[i] >=70 && grade[i] <75){
                System.out.println(names[i] + ", Your grade average is " + grade[i] + "%!" + "Your grade is a C!\n");
            } else if (grade[i] >=75.1 && grade[i] < 80){
                System.out.println(names[i] + ", Your grade average is " + grade[i] + "%!" + "Your grade is a C+!\n");
            } else if (grade[i] >=80 && grade[i] <83) {
                System.out.println(names[i] + ", Your grade average is " + grade[i] + "%!" + "Your grade is a B-!\n");
            } else if (grade[i] >=83 && grade[i] <86) {
                System.out.println(names[i] + ", Your grade average is " + grade[i] + "%!" + "Your grade is a B!\n");
            } else if (grade[i] >=86 && grade[i] <90) {
                System.out.println(names[i] + ", Your grade average is " + grade[i] + "%!" + "Your grade is a B+!\n");
            } else if (grade[i] >=90 && grade[i] <93) {
                System.out.println(names[i] + ", Your grade average is " + grade[i] + "%!" + "Your grade is a A-!\n");
            } else if (grade[i] >=93 && grade[i] <=100) {
                System.out.println(names[i] + ", Your grade average is " + grade[i] + "%!" + "Your grade is a A!\n");
            }
            i++;
        }
    }
}