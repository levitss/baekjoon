n=int(input())
max=0
answer=0
numbers=input().split(' ')
for i in range(n):
    val=float(numbers[i])
    if val>max:
        max=val
for i in range (n):
    val=float(numbers[i])
    answer+=(val*100/max)/n
print (answer)