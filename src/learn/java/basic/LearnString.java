package learn.java.basic;

public class LearnString {
    public static void main(String[] args) {
        String txt = "lksjdfjsldjflsjdfljsldjfsldjflw";
        System.out.println(txt.length());

        System.out.println(txt.toUpperCase());
        System.out.println(txt.toLowerCase());

        String textText = "Please find where locate is located!";
        System.out.println(textText.indexOf("locate"));

        String firstName = "Shakeel";
        String lastName = "Rahman";
        System.out.println(firstName + " " + lastName);
        System.out.println(firstName.concat(" ").concat(lastName));

        String txt1 = "We are so called \"Vikings\" from the north.";
        System.out.println(txt1);

        String txt2 = "It\'s alright";
        System.out.println(txt2);

        System.out.println("This is before\fNow new line");
        System.out.println("Textlksdlsfdks\rOverlap");
        System.out.println("12\b3");

        String x = "10";
        int y = 20;
        String z = x + y;
        System.out.println(z);
    }
}
