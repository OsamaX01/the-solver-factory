class Solution {
public:
    vector<int> dailyTemperatures(vector<int>& temperatures) {
        stack<int> st;
        vector<int> ans(temperatures.size(), 0);

        for (int i = 0; i < temperatures.size(); i++) {
            if (!st.empty()) {
                while (!st.empty() && temperatures[st.top()] < temperatures[i]) {
                    ans[st.top()] = i;
                    st.pop();
                }
            }

            st.push(i);
        }

        for (int i = 0; i < ans.size(); i++) {
            if (ans[i] > 0) {
                ans[i] = ans[i] - i;
            }
        }

        return ans;
    }
};