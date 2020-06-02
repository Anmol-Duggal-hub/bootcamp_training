function insertionSort(arr){
    for(var i = 1; i<arr.length; i++){
        for(var j = 0;j<= i-1;j++){
            if(arr[j]>arr[i]){
                var currentVal = arr[i]
                arr[j+1]=arr[j];
                arr[j]=currentVal;
                console.log(arr);
            }
        }
    }
    return arr;
}

console.log(insertionSort([5,3,6,2,9]))