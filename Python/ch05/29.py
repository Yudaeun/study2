# 곱하기랑 더하기 하나씩 차례대로 다 시도해보면서 최댓값 저장하기
# 곱하기 혹은 더하기
import sys
s=list(str(sys.stdin.readline()))
s.pop()
answer=0
num1=0
num2=0
for i in range(len(s)):

    num1+=int(s[i])
    num2*=int(s[i])

    if num1>num2:
        answer=num1
        num1=answer
        num2=answer
    else:
        answer=num2
        num1=answer
        num2=answer
print(answer)