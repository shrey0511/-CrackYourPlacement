//https://leetcode.com/problems/valid-number/

public class ValidNumber_65 {
    public static void main(String[] args) {
        
    }

    public boolean isNumber(String s) {
        s = s.trim();

        boolean dotSeen = false;
        boolean eSeen = false;
        boolean numberSeen = false;
        boolean numberAfterE = true;

        for(int i = 0 ; i<s.length() ; i++){
            if('0' <= s.charAt(i) && s.charAt(i) <= '9'){
                numberSeen = true;
                numberAfterE = true;

            }else if(s.charAt(i) == '.'){
                if(dotSeen || eSeen)
                    return false;

                dotSeen = true;

            }else if(s.charAt(i) == '+' || s.charAt(i) == '-'){
                if(i != 0 && s.charAt(i-1) != 'e' && s.charAt(i-1) != 'E')
                    return false;

            }else if(s.charAt(i) == 'e' || s.charAt(i) == 'E'){
                if(eSeen || !numberSeen)
                    return false;

                numberAfterE = false;
                eSeen = true;
                
            }else{
                return false;
            }
        }
        return numberSeen && numberAfterE;
    }
}
