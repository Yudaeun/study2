s1=str(input())
s2=str(input())

dic={'I':1,'V':5,'X':10,'L':50,'C':100,'D':500,'M':1000,'IV':4,'IX':9,'XL':40,'XC':90,'CD':400,'CM':900}
i=0
num2=0
num1=0
while i<len(s1):
    if s1[i:i+2] in dic.keys():
        num1+=dic[s1[i:i+2]]
        i+=2
    elif s1[i] in dic.keys():
        num1+=dic[s1[i]]
        i+=1



i=0
while i<len(s2):

    if s2[i:i+2] in dic.keys():
        num2+=dic[s2[i:i+2]]
        i+=2
    elif s2[i] in dic.keys():
        num2+=dic[s2[i]]
        i+=1

result=num1+num2
print(result)
s=''
while result>0:
    if result>=1000:
        s+='M'
        result-=1000
    elif result>=900:
        s+='CM'
        result-=900
    elif result>=500:
        s+='D'
        result-=500
    elif result>=400:
        s+='CD'
        result-=400
    elif result>=100:
        s+='C'
        result-=100
    elif result>=90:
        s+='XC'
        result-=90
    elif result>=50:
        s+='L'
        result-=50
    elif result>=40:
        s+='XL'
        result-=40
    elif result>=10:
        s+='X'
        result-=10
    elif result>=9:
        s+='IX'
        result-=9
    elif result>=5:
        s+='V'
        result-=5
    elif result>=4:
        s+='IV'
        result-=4
    else:
        s+='I'
        result-=1

print(s)
