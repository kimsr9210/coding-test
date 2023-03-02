-- 코드를 입력하세요
--ROWNUM 조회된 순서대로 순번을 매긴다 
-- ROWNUM = 1은 사용 가능 하지만 ROWNUM = 2인 경우는 데이터가 추출되지 않는다.
SELECT NAME FROM 
(SELECT * FROM ANIMAL_INS 
ORDER BY DATETIME ASC
) WHERE ROWNUM = 1;

