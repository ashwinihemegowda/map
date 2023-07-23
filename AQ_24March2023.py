#Assignment - AQ_24March2023

#1. Prompt the user to input a value, until user enters some value

while True:
    x = input("Enter the value:")
    if x == "":
        print("Please enter the value")
        continue
    else:
        print("You have entered value as",x)
        break

print("-"*60)


#2. From the string "Monty Python's Flying Circus", display the words along with its length.

String = "Monty Python's Flying Circus"
x = String[:5]
print("Actual String is",String)
print("String displyed in words along with length")
print("Word:",x, ", length:",len(x))
x = String[6:14]
print("Word:",x, ", length:",len(x))
x = String[16:22]
print("Word:",x, ", length:",len(x))
x = String[-6:]
print("Word:",x, ", length:",len(x))

print("-"*60)

'''3. Prompt the user to input any numbers between 1 and 9. If User enters any other number, prompt 
the user to input again. If the user enters the valid number, display the below two patterns.
(eg): If the user enters 5, then display the below patterns:
1
2 2
3 3 3
4 4 4 4
5 5 5 5 5
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
'''

while True:
    Number = int(input("Please enter the Number: "))
    if Number < 1 or Number >9:
        print("Enter valid number from 1 to 9")
        continue
    else:
        break
print("Pattern 1:")    
for i in range(Number + 1):
    for j in range(i):
        print (i, end = '')
    print('')
print("Pattern 2:")
for i in range(Number + 1):
    for j in range(1,i+1):
        print (j, end = '')
        j+=1
    print('')

print("-"*60)

'''
4. Write a Python program to find those numbers which are divisible by 7 and multiple of 5, between 
1500 and 2700 (both included).
'''

list1 = [n for n in range(1500, 2701) if n%7 == 0 and n%5 ==0]
print("List of numbers which are divisible by 7 & 5 is:",list1)

print("-"*60)


#5. Write a Python program that accepts a word from the user and reverse it.

while True:
    x = input("Enter the Word:")
    if x == "":
        print("Please enter the Word")
        continue
    else:
        break
print("Reverse of the entered String:",x[::-1])

print("-"*60)


#6. Write a Python program that prints all the numbers from 0 to 6 except 3 and 6

list2 = [n for n in range(7) if n!=3 and n!=6]
print("Numbers from 0 to 6 except 3 and 6",list2)
print("-"*60)


#7. Write a Python Script to validate the mobile number provided by the user.

while True:
    mobileNo = input("Enter your Mobile Number:")
    if len(mobileNo) == 10 and mobileNo.isdigit() and int(mobileNo[0]) in range(5, 10):
        status = 'valid'
        break
    else:
        print("Please enter valid mobile number")
        continue

print("Your Mobile Number",mobileNo,"is valid")
print("-"*60)


'''8. Write a Python Script to accept two strings from the user and concatenate the strings. Make sure 
you have entered only strings
'''
while True:
    str1 = input("Enter your statement 1:")
    str2 = input("Enter your statement 2:")
    if str1.isdigit() or str2.isdigit():
        print("Please enter string values")
        continue
    else:
        print("Concatenated String is " + str1+ " " + str2)
        break
print("-"*60)

'''
9. Write a Python Script to get the number from the user. The number entered should be between 
1 and 500.
'''

while True:
    x = (input("Enter the number:"))
    if x.isdigit():
        y = int(x)
        if y>=1 and y<=500:
            print("You have entered the valid number")
            break
        else:
          print("Please enter the number between 1 to 500")
          continue
    else:
          print("Please enter the number between 1 to 500")
          continue

print("-"*60)


'''
10. Write a Python Script that accepts the string from the user. Remove the vowels from the string 
entered and have only the consonants.
'''


while True:
    string = str(input("Enter the string:"))
    if string.isdigit():
        print("Please enter string values")
        continue
    else:
        for e in ['a','e','i','o','u','A','E','I','O','U']:
            string = string.replace(e,'')
        break
print("String after removing vowlels:",string)
print("-"*60)


        

    





                      
