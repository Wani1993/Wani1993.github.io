//60p Add.java 타이핑


public class Add {
    public static void main(String[] args){
        // 변수 이름
        // 영소문자로 시작 (대소문자를 구별)
        // 숫자도 올 수 있음
        // 공백이 없어야한다

        // bookTitle (특수문자 안됨)
        // book_Title 언더바는 가능하다.  


        // int : 정수형 data type (자료형)
        int x;  // 변수 선언 (variable declare) 같은이름으로 변수를 만들지 못한다.
        int y;
        int sum;

        // 초기화 (initialize)
        x = 100;  // 대입연산자 (assignment) 오른쪽에 있는걸 왼쪽으로 집어넣어준다
        y = 200;
        sum = x + y;

        System.out.println(sum);

        System.out.println(x - y);
    
        int minus;
        minus = x - y;
        System.out.println(minus);
        
        return;  // 메인 메소드가 끝이난다는 말
    }
}
