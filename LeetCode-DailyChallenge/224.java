class Solution {
    public int calculate(String s) {
        Stack<Integer> st = new Stack<>();
        int res = 0;
        int num = 0;
        int sign = 1;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                num = 10 * num + (int)(ch - '0');
            }
            else if(ch == '+'){
                res += sign * num;
                num = 0;
                sign = 1;
            }
            else if(ch == '-'){
                res += sign * num;
                num = 0;
                sign = -1;
            }
            else if(ch == '('){
                st.push(res);
                st.push(sign);
                res = 0;
                sign = 1;
            }
            else if(ch == ')'){
                res += sign * num;
                num = 0;
                res *= st.pop();
                res += st.pop();
            }
        }
        if(num != 0) res += sign * num;
        return res;
    }
}

// Time Complexity :- BigO(N)
// Space Complexity :- BigO(N)

// Date :- 2021-07-21