class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        triangle.add(firstRow);

        for(int row =1; row <numRows; row++){
            List<Integer> prevRow = triangle.get(row -1);
            List<Integer> newRow = new ArrayList<>();

            newRow.add(1);

            for(int col =1; col< row; col++){
                newRow.add(prevRow.get(col - 1)+ prevRow.get(col));
            }

            newRow.add(1);
            triangle.add(newRow);
        }
        return triangle;
        
    }
}