package learn.java.basic;

public class LearnString {
    public static void main(String[] args) {
        String txt = "lksjdfjsldjflsjdfljsldjfsldjflw";
        System.out.println(txt.length());

        System.out.println(txt.toUpperCase());
        System.out.println(txt.toLowerCase());

        String textText = "Please find where locate is located!";
        System.out.println(textText.indexOf("locate"));
    }
}
