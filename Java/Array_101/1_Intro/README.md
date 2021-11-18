# Intro to Arrays

### Arrays in Java
- Initializing Arrays:
    ```java
    int a[] = new int[5];
    int b[] = {1, 2, 3, 4, 5};

    // anonymous array
        for(int i: new int[]{1, 2, 3, 4})
            System.out.println(i);
    ```

- **for-each** loop for Arrays:
    ```java
    int arr[] = {1, 2, 3, 4};
    for(int i: arr)
        System.out.println(i);
    ```


---

### Java Built-in Functions
- _Integer.toString(int i)_ : int to String
- _someString.length()_ : returns length of a String object
