class Solution:
    def isPerfectSquare(self, num: int) -> bool:
        x = 0
        while x*x < num:
            x += 1
        return x*x == num
        