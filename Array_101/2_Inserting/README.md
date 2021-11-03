# Inserting Items into an Array

- appending (inserting at the end): _O(1)_
- inserting at specific idx: (worst case) _O(N)_

### TIPS

- when Sorting / Merging:
  - think about **backward-indexing!**

    - merge sorted array from each starting point:
      ![in-order indexing](/assets/inOrder-indexing.png)
    - merge sorted array from backward (in-place merging):
      ![backward-indexing.png](/assets/backward-indexing.png)
