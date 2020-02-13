# Quick Sort

This sorting algorithm 

## Pseudocode
```aidl
ALGORITHM QuickSort(arr, left, right)
    if left < right
        // Partition array by setting position of pivot value 
        DEFINE position <-- Partition(arr, left, right)
        // Sort left
        QuickSort(arr, left, position - 1)
        // Sort right
        QuickSort(arr, position + 1, right)

ALGORITHM Partition(arr, left, right)
    // set a pivot value as a point of reference
    DEFINE pivot <-- arr[right]
    // create variable to track largest index of numbers lower than defined pivot
    DEFINE low <-- left - 1
    for i <- left to right do
        if arr[i] <= pivot
            low++
            Swap(arr, i low)

    // place value of pivot location in middle
    // all numbers smaller than pivot are on left, larger are on right
    Swap(arr, right, low + 1)
    // return pivot index point
    return low + 1

ALGORITHM Swap(arr, i low)
    DEFINE temp;
    temp <-- arr[i]
    arr[i] <-- arr[low]
    arr[low] <-- temp
```

## Trace



Sample array: `[8,4,23,42,16,15]`

## Efficiency
- Time: 
- Space: 