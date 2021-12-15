# Inserting Items into an Array

### _edit_

---

### Java Built-in Functions
- _System.arraycopy(src_ , int srcPos, _dest_ , int destPos, int length):
    ```java
    int a[] = {1, 2, 3, 4};
    int b[] = new int[2];

    System.arraycopy(a, 2, b, 2);

    // b = {3, 4}
    ```

- clone():
    - single-array -> **deep copy**
    - multiple-dimension -> shallow copy
    ```java
    int a[] = {1, 2, 3, 4, 5};
    int b[] = a.clone();
    System.out.println(a==b);

    // false
    ```
