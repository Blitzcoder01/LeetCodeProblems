class Solution {
    
    String[] ans={};
    List<String> l= new ArrayList<String>();
    public void PossibleParanthesis(int n, int oc, int cc, String s){
        if(s.length()==n*2){
            ans= s.split(" ");
            for(int i=0; i<ans.length; i++){
                l.add(ans[i]);
            }
            return;
         }
        if(oc<n){
            PossibleParanthesis(n, oc+1, cc, s+"(");
        }
        if(oc>cc){
              PossibleParanthesis(n, oc, cc+1, s+")");
        }
        
        
    }
    public List<String> generateParenthesis(int n) {
        
        String s="";
        
        PossibleParanthesis(n,0,0,s);
        // l.add(ans.split(" "));
        return l;
    }
}
