def solution(record):
    answer = []
    # 유저 아이디를 기준으로 하나씩 루프 돌면서 해당 유저아이디의 유저가 닉네임을 변경했으면
    # 레코드에 닉네임도 다 바꾸고, 그 뒤에 다시 레코드만큼 루프 돌면서 enter이면 들어왔습니다 넣고
    # leave면 나갔습니다를 넣는다
    '''temp = []
    for i in record:
        temp.append(i.split(' '))
    for i in range(len(temp)):
        cnt = 0
        cnt2=0
        for j in range(len(temp)-1, -1, -1):

            if temp[i][1] == temp[j][1]:
                if temp[j][0] == 'Leave':
                    temp[j].append(temp[i][2])
                if cnt == 0 and temp[j][0] == 'Change':
                    change_name = temp[j][2]
                    cnt = 1
                if temp[j][0]=='Enter' and cnt==0 and cnt2==0:
                    enter_name=temp[j][2]
                    cnt2=1
                if cnt2==1:
                    temp[j][2]=enter_name
                if cnt == 1:
                    temp[j][2] = change_name

    for i in temp:
        if i[0] == 'Enter':
            line = i[2] + "님이 들어왔습니다."
            answer.append(line)
        elif i[0] == 'Leave':
            line = i[2] + "님이 나갔습니다."
            answer.append(line)'''
    id=dict()
    temp=[]
    for i in record:
        temp.append(i.split(' '))

    for i in temp:
        if i[0]=='Enter' or i[0]=='Change':
            id[i[1]]=i[2]
    for i in temp:
        if i[0]=='Enter':
            answer.append(id[i[1]]+'님이 들어왔습니다.')
        elif i[1]=='Leave':
            answer.append(id[i[1]]+'님이 나갔습니다.')
    return answer
