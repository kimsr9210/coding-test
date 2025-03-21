-- 코드를 입력하세요
--TO_DATE () : 문자열을 날짜 형식으로 변환
--TO_DATE('날짜문자열', '날짜형식')
--TO_DATE('2021-01-01', 'yyyy-mm-dd')
SELECT COUNT(*) AS USER_COUNT
FROM USER_INFO
WHERE JOINED BETWEEN to_date('2021-01-01', 'yyyy-mm-dd') 
                AND to_date('2021-12-31', 'yyyy-mm-dd')
  AND AGE BETWEEN 20 AND 29;
