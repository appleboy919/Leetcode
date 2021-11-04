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
