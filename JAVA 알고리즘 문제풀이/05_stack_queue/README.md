### 문제 목록
    01. 올바른 괄호
    02. 괄호문자제거
    03. 크레인 인형뽑기(카카오)
    04. 후위식 연산(postfix)
    05. 쇠막대기
    06. 공주구하기
    07. 교육과정설계
    08. 응급실

***

### Stack   
##### 괄호같이 짝을 판별하는 문제는 주로 Stack 자료구조를 씀.   
##### Truble shooting   
* pop 하면서 출력도 하므로 while(stack.pop() != '('); 한줄로도 while처리 충분함.   
while(stack.pop() != '('){ stack.pop(); } 하면 팝을 두 번 하는 것.

***

### Queue
* q.offer(a): 집어넣음
* q.poll(): 뺌
* q.peek() q.contain() q.size()