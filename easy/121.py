class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        buyDay = 0
        sellDay = 1
        maxProfit = 0
        while buyDay < sellDay and sellDay < len(prices):
            if prices[sellDay] - prices[buyDay] > maxProfit:
                maxProfit = prices[sellDay] - prices[buyDay]
                sellDay += 1
            elif prices[sellDay] < prices[buyDay]:
                buyDay = sellDay
                sellDay += 1
            else:
                sellDay += 1
        return maxProfit
