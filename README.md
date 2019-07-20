# DS-Algorithms-java
Data structures and algorithms practise repo

Sorting : 

Time Complexity


|    Algorithm    |   Best      |  Average    |  Worst      |
|:---------------:|:-----------:|:-----------:|:------------:|
| Selection Sort  | Ω(n^2)      | θ(n^2) 	  | O(n^2)      |
| Bubble Sort     | Ω(n)        | θ(n^2) 	  | O(n^2)      |
| Insertion Sort  | Ω(n)        | θ(n^2) 	  | O(n^2)      |
| Quick Sort      | Ω(n log(n)) | θ(n log(n)) |	O(n^2)      |
| Merge Sort      | Ω(n log(n)) | θ(n log(n)) | O(n log(n)) |

So, merge sort and quick sort are better of the above sorting techniques in case of worst and average cases.

But,

"Quick Sort in its general form is an in-place sort (i.e. it doesn’t require any extra storage) whereas merge sort
 requires O(N) extra storage, N denoting the array size which may be quite expensive.
 Allocating and de-allocating the extra space used for merge sort increases the running time of the algorithm."
 
So, Quick sort is well suited for most applications as it doesn't require additional storage.
But merge sort is also efficient where memory is not a constraint. 
 
Useful Links :
https://www.cs.usfca.edu/~galles/visualization/Algorithms.html
https://www.geeksforgeeks.org/time-complexities-of-all-sorting-algorithms/