import sys
#
input = sys.stdin.readline
n=int(input())
M=int(input())
materials=list(map(int,input().split()))
materials.sort()
start=0
end=n-1
count=0
while start!=end:
    s=materials[start]+materials[end]
    if s==M:
        count+=1
        end-=1

    elif s>M:
        end-=1
    elif s<M:
        start+=1
print(count)










