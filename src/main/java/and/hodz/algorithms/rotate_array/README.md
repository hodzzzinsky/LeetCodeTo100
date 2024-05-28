I tried to reinvent a wheel

i created a formula

```
k = k - nums.length * (k/nums.length);
```

in fact, it is equal to 
```java
    k = k % nums.length
```

Algorithm image:

![Image](reversedShifting.png)