import sys
input=sys.stdin.readline

dataN,queryN=map(int,input().split())
numList=list(map(int,input().split()))
sumList=[0]
temp=0
for i in numList:
    temp+=i
    sumList.append(temp)
for i in range(queryN):
    a, b = map(int, input().split())
    print(sumList[b]-sumList[a-1])