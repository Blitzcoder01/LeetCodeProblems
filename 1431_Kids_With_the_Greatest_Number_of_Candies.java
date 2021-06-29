class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> l= new ArrayList<>();
        int max = Arrays.stream(candies).max().getAsInt();
        
        for(int i=0; i<candies.length; i++){
            if((candies[i]+extraCandies)>= max){
                l.add(i, true);
            }
            else{
                l.add(i, false);
            }
        }
        return l;
    }
}
