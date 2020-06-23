import javax.swing.text.html.HTMLDocument.HTMLReader.CharacterAction;

class FixedExpressions{

    public static void main(String[] args) {
        String exp1="a+b*(x+y^3)";
        System.out.println(exp1+" => "+infixToPostFix(exp1));
    }

    private static int precedence(char ch){
        switch(ch){
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

    public static String infixToPostFix(String expression){
        String result="";
        int index=0;
        StackInterface<Character> stack=new LinkedStack<>();

        for(;index<expression.length();index++){
            Character currentCh=expression.charAt(index);

            if(Character.isLetterOrDigit(currentCh)){
                result+=currentCh;
            }else if(currentCh=='('){
                stack.push(currentCh);
            }else if(currentCh==')'){
                while(!stack.isEmpty() && stack.peek() != '('){
                    result+=stack.pop();
                }

                if(!stack.isEmpty() && stack.peek()!='('){
                    return "Invalid Expression";
                }else{
                    stack.pop();
                }
            }else{
                while(!stack.isEmpty() && precedence(currentCh)<=precedence(stack.peek())){
                    if(stack.peek()=='('){
                        return "Invalid Expression";
                    }
                    result+=stack.pop();
                }
                stack.push(currentCh);
            }
          
        }
        while(!stack.isEmpty()){
            if(stack.peek()=='('){
                return "Invalid Expression";
            }
            result+=stack.pop();
        }

        return result;
    }

    public static String infixToPostfix(String expression){
        String result="";

        result=new StringBuilder(infixToPostFix(expression)).reverse().toString();        
        return result;
    }

}