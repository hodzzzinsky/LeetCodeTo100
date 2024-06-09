Basically the solution is to 

1. Populate the HashSet     
```java
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }
```

2. Check if an element is a start of a sequence
3. If it is a start then -> while the sequence is continues length++;
4. then we check the longest sequence within array

```java

        int longest = 0;

        for (int n : numSet) {
            if (!numSet.contains(n - 1)) {
                int length = 1;
                while (numSet.contains(n + length)) {
                    length++;
                }
                longest = Math.max(length, longest);
            }
        }
        return longest;
```