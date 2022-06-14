loop = int(input("Enter the number of  inputs you want...")) #taking the number limit input
num_list = []
num_list_increase = []

for i in range(loop):
    num = int(input("Enter your number"))       #inputtng numbers 
    num_list.append(num) #appending numbers into array

num_list_increase = sorted(num_list,reverse = False)        #sorting array

print("Sorted array is..." , num_list_increase)
