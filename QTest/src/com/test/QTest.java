package com.test;

public class QTest {
	public static void main(String[] args) {
		System.out.println("안녕 여러분");
		
		System.out.println("넴 넨");
		
		for(int i =2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.printf("%d * %d = %d\n", i,j,i*j);
			}
			System.out.println();
			System.out.println();
		}
	}
	/*
	SQL
	-DDL : 데이터 정의어 (TABLE) // 테이블을 어떻게 가지고 놀 것이냐
		CREATE TABLE 테이블명(컬럼명 타입(크기));   
		ALTER TABLE 테이블명 ADD(컬럼 타입(크기));	//테이블, 뷰, 프로시저 등을 생성
			        		MODIFY(컬럼 타입(크기));		//	      수정
					DROP(컬럼명);				//              삭제
		DROP TABLE 테이블명

	-DML : 데이터 조작어 // 튜플(값)을 어떻게 가지고 놀 것이냐
		SELECT 컬럼 FROM 테이블 WHERE 조건;
		INSERT INTO 테이블 VALUES(값);
		INSERT INTO 테이블(컬럼) VALUES(값);
		UPDATE 테이블 SET 컬럼 = 값, 컬럼=값,... WHERE 조건;  
						-- 조건 확인 제대로 안하면 싹 다 바뀌기 때문에 중요
		DELETE FROM 테이블 WHERE 조건;
						-- 조건 확인 제대로 안하면 싹 다 바뀌기 때문에 중요

	-DCL : 데이터 제어어  
		COMMIT - 데이터를 트랜색션
		ROLLBACK - COMMIT을 기준으로 백업
		GRANT : 권한 부여
		REVOKE : 권한 삭제
	*/

}
