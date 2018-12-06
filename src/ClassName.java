import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassName {
    private static final String NAME_REGEX ="^[ACP]\\d{4}[GHIKLM]$";

    public ClassName(){

    }

    public boolean validate(String regex){
        Pattern pattern = Pattern.compile(NAME_REGEX);
        Matcher matcher = pattern.matcher(regex);

        return matcher.matches();
    }
}
class Main {
    private static ClassName exampleClassName;
    private static final String[] valiClassName = new String[] {"C0318G"};
    private static final String[] invaliClassName = new String[] { "M0318G", "P0323A"};

    public static void main(String[] args) {

        exampleClassName = new ClassName();

        for (String className:valiClassName) {
            boolean isValid = exampleClassName.validate(className);
            System.out.println("Class name is " + className +" is valid: "+ isValid);
        }

        for (String className:invaliClassName) {
            boolean isValid = exampleClassName.validate(className);
            System.out.println("Class name is " + className + " is valid: " + isValid);
        }

    }
}