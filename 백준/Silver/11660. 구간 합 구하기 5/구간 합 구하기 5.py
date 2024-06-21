import sys

input = sys.stdin.readline

arrSize,queryN=map(int,input().split())

valArr = [[0] * (arrSize+1) ]
sumArr = [[0] * (arrSize+1) for _ in range(arrSize+1)]

for i in range(arrSize):
    # valArr 채우기
    tempList=[0]+list(map(int,input().split()))
    valArr.append(tempList)


for i in range(1,arrSize+1):
    # sumArr 채우기
    for o in range(1,arrSize+1):
        sumArr[i][o]=sumArr[i][o-1]+sumArr[i-1][o]-sumArr[i-1][o-1]+valArr[i][o]

for i in range (queryN):
#     2 2   4 4  (2,2) ~~(4,4)
    y,x,b,a=map(int,input().split())
    print(sumArr[b][a]+sumArr[y-1][x-1]-sumArr[b][x-1]-sumArr[y-1][a])
