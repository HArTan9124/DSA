# Quick Sort (Lomuto Partition) - Detailed Iterations

## Initial Array

```text
[9, 4, 2, 7, 5, 8, 1, 0, 3, 6]
```

---

# Understanding the Variables

### low

Starting index of the current subarray.

### high

Ending index of the current subarray.

### pivot

Last element of the current subarray.

```java
pivot = nums[high]
```

### i

Tracks the boundary of elements smaller than the pivot.

```java
i = low - 1
```

### j

Scans the array from left to right.

```java
for(j = low; j < high; j++)
```

### pi

Partition Index returned by partition().

```java
pi = i + 1
```

After partitioning:

* Elements left of pi are smaller than pivot.
* Pivot is at its correct position.
* Elements right of pi are greater than or equal to pivot.

---

# First Partition Call

```text
quickSort(nums, 0, 9)
```

Array:

```text
[9, 4, 2, 7, 5, 8, 1, 0, 3, 6]
```

## Initial Values

```text
low = 0
high = 9
pivot = 6
i = -1
```

---

### j = 0

```text
nums[0] = 9
9 < 6 ? NO
```

i remains -1

---

### j = 1

```text
nums[1] = 4
4 < 6 ? YES
```

```text
i = 0
Swap nums[0] and nums[1]
```

Array:

```text
[4, 9, 2, 7, 5, 8, 1, 0, 3, 6]
```

---

### j = 2

```text
nums[2] = 2
2 < 6 ? YES
```

```text
i = 1
Swap nums[1] and nums[2]
```

Array:

```text
[4, 2, 9, 7, 5, 8, 1, 0, 3, 6]
```

---

### j = 3

```text
nums[3] = 7
7 < 6 ? NO
```

---

### j = 4

```text
nums[4] = 5
5 < 6 ? YES
```

```text
i = 2
Swap nums[2] and nums[4]
```

Array:

```text
[4, 2, 5, 7, 9, 8, 1, 0, 3, 6]
```

---

### j = 5

```text
nums[5] = 8
8 < 6 ? NO
```

---

### j = 6

```text
nums[6] = 1
1 < 6 ? YES
```

```text
i = 3
Swap nums[3] and nums[6]
```

Array:

```text
[4, 2, 5, 1, 9, 8, 7, 0, 3, 6]
```

---

### j = 7

```text
nums[7] = 0
0 < 6 ? YES
```

```text
i = 4
Swap nums[4] and nums[7]
```

Array:

```text
[4, 2, 5, 1, 0, 8, 7, 9, 3, 6]
```

---

### j = 8

```text
nums[8] = 3
3 < 6 ? YES
```

```text
i = 5
Swap nums[5] and nums[8]
```

Array:

```text
[4, 2, 5, 1, 0, 3, 7, 9, 8, 6]
```

---

## Final Pivot Placement

```text
Swap nums[i+1] and nums[high]
Swap nums[6] and nums[9]
```

Array:

```text
[4, 2, 5, 1, 0, 3, 6, 9, 8, 7]
```

---

## Partition Result

```text
pi = 6
pivot = 6
```

Notice:

```text
[4, 2, 5, 1, 0, 3] | 6 | [9, 8, 7]
```

Everything left of 6 is smaller.

Everything right of 6 is larger.

Pivot is now in its final position.

---

# Recursive Calls

```java
quickSort(nums, 0, 5);
quickSort(nums, 7, 9);
```

The same process repeats for each subarray.

---

# Visual Idea

```text
Original

[9, 4, 2, 7, 5, 8, 1, 0, 3, 6]

After First Partition

[4, 2, 5, 1, 0, 3] | 6 | [9, 8, 7]

After More Partitions

[2, 1, 0] | 3 | [4, 5]
[7] | 8 | [9]

Final

[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
```

---

# Memory Trick

```text
Bubble Sort
→ Push largest element to the end.

Insertion Sort
→ Insert current element into sorted part.

Selection Sort
→ Find minimum and place it at front.

Quick Sort
→ Pick pivot, partition array, recursively sort left and right parts.
```

---

# Complexity

| Case    | Time Complexity |
| ------- | --------------- |
| Best    | O(n log n)      |
| Average | O(n log n)      |
| Worst   | O(n²)           |

### Space Complexity

```text
O(log n)
```

---

# Final Output

```text
[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
```
