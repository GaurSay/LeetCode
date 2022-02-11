class Solution {
    public int romanToInt(String s) {
        int last = getValue(s.charAt(s.length()-1));
        int sum = last;
        if(s.length() == 1){
            return sum;
        }
        for(int i = s.length()-2;i>=0;i--){
            int curr = getValue(s.charAt(i));
            if(curr < last){
                sum -= curr;
            }
            else{
                sum += curr;
            }
            last = curr;
        }
        return sum;
        
    }
    private int getValue(char c){
        switch(c){
            case 'I' : return 1;
            case 'V' : return 5;
            case 'X' : return 10;
            case 'L' : return 50;
            case 'C' : return 100;
            case 'D' : return 500;
            case 'M' : return 1000;
            default : return 0;
        }
}
}