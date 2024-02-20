package com.ohgiraffers.section05.parameter;

public class Application {

    public static void main(String[] args) {

        /* 수업목표. 메소드의 파라미터에 대해 이해하고 사용할 수 있다. */
        /* 필기.
        *   매개변수(parameter) 로 사용 가능한 자료형
        *   1. 기본 자료형 (int, String, char, double, boolean)
        *   2. 기본 자료형 배열(int[], String[], char[])
        *   3. 클래스자료형
        *   4. 클래스자료형 배열
        *   5. 가변인자
        *  */
        System.out.println("=====================목차 1=======================");

        // ParameterTest 클래스에 대한 pt라는 변수를 가진 객체를 생성하고
        ParameterTest pt = new ParameterTest();

        /* 목차. 1. 기본자료형을 매개변수로 전달받는 메소드 호출 확인 */
        int num = 20;

        pt.testParameterPrimaryType(num);

        System.out.println("=====================목차 2=======================");

        /* 목차. 2. 기본자료형 배열을 매개변수로 전달받는 메소드 호출 확인 */
        int[] iarr = {1, 2, 3, 4, 5};

        System.out.println("인자로 전달하는 값 : " + iarr);
        // iarr 매개변수로 보냄!
        pt.testParameterPrimaryTypeArray(iarr);

        System.out.print("변경 후 원본 배열의 값 출력 : ");

        for (int i = 0; i < iarr.length; i++){
            System.out.print(iarr[i]+ " ");
        }
        System.out.println();

        System.out.println("=====================사각형=======================");

        /* 목차. 3. 클래스 자료형을 매개변수로 전달받는 메소드 호출 */

        RectAngle r1 = new RectAngle(12.5, 22.5);
        System.out.println("인자로 전달하는 값 : " + r1);
        pt.testParameterClassType(r1);

        // 메소드 호출 후 값 변경 확인
        System.out.println("변경 후 사각형의 넓이와 둘레==========================");
        r1.calcArea();
        r1.calcRound();

        /* 목차. 4. 클래스 자료형 배열은 뒤에서 다룰 예정이다. */

        /* 목차. 5. 가변인자 */
        /* 필기. 인자로 전달하는 값의 갯수가 정해지지 않은 경우 가변 배열을 이용할 수 있다. */

//        pt.testVariableLengthArrayParameter(); // 전달인자가 아무것도 없는 경우 에러 발생
        pt.testVariableLengthArrayParameter("정고은"); // 가변인자는 전달하지 않아도 된다.
        pt.testVariableLengthArrayParameter("박용남","게임"); //1개도 가능
        pt.testVariableLengthArrayParameter("정하은", "크로스핏", "태닝","다리두껍게하기"); //여러 개도 가능
        pt.testVariableLengthArrayParameter("똥",new String[]{"바보","멍충","개똥"}); // 배열도 가능

    }

}