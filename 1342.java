class Solution {
    public int numberOfSteps(int num) {
        int numSteps = 0;
        while (num!=0) {
            if (num%2==0){
                ++numSteps;
                num/=2;
            } else {
                ++numSteps;
                --num;
            }
        }
        return numSteps;
    }
}
