class Solution(object):
    def isPerfectSquare(self, num):
        """
        :type num: int
        :rtype: bool
        """
        sqrt = num ** (0.5)
        return int(sqrt) ** 2 == num
        