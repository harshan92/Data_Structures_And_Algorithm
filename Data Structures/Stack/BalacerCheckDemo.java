public class BalacerCheckDemo {
    public static void main(String[] args) {
        String exp1="p (x+1)(x+2)";
        String exp2="p (x+1)[x+2)";
        String exp3="{p (x+1)[x+2]}";
        String exp4="{p (x+1)[x+2]} mm";
        System.out.println(exp1+" is "+ BalanceChecker.checkBalance(exp1));
        System.out.println(exp2+" is "+ BalanceChecker.checkBalance(exp2));
        System.out.println(exp3+" is "+ BalanceChecker.checkBalance(exp3));
        System.out.println(exp4+" is "+ BalanceChecker.checkBalance(exp4));
    }
}