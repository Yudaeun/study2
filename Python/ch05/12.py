# 그룹 단어 체커
n=int(input())
cnt=n

for i in range(n):
    word=input()
    for j in range(len(word)-1):
        if word[j]==word[j+1]:
            pass
        elif word[j] in word[j+2:]:
            cnt-=1
            break
print(cnt)