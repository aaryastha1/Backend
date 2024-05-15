public class CheckParenthesis {
    boolean isBalanced(String exp) {
        String openbraces = "[{(";
        String closebraces = "[}]";
        Stack stk = new Stack(exp.length());
        for (int i = 0; i < exp.length(); i++) {
            char bracket = exp.charAt(i);
            if (bracket== '['|| bracket =='{' || bracket=='(') {
                stk.push(bracket);
            }
            else{
                int indx=closebraces.indexOf(bracket);
                int crossopeningbracket = openbraces.charAt(indx);
                if(stk.isEmpty()){
                    return false;
                }
                if(crossopeningbracket!=stk.pop()){
                    return false;
                }
            }

        }
    }
}
