My solution is quite easy 
    
it includes array coping and array sorting (bubble sort)
```java
        for (int i = 0; i < result.length; i++) {
            for (int j = 1; j < result.length; j++) {
                if (result[j] < result[j - 1]) {
                    int tmp = result[j];
                    result[j] = result[j - 1];
                    result[j - 1] = tmp;
                }
            }
        }
```
1. First iterate throw the array

2. then

3. iterate throw each element in the array

4. each element being compared with next element and then swapped if needed 

![Image](https://i.pinimg.com/564x/f5/ed/17/f5ed1705c253a02258845e1b66769e98.jpg)



Smart Solution
```java
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }
        int m = nums1.length;
        int n = nums2.length;
        int left = 0;
        int right = m;
        while (left <= right) {
            int partitionA = (left + right) / 2;
            int partitionB = (m + n + 1) / 2 - partitionA;
            int maxLeftA = (partitionA == 0) ? Integer.MIN_VALUE : nums1[partitionA - 1];
            int minRightA = partitionA == m ? Integer.MAX_VALUE : nums1[partitionA];
            int minRightB = partitionB == n ? Integer.MAX_VALUE : nums2[partitionB];
            int maxLeftB = partitionB == 0 ? Integer.MIN_VALUE : nums2[partitionB - 1];
            if (maxLeftA <= minRightB && minRightA >= maxLeftB) {
                if ((m + n) % 2 == 0) {
                    return (double) ((double) Math.max(maxLeftA, maxLeftB) + (double) Math.min(minRightA, minRightB)) / 2;
                } else {
                    return Math.max(maxLeftA, maxLeftB);
                }
            } else if (maxLeftA > minRightB) {
                right = partitionA - 1;
            } else {
                left = partitionA + 1;
            }
        }
        return 0.0;
```

1.  if(nums1.length>nums2.length){ : This condition checks if the length of  nums1  array is greater than the length of  nums2  array.

2.  return findMedianSortedArrays(nums2,nums1); : If the condition in line 1 is true, it swaps the arrays  nums1  and  nums2  and calls the function recursively with the swapped arrays.

3.  int m=nums1.length; : Assigns the length of  nums1  array to variable  m .

4.  int n=nums2.length; : Assigns the length of  nums2  array to variable  n .

5.  int left=0; : Initializes a variable  left  to 0.

6.  int right=m; : Initializes a variable  right  to the length of array  nums1 .

7.  while(left<=right){ : Starts a while loop that runs until  left  is less than or equal to  right .

8.  int partitionA = (left+right)/2; : Calculates the partition point for array  nums1 .

9.  int partitionB= (m+n+1)/2-partitionA; : Calculates the partition point for array  nums2 .

10.  int maxLeftA= (partitionA==0)?Integer.MIN_VALUE: nums1[partitionA-1]; : Finds the maximum element on the left side of partition in  nums1 .

11.  int minRightA= partitionA==m ?Integer.MAX_VALUE: nums1[partitionA]; : Finds the minimum element on the right side of partition in  nums1 .

12.  int minRightB= partitionB==n ? Integer.MAX_VALUE: nums2[partitionB]; : Finds the minimum element on the right side of partition in  nums2 .

13.  int maxLeftB= partitionB==0? Integer.MIN_VALUE: nums2[partitionB-1]; : Finds the maximum element on the left side of partition in  nums2 .

14.  if(maxLeftA<=minRightB && minRightA>=maxLeftB){ : Checks if the current partitioning is valid.

15.  if((m+n)%2==0){ : Checks if the total number of elements is even.

16.  return (double)((double)Math.max(maxLeftA,maxLeftB)+(double)Math.min(minRightA,minRightB))/2; : Calculates and returns the median for even number of elements.

17.  return Math.max(maxLeftA,maxLeftB); : Returns the median for odd number of elements.

18.  }else if(maxLeftA>minRightB){ : Updates the search range based on the current partitioning.

19.  right=partitionA-1; : Updates the  right  boundary for the binary search.

20.  }else { : Handles the other case where  maxLeftA  is less than  minRightB .

21.  left=partitionA+1; : Updates the  left  boundary for the binary search.

22.  }

23.  }

24.  return 0.0; : Returns 0.0 if the median is not found. 