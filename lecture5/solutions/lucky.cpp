#include <iostream>
#include <vector>
using namespace std;

int main() {
	int n;
	cin >> n;
	
	vector<long long> arr{4, 7};
	vector<long long> cnt{+1, -1};
	int idx = 0;
	while (true) {
		long long x = arr[idx];
		int y = cnt[idx];
		
		if (x == 4444444444LL) {
			break;
		}
		
		arr.push_back(x * 10 + 4);
		cnt.push_back(y + 1);
		
		arr.push_back(x * 10 + 7);
		cnt.push_back(y - 1);
		
		idx++;
	}
	
	for (int i = 0; i < arr.size(); i++) {
		if (cnt[i] == 0 && arr[i] >= n) {
			cout << arr[i] << '\n';
			break;
		}
	}
	
	
	return 0;
}