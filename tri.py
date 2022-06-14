a = (int(input("Enter first angle of the triangle: ")))
b = (int(input("Enter second angle of the triangle: ")))
c = (int(input("Enter third angle of the triangle: ")))

d = a + b + c
# as we know the sum of the angles of a triangle has to be 180 or the triangle cant be formed

if d == 180:
    print("The triangle is possible")
else:
    print("The triangle can't be formed")