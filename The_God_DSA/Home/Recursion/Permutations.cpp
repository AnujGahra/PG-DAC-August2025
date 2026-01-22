#include<iostream>
using namespace std;


    void getPerms(vector<int>& nums, int idx, vector<vector<int>>& ans) {
        // Base case: If we've reached the end of the array
        if(idx >= nums.size()) {
            ans.push_back(nums);
            return;
        }

        for(int i = idx; i < nums.size(); i++) {
            swap(nums[idx], nums[i]);  // Swap current index with i
            getPerms(nums, idx + 1, ans);  // Recurse for the next index
            swap(nums[idx], nums[i]);  // Backtrack
        }
    }

vector<vector<int>> permute(vector<int>& nums) {
        vector<vector<int>> ans;

        getPerms(nums, 0, ans);

        return ans;
}


int main() {



    return 0;
}