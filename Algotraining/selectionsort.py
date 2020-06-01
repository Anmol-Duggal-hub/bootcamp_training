

def minV(arr):
    for i in range(len(arr)):
        for j in range(len(arr)-1):
            print(arr)
            if arr[j]>arr[i]:
                print(i)
                print(j)
                temp=arr[j]
                arr[j]=arr[i]
                arr[i]=temp
                print(arr)
    return arr

arr = [2,9,3,1]
print(minV(arr))