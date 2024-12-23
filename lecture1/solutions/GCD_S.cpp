class Solution {
public:
    string gcdOfStrings(string str1, string str2) {
        int my_gcd = __gcd(str1.size(), str2.size()); // find how to calc gcd
        string assumption = str1.substr(0,  my_gcd); 
        bool haveAnswer = true;

        int index = 0;
        while (index < str1.size()) {
            string tmp = str1.substr(index, my_gcd);
            if (assumption != tmp) {
                haveAnswer = false;
                break;
            }

            index += my_gcd;
        }

        index = 0;
        while (index < str2.size()) {
            string tmp = str2.substr(index, my_gcd);
            if (assumption != tmp) {
                haveAnswer = false;
                break;
            }

            index += my_gcd;
        }

        if (haveAnswer) {
            return assumption;
        }
        else {
            return "";
        }
    }
};