# 첫째주 스터디

첫째주 스터디는 Java의 기본적인 내용을 다룹니다.

## Java Data Type

Java Data Type

    ㄴ Primitive Type
        ㄴ Boolean Type(boolean)
        ㄴ Numeric Type
            ㄴ Integral Type
                ㄴ Integer Type (short, int, long)
                ㄴ Floating Point Type (float, double)
        ㄴ Character Type(char)
    ㄴ Reference Type
        ㄴ Class Type
        ㄴ Interface Type
        ㄴ Array Type
        ㄴ Enum Type
        ㄴ etc.

자바에는 기본형 `Primitive Type` 과 참조형 `Reference Type` 이 있습니다.

그냥 이런 자료형들이 있습니다. 기본형은 잘 알아두시고 차이점을 알아두시면 좋습니다.

> 퀴즈 1-1. short, int, long 의 차이점에 대해서 서술하기.

> 퀴즈 1-2. float 와 double 의 차이점에 대해서 서술하기.

> 퀴즈 1-3. char 와 String 의 차이점에 대해서 서술하기.

참조형은 대부분 기본형이 아닌녀석들이라고 생각하시면 좋습니다.

Java에서는 `Java.lang.Object` 를 상속받으면 참조형이 됩니다.


## Object 란 무엇인가?

Object 에 대해서 설명하기 이전에, [객체지향][oop] 에 대한 이해가 되어있어야 합니다.

여기 다 적는것 보단 위에 걸린 링크를 보고 이해하는게 빠릅니다.... 글을 너무 잘적어 놨어요.

> 퀴즈 2-1. 캡슐화라는 것은 무엇인가?

> 퀴즈 2-2. 상속이라는 것은 무엇인가?

> 퀴즈 2-3. 다형성이란 무엇인가?


## 그래서 왜 하라는 안드로이드는 안하고 Java만 설명 하는가....?

그래서 안드로이드 스튜디오를 켜 봅시다!!!!!

**프로젝트는 min sdk 21로 설정하고, empty project로 생성합니다.**

안드로이드 프로젝트 첫 생성시의 구조

    Android Project
        ㄴ app
            ㄴ manifests
                ㄴ AndroidManifest.xml
                    >> 안드로이드 앱 구성과 관련한 셋팅을 하는 곳
            ㄴ java
                ㄴ java class files (for project)
                    ㄴ MainActivity.java
                ㄴ java class files (for UI unit test)
                ㄴ java class files (for unit test)
            ㄴ res
                ㄴ drawable
                    >> 이미지 파일 (png, jpeg, svg, gif) 및 그림과 관련된 리소스를 보관하는 패키지
                ㄴ layout
                    ㄴ activity_main.xml
                        >> 안드로이드 앱에 그려질 레이아웃들을 보관하는 패키지
                ㄴ mipmap
                    >> 런처 아이콘 이미지 자원만을 위한 폴더
                ㄴ values
                    ㄴ colors.xml
                        >> color 값을 key-value 형태로 저장하는 xml. 미리 컬러를 정의하고, key 문자열을 가지고 매칭시켜 쓸 수 있다.
                    ㄴ strings.xml
                        >> string 값을 key-value 형태로 저장하는 xml. 미리 문자열을 정의하고, key 문자열을 가지고 매칭시켜 쓸 수 있다.
                    ㄴ styles.xml
                        >> style 관련한 것들을 key-value 형태로 저장하는 xml.
        ㄴ Gradle Script
            ㄴ build.gradlle (for project)
                >> 안드로이드 프로젝트 관련한 셋팅을 하는 곳
            ㄴ build.graddle (for Module:app)
                >> 안드로이드 앱과 관련한 셋팅을 하는 곳
            ㄴ etc...

우리가 중점적으로 살펴 볼 아이들만 적어놨습니다.

그래서! 구조설명 다 끝났으니 에뮬레이터 깔고 한번 앱 실행 시켜봅시다!

`hello world!` 가 찍히면 잘 한겁니다!

## 과제 공지

1. 퀴즈라고 적어둔 것들에 대해서 잘 이해하고, 퀴즈 내용에 대한 답을 자기 생각대로 적어서 `.txt ` 파일 형태로 저장
2. 해당 레포에 PR(pull request) 을 날립니다.

~~(줄글 배끼면 티 납니다...)~~

[oop]: http://vandbt.tistory.com/39
