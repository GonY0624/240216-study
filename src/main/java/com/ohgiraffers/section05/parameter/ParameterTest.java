package com.ohgiraffers.section05.parameter;

public class ParameterTest {

    public void testParameterPrimaryType(int num){

        System.out.println("매개변수로 전달 받은 값 : " + num);

    }

    public void testParameterPrimaryTypeArray(int[] iarr){

        /* 필기.
        *   배열의 주소가 전달 될 것이다.
        *   즉, 인자로 전달하는 배열과 매개변수로 전달 받은 배열은 서로 동일한 배열릉 가리킨다. (얕은 복사)
        *  */
        System.out.println("매개변수로 전달 받은 값 : " + iarr);

        System.out.print("배열의 값 출력 : ");
        for (int i = 0; i < iarr.length; i++){
            System.out.print(iarr[i]+ " ");
        }
        System.out.println();

        iarr[0] = 99;

        System.out.print("변경 후 배열의 값 출력 : ");
        for (int i = 0; i < iarr.length; i++){
            System.out.print(iarr[i]+ " ");
        }
        System.out.println();
    }

    // 클래스가 자료형이 된거임. 클래스 자료형뒤에 변수이름은 아무렇게나 바꿔도 됨. (int num  이랑 같은 개념이라고 이해하면 됨. )
    public void testParameterClassType(RectAngle rectAngle){

        /* 필기.
        *   인스턴스도 주소가 전달된다.
        *   즉, 인자로 전달하는 인스턴스와 매개변수로 전달받은 인스턴스는 동일한
        *   인스턴스를 가진다. (얕은 복사)
        *  */

        System.out.println("매개변수로 전달 받은 값 : " + rectAngle);

        System.out.println("변경 전 사각형의 넓이와 둘레===============================" );
        rectAngle.calcArea();
        rectAngle.calcRound();

        rectAngle.setWidth(100);  // 자동형변환
        rectAngle.setHeight(100); // 자동형변환

        System.out.println("변경 후 사각형의 넓이와 둘레================================");
        rectAngle.calcArea();
        rectAngle.calcRound();

    }

    //가변인자 (String hobby1, String hobby2, String hobby3, String hobby4, , , ,)
    public void testVariableLengthArrayParameter(String name, String...hobby){

        /* 필기.
        *   가변길이의 배열은 몇 개가 매개변수로 전달 될 지 모르는 상황이기 떄문에 이름과
        *   구분하기 위해 뒤쪽에 작성해야 한다.
        *   앞쪽에 작성하는 경우 에러가 발생한다.
        *  */

        System.out.println("이름 : " + name );
        System.out.println("취미의 갯수 : " + hobby.length);
        System.out.print("취미 : ");
        for (int i = 0; i < hobby.length; i++){
            System.out.print(hobby[i] + " ");
        }
        System.out.println();

    }

}