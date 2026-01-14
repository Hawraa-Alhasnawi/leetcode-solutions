class Solution:
    def removeStars(self, s: str) -> str:
        stack = []

        for char in s:
            if char == '*':
                if stack:
                    stack.pop()  # remove the character to the left
            else:
                stack.append(char)

        return ''.join(stack)
sol = Solution()
print(sol.removeStars("leet**cod*e"))  # Output: "lecoe"