package homework.braceChecker;

public class BraceCheckerTest {
    public static void main(String[] args) {
        String text = "fff(ssa))";
        BraceChecker bc = new BraceChecker("(([((H}}");
        BraceChecker bc1 = new BraceChecker(text);

        bc.check();
        bc1.check();

    }
}