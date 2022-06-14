loop = int(input("Enter the number of  inputs you want..."))
num_list = []
num_list_increase = []
num_list_decrease =[]

for i in range(loop):
    num = int(input("Enter your number"))
    num_list.append(num)

num_list_increase = sorted(num_list,reverse = False)
num_list_decrease = sorted(num_list,reverse = True)

if num_list_increase == num_list or num_list_decrease == num_list:
    print("Array is monotonic")
else:
    print("Array is not monotonic")
