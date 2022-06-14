day = int(input("Enter  the day of the month:- "))
smallMonth = input("Enter the name of the month:- ")
month = smallMonth.upper()
monthI= month.lower()

year = int(input("Enter the year:- "))


if month == "JANUARY"or month == "MARCH" or month == "MAY" or month =="JULY" or month == "AUGUST"or month == "OCTOBER" or month == "DECEMBER":
    if day > 31 and day < 0:
        print("Date is not Valid")
elif month == "FEBRUARY":
    if year % 4 == 0:
        if day > 29 or day <  0:
            print("Date is not Valid")
    else:
        if day > 28 or day < 0:
            print("Date is not valid")
elif month == "SEPTEMBER" or month == "APRIL" or month == "JUNE" or  month == "NOVEMBER":
    if day > 30 or day < 0:
        print("Date is not valid")
else:
    print("Date given is not valid...")
    print(day,"/",month,"/",year)