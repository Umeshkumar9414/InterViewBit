//Que :- https://www.interviewbit.com/problems/min-stack/
class Solution {
    static Stack<Integer> ns;
    static Stack<Integer> m;
    Solution(){
        ns =new Stack<Integer>();
        m =new Stack<Integer>();
    }
    public void push(int x) {
        ns.push(x);
        if(m.isEmpty()|| m.peek()>=x){
            m.push(x);
        }
    }

    public void pop() {
        int f;
        if(!ns.isEmpty()){
            f=ns.pop();
            if(m.peek()==f){
                m.pop();
            }
        }
    }

    public int top() {
        
        if(!ns.isEmpty()){
            return ns.peek();
        }else{
            return -1;
        }
        
    }

    public int getMin() {
        if(!m.isEmpty())
            return m.peek();
        return -1;
    }
}
