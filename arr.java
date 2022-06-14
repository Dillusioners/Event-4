arr = []
arr2 = []
arInp1 = ""
arInp2 = ""

def aray_adder(arrc, arr, array_input):
    while arrc != 0:
        array_input = input("Enter your string: ")
        arr.append(array_input)
        arrc -= 1
arrayc = int(input("How many keywords for first array? "))
aray_adder(arrayc, arr, arInp1)
arrayc2 = int(input("How many keywords for first array? "))
aray_adder(arrayc2, arr2, arInp2)

kws = len(arr) - 1
while kws != -1:
    arr[kws] = str.upper(arr[kws])
    kws -= 1

kws2 = len(arr2) - 1
while kws2 != -1:
    arr2[kws2] = str.upper(arr2[kws2])
    kws2 -= 1

def inception(arr, arr2):
    return list(set(arr) & set(arr2))

print("Inception: ", inception(arr, arr2))
arr.extend(arr2)
print("Union: ",arr)
