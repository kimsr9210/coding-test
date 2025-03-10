-- 코드를 입력하세요.
--ORDER BY절과 사용시 실행순서: 1️⃣ ROWNUM ➡️ 2️⃣ ORDER BY
--원하는 행의 수를 구하기 위해서 : 서브쿼리 사용으로 해결
--ROWNUM 조회된 순서대로 순번을 매긴다 
-- ROWNUM = 1은 사용 가능 하지만 ROWNUM = 2인 경우는 데이터가 추출되지 않는다.
SELECT NAME FROM (
    SELECT NAME FROM ANIMAL_INS ORDER BY DATETIME
) 
WHERE ROWNUM = 1;