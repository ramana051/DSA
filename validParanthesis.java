public class validParanthesis {
    public static void main(String args[]){
        String s="(()())(())";
        StringBuilder sb=new StringBuilder();
        int balance=0;
        for(char c:s.toCharArray()){
            if(c=='('){
                balance++;
                sb.append(c);
            }
            else if(c==')'){
                if(balance>0){
                    balance--;
                    sb.append(c);
                }
            }
        }
        System.out.println(sb.toString());
    }
}
