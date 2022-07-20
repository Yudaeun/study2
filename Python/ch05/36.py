def solution(array, commands):
    answer = []
    result = []
    for i in commands:
        answer = array[i[0] - 1:i[1]]
        answer.sort()
        result.append(answer[i[2]-1])

    return result
s=['E A D','E A B']
st=[]
for i in s:
    st.append(i.split(' '))
print(st[0][1]+'님이')
