package homework.braceChecker;

public class BraceChecker {

    private String text;
    private Stack stack = new Stack();
    private Stack stackIndex = new Stack();

    public BraceChecker(String text) {
        this.text = text;
    }

    public void check() {

        int openedIndex = 0;
        int stackSize = 0;
        for (int i = 0; i < text.length(); i++) {
            char sim = text.charAt(i);
            switch (sim) {
                case '[':
                case '{':
                case '(':
                    stack.push(sim);
                    stackIndex.push((char) i);
                    stackSize++;
                    break;
                case ']':
                case ')':
                case '}':
                    char brace = stack.pop();
                    openedIndex = (int) stackIndex.pop();
                    stackSize--;
                    if (brace == ' ') {

                        System.out.println("ERROR closed " + sim + " but not open in line " + i);
                    }
                    if ((brace == '(' && sim != ')')||(brace == '[' && sim != ']')||(brace == '{' && sim != '}') ){

                        System.out.println("ERROR opened " + brace + " but closed " + sim + " in line " + i);
                    }
                    break;
                default:
                    break;
            }


        }

        if (stackSize > 0) {
            for (int i = stackSize; i > 0; i--) {
                char openBrace = stack.pop();
                openedIndex = (int) stackIndex.pop();
                System.out.println("ERROR opened " + openBrace + " but not closed " + openedIndex);
            }

        }

    }


}

