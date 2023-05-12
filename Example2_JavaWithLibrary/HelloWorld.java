import org.apache.commons.lang3.StringUtils;

public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello there!");
        System.out.println("Is \"    \" an empty string? " + StringUtils.isBlank("    "));
    }
}