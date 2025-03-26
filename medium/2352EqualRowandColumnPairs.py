"""
for this problem its important to note lists are not hashable in python, so we need to convert them to tuples 
to be able to use them as keys in a dictionary.
its the same idea for java, I could use a hashmap to store the frequency of each row and then build each column
and sum the matches with the row counts. however I couldnt use the List as a key in the hashmap, so I had to convert
it to a string to be able to use it as a key.
The solution is to count the frequency of each row as a tuple and then build each column as a tuple and sum the
matches with the row counts.

"""
from collections import Counter

class Solution:
    def equalPairs(self, grid):

        # Count frequency of each row (as tuples)
        row_counts = Counter(tuple(row) for row in grid)

        # Build each column as a tuple and sum matches with row_counts
        n = len(grid)
        # Then we just look up how many times a column matches any row
        return sum(row_counts[tuple(grid[row][col] for row in range(n))] for col in range(n))

# Test case
solution = Solution()
grid = [
    [3, 2, 1],
    [1, 7, 6],
    [2, 7, 7]
]

result = solution.equalPairs(grid)
print("Equal row-column pairs:", result)  # Expected: 1