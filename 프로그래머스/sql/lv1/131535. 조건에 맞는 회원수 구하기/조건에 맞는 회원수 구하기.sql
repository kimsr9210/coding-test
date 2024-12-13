-- 코드를 입력하세요
SELECT COUNT(*) USER_ID
FROM USER_INFO
WHERE JOINED BETWEEN to_date('2021-01-01', 'yyyy-mm-dd') and to_date('2021-12-31', 'yyyy-mm-dd')
AND AGE BETWEEN 20 AND 29;