function klargest(arr,n,k)
{
  arr.sort((a,b) => b - a);
  
  for(let i = 0; i < k; i++){
    console.log(arr[i] + " ");
  }
}

let arr = [ 1, 23, 12, 9, 30, 2, 50 ];
let n = arr.length;
let k = 3;
klargest(arr, n, k);


// use nodejs
