def solution(l, r):
    answer = []

    for i in range(l, r+1) :
        check = True
        for s in str(i):
            if (s != '5') and (s != '0'):
                check = False
                break # 반복문 빠져나오기

        if check :
            answer.append(i)

    if not answer :
        return [-1]

    return answer