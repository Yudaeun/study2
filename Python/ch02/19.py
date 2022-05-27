def solution(numbers, hand):
    answer = ''

    dic={1:[0,0],2:[0,1],3:[0,2],
         4:[1,0],5:[1,1],6:[1,2],
         7:[2,0],8:[2,1],9:[2,2],
         '*':[3,0],0:[3,1],'#':[3,2]}

    left=dic['*']
    right=dic['#']

    for num in numbers:
        if num==1 or num==4 or num==7:
            answer+="L"
            left=dic[num]
        elif num==3 or num==6 or num==9:
            answer+="R"
            right=dic[num]
        else:
            left_distance = 0
            right_distance = 0
            for a,b,c in zip(left,right,dic[num]):
                left_distance+=abs(a-c)
                right_distance+=abs(b-c)
            if left_distance<right_distance:
                answer+="L"
                left=dic[num]
            elif left_distance>right_distance:
                answer+="R"
                right=dic[num]
            else:
                if hand=="left":
                    answer+="L"
                    left=dic[num]
                else:
                    answer+="R"
                    right=dic[num]
    print(answer)
    return answer

solution([1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5],"right")