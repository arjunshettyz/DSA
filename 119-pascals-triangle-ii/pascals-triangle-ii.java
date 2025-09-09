class Solution {
    public List<Integer> getRow(int rowIndex) {
            List<Integer> row = new ArrayList<>();
            long number = 1L;
        
            for(int j = 0;j<=rowIndex;j++){
                row.add((int) number);
                number = number *(rowIndex-j)/(j+1);
            }
            return row;
        
        
    }
}