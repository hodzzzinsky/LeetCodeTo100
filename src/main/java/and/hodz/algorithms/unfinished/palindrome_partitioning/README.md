Yet did not understand and stole the solution

What I've learnt :

    when u recursively call the function and inside of it breake the loop you get out of 
    inner recursive function to outer function 🤫

```java

    private static boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left++) != s.charAt(right--)) {
                return false;
            }
        }
        return true;
    }
```

for example "aab"

("aab", 1, 1) "a" is always true

("aab", 0, 1) "aa"

1. left < right (true)
2. left++ != right-- until we reach return true (or we get false if they not equal;
