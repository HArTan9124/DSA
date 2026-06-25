# Bubble Sort - Detailed Iterations

## Initial Array

```text
[9, 4, 2, 7, 5, 8, 1, 0, 3, 6]
```

---

## Understanding the Loops

### Outer Loop (i)

```java
for(int i = 0; i < size; i++)
```

* Controls the number of passes.
* After each pass, the largest unsorted element reaches its correct position at the end.

### Inner Loop (j)

```java
for(int j = 0; j < size - 1; j++)
```

* Compares adjacent elements.
* Swaps them if they are in the wrong order.

---

# Pass 1 (i = 0)

Starting Array:

```text
[9, 4, 2, 7, 5, 8, 1, 0, 3, 6]
```

### j = 0

```text
Compare 9 and 4
9 > 4 → Swap
```

```text
[4, 9, 2, 7, 5, 8, 1, 0, 3, 6]
```

### j = 1

```text
Compare 9 and 2
9 > 2 → Swap
```

```text
[4, 2, 9, 7, 5, 8, 1, 0, 3, 6]
```

### j = 2

```text
Compare 9 and 7
9 > 7 → Swap
```

```text
[4, 2, 7, 9, 5, 8, 1, 0, 3, 6]
```

### j = 3

```text
Compare 9 and 5
9 > 5 → Swap
```

```text
[4, 2, 7, 5, 9, 8, 1, 0, 3, 6]
```

### j = 4

```text
Compare 9 and 8
9 > 8 → Swap
```

```text
[4, 2, 7, 5, 8, 9, 1, 0, 3, 6]
```

### j = 5

```text
Compare 9 and 1
9 > 1 → Swap
```

```text
[4, 2, 7, 5, 8, 1, 9, 0, 3, 6]
```

### j = 6

```text
Compare 9 and 0
9 > 0 → Swap
```

```text
[4, 2, 7, 5, 8, 1, 0, 9, 3, 6]
```

### j = 7

```text
Compare 9 and 3
9 > 3 → Swap
```

```text
[4, 2, 7, 5, 8, 1, 0, 3, 9, 6]
```

### j = 8

```text
Compare 9 and 6
9 > 6 → Swap
```

```text
[4, 2, 7, 5, 8, 1, 0, 3, 6, 9]
```

### End of Pass 1

```text
Largest element (9) reached its correct position.
```

---

# Pass 2 (i = 1)

Starting Array:

```text
[4, 2, 7, 5, 8, 1, 0, 3, 6, 9]
```

After all comparisons:

```text
[2, 4, 5, 7, 1, 0, 3, 6, 8, 9]
```

Largest remaining element (8) reaches its correct position.

---

# Pass 3 (i = 2)

```text
[2, 4, 5, 1, 0, 3, 6, 7, 8, 9]
```

Largest remaining element (7) reaches its correct position.

---

# Pass 4 (i = 3)

```text
[2, 4, 1, 0, 3, 5, 6, 7, 8, 9]
```

---

# Pass 5 (i = 4)

```text
[2, 1, 0, 3, 4, 5, 6, 7, 8, 9]
```

---

# Pass 6 (i = 5)

```text
[1, 0, 2, 3, 4, 5, 6, 7, 8, 9]
```

---

# Pass 7 (i = 6)

```text
[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
```

Array becomes fully sorted.

---

## Key Observation

After each pass:

| Pass | Element Fixed |
| ---- | ------------- |
| 1    | 9             |
| 2    | 8             |
| 3    | 7             |
| 4    | 6             |
| 5    | 5             |
| 6    | 4             |
| 7    | Array Sorted  |

---

## Why the Name "Bubble Sort"?

The largest element keeps moving toward the end during each pass, just like an air bubble rises to the surface of water.

---

## Time Complexity

| Case         | Complexity |
| ------------ | ---------- |
| Best Case    | O(n²)      |
| Average Case | O(n²)      |
| Worst Case   | O(n²)      |

---

## Space Complexity

```text
O(1)
```

---

## Final Sorted Array

```text
[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
```
