# Deleting Items from an Array

- deleting item + compacting the array: _O(N)_

### In-place Algorithm

- Transforms input using no extra data structure
- Updates its input sequence only through replacement or swapping of elements

### TIPS

- Use built-in List functions - _remove(val)_

  ```python
  a = [1, 2, 3, 2, 1]
  val = 2

  while val in a:
      a.remove(val)

  # Result:
  a = [1, 3, 1]
  ```

- _Sorted_ array -> use _sorted array features_!

  - index of **next bigger element** is assumable ==> can **skip some elements when iterating**

    ```python
    a = [1, 1, 2, 3, 3, 4, 5, 5]

    # iterating all elements --> slow
    i = 0
    while i < n:
      remove duplicate item at every iteration
    ```

    ![Slow iteration](/assets/SlowDelDup.png)

    ```python
    # iterating with skipping some elements --> faster
    i, tIdx = 0   # tIdx to point the next bigger element
    while i < n:
      for j in range(tIdx+1 , n):
        - find element from tIdx+1 to replace i-th position
        - update tIdx for next iteration
            ==> skips elements for faster run time
    ```

    ![Fast iteration](/assets/FastDelDup.png)

- Using **multiple pointers** can help reduce the number of loops

  ```python
  # set additional pointer
  retIdx = 0

  # iterate only once to find the next bigger element
  for i in range(1, n):
    if nums[retIdx] < nums[i]:
      retIdx += 1   # update the outer pointer
      nums[retIdx] = nums[i]
  return retIdx + 1
  ```
