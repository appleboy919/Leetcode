# Searching for Items in an Array

- Linear Search: _O(N)_
- Binary Search: _O(logN)_

### TIPS

- Mountain Array:

  - Check only by moving indices

  ```python
  i = 0
  # increment while going up
  while i + 1 < n and arr[i] < arr[i+1]:
          i += 1

  # check index(i) for hill / not only hill
  if i == 0 or i == n-1:
      return False

  # go down until the end / another hill
  while i+1 < n and arr[i] > arr[i+1]:
      i += 1

  # compare index(i)
  return i == n-1
  ```

  ![Mountain Array Validation](/assets/mountain_array.png)
