public class Main
{
    public static void main(String[] args)
    {
        String user = "Tom";
        String lastName = "Wulf";
        String fullName = user + " " + lastName;

        System.out.println(fullName);

        int score = 100;

        System.out.println("The score is " + score);  // "100"

        int tomLength = user.length();  // 3

        System.out.println(tomLength);

        System.out.println(user.toLowerCase()); // "tom"
        System.out.println(user.toUpperCase()); // "TOM"
        System.out.println(user);

        user = user.toUpperCase();
        System.out.println(user);

        String first = fullName.substring(0, 3);
        System.out.println("First is " + first);

        String second = fullName.substring(4);
        System.out.println("Second is " + second);

        String bill = "Bill";
        String billy = bill;

        System.out.println("Tom".equals("TOM"));
        System.out.println("Tom".equalsIgnoreCase("TOM"));

        String untrimmed = "  an untrimmed String ";

        System.out.println(untrimmed.trim());

        String num100 = String.valueOf(100); // "100"
        System.out.println(num100);

        //  \n  newline   \t

        System.out.println("Mary had a little lamb!");
        System.out.println("Mary\t had\t a\t little\t lamb!");
        System.out.println("Mary\n had\n a\n little\n lamb!");

    }
}