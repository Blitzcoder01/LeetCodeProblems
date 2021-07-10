class ProductOfNumbers {
     List<Integer> l= new ArrayList<>();
    int p=1;
    public ProductOfNumbers() {
        
    }
    
    public void add(int num) {
       
        l.add(num);
    }
    
    public int getProduct(int k) {
        p=1;
        for(int i=l.size()-k; i<l.size(); i++){
            p= p*l.get(i);
        }
        return p;
    }
}

/**
 * Your ProductOfNumbers objepct will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */
