# Selection Sort - Detailed Iterations

## Initial Array

```text
[9, 4, 2, 7, 5, 8, 1, 0, 3, 6]
```

---

## Understanding the Variables

### i

Represents the position where the next smallest element should be placed.

### minInd

Stores the index of the smallest element found in the unsorted portion.

### j

Traverses the remaining unsorted array to find the minimum element.

---

# Pass 1

### Initial Values

```text
i = 0
minInd = 0 (value = 9)
```

### Inner Loop

```text
j = 1 → 4 < 9  → minInd = 1
j = 2 → 2 < 4  → minInd = 2
j = 3 → 7 > 2  → no change
j = 4 → 5 > 2  → no change
j = 5 → 8 > 2  → no change
j = 6 → 1 < 2  → minInd = 6
j = 7 → 0 < 1  → minInd = 7
j = 8 → 3 > 0  → no change
j = 9 → 6 > 0  → no change
```

### Minimum Found

```text
minInd = 7
value = 0
```

### Swap

```text
Swap nums[0] and nums[7]
```

### Array After Pass 1

```text
[0, 4, 2, 7, 5, 8, 1, 9, 3, 6]
```

---

# Pass 2

### Initial Values

```text
i = 1
minInd = 1 (value = 4)
```

### Inner Loop

```text
j = 2 → 2 < 4 → minInd = 2
j = 3 → 7 > 2 → no change
j = 4 → 5 > 2 → no change
j = 5 → 8 > 2 → no change
j = 6 → 1 < 2 → minInd = 6
j = 7 → 9 > 1 → no change
j = 8 → 3 > 1 → no change
j = 9 → 6 > 1 → no change
```

### Minimum Found

```text
minInd = 6
value = 1
```

### Swap

```text
Swap nums[1] and nums[6]
```

### Array After Pass 2

```text
[0, 1, 2, 7, 5, 8, 4, 9, 3, 6]
```

---

# Pass 3

```text
i = 2
minInd = 2 (value = 2)
```

No smaller element found.

### Array After Pass 3

```text
[0, 1, 2, 7, 5, 8, 4, 9, 3, 6]
```

---

# Pass 4

```text
i = 3
minInd = 3 (value = 7)
```

Scanning:

```text
5 < 7 → minInd = 4
4 < 5 → minInd = 6
3 < 4 → minInd = 8
```

### Swap

```text
Swap nums[3] and nums[8]
```

### Array After Pass 4

```text
[0, 1, 2, 3, 5, 8, 4, 9, 7, 6]
```

---

# Pass 5

```text
i = 4
minInd = 4 (value = 5)
```

Scanning:

```text
4 < 5 → minInd = 6
```

### Swap

```text
Swap nums[4] and nums[6]
```

### Array After Pass 5

```text
[0, 1, 2, 3, 4, 8, 5, 9, 7, 6]
```

---

# Pass 6

```text
i = 5
minInd = 5 (value = 8)
```

Scanning:

```text
5 < 8 → minInd = 6
```

### Swap

```text
Swap nums[5] and nums[6]
```

### Array After Pass 6

```text
[0, 1, 2, 3, 4, 5, 8, 9, 7, 6]
```

---

# Pass 7

```text
i = 6
minInd = 6 (value = 8)
```

Scanning:

```text
7 < 8 → minInd = 8
6 < 7 → minInd = 9
```

### Swap

```text
Swap nums[6] and nums[9]
```

### Array After Pass 7

```text
[0, 1, 2, 3, 4, 5, 6, 9, 7, 8]
```

---

# Pass 8

```text
i = 7
minInd = 7 (value = 9)
```

Scanning:

```text
7 < 9 → minInd = 8
```

### Swap

```text
Swap nums[7] and nums[8]
```

### Array After Pass 8

```text
[0, 1, 2, 3, 4, 5, 6, 7, 9, 8]
```

---

# Pass 9

```text
i = 8
minInd = 8 (value = 9)
```

Scanning:

```text
8 < 9 → minInd = 9
```

### Swap

```text
Swap nums[8] and nums[9]
```

### Final Sorted Array

```text
[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
```

---

## What to Remember

```text
Bubble Sort    → Repeatedly swaps adjacent elements.
Insertion Sort → Inserts an element into its correct position.
Selection Sort → Finds minimum element and places it at the beginning.
```

### Role of Variables

```text
i       → Current position to fill.
minInd  → Index of smallest element found.
j       → Searches the unsorted portion.
```

### Time Complexity

| Case    | Complexity |
| ------- | ---------- |
| Best    | O(n²)      |
| Average | O(n²)      |
| Worst   | O(n²)      |

### Space Complexity

```text
O(1)
```
