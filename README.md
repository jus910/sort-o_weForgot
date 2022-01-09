# Team weforgot: Kevin Li, Justin Mohabir, Jonathan Song
## SOTW: this song is not a metaphor by Brian David Gilbert
### Bubble Sort:
Worst: The list in descending order
  * With descending order, the sum of the distances between the values and their final resting place is as big as it can be, so many swaps are required


Best: The list is in ascending order
  * With ascending order, no swaps are required

![Bubble Sort (1)](https://user-images.githubusercontent.com/58864927/148703469-6597e575-a952-43a9-ad36-75b99cafc5f6.png)
  * O(n<sup>2</sup>) time complexity for worst case
    * As we can see the graph is the sum of consecutive integers from 0 to x-1
    * Swaps can be represented as a function of n with n being size, as n(0+n-1)/2 by using the formula for the sum of an arithmetic sequence.
    * n(n-1)/2 is a quadratic, so the time complexity is quadratic. 
  * O(1) time complexity for best case because the swaps are constant

### Selection Sort:
  * There is no best and worst case, it is the same for each because it must always check for the greatest
  * It will swap even if the values are in the final resting place 

![Selection Sort  (2)](https://user-images.githubusercontent.com/58864927/148703492-97d0381b-e313-4813-b9d8-6bcf06597d43.png)
  * O(n) time complexity for for worst case because the slope is constant
  * O(n) time complexity for for best case because the slope is constant

### Insertion Sort:
Worst: The list in descending order
  * With descending order, the sum of the distances between the values and their final resting place is as big as it can be, so many swaps are required


Best: The list is in ascending order
  * The list is already sorted, so no swaps are required

![Insertion sort (1)](https://user-images.githubusercontent.com/58864927/148703510-10fbc3a4-d8b7-4525-b0fc-dac343a10c36.png)
  * O(n<sup>2</sup>) time complexity for worst case
    * As we can see the graph is the sum of consecutive integers from 0 to x-1
    * Swaps can be represented as a function of n with n being size, as n(0+n-1)/2 by using the formula for the sum of an arithmetic sequence.
    * n(n-1)/2 is a quadratic, so the time complexity is quadratic.
  * O(1) time complexity for best case because the swaps are constant
 



