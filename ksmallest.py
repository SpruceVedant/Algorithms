# Given an array arr[] and an integer K where K is smaller than size of array, the task is to find the Kth smallest element in the given array. It is given that all array elements are distinct.
def ksmallest(arr,k):
    arr.sort()
    return arr[k-1]
arr =  [1,23,12,9,30,2,3]
k = 1
print(ksmallest(arr,k))
