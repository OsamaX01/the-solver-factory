def gcd(a, b):
    while b:
        a, b = b, a % b
    return a

class Solution(object):
    def gcdOfStrings(self, str1, str2):
        """
        :type str1: str
        :type str2: str
        :rtype: str
        """
        i = 0
        j = 0
        good = True
        mx = max(len(str1), len(str2))
        my_gcd = gcd(len(str2), len(str1))
        my_ans = str1[:my_gcd]

        x = 0
        while x < len(str1): 
            if str1[x : x + my_gcd] != my_ans:
                good = False
                break
            x += my_gcd

        x = 0
        while x < len(str2): 
            if str2[x : x + my_gcd] != my_ans:
                good = False
                break
            x += my_gcd


        if good :            
            return my_ans
        else:
            return ""

        