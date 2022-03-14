# 클래스의 인스턴스 생성 패턴 - Abstract Pattern

* 구체적인 클래스를 생성하지 않고도 서로 관련성이 있거나 독립적인 여러가지 객체의 군을 생성하기 위한 인터페이스 제공
* 추상화된 인터페이스 팩토리 제공하고 인스턴스가 생성

## 예시
* Factory Oracle, Factory Postgresql 가 있으면 Oracle을 선택하면 오라클로 연결, PG를 선택하면 PG로 연결
* DaoFactory - OracleDaoFactory, PostgresDaoFactory
* UserInfoDao - OracleUserInfoDao, PostgresUserInfoDao
* ProductDao - OracleProductDao, PostgresProductDao

## 구성요소
* AbstractFactory : 개념적 제품에 대한 객체를 생성하는 오퍼레이션 인터페이스를 정의
* ConcreateFactory : 구체적인 제품에 대한 객체를 생성
* ConcreteProduct : 구체적으로 팩토리가 생성할 객체를 정의하고 AbstractProduct 가 정의하고 있는 인터페이스를 구현
* Client AbstractFactory, AbstractProduct 에 선언된 인터페이스 사용
