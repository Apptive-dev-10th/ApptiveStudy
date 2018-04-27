# 넷째주 스터디

둘째주 스터디는 Intent, Tablayout, Viewpager 를 다루겠습니다.


## Intent

> `Intent`는 일종의 메시지 객체입니다. 이것을 사용해 다른 앱 구성 요소로부터 작업을 요청할 수 있습니다. 인텐트가 여러 구성 요소 사이의 통신을 용이하게 하는 데에는 몇 가지 방법이 있지만, 기본적인 사용 사례는 다음과 같은 세 가지입니다.

> * __액티비티 시작:__
Activity는 앱 안의 단일 화면을 나타냅니다. Activity의 새 인스턴스를 시작하려면 Intent를 `startActivity()`로 전달하면 됩니다. Intent는 시작할 액티비티를 설명하고 모든 필수 데이터를 담고 있습니다.
액티비티가 완료되었을 때 결과를 수신하려면, `startActivityForResult()`를 호출합니다. 여러분의 액티비티는 해당 결과를 이 액티비티의 `onActivityResult()` 콜백에서 별도의 Intent 객체로 수신합니다. 자세한 정보는 액티비티 가이드를 참조하세요.

> * __서비스 시작:__
Service는 사용자 인터페이스 없이 백그라운드에서 작업을 수행하는 구성 요소입니다. 서비스를 시작하여 일회성 작업을 수행하도록 하려면(예: 파일 다운로드) Intent를 `startService()`에 전달하면 됩니다. Intent는 시작할 서비스를 설명하고 모든 필수 데이터를 담고 있습니다.
서비스가 클라이언트-서버 인터페이스로 디자인된 경우, 다른 구성 요소로부터 서비스에 바인드하려면 Intent를 `bindService()`에 전달하면 됩니다. 자세한 정보는 서비스 가이드를 참조하세요.

> * __브로드캐스트 전달:__
브로드캐스트는 모든 앱이 수신할 수 있는 메시지입니다. 시스템은 여러 시스템 이벤트에 대해 다양한 브로드캐스트를 전달합니다. 예를 들어 시스템이 부팅될 때 또는 기기가 변경되기 시작할 때 등이 해당됩니다. 다른 여러 앱에 브로드캐스트를 전달하려면 Intent를 `sendBroadcast()`, `sendOrderedBroadcast()` 또는 `sendStickyBroadcast()`에 전달하면 됩니다.
[Android Developer document][android_intent_doc]

기타 등등 `Intent`에 대한 자세한 설명 및 사용법은 공식문서를 참고하시면 됩니다. 우리는 필요한것만 쓸꺼니깐요!


## Tablayout

[기본적으로 tab이 달린 레이아웃][tab_layout_img]


## Viewpager

[swipe를 통해서, view간의 이동을 시킬 수 있는 layout][view_pager_img]


## 과제 공지
3주차 과제 프로젝트에 계속 올리시면 됩니다.
[카카오톡 친구목록 클론하기][kakao_friends_clone], 친구 목록이 끝났으니 더 보기 레이아웃도 따라하세요 ~_~
> tablayout, viewpager 을 반드시 사용할 것.


[kakao_friends_clone]: http://m.photoviewer.naver.com/blog?listUrl=https%3A%2F%2Fm.blog.naver.com%2FPostView.nhn%3FblogId%3Dbonobono1975%26logNo%3D220951370572&imgId=1&host=https%3A%2F%2Fm.blog.naver.com%2Fphotoviewer&historyBack=true&blogId=bonobono1975&logNo=220951370572#main/1
[android_intent_doc]: https://developer.android.com/guide/components/intents-filters?hl=ko
[tab_layout_img]: http://alexzh.com/tutorials/tablayout-android-design-support-library/
[view_pager_img]: https://stackoverflow.com/questions/32384789/android-viewpager-smooth-transition-for-this-design