public class Main
{
    public static void main(String[] args)
    {
        // Declare variables
        double INTEREST_RATE = 0.17;
        double cardBalance = 5000;
        double monthOneInterest = 0;
        double monthTwoInterest = 0;

        // Calculate interest
        monthOneInterest = cardBalance * INTEREST_RATE;
        cardBalance = cardBalance + monthOneInterest;
        monthTwoInterest = monthOneInterest + cardBalance * INTEREST_RATE;

        // Display
        System.out.println("The interest after 1 month is $" + monthOneInterest);
        System.out.println("The interest after 2 months is $" + monthTwoInterest);



    }
}