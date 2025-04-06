class Solution:
    def canPlaceFlowers(self, flowerbed: list[int], n: int) -> bool:
        count = 0
        for i in range(len(flowerbed)):
            if(flowerbed[i]==0):
                #check if the previous and next position is empty
                left_empty = (i==0 or flowerbed[i-1]==0)
                right_empty = (i==len(flowerbed)-1 or flowerbed[i+1]==0)

                #if left is empty AND right is empty then plant the flower
                if(left_empty and right_empty):
                    flowerbed[i] = 1
                    count+=1
                    i+=1
                    if(count>=n):
                        return True
        return False
    
sol = Solution()
flowerbed = [1,0,0,0,1]
n = 1
print(sol.canPlaceFlowers(flowerbed, n)) #True
