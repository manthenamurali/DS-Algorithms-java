Data structures and algorithms practise 

### Searching 

1. **Linear Search**  
Iterate through all the elements to find the index of search element.

2. **Binary Search**  
First pick the center of the array. Check if the search element is less than or grater than to the
center element. If less than the center then pick array to left of the center ie.. start..mid - 1 and repeat the same process
until the element is found. If greater than the center then pick array to right of the center ie.. mid + 1..end 
For binary search to work the input array has to be already sorted.   

##### Time Complexity


|    Algorithm    |   Best      |    Worst   |
|:---------------:|:-----------:|:----------:|
| Linear Search   | Ω(1)        | O(n)       |
| Binary Search   | Ω(1)        | O(log(n))  |


### Sorting : 

1. **Selection Sort**  
Select the smallest value in the array and place it at 0th index. Then, select the second smallest 
value and place at 1st index. Repeat till the end of array.  
        
2. **Binary Sort**  
Pick the element and compare with elements to its left and place the picked value in its correct position.
So, basically we start creating a sorted array at the beginning of the main array and grow it.

3. **Bubble Sort**   
This works by repeatedly swapping the adjacent elements if they are in wrong order.

4. **Merge Sort**  
Merge Sort is a Divide and Conquer algorithm. It divides the input array in two halves, calls itself for the two halves 
until single element. Then the nodes are merged from bottom to top.   
Check below link for better understanding,  
https://upload.wikimedia.org/wikipedia/commons/c/cc/Merge-sort-example-300px.gif

5. **Quick Sort**  
Like Merge Sort, QuickSort is also a Divide and Conquer algorithm. It picks an element as pivot and partitions the given
array around the picked pivot. The key process in quickSort is partition(). Target of partitions is, given an array and an element x of array as pivot,
put x at its correct position in sorted array and put all smaller elements (smaller than x) before x,
and put all greater elements (greater than x) after x. All this should be done in linear time.

##### Time Complexity


|    Algorithm    |   Best      |  Average    |  Worst      |
|:---------------:|:-----------:|:-----------:|:------------:|
| Selection Sort  | Ω(n^2)      | θ(n^2) 	  | O(n^2)      |
| Bubble Sort     | Ω(n)        | θ(n^2) 	  | O(n^2)      |
| Insertion Sort  | Ω(n)        | θ(n^2) 	  | O(n^2)      |
| Quick Sort      | Ω(n log(n)) | θ(n log(n)) |	O(n^2)      |
| Merge Sort      | Ω(n log(n)) | θ(n log(n)) | O(n log(n)) |

So, merge sort and quick sort are better of the above sorting techniques in case of worst and average cases.

But,

 > Quick Sort in its general form is an in-place sort (i.e. it doesn’t require any extra storage) whereas merge sort
 > requires O(N) extra storage, N denoting the array size which may be quite expensive.
 > Allocating and de-allocating the extra space used for merge sort increases the running time of the algorithm.
 
So, Quick sort is well suited for most applications as it doesn't require additional storage.
But merge sort is also efficient where memory is not a constraint. 
 
  
   
### Useful Links     
https://www.cs.usfca.edu/~galles/visualization/Algorithms.html  
https://www.geeksforgeeks.org/time-complexities-of-all-sorting-algorithms/  
