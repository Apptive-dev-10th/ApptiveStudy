# 둘째주 스터디

둘째주 스터디는 Fragment, Listview를 다루겠습니다.


## Fragment

### Fragment 란?
> __Fragment는 동작 또는 Activity 내에서 사용자 인터페이스의 일부를 나타냅니다.__ 여러 개의 프래그먼트를 하나의 액티비티에 조합하여 창이 여러 개인 UI를 구축할 수 있으며, 하나의 프래그먼트를 여러 액티비티에서 재사용할 수 있습니다. 프래그먼트는 자체 수명 주기를 가지고, 자체 입력 이벤트를 받으며, 액티비티 실행 중에 추가 및 제거가 가능한 액티비티의 모듈식 섹션이라고 생각하면 됩니다(다른 액티비티에 재사용할 수 있는 "하위 액티비티"와 같은 개념).

> __프래그먼트는 항상 액티비티 내에 포함되어 있어야 하며__ 해당 프래그먼트의 수명 주기는 호스트 액티비티의 수명 주기에 직접적으로 영향을 받습니다. 예를 들어 액티비티가 일시정지되는 경우, 그 안의 모든 프래그먼트도 일시정지되며 액티비티가 소멸되면 모든 프래그먼트도 마찬가지로 소멸됩니다. 그러나 액티비티가 실행 중인 동안에는(재개됨 수명 주기 상태에 있을 때를 말합니다) 각 프래그먼트를 추가 또는 제거하는 등 개별적으로 조작할 수 있습니다. 그와 같은 프래그먼트 트랜잭션을 수행할 때에는 이를 액티비티가 관리하는 백 스택에도 추가할 수 있습니다. 각 백 스택 항목이 발생한 프래그먼트 트랜잭션의 기록이 됩니다. 이 백 스택을 사용하면 사용자가 프래그먼트 트랜잭션을 거꾸로 돌릴 수 있습니다(뒤로 이동). 이때 Back 버튼을 누르면 됩니다.

> __프래그먼트를 액티비티 레이아웃의 일부로 추가하는 경우, 이는 액티비티의 뷰 계층 내부의 ViewGroup 안에 살며, 해당 프래그먼트가 자신의 뷰 레이아웃을 정의합니다.__ 프래그먼트를 액티비티 레이아웃에 삽입하려면 해당 프래그먼트를 액티비티의 레이아웃 파일에서 `<fragment>` 요소로 선언하거나, 애플리케이션 코드에서 이를 기존의 ViewGroup에 추가하면 됩니다. 그러나 프래그먼트가 액티비티 레이아웃의 일부분이어야만 하는 것은 아닙니다. 나름의 UI가 없는 프래그먼트도 액티비티를 위한 보이지 않는 작업자로 사용할 수 있습니다. - [Android Developer document][android_doc_fragment]


## Listview

[Adapter pattern][android_adapter_pattern] 을 먼저 알아야 합니다 

## 과제 공지
[카카오톡 친구목록 클론하기][kakao_friends_clone]
> hint: 오늘 배우지 않은 tablayout, viewpager 이용하면 추후 과제에서 더 수월할것임

[kakao_friends_clone]: http://m.photoviewer.naver.com/blog?listUrl=https%3A%2F%2Fm.blog.naver.com%2FPostView.nhn%3FblogId%3Dbonobono1975%26logNo%3D220951370572&imgId=1&host=https%3A%2F%2Fm.blog.naver.com%2Fphotoviewer&historyBack=true&blogId=bonobono1975&logNo=220951370572#main/1
[android_doc_fragment]: https://developer.android.com/guide/components/fragments.html?hl=ko
[android_adapter_pattern]: http://sunphiz.me/wp/archives/1292