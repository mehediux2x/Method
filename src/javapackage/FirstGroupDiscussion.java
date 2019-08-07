package javapackage;

/**Bisi earn 6500 per month and you are allowed to contribute a portion of your gross monthly pay to a
 * retirement plan.You want to determination the amount of your pay that will go into the plan
 * if you contribute 5 percent,8 percent , or 10 percent of your gross pay.
 */

public class FirstGroupDiscussion //Create class
{
    public static void main(String[] args)  //main method
    {
        String name001 = "Bisi";
        double monthlyPay = 6500.0;  // Variables to hold the monthly payment
        double contribution;        // and the amount of contribution

        System.out.println(name001);

        //calculate and display a 5% contribution
        contribution = monthlyPay * .05 ;
        System.out.println("5 percent is $"+ contribution + " per month");


        //calculate and display a 8% contribution
        contribution = monthlyPay * 0.08;
        System.out.println("8 percent is $"+ contribution + " per month");

        //calculate and display a 10 percent contribution
        contribution = monthlyPay * 0.1;
        System.out.println("10 percent is $"+ contribution + " per month"); //printing 10% of the monthly pay


        /**Bisi sell pizza regularly price at $605 and he is planning to have sale where the the item price
         * will reduce by 20 percent . after 20% whats the saleprice?
          */

        double regularPrice = 605;
        double discountPrice;
        //Calculate the amount of 20% discount
        discountPrice = regularPrice * 0.02 ;
        System.out.println("Regular price: $"+ regularPrice);
        System.out.println("Discount amount: $"+discountPrice);

        //Calculate the sale price by subtracting
        //discount - regular price
        double salePrice;
        salePrice = regularPrice - discountPrice;

        System.out.println("Sale price: $"+ salePrice);



        int x = 50;
        x *=100;
        short y =3607;
        y -= 2;
        System.out.println(x);
        System.out.println(y);




        String message = "Bisi Is a GuNdA!";
        System.out.println(message);

        //String upperCase = message.toUpperCase();
        //System.out.println(upperCase);
        System.out.println(message.toUpperCase());

        System.out.println(message.toLowerCase());

        System.out.println(message.length());

        System.out.println(message.indexOf('B'));

        System.out.println(message.indexOf("Is"));

        System.out.println(message.charAt(8));























    }
}
