n = int(input())
for i in range(n):
    grade = int(input())
    if (grade > 37) and ((grade%5) > 2):
        print(grade+(5-(grade%5)))
    else:
        print(grade)
