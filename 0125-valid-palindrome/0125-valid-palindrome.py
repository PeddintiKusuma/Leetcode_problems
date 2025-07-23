class Solution:
    def isPalindrome(self, s: str) -> bool:
        string = "abcdefghijklmnopqrstuvwxyz0123456789"
        s = s.lower()
        res = ""
        for i in s:
            if i in string:
                res += i
        if res == res[::-1]:
            return True
        return False
