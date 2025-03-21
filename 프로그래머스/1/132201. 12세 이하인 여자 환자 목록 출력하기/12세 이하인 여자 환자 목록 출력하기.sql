-- 코드를 입력하세요
SELECT 
     PT_NAME	
    ,PT_NO	
    ,GEND_CD	
    ,AGE	
    ,NVL(TLNO, 'NONE') AS TLNO
from PATIENT
where age < 13
and GEND_CD = 'W'
order by age desc, PT_NAME;