function solution(arr)
{
    const newArr = [];
    for(i = 0; i < arr.length; i++) {
        if(arr[i] !== arr[i+1]) {
            newArr.push(arr[i])
        }
    }
    
    return newArr;
}