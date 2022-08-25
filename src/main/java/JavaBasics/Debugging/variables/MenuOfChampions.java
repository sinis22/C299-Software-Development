package JavaBasics.Debugging.variables;

public class MenuOfChampions {

    public static void main(String[] args) {
        String brownie = "Chocoloate Brownie";
        double browniePrice = 4.50;

        String cheesecake = "Caramel Cheesecake";
        double cheesecakePrice = 3.00;

        String iceCream = "1 scoop of any ice cream of choice";
        double iceCreamPrice = 1.50;

        System.out.println("* - * - * - * - * - * - * - * - * - * - * - * - * - * - * - *");
        System.out.println("               Welcome to Heavenly Desserts");
        System.out.println("                         Menu");
        System.out.println("* - * - * - * - * - * - * - * - * - * - * - * - * - * - * - *");

        System.out.println("        "+brownie+ "         £" + Math.round(browniePrice * 100.0) / 100.0);
        System.out.println("        "+cheesecake+ "      £" + Math.round(cheesecakePrice * 100.0) / 100.0);
        System.out.println("        "+iceCream + "       £" + Math.round(iceCreamPrice * 100.0) / 100.0);


    }
}
