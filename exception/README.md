# Exception

**예외:** 사용자의 잘못된 조작 또는 개발자의 잘못된 코딩으로 발생되는 프로그램 오류, 예외 발생 시 프로그램이 곧바로 종료되나 , 예외 처리를 통해 정상 실행상태를 유지할 수 있음 

**예외 클래스:** 자바에서는 예외를 클래스로 관리함. 프로그램 실행 중 예외가 발생하면 해당 예외 클래스로 객체를 생성하고 예외 처리 코드에서 예외 객체를 이용할 수 있도록 해줌.

**일반 예외:** 컴파일러 체크 예외를 말한다. 프로그램 실행시 예외 발생 가능성이 높기에 자바 소스 컴파일과정에서 해당 예외 처리코드가 있는지 검사를 한다.

**실행 예외:** 컴파일러가 체크하지 않는 예외를 말하며 실행 시 예측할 수 없이 갑자기 발생하기 때문에 컴파일 과정에서 예외 처리 코드 존재 여부를 검사하지 않는다.