import sys
#
# input = sys.stdin.readline
n=int(input())
answ=1
start=1
end=1
sum=1


while end<n :

    if sum>n:
        sum-=start
        start+=1
    elif sum<n:
        
        end+=1
        sum+=end
    elif sum==n:
        answ+=1
        end+=1
        sum+=end

print(answ)






