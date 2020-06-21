public class BalanceChecker{
    public static void main(String[] args) {
        
    }

    public static boolean checkBalance(String expression){
        boolean isBalanced=true;
        int charactorCount=expression.length();
        StackInterface<Character> openDelimiterStack=new LinkedStack<Character>();
        int index=0;
        char nextChar=' ';
        for(; isBalanced && (index<charactorCount); index++){
            nextChar=expression.charAt(index);

            switch(nextChar){
                case '{': case '[':case '(':
                    openDelimiterStack.push(nextChar);
                    break;
                case ')': case ']': case '}':
                    if(openDelimiterStack.isEmpty()){
                        isBalanced=false;
                    }else{
                        char openDelimiter=openDelimiterStack.pop();
                        isBalanced=isPaired(openDelimiter, nextChar);
                    }
                    break;
                default: break;
            }
        }

        if(!openDelimiterStack.isEmpty()){
            isBalanced=false;
        }

        return isBalanced;
    }

    private static boolean isPaired(char open, char close){
        return (open=='(' && close==')') || (open=='[' && close==']') || (open=='{' && close=='}');
    }
}