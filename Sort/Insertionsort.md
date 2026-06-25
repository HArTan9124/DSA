# Insertion Sort - Detailed Iterations

Initial Array:

```text
[9, 4, 2, 7, 5, 8, 1, 0, 3, 6]
```

---

## Pass 1

* i = 1
* key = 4
* j = 0

Compare:

```text
nums[0] = 9 > 4
Shift 9 to the right
```

Array:

```text
[9, 9, 2, 7, 5, 8, 1, 0, 3, 6]
```

j becomes -1

Insert key at j+1 = 0

```text
[4, 9, 2, 7, 5, 8, 1, 0, 3, 6]
```

---

## Pass 2

* i = 2
* key = 2
* j = 1

Compare:

```text
nums[1] = 9 > 2
Shift 9
```

```text
[4, 9, 9, 7, 5, 8, 1, 0, 3, 6]
```

j = 0

```text
nums[0] = 4 > 2
Shift 4
```

```text
[4, 4, 9, 7, 5, 8, 1, 0, 3, 6]
```

j = -1

Insert key at position 0

```text
[2, 4, 9, 7, 5, 8, 1, 0, 3, 6]
```

---

## Pass 3

* i = 3
* key = 7
* j = 2

Compare:

```text
nums[2] = 9 > 7
Shift 9
```

```text
[2, 4, 9, 9, 5, 8, 1, 0, 3, 6]
```

j = 1

```text
nums[1] = 4 < 7
Stop
```

Insert key at j+1 = 2

```text
[2, 4, 7, 9, 5, 8, 1, 0, 3, 6]
```

---

## Pattern to Remember

Outer Loop (`i`)

```java
for(int i = 1; i < size; i++)
```

* Selects the element to insert.
* `key = nums[i]`

Inner Loop (`j`)

```java
while(j >= 0 && nums[j] > key)
```

* Moves backward through the sorted portion.
* Shifts larger elements right.
* Stops when:

  * j becomes -1, or
  * nums[j] <= key

Insertion

```java
nums[j + 1] = key;
```

* Places key in its correct sorted position.

---

## Final Sorted Array

```text
[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
```
