class Solution {

    Public static void main(String args[]){
        getRow(2);
    }

    public static List<Integer> getRow(int rowIndex) {

        List<Integer> triange = new List<>();
        triange.add(0,1);
        triange.add(rowIndex-1,1);

        int sum = 0;
        for(int i=1; i<rowIndex; i++){
            
            sum = triange.get(i-1) + triange.get(i+1);
            triange.add(i,sum);
        }
        
         return triange;
    }
}