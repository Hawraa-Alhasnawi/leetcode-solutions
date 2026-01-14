class Solution:
    #function does not return anything, it just returns none kinda like java void it doesnt return a meaningful value
    def merge(self,nums1: list[int], m: int, nums2:list[int], n: int) -> None:
        # i last valid element in list nums 1
        i = m - 1
        # j last valid element in list nums 2
        j = n-1
        # nums 1 length m+n and m+n-1 is the last actual element in the list (0 indexed)
        k = m+n-1
        if n == 0:
            return 
        while(j>=0):
            # make sure that im comparing valid index i>=0
            if i>=0 and nums1[i] > nums2[j]:
                nums1[k]=nums1[i]
                i-=1
                k-=1
            else : 
                nums1[k]=nums2[j]
                j-=1
                k-=1
            
# this solution gives me O(m+n) time complexity
s = Solution()
nums1 = [4,5,6,0,0,0]
nums2 = [1,2,3]
s.merge(nums1, 3, nums2, 3)
print(nums1)
