class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                for(int k = j+1; k < nums.length; k++){
                    int num = nums[i]+nums[j]+nums[k];
                    int count = 0;
                    for(int l = 2; l <= num; l++){
                        if(num % l == 0)count++;
                    }
                    if(count == 1)answer++;
                }
            }
        }
        return answer;
    }
}