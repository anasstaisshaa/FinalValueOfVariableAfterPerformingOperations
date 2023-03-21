class Solution {
    public static void main(String[] args) {
        String[] operations = {"--X","X++","X++"};
        finalValueAfterOperations(operations);
    }
    public static int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for(int i = 0; i < operations.length; i++){
            if(operations[i].charAt(1) == '+')
                x++;
            else{
                x--;
            }
        }
        return x;
    }
}
