```
class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
    count = Counter(nums)
    freq = defaultdict(list)
    high = 0
    
    
    for x, f in count.items():
        freq[f].append(x)
        high = max(high, f)
        ans = [0] * k
        
        for f in range(high, 0, -1):
            if f not in freq:
            continue

        while freq[f] and k > 0:
        ans[k - 1] = freq[f].pop()
        k -= 1
        if k == 0:
        break
        
    return ans

```
