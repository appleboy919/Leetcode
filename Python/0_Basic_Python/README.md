# Basic Python Skills for Coding Tests

## 1. Type

- Number

  - Integer
  - Real Number

    ```python
    # a = 5.0
    a = 5.

    # b = -0.7
    b = -.7

    # c = 1000000000
    c = 1e9

    # d = 752.5
    d = 75.25e1

    # e = 3.954
    e = 3954e-3
    ```

    ```python
    ### 0.9 is saved as 0.899999999999 ###

    a = 0.3 + 0.6

    if a == 0.9:
        print(True)
    else:
        print(False)

    # Result:

    False
    ```

    - Solution: use _round()_ function when comparing floating points

  - division operator ( / ) results _Real Number_
  - ' // ' : quotient operator

- List

  - like Arrays in C/Java
  - can initialize like:

    ```python
    n = 10
    a = [0] * n
    print(a)

    #Result:

    [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
    ```

  - Indexing from last elements:

    ```python
    a = [1, 2, 3, 4, 5]
    print(a[-1])    # 5
    print(a[-3])    # 3
    print(a[-5])    # 1
    ```

  - **Slicing**: [strt : (**EXCLUSIVE**)end]

    ```python
    a = [1, 2, 3, 4, 5]
    print(a[1:3])     # [2, 3]
    print(a[2:])      # [3, 4, 5]
    print(a[:])       # [1, 2, 3, 4, 5]
    ```

  - List Comprehension:

    ```python
    array = [i for i in range(20) if i % 2 == 1]
    print(array)

    array = [i * i for i in range(1, 10)]
    print(array)

    # Results:

    [1, 3, 5, 7, 9, 11, 13, 15, 17, 19]
    [1, 4, 9, 16, 25, 36, 49, 64, 81]
    ```

    ```python
    # initializing 2-D list n X m
    n = 3
    m = 4
    array = [[0] * m] * n
    print(array)

    array[1][1] = 5
    print(array)


    # Result:

    [[0, 0, 0], [0, 0, 0], [0, 0, 0], [0, 0, 0]]
    [[0, 5, 0], [0, 5, 0], [0, 5, 0], [0, 5, 0]]
    ```

  - List Operations:
    - append(): O(1)
    - sort([reverse=True]): O(NlogN)
    - reverse(): O(N)
    - insert(_index_, _value_): O(N)
    - count(): O(N)
    - remove(_value_): O(N)

- String

  ```python
  a = 'Hello'
  b = 'World'
  print(a + ' ' + b)
  print(a * 3)
  print(a[1:3])

  # Result:

  Hello World
  HelloHelloHello
  el
  ```

- Tuple

  - Tuples are **immutable**
  - Usually used for **Graph** algorithms:
    - ex) Priority Queue in Dijkstra's algorithm

- Dictionary

  - _Key_ - _Value_ pairs
  - No orders
  - _keys()_, _values()_: return list of keys and values

- Set

  - Does not allow duplication
  - No orders

    ```python
    data = set([1, 1, 2, 3, 4, 4, 5])
    print(data)

    # Result:

    {1, 2, 3, 4, 5}
    ```

  - Operations: _add()_, _update()_, _remove()_, &, |, -

    ```python
    a = set([1, 2, 3, 4, 5])
    b = set([3, 4, 5, 6, 7])

    print(a | b)
    print(a & b)
    print(a - b)

    a.add(6)
    print(a)

    b.update([8, 9])
    print(b)

    # Result:

    {1, 2, 3, 4, 5, 6, 7}
    {3, 4, 5}
    {1, 2}
    {1, 2, 3, 4, 5, 6}
    {3, 4, 5, 6, 7, 8, 9}
    ```

## 2. Conditionals

- _in_/_not in_ operator
- conditional expression:

  ```python
  a = 3
  result = "odd" if a%2 == 1 else "even"
  print(result)

  b = [1, 2, 3, 4, 5, 4, 1]
  remove_set = {1, 4}
  result = [i for i in b if i not in remove_set]

  print(result)

  # Result:

  odd
  [2, 3, 5]
  ```

  - consecutive inequation:

  ```python
  x = 14
  if 0 < x < 16:
    print("correct")

  # Result:

  correct
  ```

## 3. Repetitives

- _while_ loop:

```python
i = 1
result = 0

while i < 10:
  result += i
print(result)

# Result:

55
```

- _for_ loop:

  ```python
  for i in range(1, 10):
    print(i**2, end=' ')

  # Result:

  1 4 9 16 25 36 49 64 81
  ```

## 4. I/O

(Input)

- _input()_: reads data from user input ==> **slower** than _sys.stdin.readline()_
- **_list(map(int, input().split()))_** : store multiple integers
- **_sys.stdin.readline().rstrip()_** : read each line and remove new line

  ```python
  import sys

  data = sys.stdin.readline().rstrip()
  print(data)
  ```

(Output)

- print(_, _, ..) : adds ' ' between each items
- **f-string**

  ```python
  a = 1

  print(f'a is {a}')

  # Result:

  a is 1
  ```

## 5. Libraries

- Standard Libraries:

  - Built-in Function

    - sum(_iterable_)
    - min(), max()
    - eval(_"String Equation"_): returns the result of the String equation
    - **sorted([_iterable_], [reverse=True], [key=lambda])**

      ```python
      result = sorted([4, 3, 1, 2])
      print(result)

      result = sorted([4, 3, 1, 2])
      print(result)

      result = sorted([('apple', 34), ('banana', 2), ('car', 15)], key = lambda x: x[1])

      # Result:

      [1, 2, 3, 4]
      [4, 3, 2, 1]
      [('banana', 2), ('car', 15), ('apple', 34)]
      ```

    - _iterable_.sort()

  - itertools

    - **permutations(_iterable_, n)**: calculates n permutations from _iterable_

      ```python
      from itertools import permutations

      data = ['A', 'B', 'C']
      result = list(permutations(data, 3))
      print(result)

      # Result:

      [('A', 'B', 'C'), ('A', 'C', 'B'), ('B', 'A', 'C'), ('B', 'C', 'A'), ('C', 'A', 'B'), ('C', 'B', 'A')]
      ```

      - **combinations(_iterable_, n)**: calculates n combinations from _iterable_

      ```python
      from itertools import combinations

      data = ['A', 'B', 'C']
      result = list(permutations(data, 2))
      print(result)

      # Result:

      [('A', 'B'), ('A', 'C'), ('B', 'C')]
      ```

    - **product(_iterable_, repeat=n)**: calculates permutations with n-duplicates

      ```python
      from itertools import product

      data = ['A', 'B', 'C']
      result = list(product(data, repeat=2))
      print(result)

      # Result:

      [('A', 'A'), ('A', 'B'), ('A', 'C'), ('B', 'A'), ('B', 'B'), ('B', 'C'), ('C', 'A'), ('C', 'B'), ('C', 'C')]
      ```

    - **combinations*with_replacement(\_iterable*, n)**: calculates combinations with n-duplicates

      ```python
      from itertools import combinations_with_replacement

      data = ['A', 'B', 'C']
      result = list(combinations_with_replacement(data, 2))
      print(result)

      # Result:

      [('A', 'A'), ('A', 'B'), ('A', 'C'), ('B', 'B'), ('B', 'C'), ('C', 'C')]
      ```

  - heapq
    - used for prority queues -->_Min Heap_ (ex. Djikstra's Shortest Path)
    - adding items _O(NlogN)_ automatically sort the items in the heap
