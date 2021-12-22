# Singly Linked List

## Add Operation
- Add operation step:
    1. initialize a _new_ node
    2. link _next_ to _new_'s next
    3. connect _new_ next to _prv_
    ![singlyAdd](singlyAdd.png)

- Unlike arrays, can insert new node in **O(1)** time complexity
- Need to **update _head_ node** when adding **at the beginning**

## Delete Operation
- Delete operation step:
    1. find _cur_'s previous (_prv_) and its next node (_next_)
    2. link _next_ to _prv_'s next
    ![singlyDelete](singlyDelete.png)
- Need to traverse the list --> **O(N)** Time
- Need only the constant space for traversal pointer --> _O(1)_ Space